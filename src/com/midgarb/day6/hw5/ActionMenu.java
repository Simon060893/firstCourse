package com.midgarb.day6.hw5;

import java.util.Arrays;

import com.midgarb.day6.hw5.domain.Bun.Bun;
import com.midgarb.day6.hw5.domain.Bun.Kruassan;
import com.midgarb.day6.hw5.domain.Bun.Rogalik;
import com.midgarb.day6.hw5.domain.Tea.Bergamot;
import com.midgarb.day6.hw5.domain.Tea.BlackTea;
import com.midgarb.day6.hw5.domain.Tea.GreenTea;
import com.midgarb.day6.hw5.domain.Tea.Tea;
import com.midgarb.day6.hw5.domain.composition.Composition;
import com.midgarb.day6.hw5.domain.kofe.Americano;
import com.midgarb.day6.hw5.domain.kofe.Black;
import com.midgarb.day6.hw5.domain.kofe.Kapucino;
import com.midgarb.day6.hw5.domain.kofe.Koffe;
import com.midgarb.day6.hw5.domain.kofe.Mocacino;
import com.midgarb.day6.hw5.domain.kofe.WithMilk;

public class ActionMenu {

	private Tea[] t = { new BlackTea(), new Bergamot(), new GreenTea() };
	private Koffe[] k = { new Americano(), new Black(), new Kapucino(),
			new Mocacino(), new WithMilk() };
	private Bun[] b = { new Kruassan(), new Rogalik() };

	public void lookMenu() {
		System.out.println("Name      " + "Price   " + "Consist");
		///----tea
		for (int i = 0; i < t.length; i++) {
			System.out.print(t[i] + "  ");
			double price = 0;
			for (Composition h : t[i].getSostav()) {
				price += h.getPrice();
			}
			System.out.print(price + "    ");
			for (Composition h : t[i].getSostav()) {
				System.out.print(h.getName() + " ");
			}
			System.out.println(" ");
		}
		////---coffea
		for (int i = 0; i < k.length; i++) {
			System.out.print(k[i] + "  ");
			double price = 0;
			for (Composition h : k[i].getSostav()) {
				price += h.getPrice();
			}
			System.out.print(price + "    ");
			for (Composition h : k[i].getSostav()) {
				System.out.print(h.getName() + " ");
			}
			System.out.println(" ");
		}
		////---buns
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i] + "  ");
			double price = 0;
			for (Composition h : b[i].getSostav()) {
				price += h.getPrice();
			}
			System.out.print(price + "    ");
			for (Composition h : b[i].getSostav()) {
				System.out.print(h.getName() + " ");
			}
			System.out.println(" ");
		}
	}
}
