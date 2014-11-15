package com.midgarb.day9.f10;

import com.midgarb.day9.f10.interfaces.Journal;
import com.midgarb.day9.f10.interfaces.Newspaper;
import com.midgarb.day9.f10.interfaces.Subscriber;

public class Louncher {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Subscriber s0 = new Simon();
		Subscriber s1 = new Natasha();

		Newspaper np = new Facts();
		Journal j = new People();
		np.addSibscriber(s0);
		np.addSibscriber(s1);
		j.addSibscriber(s0);
		j.addSibscriber(s1);

		for (int i = 0; i < 5; i++) {
			np.createNewEdition();
			System.out.println();
			Thread.sleep(500);
			j.createNewEdition();
		}
		System.out.println("-------------");
		np.deleteSibscriber(s0);
		for (int i = 0; i < 5; i++) {
			np.createNewEdition();
			System.out.println();
			Thread.sleep(500);
			j.createNewEdition();
		}

	}

}
