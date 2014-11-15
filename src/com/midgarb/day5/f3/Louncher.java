package com.midgarb.day5.f3;

import com.midgarb.day4.f33.Tank;

public class Louncher {
	//static T34 t34 = new T34();
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
//		BT7 bt7 = new BT7();
//		bt7.setColor("blue");
//		bt7.setMaxspped(70);
//		bt7.setCrew(5);
//		bt7.updateX(128);
//		bt7.updateY(64);
//		
		T34 t44 = new T34();
		T34 t34 = new T34();
		t34.setColor("red");
		t34.setMaxspped(45);
		t34.setCrew(5);
		t34.main(args);
		T34.setStr("fg");
		System.out.println(T34.str);
		

//		Tiger tigr = new Tiger();
//		tigr.setColor("black)");
//		tigr.setMaxspped(34);
//		tigr.setCrew(3);
//		tigr.setArmor(true);
//		System.out.println("Color:" + " bt7 " + bt7.getColor() + " t34 "
//				+ t34.getColor() + " tigr " + tigr.getColor());
//		System.out.println("MaxSpeed:" + " bt7 " + bt7.getMaxspped() + " t34 "
//				+ t34.getMaxspped() + " tigr " + tigr.getMaxspped());
//		System.out.println("Crew:" + " bt7 " + bt7.getCrew() + " t34 "
//				+ t34.getCrew() + " tigr " + tigr.getCrew());
//		System.out.println("t34 "+t34.str);
//		System.out.println("t44 "+t44.str);
//	t34.str  ="gjk";
//	System.out.println("t34 "+t34.str);
//	System.out.println("t44 "+t44.str);
	//proverka(t34);
//	Integer f = new Integer(10);
//	f.toString();
//	int g = 8;
//	System.out.println(g+f.toString());
Tank t = new Tank();
		if(t34 instanceof Tank ){
		T34 t341 = (T34)t;
		System.out.println(t);
	}
	}
	public static void proverka(Tank i) throws Exception{
	
		if( i instanceof T34){
			T34 t4 = (T34) i;
			t4.move();
		}else{
			System.out.println("hj");		
		}
		i.gf();
	}

}
