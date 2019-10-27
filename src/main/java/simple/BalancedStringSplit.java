package simple;

public class BalancedStringSplit {
    public static void main(String[] args) {
        BalancedStringSplit balancedStringSplit = new BalancedStringSplit();
        System.out.println(balancedStringSplit.balancedStringSplit("RLRRLLRLRL"));

    }

    public int balancedStringSplit(String s) {
        int res = 0;
        int num = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'R') {
                num++;
            } else {
                num--;
            }
            if (num == 0) {
                res++;
            }
        }
        return res;
    }
}
