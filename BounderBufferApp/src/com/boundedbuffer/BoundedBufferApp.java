package com.boundedbuffer;

public class BoundedBufferApp {
    public static void main(String[] args) {
        BoundedBuffer buffer = new BoundedBuffer();
        int totalItems = 20; // Total number of items to produce and consume

        Producer producer = new Producer(buffer, totalItems);
        Consumer consumer = new Consumer(buffer, totalItems);

        Thread producerThread = new Thread(producer, "Producer-Thread");
        Thread consumerThread = new Thread(consumer, "Consumer-Thread");

        producerThread.start();
        consumerThread.start();

        try {
            // Wait for both threads to finish
            producerThread.join();
            consumerThread.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread was interrupted.");
        }

        System.out.println("Bounded Buffer Application has completed.");
    }
}
