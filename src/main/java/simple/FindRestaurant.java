package simple;

import java.util.*;

/**
 * 599. 两个列表的最小索引总和
 *
 * @author guojianfeng.
 * @date created in  2019/10/21
 * @desc
 */
public class FindRestaurant {
    public static void main(String[] args) {
        String[] strings = findRestaurant(new String[]{"Shogun", "Tapioca Express", "Burger King", "KFC"},
                new String[]{"KFC", "Shogun", "Burger King"});

        System.out.println(Arrays.asList(strings));
    }

    public static String[] findRestaurant(String[] list1, String[] list2) {
        Map<String, Integer> listMap1 = new HashMap<>();
        List<String> res = new ArrayList<>();
        for (int i = 0; i < list1.length; i++) {
            listMap1.put(list1[i], i);
        }
        int min_sum = Integer.MAX_VALUE;
        for (int i = 0; i < list2.length; i++) {
            if (listMap1.containsKey(list2[i])) {
                int index_sum = listMap1.get(list2[i]) + i;
                if (index_sum<min_sum){
                    min_sum = index_sum;
                    res.clear();
                    res.add(list2[i]);
                }else if (index_sum == min_sum){
                    res.add(list2[i]);
                }
            }
        }
        return res.toArray(new String[((ArrayList) res).size()]);
    }
}
