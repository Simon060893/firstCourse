package com.midgarb.day6.f12;

import java.awt.Color;
import java.awt.Graphics;

public class Triangle extends Shape {
	int[] xPoints = {0,60,0};
	int[] yPoints = {120,160,210};
	Color c;
@Override
public void draw(Graphics g) {
	g.setColor(c.orange);
g.drawPolygon(xPoints, yPoints,3);

}
}
