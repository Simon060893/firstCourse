package com.midgarb.day9.f12;

import java.util.Observable;
import java.util.Observer;

public class Natasha implements Observer  {

	@Override
	public void update(Observable o, Object arg) {
		if (arg instanceof ActionEvent) {
			System.out.println("Simon is notified with event "
					+ ((ActionEvent) arg).getName());
		} else {
			System.out.println("Simon is notified with event ");
		}
		double g = Math.random();
		if (g<1.0 || g > 5.0) {
			Facts j = (Facts) o;
			System.out.println("Result of EditionFacts" + j.getResult());
		} else {
			People np = (People) o;
			System.out.println("Result of EditionPeople" + np.getResult());
		}
		
	}



}
