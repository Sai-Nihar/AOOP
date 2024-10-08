package com.messaging;

public class MessagingApp {
    public static void main(String[] args) {
        int bufferCapacity = 5; // Maximum number of messages in the buffer
        int totalMessages = 10; // Total messages to produce and consume

        SharedBuffer sharedBuffer = new SharedBuffer(bufferCapacity);

        Producer producer = new Producer(sharedBuffer, totalMessages);
        Consumer consumer = new Consumer(sharedBuffer, totalMessages);

        Thread producerThread = new Thread(producer, "Producer-Thread");
        Thread consumerThread = new Thread(consumer, "Consumer-Thread");

        producerThread.start();
        consumerThread.start();

        try {
            producerThread.join();
            consumerThread.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread was interrupted.");
        }

        System.out.println("Messaging application has completed.");
    }
}
