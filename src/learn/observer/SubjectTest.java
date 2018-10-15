package learn.observer;

/**
 * 描述:
 *
 * @ Author Zhangpj
 * @ Date 2018-04-27 16:24
 */
public class SubjectTest {
    public static void main(String[] args) {
        AbstractSubject sub = new AbstractSubjectImpl();
        Observer1 ob1 = new Observer1();
        Observer2 ob2 = new Observer2();
        sub.list.add(ob1);
        sub.list.add(ob2);
        sub.setMessage("哥哥下班咯！");
    }

}