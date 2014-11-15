package com.midgarb.day6.hw5.domain.Bun;

import com.midgarb.day6.hw5.domain.composition.Composition;
import com.midgarb.day6.hw5.domain.composition.Cream;
import com.midgarb.day6.hw5.domain.composition.Sugar;

public class Kruassan extends Bun {
	private Composition[] kruassan = { new Cream(), new Sugar() };

	public Kruassan() {
		setSostav(kruassan);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "kruassan";
	}
}
