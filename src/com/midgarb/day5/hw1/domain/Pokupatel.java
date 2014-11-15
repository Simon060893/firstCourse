package com.midgarb.day5.hw1.domain;

public class Pokupatel {
private String nameOfBuyer;
	public String getNameOfBuyer() {
	return nameOfBuyer;
}


public void setNameOfBuyer(String nameOfBuyer) {
	this.nameOfBuyer = nameOfBuyer;
}


	private String[] name = { "Elena", "Olga", "Mihail", "Denis", "Petia",
			"Valera", "Grisha" };
	

	public String getName(int i) {
		return name[i];

	}

}
