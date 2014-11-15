package com.midgarb.day6.hw6.domain;

import java.awt.Color;
import java.awt.Graphics;

import com.midgarb.day6.hw6.interfaces.Drawble;

public class Brick extends Pole implements Drawble {
	public void draw1(Graphics g) {	g.setColor(new Color(255, 0, 150));
	}

	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		g.setColor(new Color(255, 150, 150));
	}
}
