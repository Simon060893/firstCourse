package com.midgarb.day6.hw6.domain;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

import com.midgarb.day6.hw6.server.Action;

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
