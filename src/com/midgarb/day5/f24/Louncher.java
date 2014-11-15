package com.midgarb.day5.f24;

public class Louncher  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		darkZone(300,12,1000000);
		darkZone(300,17,1000000);
		double d = 3.675d;
		int f = (int)d;
		System.out.println(f);
	}

	public static final void darkZone(int monthlyPayment, final int interest,
			int dreamSum) {
		int r =0;
		int b = 0;
	while(r < dreamSum){
		r = r + monthlyPayment + (((monthlyPayment+r)*interest)/100)/12;
		b++;
	}
		int t = b/12;
		
		//deam= month*100/inters;
		
		System.out.println("years "+ t+ " month "+b%12);
		System.out.println(b);
	}
}
