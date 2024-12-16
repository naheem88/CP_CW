# Concurrent Programming Course Work

Coursework Description 

Scenario 1

Scenario: Coffee Shop Ordering System
Consider a coffee shop where customers place orders and baristas prepare coffee. In this scenario, we have multiple customers who can place orders simultaneously, and multiple baristas who prepare the coffee based on those orders. The shop has a limited number of orders it can handle at a time, ensuring that it does not become overwhelmed with too many orders.
Requirements and marks break down:
Shared Resource: A limited order queue that can only hold a certain number of orders at a time. 
Customer: These place orders in the queue. If the queue is full, they must wait until there is space available to place their order. [implement / extend appropriate interfaces/class, implement appropriate procedures / functions].
Barista: These take orders from the queue to prepare the coffee. If the queue is empty, they must wait until there are orders available. [implement / extend appropriate interfaces/class, implement appropriate procedures / functions].
Mutual: Ensure that only one customer or barista can access the order queue at a time to avoid race conditions and ensure consistency. 
Identify and use an appropriate concurrency mechanism to ensure the code executes in a safe manner. 

Scenario 2

You are tasked with implementing a concurrent banking transaction system that handles money transfers between multiple bank accounts. Each account can only be accessed by one thread at a time, but the complication is that transfers between two accounts must lock both accounts in a safe order to prevent deadlock.
Requirements and marks break down:
1. Transaction Safety: A transaction from Account A to Account B must ensure that both accounts are locked before transferring money. If two threads attempt to transfer money between the same pair of accounts (in either direction), one must wait until the other completes.
2. Avoiding Deadlock: When multiple threads try to transfer money between different pairs of accounts, ensure that no deadlock occurs. For example, if Thread 1 is transferring money from Account A to Account B and Thread 2 is transferring from Account B to Account C, a potential deadlock could occur if a third thread is transferring money from Account C to Account A.
3. Fair Access: If multiple threads are waiting to access the same account, they should be granted access in the order they arrived (first-come-first-served).
4. Read-Write Operations: Some operations, such as getBalance() or getTransactionHistory(), should not require locking the account as long as there are no ongoing transactions. Concurrent reads are allowed, but no read should interfere with an ongoing transaction.
5. Multiple Transactions: The system should allow multiple transactions to occur simultaneously if they do not involve the same set of accounts.
6. Transaction Reversal: The system should be able to safely reverse a transaction if an error occurs during the transfer, ensuring that the states of all involved accounts are consistent after the operation.
   
Example Scenario:
Consider the following threads:
Thread 1: Transfers $100 from Account 1 to Account 2.
Thread 2: Transfers $200 from Account 2 to Account 3.
Thread 3: Transfers $50 from Account 3 to Account 1.
Thread 4: Reads the balance of Account 1 and Account 3 concurrently.
In this situation:
Thread 1 should complete its transaction before Thread 2 can access Account 2.
Thread 3 should not start its transaction until both Thread 1 and Thread 2 are done.
Thread 4 can read the balances without blocking any ongoing transactions.
If a failure occurs, the system should be able to safely roll back any partial transfers and ensure the integrity of all accounts.
Implement a system that satisfies the above requirements, ensuring safe concurrent access, avoiding deadlocks, and providing consistent results for all transactions and queries.
Identify and use an appropriate concurrency mechanism to ensure the code executes in a safe manner. 



Scenario 3

University has a shared bathroom stall. Multiple employees/Students need to use them throughout the day, but:
Requirements and marks break down:
Only a fixed number of people can use it at once (limited stalls).
We need to keep track of available stalls.
Employees / Students need to wait if all stalls are occupied.
As people finish using a stall they should leave, and other users should be able to enter and use. No stall should have more than one user at a time.  
Simulate for a single floor to keep things simpler. 
Program should have 6-bathroom stalls and 100 (Employees and Students)                  
