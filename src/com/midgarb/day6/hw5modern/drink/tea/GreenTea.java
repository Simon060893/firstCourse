package com.midgarb.day6.hw5modern.drink.tea;

import com.midgarb.day6.hw5modern.drink.coffee.Sostav;



public class GreenTea extends Tea {
	private String[] greenTea = { new Sostav().getComposition()[0],
			new Sostav().getComposition()[3], new Sostav().getComposition()[4] };

	public GreenTea() {
		setSostav(greenTea);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "GreenTea";
	}
}
