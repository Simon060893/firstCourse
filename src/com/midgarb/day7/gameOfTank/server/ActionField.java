package com.midgarb.day7.gameOfTank.server;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

import com.midgarb.day5.f25.Direction;
import com.midgarb.day7.gameOfTank.tank.AbstractTank;
import com.midgarb.day7.gameOfTank.tank.Bullet;
import com.midgarb.day7.gameOfTank.tank.T34;
import com.midgarb.day7.gameOfTank.tank.Tiger;
import com.midgarb.day7.gameOfTank.util.Brick;
import com.midgarb.day7.gameOfTank.util.Clean;
import com.midgarb.day7.gameOfTank.util.Eagle;
import com.midgarb.day7.gameOfTank.util.Field;
import com.midgarb.day7.gameOfTank.util.Pole;
import com.midgarb.day7.gameOfTank.util.Rock;


public class ActionField extends JPanel {
	private boolean COLORDED_MODE = false;// цвет фона
	public Tiger agressor;
	private Direction di;
	private Field battleField;
	private Bullet b1;
	public T34 defender;
	private Graphics g;
	private Action a;
	
	public Field getBattleField() {
		return battleField;
	}
	public void runTheGame(){
		this.a = new Action(defender, this,battleField);
		this.a.action();
		this.a = new Action(agressor, this,battleField);
		this.a.action();
//		defender.setUpAction(a);
	}

	public Graphics getG() {
		return g;
	}

	public void setG(Graphics g) {
		this.g = g;
	}

	public void processTurn(AbstractTank tank) throws Exception {
		repaint();

	}

	public void processMove(AbstractTank tank) throws Exception {
		// this.defender = tank;
		Direction direction = tank.getDirection();
		int step = 0;
		if ((direction.getId() == 0 && tank.getTankY() == 0)
				|| (direction.getId() == 1 && tank.getTankY() >= 512)
				|| (direction.getId() == 2 && tank.getTankX() == 0)
				|| ((direction.getId() == 3 && tank.getTankX() >= 512))) {

			return;
		}
		a.turn(tank.getDirection());

		while (step < 64) {
			if (direction.getId() == 0) {
				repaint();
				tank.updateY(-1);
				b1.updateY(-1);

			} else if (direction.getId() == 1) {
				repaint();
				tank.updateY(1);
				b1.updateY(1);

			} else if (direction.getId() == 2) {
				repaint();
				tank.updateX(-1);
				b1.updateX(-1);

			} else if (direction.getId() == 3) {
				repaint();
				tank.updateX(1);
				b1.updateX(1);

			}
			step++;
			Thread.sleep(10);
		}
	}

	public void processFire(Bullet b, AbstractTank tank) throws Exception {
		this.b1 = b;
		Direction tankDirection = tank.getDirection();
		// int d =agressor.getTankY()+1;
		// int d1 =agressor.getTankX()+1;
		while ((b1.getX() > -14 && b1.getX() < 590)
				&& (b1.getY() > -14 && b1.getY() < 590)) {// до какого момента с
															// учетом 14px
															// размер
															// снар€да
			if (tankDirection.getId() == 0) {
				b1.updateY(-1);
				// d +=1;
				repaint();
				Thread.sleep(5);

			}
			if (tankDirection.getId() == 1) {
				b1.updateY(1);

				repaint();
				Thread.sleep(5);
			}
			if (tankDirection.getId() == 2) {
				b1.updateX(-1);

				repaint();
				Thread.sleep(5);
			}
			if (tankDirection.getId() == 3) {
				b1.updateX(1);
				// d1++;
				repaint();
				Thread.sleep(5);
			}
			// processInterception();
			if (processInterception(tank)) {
				b1.destroy();
				break;
			}

		}

	}

	public String getQuadrant(int x, int y) {
		return x / 64 + "_" + y / 64;
	}

