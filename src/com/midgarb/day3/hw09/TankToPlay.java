package com.midgarb.day3.hw09;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.util.Arrays;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;
import javax.xml.transform.Templates;

public class TankToPlay extends JPanel {
	/**
	 * 
	 */
	// private static final long serialVersionUID = 1L;
	final boolean COLORDED_MODE = false;// ���� ����
	int tankDirection = 1;
	static int tankX = 128;
	int tankY = 512;
	int bulletX = -100;// ��� ���������
						// ������ ����
	int bulletY = -100;
	int bullspeed = 5;
	static String[][] battleField = {
			{ "B", "B", "B", "B", "B", "B", "B", "B", "B" },
			{ " ", " ", " ", " ", " ", " ", " ", " ", " " },
			{ "B", " ", "B", " ", " ", " ", "B", " ", "B" },
			{ " ", " ", "B", " ", "B", " ", "B", " ", " " },
			{ " ", "B", " ", " ", " ", " ", " ", "B", " " },
			{ " ", "B", " ", "B", " ", "B", " ", "B", " " },
			{ " ", "B", " ", " ", " ", " ", " ", "B", " " },
			{ " ", "B", " ", "B", "B", "B", " ", "B", " " },
			{ " ", " ", " ", "B", " ", "B", " ", " ", " " }

	};

	/**
	 * Write your code here.
	 * 
	 * @throws Exception
	 * 
	 */
	void clean1() throws Exception {
		// int x = Integer.parseInt(getQuadrant(tankX, tankY).split("_")[0]);
		// int y = 1+ Integer.parseInt(getQuadrant(tankX, tankY).split("_")[1]);
		//
		// for (int i = y; i > 0;) {
		// if (x < 5) {
		// for (int j = x+1 ; j <10; j++) {
		// movetoQuadrant(j, i);
		// System.out.println(j);
		// x++;
		// }
		// }
		// if(i==1 && x==9 ){
		// break;
		// }
		// if ( x == 9) {
		// i -= 1;
		// movetoQuadrant(x, i);
		// }
		//
		// if (x > 5) {
		// for (int j = x - 1; j > 0; j--) {
		// movetoQuadrant(j, i);
		// System.out.println(j);
		// x--;
		// }
		// }
		// if ( x == 1) {
		// i -= 1;
		// movetoQuadrant(x, i);
		// }
		//
		//
		// }

		for (int i = 9; i > 0; i--) {
			for (int j = Integer
					.parseInt(getQuadrant(tankX, tankY).split("_")[0]); j < 9; j++) {
				if (!battleField[i - 1][j].trim().isEmpty()) {
					System.out.println(j + "#" + i);
					movetoQuadrant(j + 1, i);
				}
			}

			for (int j = Integer
					.parseInt(getQuadrant(tankX, tankY).split("_")[0]) + 1; j > 0; j--) {
				if (!battleField[i - 1][j - 1].trim().isEmpty()) {
					System.out.println(j + "#" + i);
					movetoQuadrant(j, i);
				}
			}
		}

	}

	public void runTheGame() throws Exception {
		// movetoQuadrant("a","5");
		// getQuadent(2,5);
		// movetoQuadrant(3, 5);
		// movetoQuadrant(5, 3);
		// movetoQuadrant(3,5);
		// turn(4);
		// movetoQuadrant(2, 1);
		// movetoQuadrant(8, 1);
		// movetoQuadrant(8, 4);
		// movetoQuadrant(5, 7);
		// clean();
		// while(true){
		// fire();
		// }
		// myRandom(6);
		// bulletX=25;
		// bulletY=25;
		// System.out.println(Arrays.toString(battleField[0]));
		// System.out.println(processInterception());
		// System.out.println(Arrays.toString(battleField[0]));
		// System.out.println(getQuadrant(511,575));
		// System.out.println(Arrays.toString(battleField[2]));

		// movetoQuadrant(9, 9); //the tank hasn`t know about this quadrant
		// movetoQuadrant(9, 8);
		// movetoQuadrant(9, 8);
	clean1();
		// System.out.println(Integer.parseInt(getQuadrant(tankX,
		// tankY).split("_")[1]));

	}

	final int BF_WIDTH = 590;
	final int BF_HEIGHT = 576;

	public String getQuadrant(int x, int y) {
		int z = (x / 64);
		int l = (y / 64);
		return (z + "_" + l);
	}

