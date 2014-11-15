package com.midgarb.day6.hw5modern;

import java.util.Arrays;

import com.midgarb.day6.hw5modern.drink.Drink;
import com.midgarb.day6.hw5modern.drink.coffee.Americano;
import com.midgarb.day6.hw5modern.drink.coffee.Black;
import com.midgarb.day6.hw5modern.drink.coffee.Kapucino;
import com.midgarb.day6.hw5modern.drink.coffee.Koffe;
import com.midgarb.day6.hw5modern.drink.coffee.Mocacino;
import com.midgarb.day6.hw5modern.drink.coffee.WithMilk;
import com.midgarb.day6.hw5modern.drink.tea.Bergamot;
import com.midgarb.day6.hw5modern.drink.tea.BlackTea;
import com.midgarb.day6.hw5modern.drink.tea.GreenTea;
import com.midgarb.day6.hw5modern.drink.tea.Tea;
import com.midgarb.day6.hw5modern.food.Food;
import com.midgarb.day6.hw5modern.food.bun.Bun;
import com.midgarb.day6.hw5modern.food.bun.Kruassan;
import com.midgarb.day6.hw5modern.food.bun.Rogalik;

public class ActionMenu {
	public ActionMenu() {
		showMenu(d);
		showMenu(f);
	}

	private Tea[] t = { new BlackTea(), new Bergamot(), new GreenTea() };
	private Koffe[] k = { new Americano(), new Black(), new Kapucino(),
			new Mocacino(), new WithMilk() };
	private Bun[] b = { new Kruassan(), new Rogalik() };
	//
	private Drink[][] d = { t, k };

	private Food[][] f = { b };

	public void showMenu(MenuItem[][] m) {
		System.out.println("Name " + "     Price " + "       Composition");
		for (MenuItem m1[] : m) {
			for (MenuItem m2 : m1) {
				System.out.print(m2 + " " + m2.getPrice() + "       ");
				for (int r = 0; r < m2.getSostav().length; r++) {
					System.out.print(m2.getSostav()[r] + " ");
				}
				System.out.println();
			}

		}
	}

}
