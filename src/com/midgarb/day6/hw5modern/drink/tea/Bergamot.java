package com.midgarb.day6.hw5modern.drink.tea;

import com.midgarb.day6.hw5modern.drink.coffee.Sostav;

public class Bergamot extends Tea {
	private String[] bergamot = { new Sostav().getComposition()[0],
			new Sostav().getComposition()[3], new Sostav().getComposition()[7] };

	public Bergamot() {
		setSostav(bergamot);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Bergamot";
	}

}
