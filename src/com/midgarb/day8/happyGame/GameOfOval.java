package com.midgarb.day8.happyGame;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.image.ImageObserver;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

import com.midgarb.day5.hw1.domain.Pokupatel;
import com.midgarb.day5.hw1.domain.TovarCar;

public class GameOfOval {
	static int x = 125, y = 125;
	Graphics g;
	MyPanel my;
	Image images;
	String str = "try Click on me!!!";
	private int mouseX = 0;
	private int mouseY = 0;

	public GameOfOval() {
		JFrame frame = new JFrame("Game");
		frame.pack();
		frame.setVisible(true);
		frame.setLocation(150, 150);
		frame.setSize(500, 500);
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		// JPanel panel1 = new JPanel();
		my = new MyPanel();
		frame.add(my);
		MouseL l = new MouseL();
		my.addMouseListener(l);
		my.addMouseMotionListener(l);
		my.repaint();
		my.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

	}

	// public static void setX(int x) {
	// x = x;
	// }
	//
	// public static void setY(int y) {
	// y = y;
	// }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GameOfOval g = new GameOfOval();
	}

	public class MyPanel extends JPanel {
		public MyPanel() {
			BorderLayout bl = new BorderLayout(2, 1);
			this.setLayout(bl);
			// addMouseMotionListener((MouseMotionListener) this);
			this.add(new JLabel(str));
			JButton v = new JButton(" me!!!");
			v.setBackground(new Color(250, 0, 0));
			v.setForeground(new Color(0, 0, 250));
		}

		@Override
		public void paintComponent(Graphics g) {
			// TODO Auto-generated method stub
			super.paintComponent(g);
			g.setColor(Color.BLUE);
			if ((x < 440 && x > 0) && (y < 440 && y > 0)) {
				// // x +=10;
				// // y += 10;
				// g.fillOval(x, y, 50, 50);
				// g.drawString(str, x-5, y-5);
				// }else {
				// x=225;
				// y=225;
				// g.fillOval(x, y, 50, 50);
				// g.drawString(str, x-5, y-5);
				// }

				if ((mouseX > x - 30) && (mouseX < x + 80) && (mouseY > y - 30)
						&& (mouseY < y + 80)) {
					if (mouseX < (x + 25)) {
						x += 15;
					} else {
						x -= 15;
					}
					if (mouseY < (y + 25)) {
						y += 15;
					} else {
						y -= 15;
					}

				}
				g.fillOval(x, y, 50, 50);
				g.drawString(str, x - 5, y - 5);
			} else {
				x = 225;
				y = 225;
				g.fillOval(x, y, 50, 50);
				g.drawString(str, x - 5, y - 5);
			}
		}

	}

	public class MouseL implements MouseListener, MouseMotionListener {

		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			x += 20;
			y += 20;
			my.repaint();
		}

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub

		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub

		}

		@Override
		public void mouseEntered(MouseEvent e) {
			int i = 0;
			while (i < 20) {
				if (e.getX() < x) {
					x += 10;
					if (e.getY() < y) {
						y += 5;
					} else {
						y -= 5;
					}
				} else if (e.getX() > x) {
					x -= 10;
					if (e.getY() < y) {
						y += 5;
					} else {
						y -= 5;
					}
				}
				i++;
				str = "I`m here";
				my.repaint();
				// try {
				// Thread.sleep(100);
				// } catch (InterruptedException e1) {
				// // TODO Auto-generated catch block
				// e1.printStackTrace();
				// }
				// System.out.println(i);
			}

		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub

		}

		@Override
		public void mouseDragged(MouseEvent e) {
			// TODO Auto-generated method stub

		}

		@Override
		public void mouseMoved(MouseEvent e) {
			// TODO Auto-generated method stub
			mouseX = e.getX();
			mouseY = e.getY();
			 my.repaint();
		}

	}
}
