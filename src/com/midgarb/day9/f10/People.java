package com.midgarb.day9.f10;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.midgarb.day9.f10.interfaces.Journal;
import com.midgarb.day9.f10.interfaces.Subscriber;


public class People implements Journal {
	public List<Subscriber> subscibers;

	public People() {
		subscibers = new ArrayList<Subscriber>();
	}

	

	@Override
	public void addSibscriber(Subscriber s) {
		// TODO Auto-generated method stub
		subscibers.add(s);
	}

	@Override
	public void deleteSibscriber(Subscriber s) {
		// TODO Auto-generated method stub
		subscibers.remove(s);
	}

	@Override
	public void notifySibscriber() {
		// TODO Auto-generated method stub
		for(Subscriber s :subscibers){
			s.update();
		}
	}



	@Override
	public void createNewEdition() {
		// TODO Auto-generated method stub
		double f = Math.random();
		if (f < 0.5 || f > 8.0) {
			System.out.println("New Edition of People");
			notifySibscriber();
		} else {
			SimpleDateFormat stf = new SimpleDateFormat("HH:mm:ss");
			System.out.println(stf.format(new Date()));
		}
	}

	



}
