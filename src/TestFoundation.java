import java.util.Arrays;
import java.util.Date;

/**
 * 描述:
 *
 * @Author Zhangpj
 * @Date 2018-01-24 17:04
 */
public class TestFoundation {
    public static void main(String[] args) {

        /*int[] arr = new int[]{1,2,3,4,5};
        for (int a: arr
             ) {

            a=0;
        }
        for (int i = 0; i <arr.length ; i++) {
            arr[i]=0;
        }
        System.out.println(Arrays.toString(arr));*/
Date now = new Date();
        System.out.println(getTotalRecord(DateUtils.formatStringToDate("2018-01-01",DateUtils.FORMAT_YMD_1),DateUtils.formatStringToDate("2018-01-26",DateUtils.FORMAT_YMD_1),15));


        Date date = null;
        System.out.println("TTTTTTTTTT"+date.getTime());
    }
    private static int getTotalRecord(Date startDate, Date endDate, Integer pageSize) {
        int days = (int) ((endDate.getTime() - startDate.getTime()) / (1000*3600*24));
        return days+1;
    }
}