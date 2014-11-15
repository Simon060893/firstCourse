package com.midgarb.day8.game.util;

import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Rock extends Pole {
	public Rock(int x, int y,Image imageSafe) {
		super(x, y, imageSafe);
		// try {
		// image = ImageIO.read(new File("picture.jpg").getAbsoluteFile());
		// } catch (IOException e) {
		// // TODO Auto-generated catch block
		// System.out.println("go on ");
		// }
	}
}
