package com.midgarb.day8.f01;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.image.ImageObserver;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.WindowConstants;

public class Window extends JPanel {
	public static int y = 50;
	public static int x = 50;
	private final  String IMAGE_NAME = "suskil.JPG";
	private Image suslik;

	public Window() {
		JFrame f = new JFrame("Bla");
		f.setLocation(500, 150);
		f.setMinimumSize(new Dimension(500, 400));
		f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		f.getContentPane().add(this);
		f.pack();
		f.setVisible(true);

		JLabel label1;
		String str = "Image and Text";

		label1 = new JLabel(str, JLabel.LEFT);
		// Set the position of the text, relative to the icon:
		label1.setVerticalTextPosition(JLabel.BOTTOM);
		label1.setHorizontalTextPosition(JLabel.LEFT);

		JTextArea txt = new JTextArea();
		Font font = new Font("Verdana", Font.BOLD, 18);
		txt.setFont(font);
		label1.setFont(font);
		txt.setForeground(Color.BLUE);
		add(txt);

		add(label1);

		try {
			suslik= ImageIO.read(new File(IMAGE_NAME));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.err.println("Cann`t load a file");
		}
	}

	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.GREEN);
		g.fillRect(0, 0, 500, 400);
		g.drawImage(suslik, 150, 150, new ImageObserver(){
		@Override
		public boolean imageUpdate(Image img, int infoflags, int x, int y,
				int width, int height) {
			// TODO Auto-generated method stub
			return false;
		}
		});
	}

	public static void main(String[] args) throws InterruptedException {
		Window d = new Window();

		Thread.sleep(2000);
		System.out.println("bla");
		y = 0;
		x = 0;

		Rectangle r = new Rectangle(50, 100, 100, 100);
		// d.repaint();
		// d.repaint(r);
	}

}
