package com.midgarb.day8.sort.copy;

//import java.util.Random;
import java.util.*;
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

	public  String Selling(TovarCar <? extends com.midgarb.day5.hw01.TovarCar> car) {// sell auto by whatever
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
		
		if (car.getClass().getSimpleName().equals("Bmw")) {
			v += car.getKolModel();
			b = car.getCost();

		} else if (car.getClass().getSimpleName().equals("Audi")) {
			v += car.getKolModel();
			b = car.getCost();
		} else if (car.getClass().getSimpleName().equals("Moskvich")) {
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

	public int Sell(TovarCar <? extends com.midgarb.day5.hw01.TovarCar> car) {// sell auto by whatever period
		int b = 0;// count pokupok
		int v = 0;
		int i = 0;
		Random r = new Random();
		int u1 = r.nextInt(3);// middle selling by week, no more then 3 car
		if (car.getClass().getSimpleName().equals("Bmw")) {
			v += car.getKolModel();
			
		} else if (car.getClass().getSimpleName().equals("Audi")) {
			v += car.getKolModel();
			
		} else if (car.getClass().getSimpleName().equals("Moskvich")) {
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
