package com.midgarb.day7.gameOfTank.interfaces;

import com.midgarb.day5.f25.Direction;

public interface ITank {
	public void turn(Direction direction);
	public void move();
	public void fire();
	public void moveToQuadrant(int v, int h);
}
