
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateUtils {

	public static final String FORMAT_YMD_1 = "yyyy-MM-dd";
	public static final String FORMAT_YMD_2 = "yyyy/MM/dd";
	public static final String FORMAT_YMD_3 = "yyyyMMdd";
	public static final String FORMAT_YMD_4 = "yy/MM/dd";
	public static final String FORMAT_YMD_5 = "yyyy/M/d";
	public static final String FORMAT_YMD_6 = "yyMMdd";
	public static final String FORMAT_YMD_7 = "yyyy.MM.dd";
	public static final String FORMAT_YM_1 = "yyyyMM";
	public static final String FORMAT_YM_2 = "yyyy/MM";
	public static final String FORMAT_YM_3 = "yyyy-MM";
	public static final String FORMAT_YY_1 = "yyyy";
	public static final String FORMAT_MD_1 = "MM-dd";
	public static final String FORMAT_MD_2 = "MM/dd";
	public static final String FORMAT_DATE_TIME_1 = "yyyy-MM-dd HH:mm:ss";
	public static final String FORMAT_DATE_TIME_2 = "yyyy/MM/dd HH:mm:ss";
	public static final String FORMAT_DATE_TIME_3 = "yyyyMMddHHmmss";
	public static final String FORMAT_DATE_TIME_4 = "yyyy-MM-dd HH:mm";
	public static final String FORMAT_DATE_TIME_5 = "yyyy/MM/dd HH:mm";
	public static final String FORMAT_DATE_TIME_7 = "yyyy-MM-dd HH:mm:ss.SSS";
	public static final String FORMAT_YEAR_1 = "yyyy";
	public static final String FORMAT_MONTH_1 = "MM";
	public static final String FORMAT_TIME_1 = "HH:mm:ss";
	public static final String FORMAT_HM_1 = "HH:mm";
	public static final String FORMAT_HM_2 = "HHmm";
	public static final String FORMAT_DATE_1 = "dd";
	public static final String FORMAT_HOUR_1 = "HH";  
	public static final String FORMAT_CN = "yyyy年MM月dd日";
	public static final String FORMAT_CN_YYYY_M_D_H_M = "yyyy年MM月dd日 HH:mm";
	public static final String FORMAT_CN_YY_M_D_H_M = "yy年MM月dd日 HH:mm";
	public static final String FORMAT_CN_M_D_H_M = "MM月dd日 HH:mm";
    
	/**
	 * @discription 获取毫秒数,如023毫秒
	 * @author mahan
	 * @created 2017年5月12日 下午2:37:41
	 * @return
	 */
	public static String getMilliSecond() {
		Calendar calendar = Calendar.getInstance();
		return new DecimalFormat("000").format(calendar.get(Calendar.MILLISECOND));
	}
	
	/**
	 * 
	 * @discription 获取日期年份（2017）,参数为日期
	 * @author mahan
	 * @created 2017年5月12日 下午2:43:21
	 * @param date
	 * @return
	 */
	public static int getYear(Date date) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		return calendar.get(Calendar.YEAR);
	}
	
	/**
	 * 
	 * @discription 获取月份
	 * @author mahan
	 * @created 2017年5月12日 下午2:43:21
	 * @param date
	 * @return
	 */
	public static int getMonth(Date date) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		return calendar.get(Calendar.MONTH)+1;
	}
	
	/**
	 * 
	 * @discription 获取日期
	 * @author mahan
	 * @created 2017年5月12日 下午2:43:21
	 * @param date
	 * @return
	 */
	public static int getDate(Date date) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		return calendar.get(Calendar.DATE);
	}
	
	/**
	 * 
	 * @discription 获取小时
	 * @author mahan
	 * @created 2017年5月12日 下午2:43:21
	 * @param date
	 * @return
	 */
	public static int getHour(Date date) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		return calendar.get(Calendar.HOUR);
	}
	
	/**
	 * 
	 * @discription 获取秒
	 * @author mahan
	 * @created 2017年5月12日 下午2:43:21
	 * @param date
	 * @return
	 */
	public static int getMinute(Date date) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		return calendar.get(Calendar.MINUTE);
	}
	
	/**
	 * 
	 * @discription 获取分钟
	 * @author mahan
	 * @created 2017年5月12日 下午2:43:21
	 * @param date
	 * @return
	 */
	public static int getSecond(Date date) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		return calendar.get(Calendar.SECOND);
	}
	
	/**
	 * 
	 * @discription 获取当前是周几
	 * @author mahan
	 * @created 2017年5月12日 下午3:48:16
	 * @param date
	 * @return
	 */
	public static Integer getWeekOfDate(Date date) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		return calendar.get(Calendar.DAY_OF_WEEK);
	}
		
	/**
	 * 
	 * @discription 获取两个日期相差秒数
	 * @author mahan
	 * @created 2017年5月12日 下午3:20:57
	 * @param beginDate
	 * @param endDate
	 * @return
	 */
	public static Long getDifferMinutes(Date beginDate,Date endDate){
		return (endDate.getTime()-beginDate.getTime())/(1000 * 60);
	}
	
	/**
	 * 
	 * @discription 获取指定时分的日期,秒和毫秒置零
	 * @author mahan
	 * @created 2017年5月12日 下午4:30:14
	 * @param hour
	 * @param minute
	 * @param second
	 * @return
	 */
	public static Date getChangeDate(Date date,int hour,int minute){
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.set(Calendar.HOUR_OF_DAY, hour);
		calendar.set(Calendar.MINUTE, minute);
		calendar.set(Calendar.SECOND, 0);
		calendar.set(Calendar.MILLISECOND, 0);
		return calendar.getTime();
	}
	
	/**
     * @Description: {获取当前日期}
     * @author 黎敏  
     * @created 2015-10-14 下午4:08:46
     * @return  Date 当前日期
	 */
	public static Date getCurrentDateTime() {
		return new Date();
	}
	
	/**
     * @Description: {获取当前日期}
     * @author黎敏  
     * @created 2015-10-14 下午4:08:46
     * @return  Date 当前日期
	 */
	public static String getCurrentDateTimeString(String format) {
		// 正式部署时
		return DateUtils.formatDateToString(new Date(), format) ;
	}
	
	
	/**
	 * @Title: formatDateToString
	 * @Description: 根据时间戳转化成字符串日期
	 * @param (time:时间戳)
	 * @param (fmt:指定日期格式)
	 * @return (String:指定格式的字符串日期)
	 */
	public static String formatTimeToString(Long time, String fmt) {
		if (time == null) {
			return "";
		}
		return 	formatDateToString(new Date(time), fmt);
	}
	
	/**
	 * @Title: formatDateToString
	 * @Description: 根据日期格式转化成字符串日期
	 * @param (date:指定日期)
	 * @param (fmt:指定日期格式)
	 * @return (String:指定格式的字符串日期)
	 */
	public static String formatDateToString(Date date, String fmt) {
		if (date == null) {
			return "";
		}
		SimpleDateFormat df = new SimpleDateFormat(fmt);
		df.setLenient(false);
		return df.format(date);
	}

	/**
	 * @Title: formatDateToString
	 * @Description: 字符串日期格式的数据转换成日期
	 * @param (sDate:字符串日期)
	 * @param (fmt:日期格式)
	 * @return (Date:返回日期 ，注：出现异常返回 null)
	 */
	public static Date formatStringToDate(String sDate, String fmt) {
		SimpleDateFormat sdfFrom = null;
		Date dt = null;
		try {
			sdfFrom = new SimpleDateFormat(fmt);
			dt = sdfFrom.parse(sDate);
		} catch (ParseException e) {
			return null;
		} finally {
			sdfFrom = null;
		}
		return dt;
	}

	/**
	 * @Title: getLastDayOfMonth
	 * @Description: 获得指定日期所在月份的最后一天
	 * @param (date:指定日期)
	 * @return (Date:返回日期)
	 */
	public static Date getLastDayOfMonth(Date date) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		// 当前日期加一个月
		calendar.add(Calendar.MONTH, 1);
		// 设置为该月第一天
		calendar.set(Calendar.DATE, 1);
		// 再减一天即为上个月最后一天
		calendar.add(Calendar.DATE, -1);
		return calendar.getTime();
	}
	
	/**
	 * @Title: getFirstDayOfMonth
	 * @Description: 获得指定日期所在月份的第一天
	 * @param (date:指定日期)
	 * @return (Date:返回日期)
	 */
	public static Date getFirstDayOfMonth(Date date) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		// 设置为该月第一天
		calendar.set(Calendar.DATE, 1);
		return calendar.getTime();
	}
	
	/**
	 * 
	 * @discription 获取指定日期当月的最后一天，时分秒为：23:59:59 999
	 * @author mahan
	 * @created 2017年5月25日 下午7:13:21
	 * @param date
	 * @return
	 */
	public static Date getLastDayOfThisMonth(Date date) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		// 当前日期加一个月
		calendar.add(Calendar.MONTH, 1);
		// 设置为该月第一天
		calendar.set(Calendar.DATE, 1);
		// 再减一天即为上个月最后一天
		calendar.add(Calendar.DATE, -1);
		calendar.set(Calendar.HOUR_OF_DAY, 23);
		calendar.set(Calendar.MINUTE, 59);
		calendar.set(Calendar.SECOND, 59);
		calendar.set(Calendar.MILLISECOND, 999);
		return calendar.getTime();
	}
	
	/**
	 * 
	 * @discription 获取指定日期当月第一天，时分秒置零
	 * @author mahan
	 * @created 2017年5月25日 下午7:13:26
	 * @param date
	 * @return
	 */
	public static Date getFirstDayOfThisMonth(Date date) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		// 设置为该月第一天
		calendar.set(Calendar.DATE, 1);
		calendar.set(Calendar.HOUR_OF_DAY, 0);
		calendar.set(Calendar.MINUTE, 0);
		calendar.set(Calendar.SECOND, 0);
		calendar.set(Calendar.MILLISECOND, 0);
		return calendar.getTime();
	}

	public static void main(String[] args) {
		System.out.println(formatDateToString(new Date(),"MM月dd日 HH:mm"));
		Integer year = getYear(new Date());
	}
	
	/**
	 * @Title: getLastDayOfMonth
	 * @Description: 获得指定日期所在月份的最后一天
	 * @param (dateStr:指定日期)
	 * @param (fmt:日期的格式)
	 * @return (Date:返回日期)
	 */
	public static Date getLastDayOfMonth(String dateStr, String fmt) {
		Calendar calendar = Calendar.getInstance();
		// 转换成 Date
		Date date = DateUtils.formatStringToDate(dateStr, fmt);
		calendar.setTime(date);
		// 当前日期加一个月
		calendar.add(Calendar.MONTH, 1);
		// 设置为该月第一天
		calendar.set(Calendar.DATE, 1);
		// 再减一天即为上个月最后一天
		calendar.add(Calendar.DATE, -1);
		return calendar.getTime();
	}
    
	/**
     * @Description: 根据特定条件获取 指定日期延后的日期 
     * @created 2016-12-23 下午4:19:42
     * @param oneDate 指定的日期
     * @param calendar 延后的的条件值（按照年、月、日等）
     * @param param 延后的数值（可为负值，负值表示提前）
     * @return
	 */
	public static Date getDateAfterByCondition(Date oneDate, int calendarCon, int param) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(oneDate);
		if (calendarCon == Calendar.YEAR) {
			calendar.add(Calendar.YEAR, param);
		} else if (calendarCon == Calendar.MONTH) {
			calendar.add(Calendar.MONTH, param);
		} else if (calendarCon == Calendar.WEEK_OF_YEAR) {
			calendar.add(Calendar.WEEK_OF_YEAR, param);
		} else if (calendarCon == Calendar.DAY_OF_YEAR) {
			calendar.set(Calendar.WEEK_OF_YEAR, param);
		}
		return calendar.getTime();
	}
	
	/**
	 * @Title: getMondayOfWeek
	 * @Description: 根据指定日期获取该日期同一周星期一的日期(注：该日期为周日获取上周一的日期)
	 * @param (date:指定日期)
	 * @return (Date:返回日期)
	 */
	public static Date getMondayOfWeek(Date date) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		// 星期天 就返回上一周周一的日期
		if (1 == calendar.get(Calendar.DAY_OF_WEEK)) {
			calendar.add(Calendar.WEEK_OF_YEAR, -1);
		}
		// 设置为周一 （2 表示为周一）
		calendar.set(Calendar.DAY_OF_WEEK, 2);
		return calendar.getTime();
	}

	/**
	 * @Title: getDateAfterOneDate
	 * @Description: 获取指定日期后几天的日期
	 * @param (date:指定日期)
	 * @param (day:推迟的天数)
	 * @return (Date:返回日期)
	 */
	public static Date getDateAfterOneDate(Date date, int day) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.add(Calendar.DAY_OF_YEAR, day);
		return calendar.getTime();
	}

	/**
	 * @Title: getDateAfterOneDate
	 * @Description: 获取指定日期后几天的日期
	 * @param (dateStr:指定日期)
	 * @param (fmt:日期的格式)
	 * @param (day:推迟的天数)
	 * @return (Date:返回日期)
	 */
	public static Date getDateAfterOneDate(String dateStr, String fmt, int day) {
		// 转换成 Date
		Date date = DateUtils.formatStringToDate(dateStr, fmt);
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.add(Calendar.DAY_OF_YEAR, day);
		return calendar.getTime();
	}
	/**
	 * 获取上个月第一号
	 * @return
	 */
	public static Date getFirstDayDayOfMonth() {
		Calendar   cal_1=Calendar.getInstance();//获取当前日期 
	    cal_1.add(Calendar.MONTH, -1);
	    cal_1.set(Calendar.DAY_OF_MONTH,1);//设置为1号,当前日期既为本月第一天 
		return cal_1.getTime();
	}
	// 获取上月最后一天
	public static Date getLastDayDayOfMonth() {
		 Calendar cale = Calendar.getInstance();   
         cale.set(Calendar.DAY_OF_MONTH,0);//设置为1号,当前日期既为本月第一天 
		return  cale.getTime();
	}
	/**
	 * 
	 * @discription 获取上个月第一号(时分秒置零)
	 * @author mahan
	 * @created 2017年5月25日 下午7:16:44
	 * @return
	 */
	public static Date getFirstDayOfLastMonth() {
		Calendar   cal_1=Calendar.getInstance();//获取当前日期 
	    cal_1.add(Calendar.MONTH, -1);
	    cal_1.set(Calendar.DAY_OF_MONTH,1);//设置为1号,当前日期既为本月第一天 
	    cal_1.set(Calendar.HOUR_OF_DAY, 0);
	    cal_1.set(Calendar.MINUTE, 0);
	    cal_1.set(Calendar.SECOND, 0);
	    cal_1.set(Calendar.MILLISECOND, 0);
		return cal_1.getTime();
	}
	/**
	 * 
	 * @discription 获取上个月最后一天，时分秒为23:59:59 999
	 * @author mahan
	 * @created 2017年5月25日 下午7:10:21
	 * @return
	 */
	public static Date getLastDayOfLastMonth() {
		 Calendar cale = Calendar.getInstance();   
         cale.set(Calendar.DAY_OF_MONTH,0);//设置为1号,当前日期既为本月第一天 
         cale.set(Calendar.HOUR_OF_DAY, 23);
         cale.set(Calendar.MINUTE, 59);
         cale.set(Calendar.SECOND, 59);
         cale.set(Calendar.MILLISECOND, 999);
		return  cale.getTime();
	}
	
	/**
	 * @Title: idLeapYear
	 * @Description: 判断具体年份是不是闰年
	 * @param (year: 具体年份)
	 * @return (boolean: 是闰年返回true)
	 */
	public static boolean idLeapYear(int year) {
		if (year % 100 == 0) {
			if (year % 400 == 0) {
				return true;
			}
		} else {
			if (year % 4 == 0) {
				return true;
			}
		}
		return false;
	}
	
	/**
	 * 
     * @Description: {获取N小时后日期 }
     * @author 黎敏  
     * @created 2015-10-14 下午4:10:59
     * @param (date:指定日期)
     * @param (n:指定的小时)
     * @return
	 */
	public static Date getHourDateAfterOneHour(Date date, int n) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		int hour = cal.get(Calendar.HOUR_OF_DAY);
		cal.set(Calendar.HOUR_OF_DAY, hour + n);
		return cal.getTime();
	}

	/**
	 *
	 * @Description: {获取N分钟后日期 }
	 * @author 黎敏
	 * @created 2015-10-14 下午4:10:59
	 * @param (date:指定日期)
	 * @param (n:指定的小时)
	 * @return
	 */
	public static Date getDateAfterMinutes(Date date, int n) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		int minute = cal.get(Calendar.MINUTE);
		cal.set(Calendar.MINUTE, minute + n);
		return cal.getTime();
	}

	/**
	 * @Title: getNumberOfDays
	 * @Description: 获取指定日期所在月份的天数
	 * @param (date: 具体的日期)
	 * @return (int ： 返回具体的天数)
	 */
	public static int getNumberOfDays(Date date) {
		int result = 0;
		// 年份
		int year = Integer.parseInt(DateUtils.formatDateToString(date,
				FORMAT_YEAR_1));
		// 月份
		int month = Integer.parseInt(DateUtils.formatDateToString(date,
				FORMAT_MONTH_1));
		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			result = 31;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			result = 30;
			break;
		default:
			if (DateUtils.idLeapYear(year)) {
				result = 29;
			} else {
				result = 28;
			}
			break;
		}
		return result;
	}
	
	/**
	 * 转换指定日期为    yyyy-MM-dd 00:00:00
	 * @param dateStr
	 * @return
	 */
	public static Date getFormatDate(String dateStr,String ft){
		SimpleDateFormat format = new SimpleDateFormat(ft);
		Date date = null;
		if(dateStr != null && !"".equals(dateStr)){
			try {
				date = format.parse(dateStr);					
			} catch (ParseException e) {
			}
		}				
		return date;
	}

	/**
	 * 根据毫秒数，获取 x小时 X分钟
	 * @param millSeconds
	 * @return
	 */
	public static String getHMStr(long millSeconds){
		//小时参数
		long ph = 60 * 60 * 1000l;
		//分钟参数
		long pm = 60 * 1000;
		//秒参数
		long ps = 1000;

		if(millSeconds < pm){
			return "";
		}

		long hours = millSeconds/(ph);
		long minutes = (millSeconds%ph)/(pm);
		/*long seconds = ((millSeconds%ph)%(pm))/ps;
		long millisecond = ((millSeconds%ph)%(pm))%ps;*/

		if(hours > 0){
			if(minutes > 0){
				return hours+"小时 "+minutes + "分钟";
			}else{
				return hours+"小时";
			}
		}else{
			if(minutes > 0){
				return minutes + "分钟";
			}else{
				return "";
			}
		}
	}
	/**
	 *
	 * @discription 比较日期大小
	 * @author dujiewei
	 * @created 2017年6月16日 上午10:31:22
	 * @param v1
	 * @param v2
	 * @return
	 */
	public static int dateCompareTo(String v1, String v2) {
		String[] a1 = v1.split("-");
		String[] a2 = v2.split("-");
		int minLength = a1.length >= a2.length ? a2.length : a1.length;
		for (int i = 0; i < minLength; i++) {
			if (1 == Integer.compare(Integer.parseInt(a1[i]), Integer.parseInt(a2[i]))) {
				return 1;
			} else if (-1 == Integer.compare(Integer.parseInt(a1[i]), Integer.parseInt(a2[i]))) {
				return -1;
			}
		}
		if (a1.length >= a2.length) {
			return 1;
		} else {
			return -1;
		}
	}
	/**
	 *
	 * @discription 获取当前一年中第周
	 * @author dujiewei
	 * @created 2018年1月2日17:21:53
	 * @param date
	 * @return
	 */
	public static Integer getWeekOfYear(Date date) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		return calendar.get(Calendar.WEEK_OF_YEAR);
	}

	/**
	 * @discription 获得指定日期的前一天(年月日格式)
	 * @author dujiewei
	 * @created 2018/1/5 10:24
	 * @param date
	 * @return
	 */
	public static String getYesterDay(Date date) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.add(Calendar.DAY_OF_MONTH, -1);
		date = calendar.getTime();
		return DateUtils.formatDateToString(date,DateUtils.FORMAT_YMD_1);
	}
}

