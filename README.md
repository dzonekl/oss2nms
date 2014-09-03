oss2nms
=======

OpenNMS version compatible with OSS2 modular concepts. 

This project is a port of: http://www.opennms.org background services
to OSGI Bundles/Services. 

It doesn't contain the UI (Web) part. 

Focus on the following: 

Proof Of Concept. 

- Port the ICMP service.
- Port the Discovery service. 
- Port the Event service
- Port the Configuration service. 
- Mokup of the DB Service. (As we don't want/need to port it). 
- Deal with Dependencies as an Eclipse Target (To run from IDE, and use in Tycho builds). 

SpringFramework Dependencies: 

- Remove springframework dependencies (From the back-end services). 
- ApplicationContext / @Autowire
- SpringDaemon
- FileSystemResource
- Assert


Current Services Architecture & Bootstrap
=========================================

First, OpenNMS uses JMX for managing the application, the service deamon are bootstrapped through a service configuration file. 
The Daemons are extending 

Bootstrap -> Controller      -> Starter         ->           Invoker          
             (Authentication)   (MBeanServer/ServiceConfig)  (Load Services, register MBean, invoke Methods)

OpenNMS will call a Controller Class ( opennms.netmgt.vmmgr) which load 
the services (from a ServiceConfigFactory, see Config services below). 
- The service-configuration.xml is loaded (See opennms-base-assembly) 
- The services are loaded (Instantiated) and registered as MBeans with the MBeanServer
- The invoke method is called as defined on the Service configuration model (Service.class). 
- The invoke method points to methods in the service itself like this: 

<service>
    <name>OpenNMS:Name=Discovery</name>
    <class-name>org.opennms.netmgt.discovery.jmx.Discovery</class-name>
    <invoke at="start" pass="0" method="init"/>
    <invoke at="start" pass="1" method="start"/>
    <invoke at="status" pass="0" method="status"/>
    <invoke at="stop" pass="0" method="stop"/>
  </service>


- so in this case in pass "0", the method (on)init is called, this starts the service. 

Daemon Spring Application Context
=================================

The Daemon also have Bean information. (Spring-beans).
The application context is loaded. [There are SpringLoader classes, but they are not called?]


Model
=====

Various model objects are provided as XML Schemas. These are meta-model info for Castor to generate
corresponding classes. Some of these generated model classes are not in the git repo. The maven build
will use a Castor plugin to generate the classes (Single sourcing approach), and add them to src paths for compilation. 


In our PoC we will commit the generated classes in the git repo, so we are not depending on the releng process too much for now. 
(We change castor.properties to map the oss2 namespace). 




ICMP Service
------------

- Done Pinger, still need the acutal interfaces.
- PingResponseCallBack will fire an event to the eventd service, we disable this now (TODO, wire a mockup service for events. ). 


Discovery Service
-----------------

- Interacts with the ICMP Service, The Configuration service, Persistence Service (DB) and the Event Service. 
The current hooks are like this: 
- setEventForwarder() for the event service. 
- setPinger() for the pinger service. 
- setDiscoveryFactory for the Discovery Config factory, triggered by initializeConfig
- DataSourceFactory is a Singleton, so DataSourceFactory.getInstance().getConnection(); which then deal with the SQL API. 


The ApplicationContext (Spring specific) makes sure the Bean's are initialized by calling the setters: 

<bean id="daemon" class="org.opennms.netmgt.discovery.Discovery">
    <property name="discoveryFactory" ref="discoveryFactory" />
    <property name="eventForwarder" ref="eventForwarder"/>
    <property name="pinger" ref="pinger"/>
  </bean>


The application context, also tells the Daemon listener to look for events, see the Event Service below. 


The Discovery Services builds on top of SpringDaemon 


Event Service
-------------

- The event service basically chains events. (See EventsConstants), so a configuration file change event, will trigger the discover service restart event.
- Events are build with the EventBuilder class and fired with   m_eventForwarder.sendNow(ebldr.getEvent()); (EventForwarder).
- We only migrate the event model, and not the actual eventd service (To keep it real right). 

[TODO discuss the Event annotations and how the Springframework calls the processor for annotations.]


Configuration Service
---------------------

- As schemas  (See project config-model) 
Castor is used for Java-XML binding. For Eclipse there is old-style repo (Yippe) here: http://eclipse.opennms.org/
It installs an m2e connector in Eclipse which does....?



Porting issues / log
====================

- Provide hooks, for non-ported parts. For example, the discovery service
triggers OpenNMS events on the event bus. As we have not ported the event bus, 
there will be a hook to an Event Service, which the Discovery service will 
check for presence. If not, it will log that the service is not available. 

- As services are littered with Event-bus annotations, we duplicate the annotation (But change the namespace)
, but will not have a processor for it. The event model is also thight to javax.xml.bind.annotation for binding the Objects to XML. This is part of the JDK so no issue here. 

- When porting some of the events, we run into external dependenices like javadns. As netmgt is build with Maven dependencies,
we need an equivant to load in the Eclipse TP. (At least for IDE compilation). We will need to jar this for now, but a maven/tycho releng will get it from a maven rep. (As netmgt is doing). 

- Discussion with OpenNMS good people about the OSGI plans. Karaf container is already supported, the jars are OSGI'ed with maven-bundle-plugin. Karaf container config is in the source code. 









