package com.midgarb.day4.hw5;

public class Book {
	private String name;
	private String avtor;
	private Janr j;
	
	public Book() {
	
	}


	public Janr getJ() {
		return j;
	}


	public void setJ(Janr j) {
		this.j = j;
	}


	public void setName(String name) {
		this.name = name;
	}

	public void setAvtor(String avtor) {
		this.avtor = avtor;
	}

	public String getName() {
		return name;
	}

	public String getAvtor() {
		return avtor;
	}
}
