package com.midgarb.day9.f12;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Observable;



public class People extends Observable {
	public double result = 0.0;

	public People() {

	}

	public void createNewEdition() {
		// TODO Auto-generated method stub
		double f = Math.random();
		if (f < 0.5 || f > 10.0) {
			System.out.println("New Edition of People");
			result =f;
			setChanged();
			notifyObservers();
		} else {
			SimpleDateFormat stf = new SimpleDateFormat("HH:mm:ss");
			System.out.println(stf.format(new Date()));
		}
	}
	public void createSpecificNewEdition() {
		// TODO Auto-generated method stub
		double f = Math.random();
		if (f < 0.5 || f > 5.0) {
			System.out.println("New Edition of People");
			result = f;
			setChanged();
			notifyObservers(new ActionEvent("photo"));
		} else {
			SimpleDateFormat stf = new SimpleDateFormat("HH:mm:ss");
			System.out.println(stf.format(new Date()));
		}
	}

	public double getResult() {
		return result;
	}
}
