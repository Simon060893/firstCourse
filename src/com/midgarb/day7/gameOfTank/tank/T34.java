package com.midgarb.day7.gameOfTank.tank;

import java.awt.Color;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import com.midgarb.day5.f25.Direction;
import com.midgarb.day7.gameOfTank.util.Field;





public class T34 extends AbstractTank {

	public T34(Field battleField) {
		super( battleField, 128, 512, Direction.DOWN);
		tankColor = new Color(255,0,0);
		towerColor = new Color(0,255,0);
		setImages();
	}
	public T34( Field bf, int x, int y, Direction direction){
		super( bf, x, y, direction);
		tankColor = new Color(255,0,0);
		towerColor = new Color(0,255,0);
		setImages();
	}
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		tankX = -100;
		tankY = -100;
	}
	public void setImages(){
		images = new Image[4];
		try {
			images[0]= ImageIO.read(new File("t34up.bmp").getAbsoluteFile());
			images[1]= ImageIO.read(new File("t34down.bmp").getAbsoluteFile());
			images[2]= ImageIO.read(new File("t34right.bmp").getAbsoluteFile());
			images[3]= ImageIO.read(new File("t34left.bmp").getAbsoluteFile());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Cann`t search that file");
		}
		
	}
}
