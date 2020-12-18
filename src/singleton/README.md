# Singleton  Pattern

## Definition
Ensures a class has **only one** instance and provides a **global** point of access to it. 

## Classic Singleton
See [`Singleton.java`](./classic/Singleton.java). 
We have a **private** constructor for `Singleton()` and a public method `getInstance` to get the `uniqueInstance`.
Note that the Singleton object is only created once. 

Output:
```
..Call getInstance
Creating a new Singleton object
..Call getInstance

..Check if Singleton is unique
Singleton objects are the same
```
## Budget Pool
See [`BudgetPool.java`](./budget/BudgetPool.java). 
In this example, we have a Singleton object `BudgetPool` 
which contains a private variable `budget` and several public methods to update 
`budget`. 

When we run `BudgetPoolTest`, we get
```
Creating a new BudgetPool object
...

No budget left, cannot use
Current budget: 0
...

No budget left, cannot reset
Current budget: 0
...

Refill budget to 10
Current budget: 10
...

Use budget of 1
Current budget: 9
...

Still have budget left, not refill
Current budget: 9
...

Reset budget
Current budget: 0
```

The `BudgetPool` class is not **thread safe**. 
We have multiple threading in [`BudgetPoolThreadTest.java`](./budget/BudgetPoolThreadTest.java). 
In the first few threads, the instance is not initialized. 
Multiple threads can enter the `if-else` loop and create multiple instances. 

When we run `BudgetPoolThreadTest`, we **may** get the following output. 
Note that we have two `Creating a new BudgetPool object` instead of one. 

```
Current thread : Thread-0
Current thread : Thread-1
Thread-0
Thread-1
Creating a new BudgetPool object
...
Thread-1
Creating a new BudgetPool object
...
Thread-0
Refill budget to 10
Refill budget to 10
Current budget: 10
...
Current budget: 10
...
Thread-0
Thread-1
Use budget of 1
Use budget of 1
Current budget: 9
Current budget: 9
```

## Thread-safe Singleton
### 1. synchronized method
If calling `getInstance` does not cause substantial overhead for your application, 
we can synchronize the method directly, as in [`BudgetPool`](budgetThreadSafeSynchronize/BudgetPool.java).

When we use a `synchronized` block, internally Java uses a **monitor** 
also known as monitor lock or intrinsic lock, to provide synchronization. 
These monitors are bound to an object, 
thus all synchronized blocks of the same object can have **only one thread** executing them at the same time.
See [reference](https://www.baeldung.com/java-synchronized).

Synchronizing a method can decrease performance by a factor of 100!!! 

The output shows that we only create the instance once. 
```
Current thread : Thread-0
Current thread : Thread-1
Thread-0
Creating a new BudgetPool object
...
Thread-0
Thread-1
...
Thread-1
Refill budget to 10
Refill budget to 10
Current budget: 10
...
Thread-0
Use budget of 1
Current budget: 10
...
Thread-1
Use budget of 1
Current budget: 9
Current budget: 8
```

### 2. eagerly created instance
We can create the Singleton object eagerly as in [`BudgetPool`](budgetThreadSafeEager/BudgetPool.java) with a 
static initializer. Using this approach, we rely on the JVM to create the unique instance when the class is loaded. 
The JVM guarantees that the instance will be created before any thread accesses the static `uniqueInstance` variable. 
This may get messy due to the way **static initialization** handled by Java.

### 3. double-checked locking
In [`BudgetPool`](./budgetThreadSafeLock/BudgetPool.java), we use **double-checked locking** to 
- first check if an instance is created
- if not, THEN we **synchronize**. We only synchronize the first time.

The `volatile` keyword ensures that multiple threads handle the `uniqueInstance` correctly 
when it is being initialized. 

The Java `volatile` keyword marks a Java variable as being stored in **main memory**. 
That means, that every **read** of a volatile variable will be read from the computer's main memory (RAM), 
and not from the CPU cache and that each **writes** to a volatile variable will be written to the RAM, and not just to the CPU cache. 
The Java volatile keyword guarantees **visibility** of changes to variables across threads. See [reference](https://medium.com/javarevisited/java-concurrency-volatile-d0e585852d6b).

## Global variable v.s. Singleton
Global variables in Java are static references to objects. 
This may get messy due to the way static initialization handled by Java. 
A global variable can provide a global **access** to a class like Singleton, but cannot ensure 
only one instance of the class exists. 

## AtomicReference v.s. Singleton
`AtomicReference` Java class provides operations on underlying object reference 
that can be read and written **atomically**. 
It has `get` and `set` methods that work like reads and writes on `volatile` variables to make class **thread safe**.

AtomicReference allows you to atomically change their reference to the object -- 
and in the case of a singleton there should be one instance only 
and no one should be able to change that ever again for the execution of your app. 