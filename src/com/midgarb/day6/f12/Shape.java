package com.midgarb.day6.f12;

import java.awt.Graphics;
import java.io.Serializable;

import javax.swing.JPanel;

public abstract class Shape extends JPanel implements Drawble, Serializable  {
	public void bla() {
		System.out.println("blaOfShape");
	}

	

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Shape";
	}

}
