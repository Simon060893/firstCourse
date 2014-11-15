package com.midgarb.day5.hw01;

import java.util.Random;

public class Katalog {

	private Kategory kategoryi;

	public Katalog() {

	}

	public void createKatalog(TovarCar car) {
		Random r = new Random();
		int h = 0, g = 0;
		while (g < 50000) {
			g += r.nextInt(100000);
		}
		while (h < 5) {
			h += r.nextInt(20);
		}
		car.setKategoryi(kategoryi);
		car.setCost(g);
		car.setKolModel(h);
	}

}
