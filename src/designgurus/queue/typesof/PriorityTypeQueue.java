package designgurus.queue.typesof;

import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityTypeQueue {

    // ASCENDING ORDER COMPARATORS
    Comparator<Integer> ascendingOrderComparator = (a, b) -> Integer.compare(a, b);
    Comparator<Integer> ascendingOrderComparator2 = Collections.reverseOrder();

    Comparator<Integer> descendingOrderComparator = (a, b) -> Integer.compare(b, a);

    private PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(ascendingOrderComparator);

    private void priorityQueueMethods() {
        priorityQueue.add(1);
        priorityQueue.peek();
        priorityQueue.poll();
    }
}
