package com.midgarb.day6.hw5.domain.Tea;

import com.midgarb.day6.hw5.domain.composition.Bergamont;
import com.midgarb.day6.hw5.domain.composition.Composition;
import com.midgarb.day6.hw5.domain.composition.Sugar;
import com.midgarb.day6.hw5.domain.composition.Water;

public class Bergamot extends Tea {
	private Composition[] bergamot = { new Water(), new Sugar(),
			new Bergamont() };

	public Bergamot() {
		setSostav(bergamot);
	}
	public Composition[] getComposition() {
		return bergamot;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Bergamot";
	}

}
