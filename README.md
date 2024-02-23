# Java Collections Performance Test

This project aims to test the performance of various Java collections (`LinkedList`, `HashSet`, `TreeSet`, `LinkedHashSet`, `ArrayList`, `ArrayDeque`, `PriorityQueue`, `HashMap`, `TreeMap`, `LinkedHashMap`) using 100,000 random integers.

## Code Overview

### Basic Test Class Description

At the basic level, there are classes such as `LinkedListTests`, `HashSetTests`, etc., designed to perform tests in an organized manner. Each class has an attribute of its data type, and the constructor creates the instance object.

```java
public class LinkedListTests {
    public LinkedList<Integer> list;

    public LinkedListTests() {
        this.list = new LinkedList<>();
    }

    public void add(int num) {
        list.add(num);
    }

    // Other test methods
}
Test methods are used to measure the time taken for specific operations such as adding, checking availability, removing, and clearing elements in the collection. These methods do not modify the original collection and return the elapsed time in nanoseconds.

java
Copy code
private long testAdd(int[] testCases) {
    // Code to add elements and calculate time
}

// Other test methods
App.java Main Method
In the main method of App.java, objects for each test class are created, and each collection is loaded with 100,000 random integers. Test cases for adding, checking availability, and removing elements are generated, and tests are performed for each collection using these cases.

java
Copy code
LinkedListTests list1 = new LinkedListTests();
// Other objects for different collections

for (int i = 0; i < 100000; i++) {
    int num = new Random().nextInt(100000);
    list1.add(num);
    // Adding to other objects
}

int[] numAdd = new int[100];
int[] numAvailable = new int[100];
int[] numRemove = new int[100];
// Generating test cases

list1.initiateTests(numAdd, numAvailable, numRemove);
// Initiating tests for other objects
Setup
Ensure you have Java installed on your system.
Clone this repository to your local machine.
Running the Tests
Open the project in your favorite Java IDE.
Run the App class as the main class.
Results
The program will output the performance metrics for each collection, including add time, check available time, remove time, and clear time.

Conclusion
Based on the test results, you can analyze the performance of each collection operation and choose the best collection for your specific use case.