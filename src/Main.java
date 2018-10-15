import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.sun.org.apache.xpath.internal.SourceTree;
import learn.Param1;
import learn.Param2;
import org.omg.PortableServer.ThreadPolicyOperations;

import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) throws Exception {
		// test
	List<TPo> list = new ArrayList<>();
		TPo t1 = new TPo();
		t1.setTest(1L);
	list.add(t1);
		TPo t3 = new TPo();
	list.add(t3);
		TPo t4 = new TPo();
		list.add(t4);
		TPo t2 = new TPo();
		t1.setTest(2L);

	list.add(t2);

		TPo t5 = new TPo();
		t1.setTest(2L);
		list.add(t5);
	List<Long> tests = list.stream().map(p->p.getTest()).distinct().collect(Collectors.toList());
		System.out.println(tests.size());
		for(Long test:tests){

		}


	}
	private static List getPage(List list, int paIndex, int paSize) {
		// 总集合为空，返回空
		if (list == null || list.size() <= 0) {
			return new ArrayList();
		}
		// 总集合数量小于paSize，返回总集合
		if (list.size() <= paSize) {
			return list;
		}
		List newResultList = new ArrayList<>();
		for (int i = 0; i < list.size(); i++) {
			if (i >= (paIndex - 1) * paSize && i < paIndex * paSize) {
				newResultList.add(list.get(i));
			}
		}
		return newResultList;
	}
	public static String getHMStr(long millSeconds) {
		// 小时参数
		long ph = 60 * 60 * 1000;
		// 分钟参数
		long pm = 60 * 1000;
		// 秒参数
		long ps = 1000;
		String str = "";
		if (millSeconds < pm) {
			return "0秒";
		}
		long hours = millSeconds / (ph);
		long minutes = (millSeconds % ph) / (pm);
		long seconds = ((millSeconds % ph) % (pm)) / ps;
		if (hours > 0) {
			str = hours + "小时";
		}
		if (minutes > 0) {
			str = str + minutes + "分钟";
		}
		if (seconds > 0) {
			str = str + seconds + "秒";
		}
		return str;
	}
	private static boolean checkNeedDeal(Date settleDate) {
		Date now = new Date();
		Calendar cal1 = Calendar.getInstance();
		Calendar cal2 = Calendar.getInstance();
		cal1.setTime(settleDate);
		cal2.setTime(now);
		// 月份差
		Integer month = (cal2.get(Calendar.YEAR) - cal1.get(Calendar.YEAR)) * 12
				+ (cal2.get(Calendar.MONTH) - cal1.get(Calendar.MONTH));
		Integer period =2;
		// 月份差是周期数的整数倍，并且非本月
		if (month % period == 0 && month > 0) {
			return true;
		}
		return false;
	}
}
