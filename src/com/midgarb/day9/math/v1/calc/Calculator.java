package com.midgarb.day9.math.v1.calc;

import com.midgarb.day9.math.Arifmetica;

public class Calculator {
	public int summa(int a, int b) {
		return Arifmetica.summa(new int[] { a, b });
	}

	public int multiply(int a, int b) {
		int result = 0;
		for (int i = 0; i < b; i++) {
			result = Arifmetica.summa(new int[] { result, a });
		}
		return result;
	}
}
