package com.midgarb.day8.f03;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Day {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar c= new GregorianCalendar();
		c.set(Calendar.MINUTE, 1);
		c.set(Calendar.MILLISECOND, 0);
		System.out.println(c.getTime());
		System.out.println(c.getActualMaximum(Calendar.DAY_OF_WEEK));
		c.set(1993, 7, 06);
		System.out.println(c.getTime());
	}

}
