package designgurus.dynamicprogramming;

/**
 * 0/1 Knapsack
 * <p>
 * Given two integer arrays to represent weights and profits of 'N' items, we need to find a subset of these
 * items which will give us maximum profit such that their cumulative weight is not more than a given number 'C'.
 * Write a function that returns the maximum profit. Each item can only be selected once,
 * which means either we put an item in the knapsack or skip it.
 */
public class Knapsack {
    public int solveKnapsack(int[] profits, int[] weights, int capacity) {
        int len = profits.length;
        int[][] profitMatrix = new int[len][capacity];

        for (int i = 0; i < len; i++) {
            int profit = profits[i];
            int weight = weights[i];

            for (int j = 0; j < capacity; j++) {
                int currentCapacity = j + 1;
                int rest = currentCapacity - weight;
                int currentProfit = 0;

                if (i > 0) {
                    if (rest == 0) {
                        currentProfit = Math.max(profitMatrix[i - 1][j], profit);
                    } else if (rest > 0) {
                        int restCapacity = profitMatrix[i - 1][rest - 1];
                        int newProfit = restCapacity + profit;

                        currentProfit = Math.max(profitMatrix[i - 1][j], newProfit);
                    } else {
                        currentProfit = profitMatrix[i - 1][j];
                    }
                } else {
                    currentProfit = rest < 0 ? 0 : profit;
                }

                profitMatrix[i][j] = currentProfit;
            }
        }

        return profitMatrix[len - 1][capacity - 1];
    }
}
