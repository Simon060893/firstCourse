package com.midgarb.day5.hw01;

import java.util.Random;

public  class TovarCar<T> {
	protected int kolModel;
	protected int cost;
	protected int godVipuska;
	protected int zarobotok;
	protected int countOfSelling;
	protected Kategory kategoryi;
	protected String str;
	protected String typeOfCusova;

	public String getStr() {
		return str;
	}

	public Kategory getKategoryi() {
		return kategoryi;
	}

	public void setKategoryi(Kategory kategoryi) {
		Random f = new Random();
		int f1 = f.nextInt(4);
		Kategory[] k = kategoryi.values();
		this.kategoryi = k[f1];
	}

	public int getCountOfSelling() {
		return countOfSelling;
	}

	public void setCountOfSelling(int countOfSelling) {
		this.countOfSelling = countOfSelling;
	}

	public int getZarobotok() {
		return zarobotok;
	}

	public void setZarobotok(int zarobotok) {
		this.zarobotok = zarobotok;
	}

	public int getKolModel() {
		return kolModel;
	}

	public void setKolModel(int kolModel) {
		this.kolModel = kolModel;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

}
