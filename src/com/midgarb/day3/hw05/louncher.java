package com.midgarb.day3.hw05;

public class louncher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	static void printTwoArray(String[][] data) {
		if (data != null) {
			if (data.length == 0) {
				System.out.println("[]");
			} else {
				System.out.print("[");
				for (int i = 0; i < data.length; i++) {
					if (data[i] != null) {
						if (data[i].length == 0) {
							System.out.print("[]");
						}
						if (data[i].length > 0) {
							System.out.print("[");
							for (int j = 0; j < data[i].length; j++) {
								System.out.print(data[i][j]);
								if (j < data[i].length - 1) {
									System.out.print(", ");
								}
							}
							System.out.print("]");
						}
					} else {
						System.out.print("null");
					}
					if (i < data.length - 1) {
						System.out.print(",");
					}
					if (i == data.length - 1) {
						System.out.print("]");
					}
				}

			}
		}
	}
}
