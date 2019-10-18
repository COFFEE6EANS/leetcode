package simple;

/**
 * LCP 1. 猜数字
 * https://leetcode-cn.com/problems/guess-numbers/solution/yi-xing-zui-you-de-javashuang-bai-by-zi-xu/
 * @author guojianfeng.
 * @date created in  2019/10/18
 * @desc
 */
public class Game {
    public static void main(String[] args) {

    }
    public int game(int[] guess, int[] answer) {
        int res = 0;
        for (int i = 0; i < guess.length; i++) {
            if (guess[i]==answer[i]){
                res++;
            }
        }
        return res;
    }
}
