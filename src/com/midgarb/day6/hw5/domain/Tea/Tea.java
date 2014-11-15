package com.midgarb.day6.hw5.domain.Tea;

import com.midgarb.day6.hw5.domain.composition.Composition;

public abstract class Tea {
	private Composition[] sostav;
	

	public void setSostav(Composition[] sostav) {
		String s;
		this.sostav = new Composition[sostav.length];
		for (int i = 0; i < sostav.length; i++) {
			this.sostav[i] = sostav[i];
		}
	}

	public Composition[] getSostav() {
		return sostav;
	}

}
