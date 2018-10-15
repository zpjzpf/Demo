import learn.Param1;

import java.util.List;

/**
 * 描述:
 *
 * @Author Zhangpj
 * @Date 2018-04-19 14:03
 */
public class Param {

    private Integer age;
    private FormStatus formStatus;

    public FormStatus getFormStatus() {
        return formStatus;
    }

    public void setFormStatus(FormStatus formStatus) {
        this.formStatus = formStatus;
    }
    private List<Param1> p1;

    public List<Param1> getP1() {
        return p1;
    }

    public void setP1(List<Param1> p1) {
        this.p1 = p1;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}