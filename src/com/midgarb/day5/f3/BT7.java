package com.midgarb.day5.f3;

import com.midgarb.day4.f33.Action;
import com.midgarb.day4.f33.Field;
import com.midgarb.day5.f25.Direction;




public class BT7 extends Tanku {

	
	public BT7(Action af, Field bf){
		super(af,bf);
speed=5;
	}
	public BT7(Action af, Field bf, int x, int y, Direction direction) {
		super(af, bf, x, y, direction);
		speed=5;
	}
	
	
	@Override
	public  String toString() {
		// TODO Auto-generated method stub
		 String str = "BT7: color-";
		return str;
	}
	@Override
	public void move() throws Exception {
		// TODO Auto-generated method stub
System.out.println(1+3);
	}
}
