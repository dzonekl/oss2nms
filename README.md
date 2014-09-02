oss2nms
=======

OpenNMS version compatible with OSS2 modular concepts. 

This project is a port of: http://www.opennms.org background services
to OSGI Bundles/Services. 

It doesn't contain the UI (Web) part. 

Focus on the following: 

Proof Of Concept. 

- Port the ICMP services.
- Port the Discovery services. 


Result/Log Proof of Concept 
================

Provide hooks, for non-ported parts. For example, the discovery service
triggers OpenNMS events on the event bus. As we have not ported the event bus, 
there will be a hook to an Event Service, which the Discovery service will 
check for presence. If not, it will log that the service is not available. 

As services are littered with Event-bus annotations, we duplicate the annotation (But change the namespace)
, but will not have a processor for it. The event model is also thight to javax.xml.bind.annotation for binding the Objects to XML. This is part of the JDK so no issue here. 

When porting some of the events, we run into external dependenices like javadns. As netmgt is build with Maven dependencies,
we need an equivant to load in the Eclipse TP. (At least for IDE compilation). We will need to jar this for now, but a maven/tycho releng will get it from a maven rep. (As netmgt is doing). 













