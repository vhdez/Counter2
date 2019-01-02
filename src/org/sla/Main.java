package org.sla;

public class Main {
    public static void main(String[] args) {
        Counter counter = new Counter();
        // increment-then-decrement 100 times
        for (int i = 0; i < 100; i++) {
            Integer newCount = counter.increment();
            System.out.println(" FIRST Incrementing to " + newCount);
        }
        for (int j = 0; j < 100; j++) {
            Integer newCount = counter.decrement();
            System.out.println(" FIRST Decrementing to " + newCount);
        }

        // increment-then-decrement 100 more times
        for (int i = 0; i < 100; i++) {
            Integer newCount = counter.increment();
            System.out.println(" SECOND Incrementing to " + newCount);
        }
        for (int j = 0; j < 100; j++) {
            Integer newCount = counter.decrement();
            System.out.println(" SECOND Decrementing to " + newCount);
        }

        // increment-then-decrement 100 more times (300 total times)
        for (int i = 0; i < 100; i++) {
            Integer newCount = counter.increment();
            System.out.println(" THIRD Incrementing to " + newCount);
        }
        for (int j = 0; j < 100; j++) {
            Integer newCount = counter.decrement();
            System.out.println(" THIRD Decrementing to " + newCount);
        }
    }

}
