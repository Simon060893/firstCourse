package com.midgarb.day8.f02;


import java.text.SimpleDateFormat;
import java.util.Date;

public class Data {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
SimpleDateFormat s = new SimpleDateFormat("dd MMM yyyy");
Date data = new Date();
System.out.println(s.format(data));
//System.out.println(data);
Date date = s.parse("06 рту 1993");
System.out.println(date);
	}

}
