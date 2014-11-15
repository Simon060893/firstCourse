package com.midgarb.day4.hw3;

import java.awt.Color;

public class Cars {
	private Color colo;
	private String number;
	private String marka;
	private int dveri;
	private int maxSpeed;
	private boolean isMoving;
	private boolean isLights;


	public Cars(){
		marka = "LAda";
		number = "Kf 2201 320";
		dveri = 4;
		colo = Color.BLACK;
		isMoving = false;
		isLights = false;
	}
	
	public Color getColor() {
		return colo;
	}
	
	public void setColor(Color color) {
		this.colo = color;
	}

	public void moveCar() {
		isMoving = true;
	}
	
	public void moveCarStop() {
		isMoving = false;
	}
	
	public void turnOnLights() {
		isLights = true;
	}
	public void turnOffLights() {
		isLights = false;
	}
	public String getName(){
		return marka;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public int getDveri() {
		return dveri;
	}
	public void setDveri(int dveri) {
		this.dveri = dveri;
	}
	public int getMaxSpeed() {
		return maxSpeed;
	}
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
}
