package com.midgarb.day2.hw;

public class emotions {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		emotions(15,7,-3);
		emotions(3,300,0);
		emotions(3,300,40);
		emotions(-47,74,-4);
		start(5);
		///loop5(-10,40);
		
		
			mla(10);
		
	}
	static void mla(int i){
		while(i>0){
			i--;	
			System.out.println(i);}
	}
	static void emotions(int a, int b, int c){
		if(a==15 || a>c){
			if(a<b){
			System.out.print("heh");
		}
		else
		{System.out.print("!!!");}
		}
		else if(c<0 && a!=3){
			System.out.print(":)");
		}
		else
		{System.out.print(":(");}
	}
	static void start (int number){
		if (number >0){
			while(number > 0){
				System.out.println(number--);
				if(number==0){
					System.out.println("Go!");
				}
			}
		}else{
			System.out.println("Start failed!");
		}
	}
	static void loop5(int i, int n){
		while(i<n){
			System.out.print(n++ + " ");
//		i+=i;
//		System.out.println(i);
//		if(n==50){
//			n=n-n+i;
//			System.out.println(n);
//		}
		}
	}
	

}
