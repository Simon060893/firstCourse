package com.midgarb.day7.gameOfTank.server;

import com.midgarb.day5.f25.Direction;
import com.midgarb.day7.gameOfTank.interfaces.ITank;
import com.midgarb.day7.gameOfTank.tank.AbstractTank;
import com.midgarb.day7.gameOfTank.tank.Bullet;

import com.midgarb.day7.gameOfTank.util.Brick;
import com.midgarb.day7.gameOfTank.util.Eagle;
import com.midgarb.day7.gameOfTank.util.Field;

public class Action implements ITank {
	private ActionField af;
	private AbstractTank tank;
	private Field f;

	public Action(AbstractTank tank, ActionField af, Field f) {
		this.tank = tank;
		this.af = af;
		this.f = f;
//		moveToQuadrant(3, 1);
	}

	// try {
	// af = new ActionField();
	// } catch (Exception e) {
	// // TODO Auto-generated catch block
	// e.printStackTrace();
	// }
	public void action() {
	
//		for (int i = 9; i > 0; i--) {
//			for (int j = Integer.parseInt(af.getQuadrant(tank.getTankX(),
//					tank.getTankY()).split("_")[0]); j < 9; j++) {
//				if (f.scanQuadrant(i - 1, j) instanceof Brick) {
//					// System.out.println(j + "#" + i);
////					while(f.scanQuadrant(i - 1, j) instanceof Eagle || af.c){
//					moveToQuadrant(j + 1, i);
////				}
//					}
//			}
//
//			for (int j = Integer.parseInt(af.getQuadrant(tank.getTankX(),
//					tank.getTankY()).split("_")[0]) + 1; j > 0; j--) {
//				if (f.scanQuadrant(i - 1, j) instanceof Brick) {
//					// System.out.println(j + "#" + i);
//					moveToQuadrant(j, i);
//				}
//			}opera:speeddial

//		}
		if(this.tank == af.agressor){
			moveToQuadrant(5, 8);
		}else{
		moveToQuadrant(5, 3);
		}
	}
	@Override
	public void turn(Direction direction) {
		// TODO Auto-generated method stub
		tank.setDirection(direction);;
		try {
			af.processTurn(tank);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		try {
			af.processMove(tank);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void fire() {
		// TODO Auto-generated method stub
		Bullet bullet = new Bullet(tank.getTankX() +25, (tank.getTankY() +25), tank.getDirection());
		try {
			af.processFire(bullet, tank);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void moveToQuadrant(int v, int h) {
		// TODO Auto-generated method stub
		try {
			af.procesMoveToQuadrant(v, h, tank);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
