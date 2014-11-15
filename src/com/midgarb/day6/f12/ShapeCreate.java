package com.midgarb.day6.f12;

import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

public class ShapeCreate extends JPanel {
	
	private Drawble[] shapes;
	Circle c ;
	
	public ShapeCreate(Drawble[] shapes) {
		this.shapes = shapes;
		if (shapes == null || shapes.length < 1) {
			this.shapes = new Shape[0];
		}
		c = new Circle();
		JFrame frame = new JFrame("DAY 6, 2D Graphics");
		frame.setLocation(350, 150);
		frame.setMinimumSize(new Dimension(600, 300));
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		frame.getContentPane().add(this);
		frame.pack();
		frame.setVisible(true);
		
//		repaint();
	}
	
	public void fr() throws InterruptedException{
		int n =50;
		int m = 50;
		for(int i = 90, j = 90; i>44 && j > 44; i -=5, j -=5){
			m +=5;
			n +=5;
		c.setI(i);
			c.setJ(j);
			c.setG1(n+=5);
			c.setG2(m+=5);
			//c.draw(g);
			Thread.sleep(1000);
			repaint();
			}
		
	}
	@Override
	protected void paintComponent(Graphics g) {
		for (Drawble s : shapes) {
			s.draw(g);	
			if(s instanceof Circle){
				c.draw(g);
			}
			}
		
		
	}
}