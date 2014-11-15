package com.midgarb.day5.hw5;

import java.util.Random;

import javax.swing.JPanel;

import com.midgarb.day5.f25.Direction;



public class Tank extends JPanel {
	protected int tankX;
	protected int tankY;
	private long speed = 10;
	private static Direction direction;
	private Action af;//рычаг
	private Field bf;//ситуация на поле 
	Bullet b2;
	Tank t2;
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
	public Tank(){
		System.out.println("parent Tank");
	}
	public Tank(Action af, Field bf) {
		this(af, bf, 128, 512, direction.UP);
	}

	public Tank(Action af, Field bf, int x, int y, Direction direction) {
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

	public void turn(Direction direction) throws Exception {
		this.direction = direction;
		af.processTurn(this);//
	}

	public void move() throws Exception {
		af.processMove(this);

	}

	public void fire() throws Exception {
		Bullet bullet = new Bullet((tankX + 25), (tankY + 25), direction);
		af.processFire(bullet);
		
	}

	public void moveRandom() throws Exception {
	af.processmoveRandom();

	}

	public void moveToQuadrant(int v, int h) throws Exception {
		af.procesMoveToQuadrant(v, h);
	}
	public static void gf(){
		System.out.println("j");
	}
	public static  String getLocation1(){
		Random r = new Random();
		int f = r.nextInt(3);
		String []str= {"128_64","512_192","128_448"};
		String  s = str[f];
		
		return s;
	}
	public  void destroy(){
		tankX = -100;
		tankY = -100;
	}
}
