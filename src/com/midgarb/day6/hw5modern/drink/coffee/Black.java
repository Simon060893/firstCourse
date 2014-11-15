package com.midgarb.day6.hw5modern.drink.coffee;

public class Black extends Koffe {
	private String[] black = { new Sostav().getComposition()[0],
			new Sostav().getComposition()[3], new Sostav().getComposition()[2] };

	public Black() {
		setSostav(black);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Black   ";
	}

}
