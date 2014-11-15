package com.midgarb.day6.f12;

import java.awt.Color;
import java.awt.Graphics;

public class Square extends Rectangle {
	int i=6;
public Square(int i){
	System.out.println("Square");
bla();
this.i=i;
}

@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		setC1(10);
		filling(xPoints);
		setC1(70);
		filling(xPoints);
		setC1(70);
		filling(xPoints);
		setC1(10);
		filling(xPoints);
		setC1(70);
		filling(yPoints);
		setC1(70);
		filling(yPoints);
		setC1(10);
		filling(yPoints);
		setC1(10);
		filling(yPoints);
		g.setColor(new Color(150, 0, 250));
		super.draw(g);
	}
public void bla(){
	System.out.println("blaOfSquare"+i);
}
}
