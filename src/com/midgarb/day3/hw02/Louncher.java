package com.midgarb.day3.hw02;

public class Louncher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	static void copyArray(int[] src, int srcPos, int[] dest, int dustPos,
			int length) {
		if (src != null) {
			for (int i = srcPos, j = dustPos; i < length && j < dest.length; i++, j++) {
				dest[j] = src[i];
			}
		} else {
			System.out.println("Your massiv is not initialize");
		}
	}

}
