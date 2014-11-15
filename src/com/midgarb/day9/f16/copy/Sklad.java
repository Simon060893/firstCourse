package com.midgarb.day9.f16.copy;

import com.midgarb.day5.hw1.domain.Audi;
import com.midgarb.day5.hw1.domain.Bmw;
import com.midgarb.day5.hw1.domain.Kategory;
import com.midgarb.day5.hw1.domain.Mosckvich;

public class Sklad {
	public void createKatalog() {

		Bmw b = new Bmw();
		b.setName("Bmw_X7");
		b.setCost(70000);
		b.setKolModel(9);
		b.setKategoryi(Kategory.CUPE);
		Action.addToShop(b);

		b = new Bmw();
		b.setName("Bmw_X6");
		b.setCost(75000);
		b.setKolModel(10);
		b.setKategoryi(Kategory.JEEP);
		Action.addToShop(b);

		b = new Bmw();
		b.setName("Bmw_X5");
		b.setCost(73000);
		b.setKolModel(8);
		b.setKategoryi(Kategory.PIKAP);
		Action.addToShop(b);

		b = new Bmw();
		b.setName("Bmw_M6");
		b.setCost(75999);
		b.setKolModel(11);
		b.setKategoryi(Kategory.SEDAN);
		Action.addToShop(b);

		Audi a = new Audi();
		a.setName("Audi_A6");
		a.setCost(70000);
		a.setKolModel(6);
		a.setKategoryi(Kategory.CUPE);
		Action.addToShop(a);

		a = new Audi();
		a.setName("Audi_A12");
		a.setCost(73000);
		a.setKolModel(8);
		a.setKategoryi(Kategory.PIKAP);
		Action.addToShop(a);

		a = new Audi();
		a.setName("Audi_M6");
		a.setCost(75999);
		a.setKolModel(11);
		a.setKategoryi(Kategory.SEDAN);
		Action.addToShop(a);

		Mosckvich m = new Mosckvich();
		m.setCost(12000);
		m.setName("Mosckvich_412");
		m.setKolModel(12);
		m.setKategoryi(Kategory.CUPE);
		Action.addToShop(m);

		m = new Mosckvich();
		m.setCost(9000);
		m.setName("Mosckvich_612");
		m.setKolModel(8);
		m.setKategoryi(Kategory.PIKAP);
		Action.addToShop(m);

		m = new Mosckvich();
		m.setCost(10000);
		m.setName("Mosckvich_5");
		m.setKolModel(11);
		m.setKategoryi(Kategory.SEDAN);
		Action.addToShop(m);
	}
}
