package com.messaging;

public class Producer implements Runnable {
    private SharedBuffer buffer;
    private int messageCount;

    public Producer(SharedBuffer buffer, int messageCount) {
        this.buffer = buffer;
        this.messageCount = messageCount;
    }

    @Override
    public void run() {
        try {
            for(int i = 1; i <= messageCount; i++) {
                String message = "Message " + i;
                buffer.produce(message);
                Thread.sleep(500); // Simulate time taken to produce a message
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.out.println("Producer was interrupted.");
        }
    }
}
