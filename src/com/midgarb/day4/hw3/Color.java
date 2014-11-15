package com.midgarb.day4.hw3;

public enum Color {
	RED(0), Green(1), Blue(2), Black(3), Gray(4), Orange(5), Yellow(6), Brown(7), White(
			8), darkREd(9), lightRed(10), DARK_BLUE(11), lightBlue(12), lightGray(
			13), lightGreen(14), darkGreen(15);

	private int id;

	private Color(int id) {
		this.id = id;
	}
}
