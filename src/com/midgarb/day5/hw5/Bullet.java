package com.midgarb.day5.hw5;

import com.midgarb.day5.f25.Direction;


public class Bullet  {
	private int x;// вне видимости нашего поля
	private int y;
	private int speed = 5;
	private Direction direction;

	public Bullet(int x, int y, Direction direction) {
		this.x = x;
		this.y = y;
		this.direction = direction;
	}

	public void updateX(int x) {
		this.x += x;
	}

	public void updateY(int y) {
		this.y += y;
	}

	public void destroy() {
		x = -100;
		y = -100;
	}

	public int getSpeed() {
		return speed;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public Direction getDirection() {
		return direction;
	}

}
