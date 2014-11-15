package com.midgarb.day6.hw5.domain.kofe;

import com.midgarb.day6.hw5.domain.composition.Chocolate;
import com.midgarb.day6.hw5.domain.composition.Composition;
import com.midgarb.day6.hw5.domain.composition.Sugar;
import com.midgarb.day6.hw5.domain.composition.Water;

public class Kapucino extends Koffe {
	private Composition[] kapucino = { new Water(), new Sugar(),
			new Chocolate() };

	public Kapucino() {
		setSostav(kapucino);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "kapucino";
	}

}
