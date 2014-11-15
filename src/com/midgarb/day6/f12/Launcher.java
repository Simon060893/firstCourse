package com.midgarb.day6.f12;

import java.awt.Graphics;

public class Launcher {
static Drawble[] shapes={new Circle(),new Rectangle(), new Triangle(),new Square(2)};

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
//		Shape c = new Circle();
//		Shape r = new Rectangle();
//		Shape t = new Triangle();
		ShapeCreate v = new ShapeCreate(shapes);
		v.fr();
		
//		Rectangle s = new Square(150);
//		s.bla();
		
	}

}
