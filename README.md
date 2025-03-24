# Concurrent Programming Course Work

Coursework Description 

Scenario: Coffee Shop Ordering System
Consider a coffee shop where customers place orders and baristas prepare coffee. In this scenario, we have multiple customers who can place orders simultaneously, and multiple baristas who prepare the coffee based on those orders. The shop has a limited number of orders it can handle at a time, ensuring that it does not become overwhelmed with too many orders.
Requirements and marks break down:
Shared Resource: A limited order queue that can only hold a certain number of orders at a time. 
Customer: These place orders in the queue. If the queue is full, they must wait until there is space available to place their order. [implement / extend appropriate interfaces/class, implement appropriate procedures / functions].
Barista: These take orders from the queue to prepare the coffee. If the queue is empty, they must wait until there are orders available. [implement / extend appropriate interfaces/class, implement appropriate procedures / functions].
Mutual: Ensure that only one customer or barista can access the order queue at a time to avoid race conditions and ensure consistency. 
Identify and use an appropriate concurrency mechanism to ensure the code executes in a safe manner. 
