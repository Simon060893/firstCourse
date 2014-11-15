package com.midgarb.day6.hw5.domain.kofe;

import com.midgarb.day6.hw5.domain.composition.Composition;
import com.midgarb.day6.hw5.domain.composition.Cream;
import com.midgarb.day6.hw5.domain.composition.Sugar;
import com.midgarb.day6.hw5.domain.composition.Water;

public class Black extends Koffe {
	private Composition[] black = { new Water(), new Cream(), new Sugar() };

	public Black() {
		setSostav(black);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Black   ";
	}

}
