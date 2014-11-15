package com.midgarb.day6.f23;

public class Glyph {
	private String[] g;
public Glyph(){
	System.out.println("Glyph");
	draw();
}
public void draw(){
	System.out.println("drawOfGlyph"+g.length);
}
}
