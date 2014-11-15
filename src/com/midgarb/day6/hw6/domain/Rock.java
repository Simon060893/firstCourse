package com.midgarb.day6.hw6.domain;

import java.awt.Color;
import java.awt.Graphics;

public class Rock extends Pole {
	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		g.setColor(new Color(255, 255, 0));
	}
}
