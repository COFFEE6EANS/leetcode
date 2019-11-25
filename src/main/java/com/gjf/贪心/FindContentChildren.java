package com.gjf.贪心;

import java.util.Arrays;

/**
 * @author guojianfeng.
 * @date 2019/11/23
 */
public class FindContentChildren {
    public int findContentChildren(int[] g, int[] s) {
        if (g.length <= 0 || s.length <= 0) {
            return 0;
        }
        Arrays.sort(g);
        Arrays.sort(s);
        int gi = 0, si = 0;
        for (; gi < g.length && si < s.length; si++) {
            if (g[gi] <= s[si]) {
                gi++;
            }
        }
        return gi;
    }
}
