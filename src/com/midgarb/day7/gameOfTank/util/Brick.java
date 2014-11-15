package com.midgarb.day7.gameOfTank.util;

import java.awt.Color;
import java.awt.Graphics;

public class Brick extends Pole {
	public void draw1(Graphics g) {
		g.setColor(new Color(255, 0, 150));
	}

	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		g.setColor(new Color(255, 150, 150));
	}
}
