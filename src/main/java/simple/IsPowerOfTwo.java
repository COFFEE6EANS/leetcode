package simple;

/**
 * @author guojianfeng.
 * @date created in  2019/7/19
 * @desc
 */
public class IsPowerOfTwo {

    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(4));
    }
    public static boolean isPowerOfTwo(int n) {
        return n > 0 && (n & n - 1) == 0;
    }
}
