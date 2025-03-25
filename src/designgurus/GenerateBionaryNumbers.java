package designgurus;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Generate Binary Numbers from 1 to N
 *
 * Given an integer N, generate all binary numbers from 1 to N and return them as a list of strings.
 */
public class GenerateBionaryNumbers {

    public static String[] generateBinaryNumbers(int n) {
        String[] res = new String[n];
        Queue<String> queue = new LinkedList<>();
        bfs(res, 0, "1", queue);

        return res;
    }

    private static void bfs(String[] res, Integer i, String strBinary, Queue<String> queue) {
        if (i >= res.length) { return; }
        // add strBinary to res
        res[i] = strBinary;
        if (i == res.length - 1) { return; }

        // add left to the queue
        queue.add(strBinary + "0");
        // add right to the queue
        queue.add(strBinary + "1");

        // while queue is not empty
        while (!queue.isEmpty()) {
            String top = queue.remove();
            i++;
            bfs(res, i, top, queue);
        }
    }
}
