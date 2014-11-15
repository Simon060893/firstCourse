package com.midgarb.day7.gameOfTank.tank;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.ImageObserver;
import java.util.Random;

import javax.swing.JPanel;

import com.midgarb.day5.f25.Direction;
import com.midgarb.day7.gameOfTank.interfaces.IDestroyble;
import com.midgarb.day7.gameOfTank.interfaces.IDrawble;
import com.midgarb.day7.gameOfTank.server.Action;
import com.midgarb.day7.gameOfTank.util.Field;



public abstract class AbstractTank extends JPanel implements IDrawble,
		IDestroyble {
	protected int tankX;
	protected int tankY;
	private long speed = 10;
	protected   Direction direction;
	protected Image[] images;
	private boolean destroyed = false;
	public  void setDirection(Direction direction) {
		this.direction = direction;
	}

	private Field bf;// ситуация на поле
	private Bullet b2;

	private int crew;
	private int maxspped;
	protected Color tankColor;
	protected Color towerColor;

	public boolean isDestroyed() {
		return destroyed;
	}

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

	public AbstractTank( Field bf) {
		this( bf, 128, 512, Direction.UP);
	}

	public AbstractTank( Field bf, int x, int y, Direction direction) {
		this.tankX = x;
		this.tankY = y;
//		this.af = af;
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
public Action setUpAction(Action s){
	return s;
	
}

	public static String getLocation1() {
		Random r = new Random();
		int f = r.nextInt(3);
		String[] str = { "128_64", "512_192", "128_448" };
		String s = str[f];

		return s;
	}

	public void draw(Graphics g) {
		if(!destroyed){
			g.drawImage(images[getDirection().getId()], getX(), getY(), new ImageObserver(){
				@Override
				public boolean imageUpdate(Image img, int infoflags, int x,
						int y, int width, int height) {
					// TODO Auto-generated method stub
					return false;
				}
			});
		}
//		g.setColor(tankColor);
//		g.fillRect(this.tankX, this.tankY, 64, 64);
//
//		g.setColor(towerColor);
//		if (this.getDirection().getId() == 1) {
//			g.fillRect(this.getTankX() + 20, this.getTankY(), 24, 34);
//		} else if (this.getDirection().getId() == 2) {
//			g.fillRect(this.getTankX() + 20, this.getTankY() + 30, 24, 34);
//		} else if (this.getDirection().getId() == 3) {
//			g.fillRect(this.getTankX(), this.getTankY() + 20, 34, 24);
//		} else {
//			g.fillRect(this.getTankX() + 30, this.getTankY() + 20, 34, 24);
//		}
	}

	public void destroy() {
		destroyed =false;
//		tankX = -1000;
//		tankY = -1000;
	}
}
