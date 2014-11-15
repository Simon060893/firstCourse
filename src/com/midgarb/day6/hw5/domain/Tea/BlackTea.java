package com.midgarb.day6.hw5.domain.Tea;

import com.midgarb.day6.hw5.domain.composition.Composition;
import com.midgarb.day6.hw5.domain.composition.Lemon;
import com.midgarb.day6.hw5.domain.composition.Sugar;
import com.midgarb.day6.hw5.domain.composition.Water;



public class BlackTea extends Tea {
	 Composition[] black = { new Water(), new Sugar(), new Lemon()};

	public BlackTea() {
		setSostav(black);
	}
	public Composition[] getComposition(){
		return black;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "BlackTea";
	}
}
