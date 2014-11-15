package com.midgarb.day6.hw5modern.drink.coffee;

public class Kapucino extends Koffe {
	private String[] kapucino = { new Sostav().getComposition()[0],
			new Sostav().getComposition()[3], new Sostav().getComposition()[5],
			new Sostav().getComposition()[6] };

	public Kapucino() {
		setSostav(kapucino);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "kapucino";
	}

}
