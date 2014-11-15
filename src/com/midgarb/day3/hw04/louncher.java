package com.midgarb.day3.hw04;

public class louncher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	static long factorial(int i) {
		if (i <= 0) {
			return -1;
		}
		long num = i;
		// for(int j =1; j<=i;j++){
		// num*=j;
		// }
		if (num > 1) {
			num *= factorial(i - 1);
		}
		return num;
	}
}
