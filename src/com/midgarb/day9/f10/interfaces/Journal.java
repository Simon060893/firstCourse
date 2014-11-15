package com.midgarb.day9.f10.interfaces;



public interface Journal {
	public void addSibscriber(Subscriber s);

	public void deleteSibscriber(Subscriber s);

	public void notifySibscriber();
	public void createNewEdition();
}
