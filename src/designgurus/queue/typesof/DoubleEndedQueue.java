package designgurus.queue.typesof;

import java.util.Deque;
import java.util.LinkedList;

/**
 * Deque (Double-Ended Queue)
 * <p>
 * A deque (Double-Ended Queue) allows insertion and deletion from both ends
 * <p>
 * - Front Insertion & Rear Insertion (Enqueue).
 * - Front Removal & Rear Removal (Dequeue).
 */
public class DoubleEndedQueue {

    private Deque<Integer> deque = new LinkedList<>();

    private void dequeueMethods() {
        deque.addFirst(1);
        deque.addLast(10);

        deque.getFirst();
        deque.peekFirst();

        deque.getLast();
        deque.peekLast();

        deque.removeFirst();
        deque.pollFirst();

        deque.removeLast();
        deque.pollLast();
    }
}
