package simple;

/**
 * 771. 宝石与石头
 * https://leetcode-cn.com/problems/jewels-and-stones/
 * @author guojianfeng.
 * @date created in  2019/7/11
 * @desc  
 */
public class NumJewelsInStones {
    public int numJewelsInStones(String J, String S) {
        char[] charsS = S.toCharArray();
        int count = 0;
        for (char s : charsS) {
            if(J.contains(s+"")){
                count++;
            }
        }
        return count;
    }
}
