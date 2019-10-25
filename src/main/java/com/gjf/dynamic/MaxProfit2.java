package com.gjf.dynamic;

/**
 * 122. 买卖股票的最佳时机 II
 * @author guojianfeng.
 * @date 2019/10/25
 */
public class MaxProfit2 {
    public static int maxProfit(int[] prices) {
        int maxProfit = 0;
        for (int i = 1; i < prices.length ; i++) {
            if (prices[i]-prices[i-1]>0){
                maxProfit += prices[i]-prices[i-1];
            }
        }
        return maxProfit;
    }
}
