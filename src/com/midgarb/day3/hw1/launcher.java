package com.midgarb.day3.hw1;

import java.util.Arrays;

public class launcher {
	static String[][] students = {
		{"Oleg","Kiron"},
		{"Oksana","Kuziuma"},
		{"Igor","Lianka"}
	};
	static String[][] predmet = {
		{"Predmet1","542"},
		{"Predmet2","545"},
		{"Predmet3","245"}
	};
	static int[][] bal = {
		{0,0,2},
		{0,1,5},
		{0,2,4},
		{1,0,1},
		{1,1,2},
		{1,2,5},
		{2,0,5},
		{2,1,4},
		{2,2,4}
		};

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] mas = {2.3, 5.1, 6.1, 4.6};
		int [] v1 ={1, 5, 3, 5};
		int [] v2 ={0, 4, 2,4,7,8,9,10};
		//copyArray(v1,0,v2,2,3);
		System.arraycopy(v1, 0, v2, 3, 4);
		String []sr = {""} ;
		String [][] f = {{"hgjf"},{"jklj","khlhj"}};
		printMassiv(f);
		//System.out.println(Arrays.toString(f));
		jurnal();
	String[] ff = {"2","3","4"};
	String [][] fff = {ff,{}};

	}
	static void jurnal(){
		for(int []data : bal){//???????????????????????????????????????
			for(String f : students[data[0]]){
				System.out.print(f+" ");
			}
			for(String f : predmet[data[1]]){
				System.out.print(f+" ");
			}System.out.println(data[2]);
		}
	}
////////////home_1
	static int findElement(double[] data,double num){
		int k = -1;
		if(data!= null){
		for (int i =0; i<data.length; i++){
			if(data[i]==num){
				k=i;
			}}
		}return k;
	}
	static void copyArray(int[] src, int srcPos, int[] dest,int dustPos,
			int length){
		if(src != null){
			for(int i = srcPos, j = dustPos;  i<length && j<dest.length; i++, j++){	
				dest[j]=src[i];
			}
		}else{System.out.println("Your massiv is not initialize");}
	}
	static String inverse(String str){
		String sot = null;
		if(str != null){
		char[] st= str.toCharArray();//перевожу каждый элемент строки в елемент массива st 
//		char[] st1 = new char[st.length];
//		for(int j =0, i = st.length-1; j<st.length && i>=0;j++,i--){
//			st1[j]=st[i];
//		}
		char st1;
		for(int i = 0;i < st.length/2; i++){
			st1 = st[i];
			st[i] = st[st.length-1 - i];//меняем только половинку массива
			st[st.length-1 - i] = st1;
		}
		 sot = new String(st);//массив в строку
		 }
		return sot;
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
	static void printTwoArray(String[][] data){
		if(data!=null){
			if(data.length==0){
				System.out.println("[]");
			}else{
				System.out.print("[");
				for(int i=0; i<data.length;i++)
				{
					if(data[i] != null)
					{	
				if(data[i].length ==0)
				{
					System.out.print("[]");
				}
				 if(data[i].length > 0)
				{
					System.out.print("[");
					for(int j = 0; j<data[i].length;j++)
					{
						System.out.print(data[i][j]);
						if(j < data[i].length-1)
						{
							System.out.print(", ");
						}
					}System.out.print("]");
				}
					}
					else{
						System.out.print("null");
					}
				if(i <data.length-1)
				{
					System.out.print(",");
				}
				if(i == data.length-1){
				System.out.print("]");
				}	
			}
			
			}
			}
	}
	static void printMassiv(String[][] data){
		for(String[] cell : data){
			for(String s : cell){
				if(s != null){
					System.out.print(s + ",");
				}
			}
			System.out.print("!");
		}
	}

}
