package com.midgarb.day6.hw5.domain.Bun;

import com.midgarb.day6.hw5.domain.composition.Composition;

public abstract class Bun {
	private Composition[] sostav;
	private Double pric;

	public void setSostav(Composition[] sostav) {
		this.sostav = new Composition[sostav.length];
		for (int i = 0; i < sostav.length; i++) {
			this.sostav[i] = sostav[i];
		}
	}

	public Composition[] getSostav() {
		return sostav;
	}

}
