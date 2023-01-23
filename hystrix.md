# hystrix

Microservices are prone to failure or delayed responses. If a service fails it may impact on other services affecting performance and possibly making other parts of application inaccessible or in the worst case bring down the whole application.

Of course, there are solutions available that help make applications resilient and fault-tolerant – one such framework is Hystrix.

The Hystrix framework library helps to control the interaction between services by providing fault tolerance and latency tolerance. It improves overall resilience of the system by isolating the failing services and stopping the cascading effect of failures.


- Open Source Library ( created by Netflix )
- implements circuit breaker pattern