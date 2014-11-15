package com.midgarb.day6.hw5modern.food.bun;

import com.midgarb.day6.hw5modern.drink.coffee.Sostav;

public class Kruassan extends Bun {
	private String[] kruassan = { new Sostav().getComposition()[2],
			new Sostav().getComposition()[4] };

	public Kruassan() {
		setSostav(kruassan);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "kruassan";
	}
}
