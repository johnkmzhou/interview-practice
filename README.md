# Interview Practice
## Message Service
### What are the differences between Web Services and JMS?
* Web Service
  * XML-RPC, SOAP, REST
  * Tends to be synchronous.
  * Interoperability
* JMS
  * Other client applications can connect to JMS from within the application server or by using JNDI from outside application server.
  * Tends to be asynchronous.
  * Restricted to Java programs