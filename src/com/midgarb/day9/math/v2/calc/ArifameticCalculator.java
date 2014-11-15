package com.midgarb.day9.math.v2.calc;

import com.midgarb.day9.math.Arifmetica;

public class ArifameticCalculator implements Calculator {

	@Override
	public int summa(int a, int b) {
		// TODO Auto-generated method stub
		return Arifmetica.summa(new int[]{a,b});
	}

	@Override
	public int multiply(int a, int b) {
	int result =0;
	for(int i=0;i<b;i++){
		result = Arifmetica.summa(new int[]{a,b});
	}
	return result;
	}

}
