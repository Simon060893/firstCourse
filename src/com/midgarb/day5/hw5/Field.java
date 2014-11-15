package com.midgarb.day5.hw5;

public class Field {
	private String[][] battleField = {
			{ "B", "B", "B", "B", "B", "B", "B", "B", "B" },
			{ " ", " ", " ", " ", " ", " ", " ", " ", " " },
			{ "B", " ", "B", " ", " ", " ", "B", " ", "B" },
			{ " ", " ", "B", " ", "B", " ", "B", " ", " " },
			{ " ", "B", " ", " ", " ", " ", " ", "B", " " },
			{ " ", "B", " ", "B", " ", "B", " ", "B", " " },
			{ " ", "B", " ", " ", " ", " ", " ", "B", " " },
			{ " ", "B", " ", "B", "B", "B", " ", "B", " " },
			{ " ", " ", " ", "B", " ", "B", " ", " ", " " }

	};

	private int BF_WIDTH = 590;
	private int BF_HEIGHT = 576;

	public Field() {
	
	}

	public Field(String[][] battleField) {
		this.battleField = battleField;
	}

	public int getDimentionX() {
		return battleField.length;
	}

	public int getDimentionY() {
		return battleField.length;
	}

	public String scanQuadrant(int i, int b) {
		return battleField[i][b];
	}

	public void upadateQuadrant(int x, int y, String object) {
		battleField[x][y] = object;
	}

	public int getBfWidth() {
		return BF_WIDTH;
	}

	public int getBfHEIGHT() {
		return BF_HEIGHT;
	}

}
