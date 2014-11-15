package com.midgarb.day4.f25;

import com.midgarb.day4.f26.TankColor;

public class Vapor {
	private int olume;
	String name;
	Vapor e;

	public String getE() {
		return e.getName();
	}
	public void setE(Vapor e) {
		this.e = e;
	}
	public String getName() {
		return name;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Water w1 = new Water("w1");
//		Water w2 = new Water("w2");
//		Water w3 = new Water("w3");
//		w1.SetWater(w2);
//		w2.SetWater(w3);
//		w3.SetWater(w1);
//		w1.printWw1();
//		w2.printWw1();
//		w3.printWw1();
		System.out.println(TankColor.Black);
		System.out.println(TankColor.DarkBlue);
		System.out.println();
		
	}
public Vapor(String name){
	this.name = name;
	//System.out.println("th");
}

public int getOlume() {
	return olume;
}
public void setOlume(int volume) {
	this.olume = volume;
}
}
