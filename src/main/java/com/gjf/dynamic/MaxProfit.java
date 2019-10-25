package com.gjf.dynamic;

import common.PrintUtils;

/**
 * 121. 买卖股票的最佳时机
 * @author guojianfeng.
 * @date 2019/10/25
 */
public class MaxProfit {
    public static void main(String[] args) {
        PrintUtils.out(maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
    }

    public static int maxProfit(int[] prices) {
        int profit = 0, min = Integer.MAX_VALUE;
        for (int i = 0; i < prices.length; i++) {
            if (min > prices[i]) {
                min = prices[i];
            } else {
                profit = Math.max(prices[i] - min,profit);
            }
        }
        return profit;
    }
}
