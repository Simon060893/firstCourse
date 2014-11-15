package com.midgarb.day6.hw5modern.drink.tea;

import com.midgarb.day6.hw5modern.drink.coffee.Sostav;



public class BlackTea extends Tea {
	private String[] black = { new Sostav().getComposition()[0],
			new Sostav().getComposition()[3] };

	public BlackTea() {
		setSostav(black);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "BlackTea";
	}
}
