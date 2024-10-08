package com.boundedbuffer;

public class BoundedBuffer {
    private final int MAX_CAPACITY = 10; // Maximum capacity of the buffer
    private final int[] buffer; // Array to store buffer items
    private int count = 0; // Current number of items in the buffer
    private int in = 0; // Points to the next insertion position
    private int out = 0; // Points to the next removal position

    public BoundedBuffer() {
        buffer = new int[MAX_CAPACITY];
    }

    // Method for producer to add items to the buffer
    public synchronized void produce(int item) throws InterruptedException {
        // If buffer is full, wait until space becomes available
        while (count == MAX_CAPACITY) {
            System.out.println("Buffer is full. Producer is waiting...");
            wait();
        }

        // Add item to the buffer
        buffer[in] = item;
        in = (in + 1) % MAX_CAPACITY;
        count++;
        System.out.println("Produced: " + item + " | Buffer Size: " + count);

        // Notify consumer that an item is available
        notifyAll();
    }

    // Method for consumer to remove items from the buffer
    public synchronized int consume() throws InterruptedException {
        // If buffer is empty, wait until an item is available
        while (count == 0) {
            System.out.println("Buffer is empty. Consumer is waiting...");
            wait();
        }

        // Remove item from the buffer
        int item = buffer[out];
        out = (out + 1) % MAX_CAPACITY;
        count--;
        System.out.println("Consumed: " + item + " | Buffer Size: " + count);

        // Notify producer that space is available
        notifyAll();

        return item;
    }
}
