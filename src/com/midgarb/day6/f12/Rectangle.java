package com.midgarb.day6.f12;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Stroke;

public class Rectangle extends Shape {
	int[] xPoints = new int[5];
	int[] yPoints = new int[5];
	int c1;
	Color c;
	public int getC1() {
		return c1;
	}
	public void setC1(int c1) {
		this.c1 = c1;
	}
	protected Rectangle(){
//		setC1(50);
//		filling(xPoints);
//		setC1(270);
//		filling(xPoints);
//		setC1(270);
//		filling(xPoints);
//		setC1(10);
//		filling(xPoints);
//		setC1(70);
//		filling(yPoints);
//		setC1(70);
//		filling(yPoints);
//		setC1(10);
//		filling(yPoints);
//		setC1(10);
//		filling(yPoints);
//		g.setColor(new Color(250, 100, 0));
	}

	@Override
	public void bla(){
		System.out.println("blaOfRectangle");
	}
	public void draw(Graphics g) {
		Graphics2D f = (Graphics2D) g;
		f.setStroke(new BasicStroke(15));
		g.setColor(c.gray);
		g.drawPolygon(xPoints, yPoints, 4);
		
	}
	public void filling(int [] c){
		for(int i =0; i <c.length;i++){
			if(c[i] == 0){
				c[i]=getC1();
				return;
			}
		}
	}
}
