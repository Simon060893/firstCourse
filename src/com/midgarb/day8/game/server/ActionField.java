package com.midgarb.day8.game.server;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.WindowConstants;

import com.midgarb.day5.f25.Direction;
import com.midgarb.day8.game.tank.AbstractTank;
import com.midgarb.day8.game.tank.BT7;
import com.midgarb.day8.game.tank.Bullet;
import com.midgarb.day8.game.tank.T34;
import com.midgarb.day8.game.tank.Tiger;
import com.midgarb.day8.game.util.Brick;
import com.midgarb.day8.game.util.Clean;
import com.midgarb.day8.game.util.Eagle;
import com.midgarb.day8.game.util.Field;
import com.midgarb.day8.game.util.Pole;
import com.midgarb.day8.game.util.Rock;
import com.midgarb.day8.game.util.Water;

public class ActionField extends JPanel {
	private boolean COLORDED_MODE = false;// ���� ����
	public Tiger agressor;
	public BT7 agressor1;
	private Direction di;
	private Field battleField;
	private Bullet b1;
	public T34 defender;
	private Graphics g;
	JFrame frame;
	double h= 1d;

	// private Action a;

	public Field getBattleField() {
		return battleField;
	}

	public void runTheGame() {
		int f = 0;
		int j =0,h=0;
		while (f == 0) {
			if (!agressor.isDestroyed() && !defender.isDestroyed()
					&& (battleField.getBattleField()[8][4] instanceof Eagle)) {
				try {
					// processAction(agressor.setUpAction(), agressor);

//					processAction(defender.setUpAction(), defender);
					processActionDefender(defender, agressor);
//					processAction(agressor1.setUpAction(), agressor1);;
					if(!agressor1.isDestroyed()){
					procesMoveToQuadrant(5,8,agressor1);
					}
//					agressor1.moveToQuadrant(5, 8);
					if(!agressor.isDestroyed()){
					processActionTank(defender, agressor);
					}
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} else if (defender.isDestroyed()
					|| battleField.getBattleField()[8][4] instanceof Clean) {
				f = 1;

				final JFrame frame1 = new JFrame("You lose");
				frame1.setLocation(frame.getX() + 100, frame.getY() + 100);
				frame1.setMinimumSize(new Dimension(250, 150));
				frame1.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
				JPanel jp = new JPanel();
				frame1.getContentPane().add(jp);
				frame1.pack();
				frame1.setVisible(true);

				jp.setLayout(new GridBagLayout());
				GridBagConstraints c = new GridBagConstraints();

				c.gridx = 0;
				c.gridy = 0;
				c.gridwidth = 2;
				JLabel jla = new JLabel("Would you try again???");
				jp.add(jla, c);
				JButton jb = new JButton("OK");
				jb.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {

					    SwingUtilities.invokeLater(new Runnable() {
						      public void run() {
									removeAll();
									// this = null;
									try {
										// ActionField af= new ActionField();
										// af.runTheGame();
//										frame.setVisible(false);
										frame1.setVisible(false);
//										new Louncher();
//										newGame();
		
										createElementOfPole();
										runTheGame();
										// frame.setVisible(true);
									} catch (Exception e1) {
										// TODO Auto-generated catch block
										e1.printStackTrace();
									}

						      }
						    });
// TODO Auto-generated method stub
					}

				});

				c.gridwidth = 1;
				c.gridx = 0;
				c.gridy = 1;
				jp.add(jb, c);
				JButton jb1 = new JButton("Cancel");
				jb1.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						removeAll();
						// this = null;
						try {
							// ActionField af= new ActionField();
							// af.runTheGame();

							frame.removeAll();
							frame1.removeAll();
							frame.setVisible(false);
							frame1.setVisible(false);
							System.exit(0);
							
						} catch (Exception e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
					}

				});
				// c.gridwidth = 1;
				c.gridx = 1;
				c.gridy = 1;
				jp.add(jb1, c);

			} else if (agressor.isDestroyed()) {
				f = 1;
				JOptionPane.showConfirmDialog(null, "Game over!!!", "You win",
						JOptionPane.PLAIN_MESSAGE);

			}
		}
		// if (!agressor.isDestroyed() && !defender.isDestroyed()){
		// try {
		// processAction(defender.askAction(), defender);
		// } catch (Exception e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }
		// }
	}
	public void newGame() throws Exception{
		ActionField f =	new ActionField();
		frame.repaint();
		f.runTheGame();
		f = null;
	}

	public void processAction(Action action, AbstractTank tank)
			throws Exception {
		// if (tank instanceof Tiger) System.out.println("Tiger: " + action);
		// if (tank instanceof T34) System.out.println("T34: " + action);
		if (action == Action.MOVE) {
			processFire(new Bullet(tank.getTankX() + 27,
					(tank.getTankY() + 27), tank.getDirection()), tank);
			if (tank instanceof T34 && checkQuadrant(tank)) {
				System.out.println("You cann`t step forth");
			} else {
				processMove(tank);
			}
			// System.out.println("Move");
		} else if (action == Action.TURN_UP) {
			processTurn(Direction.UP, tank);
			// System.out.println("TURN_UP");
		} else if (action == Action.TURN_DOWN) {
			processTurn(Direction.DOWN, tank);
			// System.out.println("DOWN");
		} else if (action == Action.TURN_LEFT) {
			processTurn(Direction.LEFT, tank);
		} else if (action == Action.TURN_RIGHT) {
			processTurn(Direction.RIGHT, tank);
		} else if (action == Action.FIRE) {
			processFire(new Bullet(tank.getTankX() + 27,
					(tank.getTankY() + 27), tank.getDirection()), tank);
		}
	}

	public void processActionTank(AbstractTank tank1, AbstractTank tank)
			throws Exception {
		if (tank1.getTankX() < tank.getTankX()) {
			tank.turn(Direction.LEFT);
			// tank.setUpAction(Action.TURN_LEFT);

		} else if (tank1.getTankX() > tank.getTankX()) {
			tank.turn(Direction.RIGHT);
			// tank.setUpAction(Action.TURN_LEFT);
		} else if (tank1.getTankX() == tank.getTankX()) {

			if (tank1.getTankY() < tank.getTankY()) {
				tank.turn(Direction.UP);

			} else {
				tank.turn(Direction.DOWN);
			}
			while (tank1.getTankY() != tank.getTankY() || tank1.isDestroyed()) {
				processFire(new Bullet(tank.getTankX() + 27,
						(tank.getTankY() + 27), tank.getDirection()), tank);
				processMove(tank);
				return;
			}
		}
		while (tank1.getTankY() != tank.getTankY() || tank1.isDestroyed()) {
			processFire(new Bullet(tank.getTankX() + 27,
					(tank.getTankY() + 27), tank.getDirection()), tank);
			processMove(tank);
			return;
		}

	}
	
	public void processActionDefender(AbstractTank tank1, AbstractTank tank){
		if(tank1.getTankX() == tank.getTankX()){
			try {
				tank1.turn(Direction.UP);
				processFire(new Bullet(tank1.getTankX() + 27,
						(tank1.getTankY() + 27), tank1.getDirection()),tank1);
				if(h%2 == 0){
					tank1.turn(Direction.LEFT);
					System.out.println(h%2);
				}else{
					tank1.turn(Direction.RIGHT);
					System.out.println(h%2);
				}
	
//				tank1.turn(Direction.LEFT);
				processMove(tank1);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else if(tank1.getTankY() == tank.getTankY()){
			try {
				tank1.turn(Direction.RIGHT);
				processFire(new Bullet(tank1.getTankX() + 27,
						(tank1.getTankY() + 27), tank1.getDirection()),tank1);
				if(h%2 == 0){
					tank1.turn(Direction.UP);
				}else{
					tank1.turn(Direction.DOWN);
				}
				
				processMove(tank1);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}else{
			try {
				processAction(defender.setUpAction(), defender);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		h++;
	}

	public boolean checkQuadrant(AbstractTank tank) {
		int i = Integer.parseInt(tank.getLocationTank(tank.getX(), tank.getY())
				.substring(
						0,
						tank.getLocationTank(tank.getX(), tank.getY()).indexOf(
								"_")));
		int j = Integer.parseInt(tank.getLocationTank(tank.getX(), tank.getY())
				.substring(
						tank.getLocationTank(tank.getX(), tank.getY()).indexOf(
								"_") + 1));
		if (tank.getDirection() == Direction.UP) {
			if (i - 1 > -1
					&& (battleField.getBattleField()[i - 1][j] instanceof Eagle || battleField
							.getBattleField()[i - 1][j] instanceof Rock)) {
				return true;
			}
		} else if (tank.getDirection() == Direction.DOWN) {
			if (i + 1 < 9
					&& (battleField.getBattleField()[i + 1][j] instanceof Eagle || battleField
							.getBattleField()[i + 1][j] instanceof Rock)) {
				return true;
			}
		} else if (tank.getDirection() == Direction.RIGHT) {
			if (j + 1 < 9
					&& (battleField.getBattleField()[i][j + 1] instanceof Eagle || battleField
							.getBattleField()[i][j + 1] instanceof Rock)) {
				return true;
			}
		} else if (tank.getDirection() == Direction.LEFT) {
			if (j - 1 > -1
					&& (battleField.getBattleField()[i][j - 1] instanceof Eagle || battleField
							.getBattleField()[i][j - 1] instanceof Rock)) {
				return true;
			}
		}

		return false;

	}

	public Graphics getG() {
		return g;
	}

	public void setG(Graphics g) {
		this.g = g;
	}

	public void processTurn(Direction direction, AbstractTank tank)
			throws Exception {
		Thread.sleep(10);
		tank.turn(direction);
		repaint();
		Thread.sleep(10);
	}

	public void processMove(AbstractTank tank) throws Exception {
		// this.defender = tank;
		Direction direction = tank.getDirection();
		int step = 0;
		if ((direction.getId() == 1 && tank.getTankY() == 0)
				|| (direction.getId() == 2 && tank.getTankY() >= 512)
				|| (direction.getId() == 3 && tank.getTankX() == 0)
				|| ((direction.getId() == 4 && tank.getTankX() >= 512))) {

			return;
		}
		tank.turn(tank.getDirection());

		while (step < 64) {
			if (direction.getId() == 1) {
				repaint();
				tank.updateY(-1);
				b1.updateY(-1);

			} else if (direction.getId() == 2) {
				repaint();
				tank.updateY(1);
				b1.updateY(1);

			} else if (direction.getId() == 3) {
				repaint();
				tank.updateX(-1);
				b1.updateX(-1);

			} else if (direction.getId() == 4) {
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
				&& (b1.getY() > -14 && b1.getY() < 590)) {
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
				battleField.upadateQuadrant(i, j, new Clean(j * 64, i * 64,
						battleField.getiGround()));
				// Pole.destroy();
				return true;
			} else if (battleField.scanQuadrant(i, j) instanceof Eagle) {
				if (tank instanceof T34) {
					tank.turn(di.UP);
				} else if (tank instanceof Tiger|| tank instanceof BT7) {
					battleField.upadateQuadrant(i, j, new Clean(j * 64, i * 64,
							battleField.getiGround()));
				}
				return true;
			} else if (battleField.scanQuadrant(i, j) instanceof Rock) {
				// battleField.upadateQuadrant(i, j, new Clean());
				if (tank instanceof T34 ) {
					tank.turn(di.UP);
				} else if (tank instanceof Tiger || tank instanceof BT7) {
					battleField.upadateQuadrant(i, j, new Clean(j * 64, i * 64,
							battleField.getiGround()));
				}
				return true;
			} else if (checkInterception(
					getQuadrant(agressor.getTankX(), agressor.getTankY()), s)
					&& tank == defender) {
				agressor.updateArmor(-1);
				if (agressor.getArmor() == 0) {
					agressor.destroy();
				}
				return true;
			}else if (checkInterception(
					getQuadrant(agressor1.getTankX(), agressor1.getTankY()), s)
					&& tank == defender) {
//				agressor.updateArmor(-1);
//				if (agressor.getArmor() == 0) {
					agressor1.destroy();
//				}
				return true;
			}
			else if (checkInterception(
					getQuadrant(defender.getTankX(), defender.getTankY()), s)
					&& tank == agressor1) {
				defender.destroy();
				return true;
			}
			else if (checkInterception(
					getQuadrant(agressor1.getTankX(), agressor1.getTankY()), s)
					&& tank == agressor) {
				agressor.setDirection(Direction.UP);
//				agressor.move();
				return true;
			}
			else if (checkInterception(
					getQuadrant(agressor.getTankX(), agressor.getTankY()), s)
					&& tank == agressor1) {
				agressor1.setDirection(Direction.DOWN);
//				agressor1.move();
				return true;
			}
			else if (checkInterception(
					getQuadrant(defender.getTankX(), defender.getTankY()), s)
					&& tank == agressor) {
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

	public void procesMoveToQuadrant(int v, int h, AbstractTank tank)
			throws Exception {
		String f1 = getQuadentXY(v, h);
		int f2 = Integer.parseInt(f1.substring(0, f1.indexOf("_")));
		int f3 = Integer.parseInt(f1.substring(f1.indexOf("_") + 1));
		while (tank.getTankX() < f2) {
			tank.turn(di.RIGHT);
			// killEnemy();
			processFire(new Bullet(tank.getTankX() + 27,
					(tank.getTankY() + 27), tank.getDirection()), tank);
			processMove(tank);
//			Thread.sleep(10);
			return;
		}
		while (tank.getTankX() > f2) {

			tank.turn(di.LEFT);
			// killEnemy();
			processFire(new Bullet(tank.getTankX() + 27,
					(tank.getTankY() + 27), tank.getDirection()), tank);
			processMove(tank);
//			Thread.sleep(10);
			return;
		}
		while (tank.getTankY() < f3) {
			tank.turn(di.DOWN);
			// killEnemy();
			processFire(new Bullet(tank.getTankX() + 27,
					(tank.getTankY() + 27), tank.getDirection()), tank);
			processMove(tank);
//			Thread.sleep(10);
			return;
		}
		while (tank.getTankY() > f3) {
			tank.turn(di.UP);
			// killEnemy();
			processFire(new Bullet(tank.getTankX() + 27,
					(tank.getTankY() + 27), tank.getDirection()), tank);
			processMove(tank);
//			Thread.sleep(10);
			return;
		}

	}

	public ActionField() throws Exception {
		createElementOfPole();
		// b1 = new Bullet(-100, -100, agressor.getDirection());
		frame = new JFrame("BATTLE FIELD, DAY 4");
		frame.setLocation(500, 130);

		JMenuBar menuBar= new JMenuBar();
		JMenu menu = new JMenu("File");
		JMenuItem m = new JMenuItem("Save as");
		JMenuItem m1 = new JMenuItem("Open");
		menu.add(m);
		menu.add(m1);
		menuBar.add(menu);
		frame.setJMenuBar(menuBar);
		frame.setMinimumSize(new Dimension(battleField.getBF_WIDTH(),
				battleField.getBF_HEIGHT() + 32));
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		frame.getContentPane().add(this);
		frame.pack();
		frame.setVisible(true);
		
		
	}
	public void createElementOfPole(){
		String str = AbstractTank.getLocation1();
		battleField = new Field();
		// System.out.println(battleField);
		defender = new T34(battleField);
		agressor = new Tiger(battleField, Integer.parseInt(str.split("_")[0]),
				Integer.parseInt(str.split("_")[1]), Direction.LEFT);
		agressor1 = new BT7(battleField);
		// Direction d;
		b1 = new Bullet(-100, -100, defender.getDirection());
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
				if (battleField.scanQuadrant(j, k) instanceof Pole) {
					if (battleField.scanQuadrant(j, k) instanceof Water) {

					} else {
						battleField.scanQuadrant(j, k).draw(g);
					}
				}
			}
		}
		defender.draw(g);
		agressor.draw(g);
		agressor1.draw(g);
		b1.draw(g);

		for (int j = 0; j < battleField.getDimentionY(); j++) {
			for (int k = 0; k < battleField.getDimentionX(); k++) {
				if (battleField.scanQuadrant(j, k) instanceof Water) {
					battleField.scanQuadrant(j, k).draw(g);
				}
			}
		}
		setG(g);
	}
}
