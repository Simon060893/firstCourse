package com.midgarb.day6.hw5modern.drink.coffee;

public class Americano extends Koffe {
	private String[] americano = { new Sostav().getComposition()[0],
			new Sostav().getComposition()[3],
			new Sostav().getComposition()[6] };

	public Americano() {
		setSostav(americano);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Americano";
	}

}
