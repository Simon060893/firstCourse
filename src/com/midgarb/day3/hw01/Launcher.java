package com.midgarb.day3.hw01;

public class Launcher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	static int findElement(double[] data, double num) {
		int k = -1;
		if (data != null) {
			for (int i = 0; i < data.length; i++) {
				if (data[i] == num) {
					k = i;
				}
			}
		}
		return k;
	}
}
