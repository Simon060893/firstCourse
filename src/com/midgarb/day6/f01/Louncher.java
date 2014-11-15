package com.midgarb.day6.f01;

public class Louncher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	try{
		Louncher.doSomeThink();
	}catch(InterruptedException e){
		//System.out.println("ds");
		e.printStackTrace();
	}
	catch(IllegalArgumentException e){
		System.out.println("ds");
		e.printStackTrace();
	}
	}
	public static void doSomeThink() throws InterruptedException{
		Thread.sleep(-1000);
	}

}