	public boolean processInterception() {
		String s = getQuadrant(bulletX, bulletY);
		int j = Integer.parseInt(s.split("_")[0]);
		int i = Integer.parseInt(s.split("_")[1]);
		if ((i >= 0 && i <= 8) && (j >= 0 && j <= 8)) {
			if (!battleField[i][j].trim().isEmpty()) {
				battleField[i][j] = "";
				return true;
			}
		}
		return false;

	}

	public boolean processInterception1() throws InterruptedException {
		if (tankDirection == 2) {
			String s = getQuadrant(tankX, tankY + 64);
			int j = Integer.parseInt(s.split("_")[0]);
			int i = Integer.parseInt(s.split("_")[1]);
			if ((i >= 0 && i <= 8) && (j >= 0 && j <= 8)) {
				if (!battleField[i][j].trim().isEmpty()) {
					// fire();
					return true;
				}
			}
		}
		if (tankDirection == 1) {
			String s = getQuadrant(tankX, tankY - 64);
			int j = Integer.parseInt(s.split("_")[0]);
			int i = Integer.parseInt(s.split("_")[1]);
			if ((i >= 0 && i <= 8) && (j >= 0 && j <= 8)) {
				if (!battleField[i][j].trim().isEmpty()) {
					// fire();
					return true;
				}
			}
		}
		if (tankDirection == 4) {
			String s = getQuadrant(tankX + 64, tankY);
			int j = Integer.parseInt(s.split("_")[0]);
			int i = Integer.parseInt(s.split("_")[1]);
			if ((i >= 0 && i <= 8) && (j >= 0 && j <= 8)) {
				if (!battleField[i][j].trim().isEmpty()) {
					// fire();
					return true;
				}
			}
		}
		if (tankDirection == 3) {
			String s = getQuadrant(tankX - 64, tankY);
			int j = Integer.parseInt(s.split("_")[0]);
			int i = Integer.parseInt(s.split("_")[1]);
			if ((i >= 0 && i <= 8) && (j >= 0 && j <= 8)) {
				if (!battleField[i][j].trim().isEmpty()) {
					// fire();
					return true;
				}
			}
		}
		return false;

	}

	public void fire() throws InterruptedException {
		bulletX = tankX + 25;
		bulletY = tankY + 25;
		while ((bulletX > -14 && bulletX < 590)
				&& (bulletY > -14 && bulletY < 590)) {// ��
														// ������
														// �������
														// �
														// ������
														// 14px
														// ������
														// �������
			if (tankDirection == 1) {
				bulletY--;

				repaint();
				Thread.sleep(bullspeed);

			}
			if (tankDirection == 2) {
				bulletY++;

				repaint();
				Thread.sleep(bullspeed);
			}
			if (tankDirection == 3) {
				bulletX--;

				repaint();
				Thread.sleep(bullspeed);
			}
			if (tankDirection == 4) {
				bulletX++;

				repaint();
				Thread.sleep(bullspeed);
			}
			// processInterception();
			if (processInterception()) {
				bulletX = -100;
				bulletY = -100;
				break;
			}

		}

	}

	public void turn(int direction) {
		tankDirection = direction;
		repaint();
	}

	public void move(int direction) throws Exception {
		int step = 0;
		if ((direction == 1 && tankY == 0) || (direction == 2 && tankY >= 512)
				|| (direction == 3 && tankX == 0)
				|| ((direction == 4 && tankX >= 512))) {
			// System.out.println("direction" + direction + " tabkX" + tankX
			// + " tankY " + tankY);
			return;
		}
		turn(direction);

		while (step < 64) {
			if (direction == 1) {
				repaint();
				tankY -= 1;
				bulletY--;
				// System.out.println("top" + tankY);
			} else if (direction == 2) {
				repaint();
				tankY += 1;
				bulletY++;
				// System.out.println("bottom" + tankY);
			} else if (direction == 3) {
				repaint();
				tankX -= 1;
				bulletX--;
				// System.out.println("left" + tankX);
			} else if (direction == 4) {
				repaint();
				tankX += 1;
				bulletX++;
				// System.out.println("right" + tankX);
			}
			step++;
			Thread.sleep(10);
		}

	}

