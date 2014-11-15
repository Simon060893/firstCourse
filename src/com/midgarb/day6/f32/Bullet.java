package com.midgarb.day6.f32;

import java.awt.Color;
import java.awt.Graphics;

import com.midgarb.day5.f25.Direction;


public class Bullet  implements Drawble, Destroyable  {
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
	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		g.setColor(new Color(205,0,105));
		g.fillRect(this.x, this.y, 14, 14);
	}
	public void destroy() {
		x = -100;
		y = -100;
	}
}
