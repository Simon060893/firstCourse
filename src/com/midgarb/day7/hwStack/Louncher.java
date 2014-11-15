package com.midgarb.day7.hwStack;

public class Louncher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack s = new Stack(4);
		s.push("fg");
		s.push("fg1");
		s.push("fg2");
		s.push("fg3");
		s.push("fg4");
		s.push("fg5");
		s.pop("fg4");
		s.pop("fg2");
		s.print();
		System.out.println(s.peak("fg2"));
	}

}
