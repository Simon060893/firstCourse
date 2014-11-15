package com.midgarb.day9.f8;

public interface Subject {

	public void addObserver(Observer o);
	public void removeObserver(Observer o);
	public void notifyObservers();
}
