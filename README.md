# Interview Practice
## Sorting
### What are the differences between Comparable and Comparator?
Comparable
* Sorting logic must be in same class as objects that are being sorted (natural order).
* Class to be sorted must implement interface.
* int compareTo(Object o1)
Comparator
* Sorting logic is in separate class.
* int compare(Object o1, Object o2)
## Concurrency
### How do you handle two users modifying the same form data at the same time?
Optimistic locking.
## Application Architecture
### What are the differences between Web Services and JMS?
Web Service
* XML-RPC, SOAP, and REST.
* Tends to be synchronous.
* Interoperability.
JMS
* Other client applications can connect to JMS from within the same application server or by using JNDI from outside application server.
* Tends to be asynchronous.
* Restricted to Java programs.
