package leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 39. Combination Sum (Medium)
 *
 */
public class CombinationSum {
    List<List<Integer>> combinations = new ArrayList<>();
    Stack<Integer> stack = new Stack<>();

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        backtrack(0, 0, candidates, target);
        return combinations;
    }

    private void backtrack(int startingIndex, int stackCount, int[] candidates, int target) {
        if (stackCount > target) { return; }
        if (stackCount == target) {
            combinations.add(new ArrayList<>(stack));
            return;
        }

        for (int i = startingIndex; i < candidates.length; i++) {
            stack.add(candidates[i]);
            backtrack(i, stackCount + candidates[i], candidates, target);
            stack.pop();
        }
    }
}
