package com.midgarb.day8.game.util;

import java.awt.AlphaComposite;
import java.awt.Composite;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.ImageObserver;

public class Water extends Pole {
	public Water(int x, int y, Image imageSafe) {
		super(x, y, imageSafe);
		// try {
		// image = ImageIO.read(new File("waterr.png").getAbsoluteFile());
		//
		// } catch (IOException e) {
		// // TODO Auto-generated catch block
		// System.out.println("go on ");
		// }
	}

	@Override
	public void draw(Graphics g) {
		Graphics2D g2D = (Graphics2D) g;
		Composite org = g2D.getComposite();
		Composite translucent = AlphaComposite.getInstance(
				AlphaComposite.SRC_OVER, 0.5f);
		g2D.setComposite(translucent);
		// AlphaComposite ac =
		// AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 0.5f);
		// g.setComposite(ac);
		g.drawImage(this.getImageSafe(), getX(), getY(), getX() + 64,
				getY() + 64, getX(), getY(), getX() + 64, getY() + 64,
				new ImageObserver() {

					@Override
					public boolean imageUpdate(Image img, int infoflags, int x,
							int y, int width, int height) {
						// TODO Auto-generated method stub
						return false;
					}
				});
		g2D.setComposite(org);
	}
}
