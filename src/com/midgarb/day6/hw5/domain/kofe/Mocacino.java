package com.midgarb.day6.hw5.domain.kofe;

import com.midgarb.day6.hw5.domain.composition.Chocolate;
import com.midgarb.day6.hw5.domain.composition.Composition;
import com.midgarb.day6.hw5.domain.composition.Milk;
import com.midgarb.day6.hw5.domain.composition.Sugar;
import com.midgarb.day6.hw5.domain.composition.Water;

public class Mocacino extends Koffe {
	private Composition[] mocacino = { new Water(), new Sugar(), new Milk(),
			new Chocolate() };

	public Mocacino() {
		setSostav(mocacino);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Mocacino";
	}
}
