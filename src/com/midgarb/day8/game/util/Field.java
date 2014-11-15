package com.midgarb.day8.game.util;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Field {
	
	// private Eagle e = new Eagle(8,5);

	// private Pole[][] battleField = {
	// { new Brick(0, 0), new Brick(64, 0), new Brick(128, 0),
	// new Brick(192, 0), new Brick(256, 0), new Brick(320, 0),
	// new Brick(384, 0), new Brick(448, 0), new Brick(512, 0) },
	// { new Clean(0, 64), new Clean(64, 64), new Clean(128, 64),
	// new Clean(192, 64), new Clean(256, 64), new Clean(320, 64),
	// new Clean(384, 64), new Clean(448, 64), new Clean(512, 64) },
	// { new Brick(0, 128), new Clean(64, 128), new Brick(128, 128),
	// new Clean(192, 128), new Clean(256, 128),
	// new Clean(320, 128), new Brick(384, 128),
	// new Clean(448, 128), new Brick(512, 128) },
	// { new Clean(0, 192), new Clean(64, 192), new Brick(128, 192),
	// new Clean(192, 192), new Brick(256, 192),
	// new Clean(320, 192), new Brick(384, 192),
	// new Clean(448, 192), new Clean(512, 192) },
	// { new Clean(0, 256), new Brick(64, 256), w, w, w, w, w,
	// new Brick(448, 256), new Clean(512, 256) },
	// { new Clean(0, 320), new Brick(64, 320), w, new Brick(192, 320), w,
	// new Brick(320, 320), w, new Brick(448, 320),
	// new Clean(512, 320) },
	// { new Clean(0, 384), new Brick(64, 384), w, w, w, w, w,
	// new Brick(448, 384), new Clean(512, 384) },
	// { new Clean(0, 448), new Brick(64, 448), new Clean(128, 448), r, r,
	// r, new Clean(384, 448), new Brick(448, 448),
	// new Clean(512, 448) },
	// { new Clean(0, 512), new Clean(64, 512), new Clean(128, 512),
	// new Rock(192, 512), new Eagle(256, 512),
	// new Rock(320, 512), new Clean(384, 512),
	// new Clean(448, 512), new Clean(512, 512) }
	//
	// };
	private Image iWater;
	private Image iGround;
	private Image iRock;
	private Image iBrick;
	private Image iEagle;

	private Rock r = new Rock(0, 0, iRock);
	private Brick b = new Brick(0, 0, iBrick);
	private Water w = new Water(0, 0, iWater);
	private Clean c = new Clean(0, 0, iGround);
	private Pole[][] battleField = { { b, b, b, b, b, b, b, b, b },
			{ c, c, c, c, c, c, c, c, c }, { b, c, b, c, c, c, b, c, b },
			{ c, c, b, c, b, c, b, c, c }, { c, b, w, w, w, w, w, b, c },
			{ c, b, w, b, w, b, w, b, c }, { c, b, w, w, w, w, w, b, c },
			{ c, b, c, r, r, r, c, b, c },
			{ c, c, c, r, new Eagle(256, 512, iEagle), r, c, c, c }

	};
	private int BF_WIDTH = 590;
	private int BF_HEIGHT = 605;

	public void createFiled() {
		long time = System.currentTimeMillis();
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				if (battleField[i][j] instanceof Rock) {
					battleField[i][j] = new Rock(j * 64, i * 64, iRock);
				} else if (battleField[i][j] instanceof Brick) {
					battleField[i][j] = new Brick(j * 64, i * 64, iBrick);
				} else if (battleField[i][j] instanceof Water) {
					battleField[i][j] = new Water(j * 64, i * 64, iWater);
				} else if (battleField[i][j] instanceof Clean) {
					battleField[i][j] = new Clean(j * 64, i * 64, iGround);
				}else if (battleField[i][j] instanceof Eagle) {
					battleField[i][j] = new Eagle(j * 64, i * 64, iEagle);
				}

			}
		}
		System.out.println((System.currentTimeMillis() - time));
	}

	private void loadImages() {
		try {
			iWater = ImageIO.read(new File("water.jpg").getAbsoluteFile());
			iGround = ImageIO.read(new File("ground.jpg").getAbsoluteFile());
			iRock = ImageIO.read(new File("picture.jpg").getAbsoluteFile());
			iBrick = ImageIO.read(new File("brick.jpg").getAbsoluteFile());
			iEagle = ImageIO.read(new File("picture.jpg").getAbsoluteFile());
		
		} catch (IOException e) {
			System.err.println("Can't find images for battlefield objects");
		}
	}
//	public void draw(Graphics g) {
//		for (int j = 0; j < getDimentionY(); j++) {
//			for (int k = 0; k < getDimentionX(); k++) {
//				battleField[j][k].draw(g);
//			}
//		}
//	}

	public Field() {
		loadImages();
		createFiled();
	}

	public Image getiGround() {
		return iGround;
	}

	public Field(Pole[][] battleField) {
		this.battleField = battleField;

	}

	public Pole scanQuadrant(int i, int b) {
		return battleField[i][b];
	}

	public void upadateQuadrant(int x, int y, Pole object) {
		battleField[x][y] = object;

	}
	

	public Pole[][] getBattleField() {
		return battleField;
	}

	public int getBF_WIDTH() {
		return BF_WIDTH;
	}

	public int getBF_HEIGHT() {
		return BF_HEIGHT;
	}

	public int getDimentionX() {
		return battleField.length;
	}

	public int getDimentionY() {
		return battleField.length;
	}
}
