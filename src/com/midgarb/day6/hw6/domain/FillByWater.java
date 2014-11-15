package com.midgarb.day6.hw6.domain;

import java.awt.Color;
import java.awt.Graphics;

import com.midgarb.day6.hw6.server.Action;

public class FillByWater extends Pole {
	int x;
	int y;
	int width;
	int height;

	
public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
public FillByWater(Graphics g,int i1,int j1, int fd,int fd3) {
//	int fd= i1+32;
//	int fd3= j1+32;
//	for(int  i = i1+30, j =j1+30; i>i1 && j>j1; i -=2,j -=2){
	g.setColor(new Color(0,0,0));
		draw( g, i1, j1, fd , fd3);
		
//		try {
//			Thread.sleep(100);
//		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		repaint();
//	}
//		
}

	public void draw(Graphics g,int i,int j,int g3,int hg){
		g.fillRect(i, j, g3, hg );
	}


@Override
public void draw(Graphics g) {
	// TODO Auto-generated method stub
}
}
