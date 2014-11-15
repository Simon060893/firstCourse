package com.midgarb.day6.hw5.domain.kofe;

import com.midgarb.day6.hw5.domain.composition.Composition;
import com.midgarb.day6.hw5.domain.composition.Sugar;
import com.midgarb.day6.hw5.domain.composition.Water;

public class Americano extends Koffe {
	private Composition[] americano = { new Water(), new Sugar() };

	public Americano() {
		setSostav(americano);
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Americano";
	}
}
