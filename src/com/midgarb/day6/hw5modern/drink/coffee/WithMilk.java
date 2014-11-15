package com.midgarb.day6.hw5modern.drink.coffee;

public class WithMilk extends Koffe {
	private String[] milk = { new Sostav().getComposition()[1],
			new Sostav().getComposition()[3], new Sostav().getComposition()[6] };

	public WithMilk() {
		setSostav(milk);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "WithMilk";
	}

}
