package com.midgarb.day4.hw5;

public enum Janr {
	FANTASY(0), FOOD(1), COMPUTERS(2), FICTION(3), HISTORY(4);

	private int i;

	private Janr(int i) {
		this.i = i;
	}
	public int getId(){
		return i;
	}
}
