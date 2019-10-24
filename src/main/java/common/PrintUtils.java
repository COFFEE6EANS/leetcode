package common;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author guojianfeng.
 * @date 2019/10/22
 */
public class PrintUtils {
    public static void out(int i){
        System.out.println(i);
    }
    public static void out(String s){
        System.out.println(s);
    }
    public static void out(int[] nums){
        System.out.println( Arrays.toString(nums));
    }
    public static void out(List list){
        StringBuilder builder = new StringBuilder("[");
        list.forEach(l->{
            builder.append(l+",");
        });
        if (list.size()>1){
            builder.deleteCharAt(builder.lastIndexOf(","));
        }
        builder.append("]");
        System.out.println(builder.toString());
    }

    public static void main(String[] args) {
        List strings = Arrays.asList(1,2);
        out(strings);
    }
}
