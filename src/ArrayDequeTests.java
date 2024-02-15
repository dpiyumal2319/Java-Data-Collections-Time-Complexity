import java.util.ArrayDeque;

public class ArrayDequeTests {
    public ArrayDeque<Integer> deque;

    public ArrayDequeTests() {
        this.deque = new ArrayDeque<>();
    }

    public void push(int num) {
        deque.add(num);
    }

    public void initiateTests(int[] testCasesAdd,int[] testCasesCheckAvailable,int[] testCasesRemove) {
        // checking time to add a given element
        long addTimeAD = testAdd(testCasesAdd);
        System.out.println("ArrayDeque add time: " + addTimeAD);

        // checking time to check if an element is available
        long checkAvailableTimeAD = testCheckAvailable(testCasesCheckAvailable);
        System.out.println("ArrayDeque check available time: " + checkAvailableTimeAD);

        // checking time to remove a given element
        long removeTimeAD = testRemove(testCasesRemove);
        System.err.println("ArrayDeque remove time: " + removeTimeAD);

        // checking time to clear the deque
        long clearTimeAD = testClear();
        System.out.println("ArrayDeque clear time: " + clearTimeAD);
    }

    private int testAdd(int[] testCases) {
        long elapsedTime = 0;
        for (int num : testCases) {
            ArrayDeque<Integer> copyDeque = new ArrayDeque<>(deque);
            long start = System.nanoTime();
            copyDeque.add(num);
            long end = System.nanoTime();
            elapsedTime += end - start;
        }
        return (int) (elapsedTime / testCases.length);
    }

    private int testCheckAvailable(int[] testCases) {
        long elapsedTime = 0;
        for (int num : testCases) {
            long start = System.nanoTime();
            deque.contains(num);
            long end = System.nanoTime();
            elapsedTime += end - start;
        }
        return (int) (elapsedTime / testCases.length);
    }

    private int testRemove(int[] testCases) {
        long elapsedTime = 0;
        for (int num : testCases){
            ArrayDeque<Integer> copyDeque = new ArrayDeque<>(deque);
            long start = System.nanoTime();
            copyDeque.removeIf(value -> value.equals(num));
            long end = System.nanoTime();
            elapsedTime += end - start;
        }
        return (int) (elapsedTime / testCases.length);
    }

    private int testClear() {
        long elapsedTime = 0;
        for (int i = 0; i < 100; i++) {
            ArrayDeque<Integer> copyDeque = new ArrayDeque<>(deque);
            long start = System.nanoTime();
            copyDeque.clear();
            long end = System.nanoTime();
            elapsedTime += end - start;
        }
        return (int) (elapsedTime / 100);
    }
}
