Q1. **Print Numbers Sequentially** \
Write a program that uses three threads to print numbers from 1 to 30 sequentially. The first thread should print numbers 1, 4, 7, ..., the second thread should print 2, 5, 8, ..., and the third thread should print 3, 6, 9, ...

Q2. **Producer-Consumer Problem** \
Implement a simple producer-consumer problem using a shared buffer (e.g., a blocking queue). One or more producer threads should generate items and place them into the buffer, and one or more consumer threads should take items from the buffer and process them.

Q3. **Dining Philosophers Problem** \
Implement the dining philosophers problem using synchronization mechanisms such as semaphores or monitors to avoid deadlock. Ensure that no two neighboring philosophers are eating at the same time.

Q4.**Thread-safe Counter** \
Create a thread-safe counter class. The counter should support increment and decrement operations, and multiple threads should be able to safely increment and decrement the counter without causing race conditions.

Q5. **Print Odd and Even Numbers Using Two Threads** \
Write a program that uses two threads to print odd and even numbers from 1 to 20. One thread should print odd numbers, and the other should print even numbers. Use proper synchronization to ensure that the numbers are printed in order.

Q6. **Thread-safe Singleton** \
Implement a thread-safe singleton class in Java. Ensure that only one instance of the class is created, even when multiple threads try to access it simultaneously.

Q7. **Reentrant Lock** \
Write a program that demonstrates the use of ReentrantLock for synchronizing access to a shared resource by multiple threads.

Q8. **Thread Pool** \
Create a simple thread pool using the ExecutorService framework. Submit multiple tasks to the thread pool and ensure they are executed by the available threads.

Q9. **Thread Interruption** \
Write a program where one thread interrupts another thread. Handle the interruption properly and print a message indicating that the thread was interrupted.

Q10. **Deadlock Simulation**
Write a program that intentionally creates a deadlock situation between two threads. Then, modify the program to avoid the deadlock using proper synchronization techniques.