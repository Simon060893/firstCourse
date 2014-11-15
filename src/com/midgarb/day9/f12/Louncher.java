package com.midgarb.day9.f12;

import java.util.Observer;

import com.midgarb.day9.f10.interfaces.Journal;
import com.midgarb.day9.f10.interfaces.Newspaper;
import com.midgarb.day9.f10.interfaces.Subscriber;

public class Louncher {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Observer s0 = new Simon();
//		Observer s1 = new Natasha();

		Facts np = new Facts();
		People j = new People();
		np.addObserver(s0);
		j.addObserver(s0);

		for (int i = 0; i < 3; i++) {
			np.createNewEdition();
			System.out.println();
			Thread.sleep(500);
//			j.createNewEdition();
		}
		System.out.println("-------------");
	j.deleteObserver(s0);
		for (int i = 0; i < 3; i++) {
			np.createSpecificNewEdition();
//			j.createSpecificNewEdition();
			System.out.println();
			Thread.sleep(500);
//			j.createNewEdition();
		}

	}

}
