package priorityqueue;

import java.util.PriorityQueue;

public class GenericPriorityQueue<T extends Comparable<T>> {
    private PriorityQueue<T> queue;

    public GenericPriorityQueue() {
        queue = new PriorityQueue<>();
    }

    // Add an element to the priority queue
    public void enqueue(T element) {
        queue.add(element);
    }

    // Remove and return the highest-priority element
    public T dequeue() {
        return queue.poll();
    }

    // Peek at the highest-priority element without removing it
    public T peek() {
        return queue.peek();
    }

    // Check if the queue is empty
    public boolean isEmpty() {
        return queue.isEmpty();
    }

    // Get the size of the queue
    public int size() {
        return queue.size();
    }
}

