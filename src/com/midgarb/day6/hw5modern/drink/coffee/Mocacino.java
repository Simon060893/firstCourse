package com.midgarb.day6.hw5modern.drink.coffee;

public class Mocacino extends Koffe {
	private String[] mocacino = { new Sostav().getComposition()[0],
			new Sostav().getComposition()[1], new Sostav().getComposition()[3],
			new Sostav().getComposition()[6] };

	public Mocacino() {
		setSostav(mocacino);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Mocacino";
	}
}
