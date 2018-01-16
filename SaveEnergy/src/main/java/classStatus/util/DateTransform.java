package classStatus.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 日期转换工具
 * @author HT
 *
 */
	
public class DateTransform {
	static SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	
	/**
	 * 日期类转字符串
	 * @param date
	 * @return
	 */
	public static String trans(Date date) {
		String stringDate=sdf.format(date);
		return stringDate;
	}
	
	/**
	 * 字符串转日期类
	 * @param date
	 * @return
	 */
	public static Date trans(String date) {
		Date d=new Date();
		try {
			 d=sdf.parse(date);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return d;
	}
}