	private boolean processInterception(AbstractTank tank) throws Exception {

		String s = getQuadrant(b1.getX(), b1.getY());
		int j = Integer.parseInt(s.split("_")[0]);
		int i = Integer.parseInt(s.split("_")[1]);
		if ((i >= 0 && i <= 8) && (j >= 0 && j <= 8)) {
			if (battleField.scanQuadrant(i, j) instanceof Brick) {
				// battleField.upadateQuadrant(i, j,
				// create(defender.getTankX(),defender.getTankY()));
				battleField.upadateQuadrant(i, j, new Clean());
				return true;
			} else if (battleField.scanQuadrant(i, j) instanceof Eagle) {
				battleField.upadateQuadrant(i, j, new Clean());
				return true;
			} else if (battleField.scanQuadrant(i, j) instanceof Rock) {
//				 battleField.upadateQuadrant(i, j, new Clean());
				 if(tank instanceof T34){
				 a.turn(di.UP);
				 }else if(tank instanceof Tiger){
				 battleField.upadateQuadrant(i, j, new Clean());
				 }
				 return true;
			} 
			else if (checkInterception(
					getQuadrant(agressor.getTankX(), agressor.getTankY()), s) && tank==defender) {
				agressor.updateArmor(-1);
				if (agressor.getArmor() == 0) {
					agressor.destroy();
				}
				return true;
			}
			 if(checkInterception(getQuadrant(defender.getTankX(),
			 defender.getTankY()), s) && tank==agressor)
			 {
			 defender.destroy();
			 return true;
			 }
		}
		return false;

	}

	public boolean checkInterception(String object, String quadrant) {
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

	public static String getQuadentXY(int v, int hor) {
		return (v - 1) * 64 + "_" + (hor - 1) * 64;

	}

	public void procesMoveToQuadrant(int v, int h, AbstractTank tank) throws Exception {
		String f1 = getQuadentXY(v, h);
		int f2 = Integer.parseInt(f1.substring(0, f1.indexOf("_")));
		int f3 = Integer.parseInt(f1.substring(f1.indexOf("_") + 1));
		while (tank.getTankX() < f2) {
			a.turn(di.LEFT);
			// killEnemy();
			a.fire();
			a.move();
			Thread.sleep(10);
		}
		while (tank.getTankX() > f2) {

			a.turn(di.RIGHT);
			// killEnemy();
			a.fire();
			a.move();
			Thread.sleep(10);
		}
		while (tank.getTankY() < f3) {
			a.turn(di.DOWN);
			// killEnemy();
			a.fire();
			a.move();
			Thread.sleep(10);
		}
		while (tank.getTankY() > f3) {
			a.turn(di.UP);
			// killEnemy();
			a.fire();
			a.move();
			Thread.sleep(10);
		}

	}

	public ActionField() throws Exception {
		String str = AbstractTank.getLocation1();
		battleField = new Field();
		// System.out.println(battleField);
		defender = new T34(battleField);
		agressor = new Tiger(battleField, 
				Integer.parseInt(str.split("_")[0]), Integer.parseInt(str
						.split("_")[1]), Direction.LEFT);
		// Direction d;
		b1 = new Bullet(-100, -100, defender.getDirection());
		// b1 = new Bullet(-100, -100, agressor.getDirection());
		JFrame frame = new JFrame("BATTLE FIELD, DAY 4");
		frame.setLocation(500, 150);
		frame.setMinimumSize(new Dimension(battleField.getBF_WIDTH(),
				battleField.getBF_HEIGHT() + 32));
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		frame.getContentPane().add(this);
		frame.pack();
		frame.setVisible(true);
	}

	@Override
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
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
					cc = new Color(180, 80, 180);
				}
				i++;
				g.setColor(cc);
				g.fillRect(h * 64, v * 64, 64, 64);
			}
		}

		for (int j = 0; j < battleField.getDimentionY(); j++) {
			for (int k = 0; k < battleField.getDimentionX(); k++) {
				String coordinates = getQuadentXY(j + 1, k + 1);
				int separator = coordinates.indexOf("_");
				int y = Integer.parseInt(coordinates.substring(0, separator));
				int x = Integer.parseInt(coordinates.substring(separator + 1));
				if (battleField.scanQuadrant(j, k) instanceof Pole) {
					battleField.scanQuadrant(j, k).draw(g);
					// try {
					// if
					// (processInterception1(defender)||processInterception1(agressor))
					// {
					// battleField.scanQuadrant(j, k).draw1(g);
					//
					// }
					//
					// } catch (Exception e) {
					// // TODO Auto-generated catch block
					// e.printStackTrace();
					// }
				}
				g.fillRect(x, y, 64, 64);
			}
		}
		defender.draw(g);
		agressor.draw(g);
		b1.draw(g);
		setG(g);
	}

}
