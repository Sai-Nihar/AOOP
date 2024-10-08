package priorityqueue;

public class PriorityQueueTest {
    public static void main(String[] args) {
        // Test with Integers
        GenericPriorityQueue<Integer> intQueue = new GenericPriorityQueue<>();
        intQueue.enqueue(10);
        intQueue.enqueue(5);
        intQueue.enqueue(20);
        System.out.println("Integer Queue Peek: " + intQueue.peek()); // Should output 5 (smallest)
        System.out.println("Integer Queue Dequeue: " + intQueue.dequeue()); // Output 5

        // Test with Doubles
        GenericPriorityQueue<Double> doubleQueue = new GenericPriorityQueue<>();
        doubleQueue.enqueue(3.5);
        doubleQueue.enqueue(1.2);
        doubleQueue.enqueue(7.8);
        System.out.println("Double Queue Peek: " + doubleQueue.peek()); // Should output 1.2
        System.out.println("Double Queue Dequeue: " + doubleQueue.dequeue()); // Output 1.2

        // Test with Strings
        GenericPriorityQueue<String> stringQueue = new GenericPriorityQueue<>();
        stringQueue.enqueue("Banana");
        stringQueue.enqueue("Apple");
        stringQueue.enqueue("Cherry");
        System.out.println("String Queue Peek: " + stringQueue.peek()); // Should output "Apple" (alphabetically first)
        System.out.println("String Queue Dequeue: " + stringQueue.dequeue()); // Output "Apple"
    }
}