	public void moveRandom() throws Exception {
		Random d = new Random();
		int g;
		while (true) {
			long f = System.currentTimeMillis();
			String f1 = String.valueOf(f);
			g = Integer.parseInt(f1.substring(9, 10));
			System.out.println(g);
			if (g == 1) {
				move(g);
				repaint();
				Thread.sleep(250);
			} else if (g == 2) {
				move(g);
				repaint();
				Thread.sleep(500);
			} else if (g == 3) {
				move(g);
				repaint();
				Thread.sleep(10);
			} else if (g == 4) {
				move(g);
				repaint();
				Thread.sleep(10);
			} else if (g > 4 && g <= 6) {
				move(2);
				repaint();
				Thread.sleep(10);
			} else if (g > 6 && g <= 8) {
				move(4);
				repaint();
				Thread.sleep(10);
			} else if (g == 9) {
				move(1);
				repaint();
				Thread.sleep(10);
			} else {
				Thread.sleep(1000);
			}

		}

	}

	public void myRandom(int i2) throws Exception {
		int g, k = 0;

		long f = System.currentTimeMillis();
		String f1 = String.valueOf(f);
		g = Integer.parseInt(f1.substring(9, 10));
		// System.out.println(g);
		if (i2 <= 9 && i2 >= 0) {
			if (g <= i2) {
				System.out.println(g);
			} else {
				System.out.println(g - i2);
			}
		} else {
			System.out.println(i2 % g);
		}

	}

	public void movetoQuadrant(int v, int h) throws Exception {

		String f1 = getQuadentXY(v, h);
		int f2 = Integer.parseInt(f1.split("_")[0]);
		int f3 = Integer.parseInt(f1.split("_")[1]);

		while (tankX < f2) {
			//

			// }
			turn(4);
			if (processInterception1()) {
				fire();
			}
			move(4);
			Thread.sleep(10);
		}
		while (tankX > f2) {
			// (processInterception1() && tankX-64>f2){

			// }
			turn(3);
			if (processInterception1()) {
				fire();
			}
			move(3);
			Thread.sleep(10);
		}
		while (tankY < f3) {
			// if(processInterception1()&& tankY-64<f3){

			// }
			turn(2);
			if (processInterception1()) {
				fire();
			}
			move(2);
			Thread.sleep(10);

		}
		while (tankY > f3) {
			// if(processInterception1()&& tankY+64>f3){

			// }
			turn(1);
			if (processInterception1()) {
				fire();
			}
			move(1);
			Thread.sleep(10);

		}

		// tankY+=f3;

	}

	public static String getQuadentXY(int v, int hor) {
		String coordinate = "0";
		if ((v >= 0) && (v <= 8) || (hor >= 0) && (hor <= 8)) {
			int x = (v - 1) * 64;
			int y = (hor - 1) * 64;
			coordinate = x + "_" + y;
		}
		return coordinate;

	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		TankToPlay bf = new TankToPlay();
		bf.runTheGame();
	}

	// Magic bellow. Do not worry about this now, you will understand everything
	// in this course.
	// Please concentrate on your tasks only.
	public TankToPlay() throws Exception {
		JFrame frame = new JFrame("BATTLE FIELD, DAY 2");
		frame.setLocation(500, 150);
		frame.setMinimumSize(new Dimension(BF_WIDTH, BF_HEIGHT + 32));
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

		for (int j = 0; j < battleField.length; j++) {
			for (int k = 0; k < battleField.length; k++) {
				if (battleField[j][k].equals("B")) {
					String coordinates = getQuadentXY(j + 1, k + 1);
					int separator = coordinates.indexOf("_");
					int y = Integer.parseInt(coordinates
							.substring(0, separator));
					int x = Integer.parseInt(coordinates
							.substring(separator + 1));
					g.setColor(new Color(0, 0, 255));
					try {
						if (processInterception1()) {
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

		g.setColor(new Color(255, 0, 0));
		g.fillRect(tankX, tankY, 64, 64);

		g.setColor(new Color(0, 255, 0));
		if (tankDirection == 1) {
			g.fillRect(tankX + 20, tankY, 24, 34);
		} else if (tankDirection == 2) {
			g.fillRect(tankX + 20, tankY + 30, 24, 34);
		} else if (tankDirection == 3) {
			g.fillRect(tankX, tankY + 20, 34, 24);
		} else {
			g.fillRect(tankX + 30, tankY + 20, 34, 24);
		}

		g.setColor(new Color(255, 255, 0));
		g.fillRect(bulletX, bulletY, 14, 14);
	}

}
