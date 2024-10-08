package com.boundedbuffer;

public class Consumer implements Runnable {
    private final BoundedBuffer buffer;
    private final int consumptionCount;

    public Consumer(BoundedBuffer buffer, int consumptionCount) {
        this.buffer = buffer;
        this.consumptionCount = consumptionCount;
    }

    @Override
    public void run() {
        try {
            for (int i = 1; i <= consumptionCount; i++) {
                int item = buffer.consume();
                processItem(item);
                Thread.sleep(150); // Simulate time taken to process an item
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.out.println("Consumer was interrupted.");
        }
    }

    private void processItem(int item) {
        System.out.println("Processing item: " + item);
    }
}
