package learn.test;

/**
 * 描述:
 *
 * @ Author Zhangpj
 * @ Date 2018-05-22 14:12
 */
public class HashMapTest {
    public static void main(String[] args) {
        /*int hash = 16;
        hash ^= (hash >>> 20) ^ (hash >>> 12);
        hash ^= (hash >>> 7) ^ (hash >>> 4);
        System.out.println(16>>>2);*/
        String key = "Test";
        int hash = key.hashCode();
        System.out.println("before"+hash);
        System.out.println(hash>>>20);
        System.out.println(hash>>>12);
        System.out.println(2603186^633);
        System.out.println("&&&&&&&&&&&&&&&&&&");
        hash ^= (hash >>> 20) ^ (hash >>> 12);
        System.out.println(hash);
    }
}