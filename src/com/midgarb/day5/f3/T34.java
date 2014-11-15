package com.midgarb.day5.f3;

import com.midgarb.day4.f33.Action;
import com.midgarb.day4.f33.Tank;

public class T34 extends Tank {
	private Action af;
	public static  String str=null ;

	public static void setStr(String str) {
		T34.str = str;
	}
	public T34() {
		
		System.out.println(str);
		System.out.println("T34");
	}
	public static void main(String[] args){
		System.out.println("Sus");
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub

		return "this is T34";
	}

	@Override
	public void move() throws Exception {
		// TODO Auto-generated method stub
		System.out.println(5);

	}
}
