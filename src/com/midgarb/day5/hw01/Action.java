package com.midgarb.day5.hw01;

import java.util.Random;

public class Action {
	//private TovarCar car;
	private Bmw b;
	private Audi a;
	private Mosckvich m;
	private Pokupka p1;
	private Katalog k;


	public Action() {
		k = new Katalog();
		b = new Bmw();
		a = new Audi();
		m = new Mosckvich();
		p1 = new Pokupka();
		// System.out.println(p);
	}

	public void CostOfCar() {// price of tovar
		System.out.println("Bmw-" + b.getCost() + "$");
		System.out.println("Audi-" + a.getCost() + "$");
		System.out.println("Mosckvich-" + m.getCost() + "$");
	}

	public void CountOfCar() {
		System.out.println("Bmw-" + b.getKolModel() + " штук");
		System.out.println("Audi-" + a.getKolModel() + " штук");
		System.out.println("Mosckvich-" + m.getKolModel() + " штук");
	}

	public void CountBroughtOfPeriod(int u) {
		for (int g = 0; g < u; g++) {
			System.out.print(p1.Sell(b) + p1.Sell(a) + p1.Sell(m) + " ");
		}
	}

	public void ListOfSelling() {
		int d = 0,c=0,v=0;
		String[] s = { p1.Selling(b), p1.Selling(a), p1.Selling(m) };
		Random r = new Random();
		int f1 = r.nextInt(3);
		//int f2 = r.nextInt(4);
		
	
		while(f1<s.length) {
			System.out.println(s[f1]);
			d++;
			if(f1==0){
				v +=b.getZarobotok();
				c +=b.getCountOfSelling();
			}
			if(f1==1){
				v+=a.getZarobotok();
				c +=a.getCountOfSelling();
			}
			if(f1==2){
				v+=m.getZarobotok();
				c +=m.getCountOfSelling();
			}
			f1++;
		}
//		while(f1>f2) {
//			System.out.println(s[f2]);
//			d++;
//			f2++;
//		}
		
		System.out.print("Itogo: "+d+" pokupki by sum "+v+" with general count at "+c);
	}

	public void KataloCar(int i) {
		Random h = new Random();
		TovarCar[] car = {b,a,m};
		for(int j = 1; j<i;j++){
			int e = h.nextInt(3);
			k.createKatalog(car[e]);
			System.out.println(car[e].getStr()+" " + car[e].getKategoryi() +" "+ car[e].getKolModel()+" штук по "+car[e].getCost()+"$");
		}
		

	}
}
