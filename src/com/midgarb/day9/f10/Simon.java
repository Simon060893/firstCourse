package com.midgarb.day9.f10;

import com.midgarb.day9.f10.interfaces.Subscriber;


public class Simon implements Subscriber  {
	

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Simon" +"notify";
	}

	public void update() {
		// TODO Auto-generated method stub
		System.out.println("Simon is" +"notify");
	}

}
