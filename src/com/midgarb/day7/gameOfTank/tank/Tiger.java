package com.midgarb.day7.gameOfTank.tank;

import java.awt.Color;

import com.midgarb.day5.f25.Direction;
import com.midgarb.day7.gameOfTank.util.Field;





public class Tiger extends AbstractTank {
	private  int armor =3; 

	
	public Tiger( Field bf) {
		super( bf, 128, 512, Direction.DOWN);
		tankColor = new Color(255,0,250);
		towerColor = new Color(0,255,0);
	}
	public Tiger( Field bf, int x, int y, Direction direction){
		super(bf, x, y, direction);
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
