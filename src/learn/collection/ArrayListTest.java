package learn.collection;

import java.util.ArrayList;

/**
 * 描述:
 *
 * @ Author Zhangpj
 * @ Date 2018-05-17 14:53
 */
public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList(15);
        arrayList.add(1);
        ArrayList list2 = new ArrayList(arrayList);
        System.out.println(list2.get(0));
    }

}