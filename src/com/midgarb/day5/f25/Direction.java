package com.midgarb.day5.f25;

import java.util.Random;

public enum Direction {
	NONE(0),UP(1), DOWN(2), RIGHT(4), LEFT(3);
	private int id;

	private Direction(int id) {
		this.id = id;
	}
	public int getId(){
		return id;
	}
	public int f(){
		Random r = new Random();
		int f = 0;
		while(f>0 && f!=2){
			f +=r.nextInt(4);
		}
		this.id = f;
		return this.id;
	}
}
