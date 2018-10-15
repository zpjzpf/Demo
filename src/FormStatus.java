/**
 * 描述:
 *
 * @Author Zhangpj
 * @Date 2018-04-19 14:03
 */
public enum FormStatus {

    SAVE('A', "保存"),SUBMIT('B', "提交"),
    AUDIT('C', "审核");
    private char type;
    private String desc;

    private FormStatus(char type, String desc) {
        this.type = type;
        this.desc = desc;
    }

    public Character getType() {
        return this.type;
    }

    public String getDesc() {
        return this.desc;
    }
}