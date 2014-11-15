package com.midgarb.day5.hw5;

import java.util.Random;

import com.midgarb.day5.f25.Direction;


public class Tiger extends Tank {
	
	private  int armor =3; 

public Tiger(Action af, Field battleField, int parseInt, int parseInt2,
		Direction up) {
	tankX = parseInt;
	tankY = parseInt2;
}
public void updateArmor(int i){
	this.armor +=i;
}
public int getArmor(){
	return armor;
}


}
