package com.midgarb.day6.f32;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.util.Arrays;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

import com.midgarb.day5.f25.Direction;


public class Action extends JPanel {
	private boolean COLORDED_MODE = false;// цвет фона
//	private Tank defender;
	private Tiger agressor;
	private Direction di;
	private Field battleField;
	private Bullet b1;
	private T34 defender;
	private boolean f =false;

	public void runTheGame() throws Exception {

		defender.moveToQuadrant(3, 4);

		defender.moveToQuadrant(5, 4);
		defender.moveToQuadrant(9, 6);
		defender.moveToQuadrant(5, 4);

	}

	public void processTurn(AbstractTank tank) throws Exception {
		repaint();

	}

	public void processMove( ) throws Exception {
		//this.defender = tank;
		Direction direction = defender.getDirection();
		int step = 0;
		if ((direction.getId() == 1 && defender.getTankY() == 0)
				|| (direction.getId() == 2 && defender.getTankY() >= 512)
				|| (direction.getId() == 3 && defender.getTankX() == 0)
				|| ((direction.getId() == 4 && defender.getTankX() >= 512))) {
			System.out.println("direction" + defender.getDirection() + " tabkX"
					+ defender.getTankX() + " tankY " + defender.getTankY());
			return;
		}
		defender.turn(defender.getDirection());

		while (step < 64) {
			if (direction.getId() == 1) {
				repaint();
				defender.updateY(-1);
				b1.updateY(-1);
				
			} else if (direction.getId() == 2) {
				repaint();
				defender.updateY(1);
				b1.updateY(1);
				
			} else if (direction.getId() == 3) {
				repaint();
				defender.updateX(-1);
				b1.updateX(-1);
				
			} else if (direction.getId() == 4) {
				repaint();
				defender.updateX(1);
				b1.updateX(1);
				
			}
			step++;
			Thread.sleep(10);
		}
	}

