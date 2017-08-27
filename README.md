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
### What is the life cycle of a thread?
1. New (instance of Thread class created before invocation of start() method
2. Runnable (after invocation of start(), but has not be selected by thread scheduler)
3. Running (selected by thread scheduler)
4. Non-Runnable (Blocked) (thread is alive, but not eligible to run)
5. Terminated (exits run() method)

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

### What would you use to schedule a monthly report?
Batch processing.