package cn.itcast.test;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Calendar;

import org.junit.Test;

public class test_01 {
     
	@Test
	public void getTime() {
		Calendar ca =Calendar.getInstance();
		SimpleDateFormat format = new SimpleDateFormat();
		int week = ca.getFirstDayOfWeek();
		long millis = ca.getTimeInMillis();// 获取从1970  年 1  月  1 日  0 0  时 0 0  分 0  秒到现在的毫秒数
	   ca.add(Calendar.MONTH, 0);
	   ca.set(Calendar.DAY_OF_MONTH, 1);
	   String format2 = format.format(ca.getTime());
	   /*LocalDate、LocalTime、LocalDateTime、Clock、Instant 等类*/
	   LocalDate now = LocalDate.now();
			   System.out.println(now);
		System.out.println(week);
		System.out.println(millis);
		System.out.println(format2);
		
		LocalDateTime today= LocalDateTime.now();//获取当前时间
		 LocalDateTime yestaday=today.minusDays(1);//获取昨天时间
		 System.out.println(today);
		 System.out.println(yestaday);
	}
	
	@Test
	public void aboutInteger() {
		  Integer i1=22,i2=22,i3=453,i4=453;
		  System.out.println(i1==i2);
		  System.out.println(i3==i4);
		   String s ="123";
		   int a =0;
		   Integer of = Integer.valueOf(s);
		   
		   Integer i = Integer.parseInt(s);
		   System.out.println(i);
		   System.out.println(of);
	}
}
