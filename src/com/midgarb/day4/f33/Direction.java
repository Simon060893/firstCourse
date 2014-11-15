package com.midgarb.day4.f33;

public enum Direction {
	NONE(0),UP(1), DOWN(2), RIGHT(3), LEFT(4);
	private int id;

	private Direction(int id) {
		this.id = id;
	}
	public int getId(){
		return id;
	}

}
