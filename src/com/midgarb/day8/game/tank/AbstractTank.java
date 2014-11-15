package com.midgarb.day8.game.tank;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.awt.image.RescaleOp;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

import com.midgarb.day5.f25.Direction;
import com.midgarb.day8.game.interfaces.IDestroyble;
import com.midgarb.day8.game.interfaces.IDrawble;
import com.midgarb.day8.game.interfaces.ITank;
import com.midgarb.day8.game.server.Action;
import com.midgarb.day8.game.server.ActionField;
import com.midgarb.day8.game.util.Field;



public class AbstractTank extends JPanel implements IDrawble, IDestroyble, ITank
		 {
	protected int tankX;
	protected int tankY;
	private long speed = 10;
	protected Direction direction;
	protected Image[] images;
	private boolean destroyed = false;
	private ActionField af;
	protected Action[] actions;
	private int actionCount = 0;
	private BufferedImage bi;
	float[] scales = { 1f, 1f, 1f, 0.5f };
	float[] offsets = new float[4];
	RescaleOp rop;

	public void setDirection(Direction direction) {
		this.direction = direction;
	}

	private Field bf;// ситуация на поле
	private Bullet b2;

	private int crew;
	private int maxspped;
	protected Color tankColor;
	protected Color towerColor;

//	public void turn(Direction direction) {
//		this.direction = direction;
//	}

	public Action askAction(){
		if (actionCount < actions.length){
			return actions[actionCount++];
		} else {
			return Action.NONE;
		}
	}
	public String getLocationTank(int x, int y){
		
		return x/64+"_"+y/64;
		
	}

	public boolean isDestroyed() {
		return destroyed;
	}

	public int getCrew() {
		return crew;
	}

	public void setCrew(int crew) {
		this.crew = crew;
	}

	public int getMaxspped() {
		return maxspped;
	}

	public void setMaxspped(int maxspped) {
		this.maxspped = maxspped;
	}

	public AbstractTank(Field bf) {
		this(bf, 128, 512, Direction.UP);
	}

	public AbstractTank(Field bf, int x, int y, Direction direction) {
		this.tankX = x;
		this.tankY = y;
		// this.af = af;
		this.bf = bf;
		this.direction = direction;
	}

	public int getTankX() {
		return tankX;
	}

	public void updateX(int tankX) {
		this.tankX += tankX;
	}

	public int getTankY() {
		return tankY;
	}

	public void updateY(int tankY) {
		this.tankY += tankY;
	}

	public Direction getDirection() {
		return direction;
	}

	public Action setUpAction(Action s) {
		return s;

	}

	public static String getLocation1() {
		Random r = new Random();
		int f = r.nextInt(3);
		String[] str = { "192_64", "512_192", "192_256" };
		String s = str[f];

		return s;
	}

	public void draw(Graphics g) {

		if (!destroyed) {
			g.drawImage(images[getDirection().getId()], getTankX(), getTankY(),
					new ImageObserver() {
						@Override
						public boolean imageUpdate(Image img, int infoflags,
								int x, int y, int width, int height) {
							// TODO Auto-generated method stub
							return false;
						}
					});
		
			// BufferedImage img = ImageIO.read(images[getDirection().getId()]);
			// int w = img.getWidth(null);
			// int h = img.getHeight(null);
			// bi = new BufferedImage(0, 0, BufferedImage.TYPE_INT_ARGB);
			// Graphics g1 = bi.getGraphics();
			// g.drawImage(img, 0, 0, null);
			// setOpacity(0.5f);
			// Graphics2D g2d = (Graphics2D)g;
			// g2d.drawImage(bi, rop, 0, 0);

		}	else{
			tankX=1000;
			tankY=1000;
		}
	}

	public void destroy() {
		destroyed = true;
		// tankX = -1000;
		// tankY = -1000;
	}




	@Override
	public void turn(Direction direction) {
		// TODO Auto-generated method stub
		this.direction = direction;
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void fire() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void moveToQuadrant(int v, int h) {
		// TODO Auto-generated method stub
		
	}


}
