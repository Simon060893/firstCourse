package com.midgarb.day6.f12;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

public class Circle extends Shape {
	Color c;
	int i;
	int j;
	int g1;
	int g2;



	public int getI() {
		return i;
	}



	public int getJ() {
		return j;
	}



	public void setI(int i) {
		this.i = i;
	}



	public void setJ(int j) {
		this.j = j;
	}


	public void setG1(int g1) {
		this.g1 = g1;
	}


	public void setG2(int g2) {
		this.g2 = g2;
	}

	// Font font;
	public void draw(Graphics g, int i, int j, int g1, int g2) {

		g.fillOval(this.i , this.j , this.g1 , this.g2);

	}
	

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "circle";
	}

	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		g.fillOval(this.i, this.j, this.g1, this.g2 );
		g.setColor(c.cyan);
		g.clearRect(90, 90, 30, 30);
		g.drawRoundRect(290, 10, 150, 200, 50, 100);
		g.drawOval(100, 100, 200, 120);

		g.setColor(c.blue);

	}



	public int getG1() {
		return g1;
	}



	public int getG2() {
		return g2;
	}
}