	public void processFire(Bullet b) throws Exception {
		this.b1 = b;
		Direction tankDirection = defender.getDirection();
		// int d =agressor.getTankY()+1;
		// int d1 =agressor.getTankX()+1;
		while ((b1.getX() > -14 && b1.getX() < 590)
				&& (b1.getY() > -14 && b1.getY() < 590)) {// до какого момента с
															// учетом 14px
															// размер
															// снар€да
			if (tankDirection.getId() == 1) {
				b1.updateY(-1);
				// d +=1;
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
				// d1++;
				repaint();
				Thread.sleep(5);
			}
			// processInterception();
			if (processInterception()) {
				b1.destroy();
				break;
			}
			// else if((b1.getY() == d )||((b1.getX() == d1 ))){
			// agressor.destroy();
			// b1.destroy();
			// break;
			// }

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
			} else if (checkInterception(
					getQuadrant(agressor.getTankX(), agressor.getTankY()), s)) {
				agressor.updateArmor(-1);
				if (agressor.getArmor() == 0) {
					agressor.destroy();
				}
				return true;
			}
			// if(checkInterception(getQuadrant(defender.getTankX(),
			// defender.getTankY()), s))
			// {
			// defender.destroy();
			// return true;
			// }
		}
		return false;

	}

	private boolean checkInterception(String object, String quadrant) {
		int j = Integer.parseInt(object.split("_")[0]);
		int i = Integer.parseInt(object.split("_")[1]);

		int qx = Integer.parseInt(quadrant.split("_")[0]);
		int qy = Integer.parseInt(quadrant.split("_")[1]);
		if ((i >= 0 && i <= 8) && (j >= 0 && j <= 8)) {
			if (j == qx && i == qy) {
				return true;
			}
		}
		return false;
	}

	private boolean checkInterception1(String object, String object2) {
		int i = Integer.parseInt(object.split("_")[0]);
		int j = Integer.parseInt(object.split("_")[1]);
		int qx = Integer.parseInt(object2.split("_")[0]);
		int qy = Integer.parseInt(object2.split("_")[1]);

		if ((i >= 0 && i <= 8) && (j >= 0 && j <= 8)) {
			if (i > qx && j == qy) {
				if ((i - 1) == qx) {
					return true;
				}
			} else if (i < qx && j == qy) {
				if ((i + 1) == qx) {
					return true;
				}
			} else if (i == qx && j < qy) {
				if ((j + 1) == qy) {
					return true;
				}
			} else if (i == qx && j > qy) {
				if ((j - 1) == qy) {
					return true;
				}
			}
		}
		return false;
	}

	private boolean processInterception2() throws Exception {
		if (defender.getTankX() > agressor.getTankX()) {
			if (defender.getTankX() - 128 < agressor.getTankX()) {
				return true;
			}
		} else if (defender.getTankX() < agressor.getTankX()) {
			if (defender.getTankX() + 64 > agressor.getTankX()) {
				return true;
			}
		} else if (defender.getTankY() > agressor.getTankY()) {
			if (defender.getTankY() - 65 < agressor.getTankY()) {
				return true;
			}
		} else if (defender.getTankY() < agressor.getTankY()) {
			if (defender.getTankY() + 64 > agressor.getTankY()) {
				return true;
			}
		}
		return false;
	}

	public boolean processInterception1() throws Exception {
		String s = "";
		if (defender.getDirection().getId() == 2) {
			s += getQuadrant(defender.getTankX(), defender.getTankY() + 64);
		}
		if (defender.getDirection().getId() == 1) {
			s += getQuadrant(defender.getTankX(), defender.getTankY()-63);
		}
		if (defender.getDirection().getId() == 4) {
			s += getQuadrant(defender.getTankX() + 64, defender.getTankY());
		}
		if (defender.getDirection().getId() == 3) {
			s += getQuadrant(defender.getTankX()-63 , defender.getTankY());
		}
		int j = Integer.parseInt(s.split("_")[0]);
		int i = Integer.parseInt(s.split("_")[1]);
		if ((i >= 0 && i <= 8) && (j >= 0 && j <= 8)) {
			if (!battleField.scanQuadrant(i, j).trim().isEmpty()) {

				return true;
			}
		}

		return false;

	}

	public String getQuadentXY(int v, int hor) {
		return (v - 1) * 64 + "_" + (hor - 1) * 64;

	}

	public void processmoveRandom() throws Exception {
		Random d = new Random();
		int i;
		while (true) {
			i = d.nextInt(5);
			if (i > 0) {
				defender.move();
				defender.turn(defender.getDirection());
			}

		}

	}

	public void procesMoveToQuadrant(int v, int h) throws Exception {
		String f1 = getQuadentXY(v, h);
		int f2 = Integer.parseInt(f1.substring(0, f1.indexOf("_")));
		int f3 = Integer.parseInt(f1.substring(f1.indexOf("_") + 1));
		while (defender.getTankX() < f2) {
			// defender.turn(defender.getDirection());
			defender.turn(di.LEFT);
			if (checkInterception1(
					getQuadrant(defender.getTankX(), defender.getTankY()),
					getQuadrant(agressor.getTankX(), agressor.getTankY()))) {
				while (agressor.getArmor() > 0) {

					defender.fire();
					Thread.sleep(100);
					if (agressor.getArmor() == 1) {
						agressor.destroy();
					}
					agressor.updateArmor(-1);
				}
			}
			if (processInterception1()) {
				defender.fire();
			}
			defender.move();
			Thread.sleep(10);
		}
		while (defender.getTankX() > f2) {
			// defender.turn(defender.getDirection());
			defender.turn(di.RIGHT);
			if (checkInterception1(
					getQuadrant(defender.getTankX(), defender.getTankY()),
					getQuadrant(agressor.getTankX(), agressor.getTankY()))) {
				while (agressor.getArmor() > 0) {

					defender.fire();
					Thread.sleep(100);
					if (agressor.getArmor() == 1) {
						agressor.destroy();
					}
					agressor.updateArmor(-1);
				}
			}
			if (processInterception1()) {
				defender.fire();
			}
			defender.move();
			Thread.sleep(10);
		}
		while (defender.getTankY() < f3) {
			// defender.turn(defender.getDirection());
			defender.turn(di.DOWN);
			if (checkInterception1(
					getQuadrant(defender.getTankX(), defender.getTankY()),
					getQuadrant(agressor.getTankX(), agressor.getTankY()))) {
				while (agressor.getArmor() > 0) {

					defender.fire();
					Thread.sleep(100);
					if (agressor.getArmor() == 1) {
						agressor.destroy();
					}
					agressor.updateArmor(-1);
				}
			}
			if (processInterception1()) {
				defender.fire();
			}
			defender.move();
			Thread.sleep(10);
		}
		while (defender.getTankY() > f3) {
			// defender.turn(defender.getDirection());
			defender.turn(di.UP);
			if (checkInterception1(
					getQuadrant(defender.getTankX(), defender.getTankY()),
					getQuadrant(agressor.getTankX(), agressor.getTankY()))) {
				while (agressor.getArmor() > 0) {

					defender.fire();
					Thread.sleep(100);
					if (agressor.getArmor() == 1) {
						agressor.destroy();
					}
					agressor.updateArmor(-1);
				}
			}
			if (processInterception1()) {
				defender.fire();
			}
			defender.move();
			Thread.sleep(10);
		}

	}

	public Action() throws Exception {
		// defender.toString();
		"gdfg".toString();
		String str = AbstractTank.getLocation1();
		battleField = new Field();
		System.out.println(battleField);
		defender = new T34(this, battleField);
		agressor = new Tiger(this, battleField,
				Integer.parseInt(str.split("_")[0]), Integer.parseInt(str
						.split("_")[1]), di.UP);
		// Direction d;
		b1 = new Bullet(-100, -100, defender.getDirection());
		JFrame frame = new JFrame("BATTLE FIELD, DAY 4");
		frame.setLocation(500, 150);
		frame.setMinimumSize(new Dimension(battleField.getBfWidth(),
				battleField.getBfHEIGHT() + 32));
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
					try {
						if(processInterception1()){
							g.setColor(new Color(255, 0, 150));
						}
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					g.fillRect(x, y, 64, 64);
				}
			}
		}
		defender.draw(g);
		agressor.draw(g);
		b1.draw(g);
}

}
