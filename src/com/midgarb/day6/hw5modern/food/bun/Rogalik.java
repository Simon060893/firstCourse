package com.midgarb.day6.hw5modern.food.bun;

import com.midgarb.day6.hw5modern.drink.coffee.Sostav;

public class Rogalik extends Bun {
	private String[] rogalik = { new Sostav().getComposition()[2],
			new Sostav().getComposition()[3], new Sostav().getComposition()[5] };

	public Rogalik() {
		setSostav(rogalik);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Rogalik ";
	}
}
