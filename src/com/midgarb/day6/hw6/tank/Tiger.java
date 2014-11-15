package com.midgarb.day6.hw6.tank;

import java.awt.Color;

import com.midgarb.day5.f25.Direction;
import com.midgarb.day6.hw6.domain.Field;
import com.midgarb.day6.hw6.server.Action;

public class Tiger extends AbstractTank {
	private  int armor =3; 

	
	public Tiger(Action af, Field bf) {
		super(af, bf, 128, 512, direction);
		tankColor = new Color(255,0,250);
		towerColor = new Color(0,255,0);
	}
	public Tiger(Action af, Field bf, int x, int y, Direction direction){
		super(af, bf, x, y, direction);
		tankColor = new Color(255,0,250);
		towerColor = new Color(0,255,0);
	}

public void updateArmor(int i){
	this.armor +=i;
}
public int getArmor(){
	return armor;
}
public void destroy() {
	tankX = -100;
	tankY = -100;
}
}
