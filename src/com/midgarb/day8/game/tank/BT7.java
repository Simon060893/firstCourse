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

public class BT7 extends AbstractTank {

	public BT7(Field bf) {
		super(bf, 0, 64, Direction.RIGHT);
		tankColor = new Color(255, 0, 0);
		towerColor = new Color(0, 255, 0);
		setImages();
		}
	int actionsCP = 0;

	private Action[] actionsT34 = { Action.TURN_LEFT, Action.FIRE, Action.MOVE,
			Action.TURN_RIGHT, Action.MOVE, Action.TURN_UP, Action.FIRE };



	public BT7(Field bf, int x, int y, Direction direction) {
		super(bf, x, y, direction);
		tankColor = new Color(255, 0, 0);
		towerColor = new Color(0, 255, 0);
		setImages();
	}

	// @Override
	// public void destroy() {
	// // TODO Auto-generated method stub
	// tankX = -100;
	// tankY = -100;
	// }
	// Image[] images = new Image[5];
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
	public Action setUpAction(){
		Random r = new Random();
		int i = r.nextInt(9);;
		Action action = Action.NONE;
		if ( i == 0 ){
			action = Action.TURN_UP;
		} else if (i == 1) {
			action = Action.TURN_DOWN;
		} else if (i == 2) {
			action = Action.TURN_LEFT;
		} else if (i == 3) {
			action = Action.TURN_RIGHT;
		} else if (i > 3 && i <= 7 ) {
			
			action = Action.MOVE;
		} else if (i > 7 && i <= 9 ) {
			action = Action.FIRE;
		}
		return action;
	}

	@Override
	public Action setUpAction(Action s) {
		// TODO Auto-generated method stub
		return s;
	}
}
