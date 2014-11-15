package com.midgarb.day6.hw5.domain.Bun;

import com.midgarb.day6.hw5.domain.composition.Composition;
import com.midgarb.day6.hw5.domain.composition.Cream;

public class Rogalik extends Bun {
	private Composition[] rogalik = { new Cream() };

	public Rogalik() {
		setSostav(rogalik);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Rogalik ";
	}
}
