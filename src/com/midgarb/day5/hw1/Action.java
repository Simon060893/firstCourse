//package com.midgarb.day5.hw1;
//
//import java.util.Random;
//
//import com.midgarb.day5.hw1.domain.Audi;
//import com.midgarb.day5.hw1.domain.Bmw;
//import com.midgarb.day5.hw1.domain.Kategory;
//import com.midgarb.day5.hw1.domain.Mosckvich;
//import com.midgarb.day5.hw1.domain.TovarCar;
//
//public class Action {
//	private Pokupka p1;
//	private Sklad s;
//	private static TovarCar[][] car = new TovarCar[3][];
//
//	public Action() {
//		p1 = new Pokupka();
//		s = new Sklad();
//	}
//
//	public TovarCar[][] getCar() {
//		fiilingToTovar(car);
//		s.createKatalog();
//		return car;
//	}
//
//	public static void addToShop(TovarCar car1) {
//		if (car1 instanceof Bmw) {
//			setCar(car[0], car1);
//		}
//		if (car1 instanceof Audi) {
//			setCar(car[1], car1);
//		}
//		if (car1 instanceof Mosckvich) {
//			setCar(car[2], car1);
//		}
//
//	}
//
//	private static void setCar(TovarCar[] car, TovarCar car1) {
//		for (int i = 0; i < car.length; i++) {
//			if (car[i] == null) {
//				car[i] = car1;
//				return;
//			}
//		}
//	}
//
//	private void fiilingToTovar(TovarCar[][] car) {
//		car[0] = new Bmw[4];
//		car[1] = new Audi[3];
//		car[2] = new Mosckvich[3];
//	}
//
//	// ------------- information about goods
//	public void CostOfCar() {
//		for (TovarCar[] car1 : getCar()) {
//			for (TovarCar car2 : car1) {
//				System.out.println(car2 + " " + car2.getKategoryi() + " from "
//						+ car2.getCost() + "$. There are " + car2.getKolModel()
//						+ " of things");
//			}
//
//		}
//	}
//
//	// --------------to recieve the goods by kategory
//	public void giveTheGoods(Kategory kategoryi) {
//		for (TovarCar[] car1 : getCar()) {
//			for (TovarCar car2 : car1) {
//				if (car2.getKategoryi().equals(kategoryi)) {
//					System.out.println(car2 + " " + car2.getCost() + "$ "
//							+ car2.getKolModel());
//				}
//			}
//		}
//	}
//
//	// -------------make a bye by the day from period of u
//	public void CountBroughtOfPeriod(int u) {
//
//		for (int g = 0; g < u; g++) {
//			int g1 = 0;
//			for (TovarCar[] car1 : getCar()) {
//				for (TovarCar car2 : car1) {
//					g1 += p1.Sell(car2);
//				}
//			}
//			System.out.print(g1 + " ");
//		}
//		System.out.println();
//	}
//
//	public void ListOfSelling() {
//		int d = 0, c = 0, v = 0;
//		for (TovarCar[] car1 : getCar()) {
//			Random r = new Random();
//			int f1 = r.nextInt(car1.length);
//			while ((f1 + 1) < car1.length) {
//				d++;
//				System.out.println(d + " " + p1.Selling(car1[f1]));
//				v += car1[f1].getZarobotok();
//				c += car1[f1].getCountOfSelling();
//
//				f1++;
//			}
//		}
//
//		System.out.print("Itogo: " + d + " pokupki by sum " + v
//				+ " with general count at " + c);
//	}
//
//}
