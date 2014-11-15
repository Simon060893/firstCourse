package com.midgarb.day8.hw_magicSquare;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

public class MagicSquare extends JPanel {
	static JPanel panel;
	int x;
	int y;
	int z;

	// public static void setX(int x1) {
	// x = x1;
	// }
	//
	//
	//
	// public static void setY(int y1) {
	// y = y1;
	// }
	// public static void setZ(int x1) {
	// z = x1;
	// }

	// Graphics g;
	//
	public MagicSquare() {
		// g.setColor(Color.BLUE);
		panel = new JPanel();
		// BorderLayout border = new BorderLayout();
		// panel.setLayout(border);
		// Graphics
		JFrame frame = new JFrame("Square");
		frame.getContentPane().add(this);
		frame.pack();
		frame.setVisible(true);
		frame.setLocation(200, 200);
		frame.setSize(250, 250);
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		JButton b = new JButton();
		MouseL l = new MouseL();
		this.addMouseListener(l);
		b.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Random r = new Random();
				x = r.nextInt(250);
				y = r.nextInt(200);
				z = r.nextInt(150);
				repaint();
			}
		});
		b.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		this.add(b);

	}

	public static void main(String[] args) {
		MagicSquare ms = new MagicSquare();

	}

	public void paintComponent(Graphics g) {
		// TODO Auto-generated method stub

		g.setColor(new Color(x, y, z));
		g.fillRect(0, 0, 250, 250);
	}

	public class MouseL implements MouseListener {

		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			Random r = new Random();
			x = r.nextInt(250);
			y = r.nextInt(250);
			z = r.nextInt(250);
			repaint();
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
			// TODO Auto-generated method stub

		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub

		}

	}
}
