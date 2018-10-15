import java.util.*;

/**
 * 描述:
 *
 * @Author Zhangpj
 * @Date 2018-01-24 10:52
 */
public class TestClock {
    public static void main(String[] args) {
        List<String> ids = new ArrayList<String>();
        ids.add("1001");
        ids.add("1002");
        ids.add("1003");
        ids.add("1004");
        ids.add("1005");

        int pageSize = 9;
        int pageIndex = 9;

//        Date startDate = DateUtils.formatStringToDate("2018-01-01",DateUtils.FORMAT_YMD_1);

//        Date endDate = DateUtils.formatStringToDate("2018-01-24",DateUtils.FORMAT_YMD_1);
        String startDate = "2018-01-01";
        String endDate = "2018-01-24";
        getDate(ids, pageSize, pageIndex, startDate, endDate);

    }

    public static String[][] getDate(List ids, int pageSize, int pageIndex, String startDate, String endDate) {
        String[][] array = new String[pageSize][2];
        System.out.println(array.length);
        for (int i = 0; i < array.length; i++) {

            String id = null;
            String date = null;
            // 首先计算出当前数据属于第X条
            int tiao = (pageIndex - 1) * pageSize + i;

            int tian = tiao / ids.size();

            int idYu = tiao % ids.size();
            date = DateUtils.formatDateToString(DateUtils.getDateAfterOneDate(startDate, DateUtils.FORMAT_YMD_1, tian), DateUtils.FORMAT_YMD_1);
            id = (String) ids.get(idYu);

            System.out.println("date:" + date);
            System.out.println("id" + id);
            array[i] = new String[]{id, date};
        }

        System.out.println(Arrays.toString(array));
        return array;
    }

}