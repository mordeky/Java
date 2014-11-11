package ch06.sec03.calendar;

import java.util.Calendar;

public class TestRandom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar c1 = Calendar.getInstance();
		//c1.set(2012, 7 - 1, 2); //表示2012年7月2日
		c1.set(1970, 1 - 1, 1); //表示2012年7月2日
		long t1 = c1.getTimeInMillis();
		// long t1 = Calendar.getInstance().getTimeInMillis();
		long t2 = Calendar.getInstance().getTimeInMillis();
		long s = 24*3600*1000;
		long diff = s - t1;
		 diff = (t2 - t1)/(365*s);
		System.out.println(diff);
	}

}
