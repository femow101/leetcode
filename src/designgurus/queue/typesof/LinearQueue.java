package designgurus.queue.typesof;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Simple Queue (Linear Queue)
 * <p>
 * A simple queue is the most basic form of a queue. It follows the FIFO (First-In, First-Out) rule.
 * <p>
 * - FIFO order
 * - New elements are added at the rear.
 * - Elements are removed from the front.
 */
public class LinearQueue {

    private Queue<Integer> linearQueue = new LinkedList<>();

    private void queueMethods() {
        linearQueue.add(1);
        linearQueue.peek(); // Return de HEAD
        linearQueue.poll(); // Return and Remove HEAD
    }
}
