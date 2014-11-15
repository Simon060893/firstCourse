package com.midgarb.day3.hw06;

public class louncher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	static String[][] students = { { "Oleg", "Kiron" },
			{ "Oksana", "Kuziuma" }, { "Igor", "Lianka" } };
	static String[][] predmet = { { "Predmet1", "542" }, { "Predmet2", "545" },
			{ "Predmet3", "245" } };
	static int[][] bal = { { 0, 0, 2 }, { 0, 1, 5 }, { 0, 2, 4 }, { 1, 0, 1 },
			{ 1, 1, 2 }, { 1, 2, 5 }, { 2, 0, 5 }, { 2, 1, 4 }, { 2, 2, 4 } };

	static void jurnal() {
		for (int[] data : bal) {// ???????????????????????????????????????
			for (String f : students[data[0]]) {
				System.out.print(f + " ");
			}
			for (String f : predmet[data[1]]) {
				System.out.print(f + " ");
			}
			System.out.println(data[2]);
		}
	}
}
