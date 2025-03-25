package leetcode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 225. Implement Stack using Queues
 * https://leetcode.com/problems/implement-stack-using-queues/
 *
 */
public class ImplementStackUsingQueues {
    private Queue<Integer> q1;
    private Queue<Integer> q2;

    public ImplementStackUsingQueues() {
        q1 = new LinkedList<>();
        q2 = new LinkedList<Integer>();
    }

    public void push(int x) {
        q2.add(x);

        while(!q1.isEmpty()) {
            q2.add(q1.remove());
        }

        q1 = q2;
        q2 = new LinkedList<Integer>();
    }

    public int pop() {
        return q1.remove();
    }

    public int top() {
        return q1.peek();
    }

    public boolean empty() {
        return q1.isEmpty();
    }
}
