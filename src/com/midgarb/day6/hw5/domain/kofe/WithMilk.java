package com.midgarb.day6.hw5.domain.kofe;

import com.midgarb.day6.hw5.domain.composition.Composition;
import com.midgarb.day6.hw5.domain.composition.Milk;
import com.midgarb.day6.hw5.domain.composition.Sugar;
import com.midgarb.day6.hw5.domain.composition.Water;

public class WithMilk extends Koffe {
	private Composition[] milk = { new Water(), new Sugar(), new Milk() };

	public WithMilk() {
		setSostav(milk);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "WithMilk";
	}

}
