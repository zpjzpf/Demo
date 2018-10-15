import java.math.BigDecimal;

/**
 * 描述:
 *
 * @Author Zhangpj
 * @Date 2018-04-19 14:04
 */
public class TestEnum {
    private static BigDecimal price;
    public static void main(String[] args) {
        Param param = new Param();
        param.setFormStatus(FormStatus.AUDIT);
        System.out.println(param.getFormStatus().getType());
        System.out.println(price);
        System.out.println(new BigDecimal(0).equals(price));
    }


}