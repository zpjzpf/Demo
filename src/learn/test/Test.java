package learn.test;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import javafx.scene.shape.Circle;

import java.util.Collections;

/**
 * 描述:
 *
 * @ Author Zhangpj
 * @ Date 2018-05-21 15:14
 */
public class Test {

    public static void main(String[] args) {
        Circle a = new Circle(1);

        Circle b = new Circle(2);

        System.out.println(a.hashCode());
        System.out.println(b.hashCode());
//        swap(a,b);
        System.out.println(a.hashCode());
        System.out.println(b.hashCode());


        System.out.println(a.getRadius());

        System.out.println(b.getRadius());
    }
    public static void swap(Circle x,Circle y){
       x = new Circle(3);
        System.out.println("]]]");

//        Collections.EMPTY_LIST
    }
    public void test(Circle x){
    }

}