package com.midgarb.day5.f3;



import javax.swing.JPanel;

import com.midgarb.day4.f33.Action;
import com.midgarb.day4.f33.Bullet;
import com.midgarb.day4.f33.Field;
import com.midgarb.day4.f33.Tank;
import com.midgarb.day5.f25.Direction;

public class Tanku extends JPanel {
	private int tankX;
	private int tankY;
	protected long speed = 10;
	private static Direction direction ;
	private Action af;//рычаг
	private Field bf;//ситуация на поле 
	Bullet b2;
	Tanku t2;
	Tank u;
	private String color;
	private int crew;
	private int maxspped;

	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
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
	public Tanku(){
		System.out.println("parent Tank");
	}
	public Tanku(Action af, Field bf) {
		this(af, bf, 128, 512, direction);
	}

	public Tanku(Action af, Field bf, int x, int y, Direction direction) {
		this.tankX = x;
		this.tankY = y;
		this.af = af;
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

	public void turn() throws Exception {
		this.direction.getId();
		af.processTurn(u);//
	}

	public void move() throws Exception {
		af.processMove(u);

	}

	public void fire() throws Exception {
//		Bullet bullet = new Bullet((tankX + 25), (tankY + 25), direction.DOWN);
//		af.processFire(bullet);
	}

	public void moveRandom() throws Exception {
	af.processmoveRandom();

	}

	public void moveToQuadrant(int v, int h) throws Exception {
		af.procesMoveToQuadrant(v, h);
	}
	public  void destroy(){
//		this.updateX(650);
//		this.updateY(650);
		tankX = -100;
		tankY = -100;
	}
}
