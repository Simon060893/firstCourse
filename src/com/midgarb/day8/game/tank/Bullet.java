package com.midgarb.day8.game.tank;

import java.awt.Color;
import java.awt.Graphics;

import com.midgarb.day5.f25.Direction;
import com.midgarb.day8.game.interfaces.IDestroyble;
import com.midgarb.day8.game.interfaces.IDrawble;


public class Bullet implements IDrawble, IDestroyble {
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

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public int getSpeed() {
		return speed;
	}

	public Direction getDirection() {
		return direction;
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		x = -100;
		y = -100;
	}

	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		g.setColor(new Color(250, 250, 0));
		g.fillRect(this.x, this.y, 10, 10);
	}
}
