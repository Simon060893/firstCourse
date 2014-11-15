package com.midgarb.day3.hw1;

public class birds {
	static String[][] type = {{"0","Орел","$"},{"1","Утка","euro"}};
	static int[][] countOfBirds = {{0,5},{1,6}};
	static int[][] priseOfBirds = {{0,6},{1,2}};
	static int[][] priseOfBirds1 = {{6},{2}};
	static int[][] countOfSells = {{2},{10}};
	static int[] countOfSells1 = {1,15};
	static String[][] birds={
			{"Орел","5","2","6"},
			{"Утка","2","10","2"},
			{"Гусь","2","15","3"},
			{"Соловей","3","5","1"}
	};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//howManyAllSells();
		//countBirdsOfType();
		//countBirdsUnder3();
		//profit();
		//kolPtitsBilo();
//		howMachBay(12,8);
//		BirdsofSells();
		BirdsofType();
	}
	static void BirdsofType(){
		for(String[]h:birds){
			if(Integer.parseInt(h[1])<3){
				System.out.println("You need to bay " + h[0]);
			}
		}
	}
	static void BirdsofSells(){
		int b;
		for(String[] f:birds){
			b=Integer.parseInt(f[2]);
			System.out.println("for"+f[0]+"wil be prise"+b);
		}
	}
	static void howManyAllSells(){
		int v=0;
		for(int[]data : countOfSells){
			for(int c: data){
				v+=c;
			}
		}
		System.out.println(v);
	}
	static void countBirdsOfType(){
		for(int [] f:countOfBirds){
			for(String c: type[f[0]]){
				System.out.print(c+" ");
			}
			System.out.print(f[1]+" ");
		}
		
	}
	static void countBirdsUnder3(){
		for(int [] f:countOfBirds){
			if(f[1]<=3){
			for(String c: type[f[0]]){
				System.out.print(c+" ");
			}
			System.out.print(f[1]+" ");
		}
			}
		
	}
	static void profit(){
		int n=0;
//		for(int i =0;(i<priseOfBirds.length && i<countOfSells1.length);i++){
//		n+=countOfSells1[i]*priseOfBirds[i];
//	}
		for(int[] f:priseOfBirds){
			for(int g:countOfSells[f[0]]){
				n+=g*f[1];
			}
		}
		System.out.println(n);
}
	static void kolPtitsBilo(){
		int n =0;
		int v=0;
		for(int[] g:countOfBirds){
			for(int g1:countOfSells[g[0]]){
				for(String h:type[g[0]]){
					System.out.println((g1+g[1]+" "+h));
				}
			}
			
		}
	}
	
	static void howMachBay(int dol, int euro){
		int n;
		int[][]f1={{dol},{euro}};
		for(String[] g : type)
		{
			 n =Integer.parseInt(g[0]);
			for(int j:priseOfBirds1[n])
			{
				for(int valiuta:f1[n])
				{
				System.out.println(valiuta/j+" "+g[1]);
				}
			}
		}
	}
}
