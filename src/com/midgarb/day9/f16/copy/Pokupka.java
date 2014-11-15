package com.midgarb.day9.f16.copy;

import java.util.Random;

import com.midgarb.day5.hw1.domain.Audi;
import com.midgarb.day5.hw1.domain.Bmw;
import com.midgarb.day5.hw1.domain.Mosckvich;
import com.midgarb.day5.hw1.domain.Pokupatel;
import com.midgarb.day5.hw1.domain.TovarCar;

public class Pokupka {
	private Pokupatel p;

	public Pokupka() {
		p = new Pokupatel();
	}

	public  String Selling(TovarCar car) {// sell auto by whatever
		String mas = "";
		int v = 0;
		int i = 0;
		int b = 0 ;
		Random r = new Random();
		int u1 = 0;// middle selling by week
		while(u1 == 0){
			u1 +=r.nextInt(7);
		}
		int nameId = r.nextInt(7);
		
		if (car instanceof Bmw) {
			v += car.getKolModel();
			b = car.getCost();

		} else if (car instanceof Audi) {
			v += car.getKolModel();
			b = car.getCost();
		} else if (car instanceof Mosckvich) {
			v += car.getKolModel();
			b = car.getCost();
		}
		
			while (i < u1) {
				i++;
				v -= 1;
			}
			mas = p.getName(nameId) + " " + car + " "+ car.getKategoryi()+" " + b + "$ " + i;
		car.setCountOfSelling(i);
		car.setZarobotok(b*i);
	
		return mas; 
	}

	public int Sell(TovarCar car) {// sell auto by whatever period
		int b = 0;// count pokupok
		int v = 0;
		int i = 0;
		Random r = new Random();
		int u1 = r.nextInt(3);// middle selling by week, no more then 3 car
		if (car instanceof Bmw) {
			v += car.getKolModel();
			
		} else if (car instanceof Audi) {
			v += car.getKolModel();
			
		} else if (car instanceof Mosckvich) {
			v += car.getKolModel();
		}
			while (i < u1) {
				i++;
				v--;
				if (v > 0) {
					b = car.getKolModel() - v;
				} else {
					break;
				}
			}
		
		return b;
	}
}
