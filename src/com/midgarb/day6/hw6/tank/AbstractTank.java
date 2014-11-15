package com.midgarb.day6.hw6.tank;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

import javax.swing.JPanel;

import com.midgarb.day5.f25.Direction;
import com.midgarb.day6.hw6.domain.Field;
import com.midgarb.day6.hw6.interfaces.Destroyable;
import com.midgarb.day6.hw6.interfaces.Drawble;
import com.midgarb.day6.hw6.server.Action;

public abstract class AbstractTank extends JPanel implements Drawble,
		Destroyable {
	protected int tankX;
	protected int tankY;
	private long speed = 10;
	protected static Direction direction;
	private Action af;// рычаг
	private Field bf;// ситуация на поле
	private Bullet b2;

	private int crew;
	private int maxspped;
	protected Color tankColor;
	protected Color towerColor;

	public int getCrew() {
		return crew;
	}

	public void setCrew(int crew) {
		this.crew = crew;
	}

	public int getMaxspped() {
		return maxspped;
	}

	public void setMaxspped(int maxspped) {
		this.maxspped = maxspped;
	}

	public AbstractTank(Action af, Field bf) {
		this(af, bf, 128, 512, direction.UP);
	}

	public AbstractTank(Action af, Field bf, int x, int y, Direction direction) {
		this.tankX = x;
		this.tankY = y;
		this.af = af;
		this.bf = bf;
		this.direction = direction;
	}

	public int getTankX() {
		return tankX;
	}

	public void updateX(int tankX) {
		this.tankX += tankX;
	}

	public int getTankY() {
		return tankY;
	}

	public void updateY(int tankY) {
		this.tankY += tankY;
	}

	public Direction getDirection() {
		return direction;
	}

	public void turn(Direction direction) throws Exception {
		this.direction = direction;
		af.processTurn(this);//
	}

	public void move() throws Exception {
		af.processMove(this);

	}

	public void fire() throws Exception {
		Bullet bullet = new Bullet((tankX + 25), (tankY + 25), direction);
		af.processFire(bullet,this);

	}

	public void moveRandom() throws Exception {
		af.processmoveRandom();

	}

	public void moveToQuadrant(int v, int h) throws Exception {
		af.procesMoveToQuadrant(v, h,this);
	}

	public static void gf() {
		System.out.println("j");
	}

	public static String getLocation1() {
		Random r = new Random();
		int f = r.nextInt(3);
		String[] str = { "128_64", "512_192", "128_448" };
		String s = str[f];

		return s;
	}

	public void draw(Graphics g) {
		g.setColor(tankColor);
		g.fillRect(this.tankX, this.tankY, 64, 64);

		g.setColor(towerColor);
		if (this.getDirection().getId() == 1) {
			g.fillRect(this.getTankX() + 20, this.getTankY(), 24, 34);
		} else if (this.getDirection().getId() == 2) {
			g.fillRect(this.getTankX() + 20, this.getTankY() + 30, 24, 34);
		} else if (this.getDirection().getId() == 3) {
			g.fillRect(this.getTankX(), this.getTankY() + 20, 34, 24);
		} else {
			g.fillRect(this.getTankX() + 30, this.getTankY() + 20, 34, 24);
		}
	}

	public void destroy() {
		tankX = -100;
		tankY = -100;
	}
}
