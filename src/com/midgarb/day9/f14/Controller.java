package com.midgarb.day9.f14;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class Controller  extends MouseAdapter implements InterceptionListener {
	
	private Model model;
	private View view;

	public Controller(Model model, View view) {
		this.model = model;
		this.view = view;
	}
	@Override
	public void mouseMoved(MouseEvent e) {
		view.getMouse().x = e.getX();
		view.getMouse().y = e.getY();
		view.repaint();
	}

	@Override
	public void processInterception() {
		// TODO Auto-generated method stub
		model.processInterception();
		view.repaint();
	}
}
