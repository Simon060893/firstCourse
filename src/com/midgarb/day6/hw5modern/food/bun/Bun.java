package com.midgarb.day6.hw5modern.food.bun;

import com.midgarb.day6.hw5modern.food.Food;

public abstract class Bun extends Food {
	private String[] sostav;
	private Double price=0.0d;

	public void setSostav(String[] sostav) {
		this.sostav = new String[sostav.length];
		for (int i = 0; i < sostav.length; i++) {
			this.sostav[i] = sostav[i].substring(0, sostav[i].indexOf("("));
			price += Double.parseDouble(sostav[i].substring(
					sostav[i].indexOf("(") + 1, sostav[i].indexOf(")")));
		}
	}

	public String[] getSostav() {
		return sostav;
	}

	public Double getPrice() {
		return price;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "BUN";
	}
}
