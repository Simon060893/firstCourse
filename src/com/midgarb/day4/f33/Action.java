package com.midgarb.day4.f33;


import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

import com.midgarb.day5.f3.T34;

public class Action extends JPanel {
	private boolean COLORDED_MODE = false;// цвет фона
	private Tank t1;
	private Direction di; 
	private Bullet b1;
	private T34 t3;
	private Field battleField;


	public void runTheGame() throws Exception {
		//t1.moveRandom();
		t1.moveToQuadrant(3,1);
		t1.moveToQuadrant(8,1);
	}

	public void processTurn(Tank tank) throws Exception {
		repaint();

	}
	
	public void processMove(Tank tank) throws Exception {
		this.t1 = tank;
		Direction direction = t1.getDirection();
		int step = 0;
		if ((direction.getId() == 1 && t1.getTankY() == 0) || (direction.getId() == 2 && t1.getTankY() >= 512)
				|| (direction.getId() == 3 && t1.getTankX() == 0)|| ((direction.getId() == 4 && t1.getTankX() >= 512))) {
			System.out.println("direction" + t1.getDirection() + " tabkX" + t1.getTankX()
					+ " tankY " + t1.getTankY());
			return;
		}
		t1.turn(t1.getDirection());

		while (step < 64) {
			if (direction.getId() == 1) {
				repaint();
				t1.updateY(-1);
				b1.updateY(-1);
				System.out.println("top" + t1.getTankY());
			} else if (direction.getId() == 2) {
				repaint();
				t1.updateY(1);
				b1.updateY(1);
				System.out.println("bottom" + t1.getTankY());
			} else if (direction.getId() == 3) {
				repaint();
				t1.updateX(-1);
				b1.updateX(-1);
				System.out.println("left" + t1.getTankX());
			} else if (direction.getId() == 4) {
				repaint();
				t1.updateX(1);
				b1.updateX(1);
				System.out.println("right" + t1.getTankX());
			}
			step++;
			Thread.sleep(10);
		}	
	}

	public void processFire(Bullet b) throws Exception {
		this.b1 = b;
		Direction tankDirection = t1.getDirection();
		while ((b1.getX() > -14 && b1.getX() < 590)
				&& (b1.getY() > -14 && b1.getY() < 590)) {// до какого момента с
														// учетом 14px размер
														// снар€да
			if (tankDirection.getId() == 1) {
				b1.updateY(-1);

				repaint();
				Thread.sleep(5);

			}
			if (tankDirection.getId() == 2) {
				b1.updateY(1);

				repaint();
				Thread.sleep(5);
			}
			if (tankDirection.getId() == 3) {
				b1.updateX(-1);

				repaint();
				Thread.sleep(5);
			}
			if (tankDirection.getId() == 4) {
				b1.updateX(1);

				repaint();
				Thread.sleep(5);
			}
			// processInterception();
			if (processInterception()) {
				b1.destroy();
				break;
			}

		}

	}


	public String getQuadrant(int x, int y) {
		return x / 64 + "_" + y / 64;
	}

	private boolean processInterception() {

		String s = getQuadrant(b1.getX(), b1.getY());
		int j = Integer.parseInt(s.split("_")[0]);
		int i = Integer.parseInt(s.split("_")[1]);
		if ((i >= 0 && i <= 8) && (j >= 0 && j <= 8)) {
			if (!battleField.scanQuadrant(i, j).trim().isEmpty()) {
				battleField.upadateQuadrant(i, j, "");
				return true;
			}
		}
		return false;

	}

	public boolean processInterception1() throws Exception {
		if (t1.getDirection().getId() == 2) {
			String s = getQuadrant(t1.getTankX(), t1.getTankY() + 64);
			int j = Integer.parseInt(s.split("_")[0]);
			int i = Integer.parseInt(s.split("_")[1]);
			if ((i >= 0 && i <= 8) && (j >= 0 && j <= 8)) {
				if (!battleField.scanQuadrant(i, j).trim().isEmpty()) {
					
					return true;
				}
			}
		}
		if (t1.getDirection().getId() == 1) {
			String s = getQuadrant(t1.getTankX(), t1.getTankY() - 64);
			int j = Integer.parseInt(s.split("_")[0]);
			int i = Integer.parseInt(s.split("_")[1]);
			if ((i >= 0 && i <= 8) && (j >= 0 && j <= 8)) {
				if (!battleField.scanQuadrant(i, j).trim().isEmpty()) {
				
					return true;
				}
			}
		}
		if (t1.getDirection().getId() == 4) {
			String s = getQuadrant(t1.getTankX() + 64, t1.getTankY());
			int j = Integer.parseInt(s.split("_")[0]);
			int i = Integer.parseInt(s.split("_")[1]);
			if ((i >= 0 && i <= 8) && (j >= 0 && j <= 8)) {
				if (!battleField.scanQuadrant(i, j).trim().isEmpty()) {
				
					return true;
				}
			}
		}
		if (t1.getDirection().getId() == 3) {
			String s = getQuadrant(t1.getTankX() - 64, t1.getTankY());
			int j = Integer.parseInt(s.split("_")[0]);
			int i = Integer.parseInt(s.split("_")[1]);
			if ((i >= 0 && i <= 8) && (j >= 0 && j <= 8)) {
				if (!battleField.scanQuadrant(i, j).trim().isEmpty()) {
					
					return true;
				}
			}
		}
		return false;

	}


