package ch06.sec03.calendar;

import java.util.Calendar;
import java.util.Date;

public class TestCalendar {

	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		String strStyle = "%1$tY-%1$tm-%1$td %1$tH:%1$tM:%1$tS";
		String s = String.format(strStyle, c);
		System.out.println(s);// ��������ڣ�2012-07-02 11:34:34

		c.set(2012, 7 - 1, 2); // ��ʾ2012��7��2��
		c.set(Calendar.DATE, 10); // ��Ϊ2012��7��10��

		s = String.format(strStyle, c);
		System.out.println(s);// ��������ڣ�2012-07-02 11:34:34
		
		Calendar c6 = Calendar.getInstance();
		Date d1 = c6.getTime();// ת��ΪDate����
		
		Date d = new Date();
		Calendar c7 = Calendar.getInstance();// ת��ΪCalendar
		c7.setTime(d);
	}
}
