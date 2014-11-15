package com.midgarb.day6.hw5.domain.Tea;

import com.midgarb.day6.hw5.domain.composition.Composition;
import com.midgarb.day6.hw5.domain.composition.Sugar;
import com.midgarb.day6.hw5.domain.composition.Water;

public class GreenTea extends Tea {
	private Composition[] greenTea = { new Water(), new Sugar() };

	public GreenTea() {
		setSostav(greenTea);
	}

	public Composition[] getComposition() {
		return greenTea;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "GreenTea";
	}

}
