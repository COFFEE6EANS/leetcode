package com.gjf.binarySearch;

/**
 * 680. 验证回文字符串 Ⅱ
 *
 * @author guojianfeng.
 * @date 2019/11/21
 */
public class ValidPalindrome {
    public static void main(String[] args) {
        System.out.println(validPalindrome("aguokepatgbnvfqmgmlcupuufxoohdfpgjdmysgvhmvffcnqxjjxqncffvmhvgsymdjgpfdhooxfuupuculmgmqfvnbgtapekouga"));
    }

    public static boolean validPalindrome(String s) {
        int a = 0, b = s.length() - 1;
        boolean flag = true;
        while (a < b) {
            if (s.charAt(a) == s.charAt(b)) {
                a++;
                b--;
            } else if (flag) {
                return validPalindrome2(s, a + 1, b) || validPalindrome2(s, a, b - 1);
            }
        }
        return true;
    }

    public static boolean validPalindrome2(String s, int a, int b) {
        while (a < b) {
            if (s.charAt(a) == s.charAt(b)) {
                a++;
                b--;
            } else {
                return false;
            }
        }
        return true;
    }
}
