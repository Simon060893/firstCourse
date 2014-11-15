package com.midgarb.day5.f3;

import com.midgarb.day4.f33.Action;
import com.midgarb.day4.f33.Field;
import com.midgarb.day5.f25.Direction;

public class Tiger extends Tanku {
	private int armor;

	public Tiger(Action af, Field bf) {
		super(af, bf);
		speed = 2;
		armor = 1;
	}

	public Tiger(Action af, Field bf,int x, int y, Direction direction) {
		super(af, bf, x, y, direction);
		speed = 2;
		armor = 1;
	}

	public int isArmor() {
		return armor;
	}

	public void setArmor(int armor) {
		this.armor = armor;
	}

}