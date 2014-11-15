package com.midgarb.day7.gameOfTank.util;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public abstract class Pole extends JPanel {
	protected Color color;

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public abstract void draw(Graphics g);

	public void draw1(Graphics g) {

	}
}