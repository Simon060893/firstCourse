package com.midgarb.day8.game.tank;

import java.awt.Color;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.Random;

import javax.imageio.ImageIO;

import com.midgarb.day5.f25.Direction;
import com.midgarb.day8.game.server.Action;
import com.midgarb.day8.game.util.Field;


public class Tiger extends AbstractTank {
	private int armor = 2;
	Field battlefield;

	public Tiger(Field bf) {
		super(bf, 128, 512, Direction.DOWN);
		tankColor = new Color(255, 0, 250);
		towerColor = new Color(0, 255, 0);
		setImages();
	}

	public Tiger(Field bf, int x, int y, Direction direction) {
		super(bf, x, y, direction);
		tankColor = new Color(255, 0, 250);
		towerColor = new Color(0, 255, 0);
		actions = null;
		setImages();
	}

	public Action setUpAction(){
		// destroy all including Defender
		Random r = new Random();
		int i = r.nextInt(8);;
		Action action = Action.NONE;
		if ( i == 0 ){
			action = Action.TURN_UP;
		} else if (i == 1) {
			action = Action.TURN_DOWN;
		} else if (i == 2) {
			action = Action.TURN_LEFT;
		} else if (i == 3) {
			action = Action.TURN_RIGHT;
		} else if (i > 3 && i <5 ) {
			action = Action.FIRE;
		} else if (i > 4 && i <= 8 ) {
			action = Action.MOVE;
		}
		return action;
	}

	

	public void updateArmor(int i) {
		this.armor += i;
	}

	public int getArmor() {
		return armor;
	}

	public void setImages() {
		images = new Image[5];
		try {
			images[1] = ImageIO.read(new File("tigerup.bmp").getAbsoluteFile());
			images[2] = ImageIO.read(new File("tigerdown.bmp")
					.getAbsoluteFile());
			images[4] = ImageIO.read(new File("tigerright.bmp")
					.getAbsoluteFile());
			images[3] = ImageIO.read(new File("tigerleft.bmp")
					.getAbsoluteFile());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Cann`t search that file");
		}

	}

	@Override
	public Action setUpAction(Action s) {
		// TODO Auto-generated method stub
		return s;
	}
}
