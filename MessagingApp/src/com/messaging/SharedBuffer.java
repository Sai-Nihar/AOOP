package com.messaging;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class SharedBuffer {
    private BlockingQueue<String> queue;
    private final int capacity;

    public SharedBuffer(int capacity) {
        this.capacity = capacity;
        this.queue = new LinkedBlockingQueue<>(capacity);
    }

    // Producer calls this method to add messages
    public void produce(String message) throws InterruptedException {
        queue.put(message); // Blocks if the queue is full
        System.out.println("Produced: " + message);
    }

    // Consumer calls this method to retrieve messages
    public String consume() throws InterruptedException {
        String message = queue.take(); // Blocks if the queue is empty
        System.out.println("Consumed: " + message);
        return message;
    }
}