	public  String getQuadentXY(int v, int hor) {
		return (v - 1) * 64 + "_" + (hor - 1) * 64;

	}
	public void processmoveRandom() throws Exception {
		Random d = new Random();
		int i;
		while (true) {
			i = d.nextInt(5);
			if (i > 0) {
				t1.move();
				t1.turn(t1.getDirection());
			}

		}

	}
	public void procesMoveToQuadrant(int v, int h) throws Exception {
		String f1 = getQuadentXY(v, h);
		int f2 = Integer.parseInt(f1.substring(0, f1.indexOf("_")));
		int f3 = Integer.parseInt(f1.substring(f1.indexOf("_") + 1));
		while (t1.getTankX() < f2) {
			t1.turn(t1.getDirection());
			if (processInterception1()) {
				t1.fire();
			}
			t1.move();
			Thread.sleep(10);
		}
		while (t1.getTankX() > f2) {
			t1.turn(t1.getDirection());
			if (processInterception1()) {
				t1.fire();
			}
			t1.move();
			Thread.sleep(10);
		}
		while (t1.getTankY() < f3) {
			t1.turn(t1.getDirection());
			if (processInterception1()) {
				t1.fire();
			}
			t1.move();
			Thread.sleep(10);
		}
		while (t1.getTankY() > f3) {
			t1.turn(t1.getDirection());
			if (processInterception1()) {
				t1.fire();
			}
			t1.move();
			Thread.sleep(10);
		}

	}
	
	public Action() throws Exception {
		battleField = new Field();
		t1 = new Tank(this,battleField );
		//Direction d;
		b1 = new Bullet(-100, -100, t1.getDirection());
		JFrame frame = new JFrame("BATTLE FIELD, DAY 4");
		frame.setLocation(500, 150);
		frame.setMinimumSize(new Dimension(battleField.getBfWidth(), battleField.getBfHEIGHT() + 32));
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		frame.getContentPane().add(this);
		frame.pack();
		frame.setVisible(true);
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);

		int i = 0;
		Color cc;
		for (int v = 0; v < 9; v++) {
			for (int h = 0; h < 9; h++) {
				if (COLORDED_MODE) {
					if (i % 2 == 0) {
						cc = new Color(252, 241, 177);
					} else {
						cc = new Color(233, 243, 255);
					}
				} else {
					cc = new Color(180, 180, 180);
				}
				i++;
				g.setColor(cc);
				g.fillRect(h * 64, v * 64, 64, 64);
			}
		}

		for (int j = 0; j < battleField.getDimentionY(); j++) {
			for (int k = 0; k < battleField.getDimentionX(); k++) {
				if (battleField.scanQuadrant(j, k).equals("B")) {
					String coordinates = getQuadentXY(j + 1, k + 1);
					int separator = coordinates.indexOf("_");
					int y = Integer.parseInt(coordinates
							.substring(0, separator));
					int x = Integer.parseInt(coordinates
							.substring(separator + 1));
					g.setColor(new Color(0, 0, 255));
					g.fillRect(x, y, 64, 64);
				}
			}
		}

		g.setColor(new Color(255, 0, 0));
		g.fillRect(t1.getTankX(), t1.getTankY(), 64, 64);

		g.setColor(new Color(0, 255, 0));
		if (t1.getDirection().getId() == 1) {
			g.fillRect(t1.getTankX() + 20, t1.getTankY(), 24, 34);
		} else if (t1.getDirection().getId() == 2) {
			g.fillRect(t1.getTankX() + 20, t1.getTankY() + 30, 24, 34);
		} else if (t1.getDirection().getId() == 3) {
			g.fillRect(t1.getTankX(), t1.getTankY() + 20, 34, 24);
		} else {
			g.fillRect(t1.getTankX() + 30, t1.getTankY() + 20, 34, 24);
		}

		g.setColor(new Color(255, 255, 0));
		g.fillRect(b1.getX(), b1.getY(), 14, 14);
	}

}
