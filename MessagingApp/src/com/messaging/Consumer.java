package com.messaging;

public class Consumer implements Runnable {
    private SharedBuffer buffer;
    private int messageCount;

    public Consumer(SharedBuffer buffer, int messageCount) {
        this.buffer = buffer;
        this.messageCount = messageCount;
    }

    @Override
    public void run() {
        try {
            for(int i = 1; i <= messageCount; i++) {
                String message = buffer.consume();
                // Process the message (here, we just print it)
                Thread.sleep(800); // Simulate time taken to consume a message
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.out.println("Consumer was interrupted.");
        }
    }
}
