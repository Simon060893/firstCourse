package com.midgarb.day8.game.util;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.ImageObserver;

import javax.swing.JPanel;

public abstract class Pole extends JPanel {
	protected Color color;
	protected Image image;
	protected Image image1;
	protected  Image imageSafe;
	private int x;
	private int y;
	private boolean destroyble = false;

	public Pole() {

	}

	public Pole(int x, int y, Image imageSafe) {
		this.x = x;
		this.y = y;
		this.imageSafe = imageSafe;
	}

	public Image getImageSafe() {
		return imageSafe;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public boolean isDestroyble() {
		return destroyble;
	}

	public void destroy() {
		destroyble = true;
	}

	public void draw(Graphics g) {
		if (!destroyble) {
//			if (image != null) {
				g.drawImage(getImageSafe(), getX(), getY(), getX() + 64, getY() + 64,
						getX(), getY(), getX() + 64, getY() + 64,
						new ImageObserver() {
							@Override
							public boolean imageUpdate(Image img,
									int infoflags, int x, int y, int width,
									int height) {
								// TODO Auto-generated method stub
								return false;
							}
						});
//			} else {
//				g.setColor(Color.BLUE);
//				g.fillRect(this.getX(), this.getY(), 64, 64);
//			}
		}
	}

	public void draw1(Graphics g) {

	}

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

}
