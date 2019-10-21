package simple;

/**
 * @author guojianfeng.
 * @date created in  2019/10/21
 * @desc
 */
public class RemoveOuterParentheses {
    public static void main(String[] args) {
        String s = removeOuterParentheses("(()())(())");
        System.out.println(s);
    }

    public static String removeOuterParentheses(String S) {
        char[] chars = S.toCharArray();
        String res = "";
        int l = 1, r = 0;
        for (int i = 1; i < S.length(); i++) {
            if (chars[i] == '(') {
                l++;
            } else {
                r++;
            }
            if (l != r) {
                res += String.valueOf(chars[i]);
            } else {
                i++;
                l = 1;
                r = 0;
            }
        }
        return res;
    }
}
