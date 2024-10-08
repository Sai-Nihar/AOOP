package com.boundedbuffer;

public class Producer implements Runnable {
    private final BoundedBuffer buffer;
    private final int productionCount;

    public Producer(BoundedBuffer buffer, int productionCount) {
        this.buffer = buffer;
        this.productionCount = productionCount;
    }

    @Override
    public void run() {
        try {
            for (int i = 1; i <= productionCount; i++) {
                buffer.produce(i);
                Thread.sleep(100); // Simulate time taken to produce an item
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.out.println("Producer was interrupted.");
        }
    }
}
