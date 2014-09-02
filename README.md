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

Provide hooks, for non-ported parts. For example, the discovery service
triggers OpenNMS events on the event bus. As we have not ported the event bus, 
there will be a hook to an Event Service, which the Discovery service will 
check for presence. If not, it will log that the service is not available. 




