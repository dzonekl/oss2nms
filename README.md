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


ICMP Service
============

- Done Pinger, still need the acutal interfaces.


Discovery Service
=================

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


Event Service
=============

- The event service basically chains events. (See EventsConstants), so a configuration file change event, will trigger the discover service restart event.
- Events are build with the EventBuilder class and fired with   m_eventForwarder.sendNow(ebldr.getEvent()); (EventForwarder). 

[TODO discuss the Event annotations and how the Springframework calls the processor for annotations.]


Configuration Service
=====================

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





Conclusions sofar
=================

OpenNMS is very much hard-wired. The Discovery service runs as a Daemon (SpringDaemon) and is configured to use other service 
by setters and a Singleton. A modular approach is to query for the availability of these services. 











