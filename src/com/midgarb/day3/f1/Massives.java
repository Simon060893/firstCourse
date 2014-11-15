package com.midgarb.day3.f1;

import java.util.Arrays;
import java.util.Random;

public class Massives {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] g = {11,10,8,7,6};
		int[] v ={0};
		int[] d = {};
		int[] t = null;
		int[] d1 ={0,0,15,25,16,2};
		int[] d2 = {-3,25,2};
		//System.out.println(getLast(g));
		//int i =getLast(g);
//		System.out.println(i);
//		System.out.println(getLast(v));
//		System.out.println(getLast(d));
//		System.out.println(getLast(d1));
//		System.out.println(getLast(d2));
//		System.out.println(Arrays.toString(g));
//		swap(d2,0,2);
//		swap(d1,0,2);
//		printArray(t);
//		printArray(d1);
//		printArray(t);
//		printArray(d2);
		//System.out.println(oldWlwmwntSum(g));
//		System.out.println(oldWlwmwntSum1(d1));
//		System.out.println(average(d1));
//		System.out.println(average1(d1));
		//System.out.println(swap(g,0,3));
		//sort(g);
		
		int dataK[]= createArray(10);
		int dataK10[]= createArray(10000);
		//System.out.println(Arrays.toString(dataK));
//		int dataK10[]= createArray(100000);
	sprt(dataK);
	//sprt(dataK10);
		//sprt(dataK10);
		}
	static int[] createArray(int number){
		 Random x = new Random();
		 
		
		int [] data= new int[number];
		for(int i= 0; i<number;i++){
			 int i1 = x.nextInt(number);
			data[i]=i1;
		}
		return data;
	}
	static int getLast(int[] data) {
		if(data.length==0) {
			return -1;
		}else if(data != null && data.length>0) {
			return  data[data.length-1];		
		}else{return data.length;}
		
	}
	//меняем соседние елементы если значения текущего больше следующего
	static void swap1(int[] g1, int i, int k){
		if(g1 !=null && k <= g1.length-1 && i <= g1.length-1 && i!=k && i>=0 && k>=0){
			
			int temp = g1[i];
			//System.out.println(temp);
			g1[i] = g1[k];
			g1[k] = temp;
			System.out.println(Arrays.toString(g1));
		}else{System.out.println("Error");}
	}
	static void printArray(int[] data) {
		if(data != null){
			if (data.length==0){
				System.out.println("[]");
			}else {
		System.out.print("[");
//		for(int i = 0; i <data.length-1;  i++){
//			System.out.print(data[i]+"," );
//		}
		int g = 0;
		while(g < data.length-1){
			System.out.print(data[g]+", ");
			g++;
		}
		System.out.println(data[data.length-1]+"]");
	}
			}
	}
	static long oldWlwmwntSum(int[]data){
		int sum =0;
		if(data != null) {
			if(data.length == 0) {
				System.out.println("[]");
			}else {
				for(int i =0;i<data.length;i+=2){
					if((i+2)>data.length){
					    break;}
				       else{ sum += data[i] + data[i+2]; }
			}
			}
		}else {return -1;}
		return sum;
	}
	static long oldWlwmwntSum1(int[]data){
		int sum =0;
		if(data != null) {
			if(data.length == 0) {
				System.out.println("[]");
			}else {
				for(int i =0;i<data.length;i++){
					if(i%2 == 1){
						sum += data[i];
				}
			}
			}
		}else {return -1;}
		return sum;
	}
	static double average(int[] data){
		double Ave =-1;
		double sum = 0;
		if(data != null || data.length>0){
		for(int f: data){
			 sum += f;
			 Ave= sum/(data.length);
			} 			
		}
		return Ave;
	}
	static double average1(int[] data){
		
		double sum = 0;
		if(data == null || data.length==0){
			return -1;}
		for(int f: data){
			 sum += f;		 			
		}	
		return  sum/(data.length);
	}
	static void sprt(int[] data) {
		long time = System.currentTimeMillis();
		if(data!=null){
			int activeLength =data.length - 1;
			int swopCount ;
			for (int i = 0; i < data.length; i++) {
				swopCount = 0;
				// System.out.print(swopCount);
				for (int k = 0; k < activeLength; k++) {
					swopCount += swap(data, k, k + 1);
					System.out.println(swopCount);
				}
				if (swopCount == 0) {
					break;
				}
				activeLength--;
			}
	}System.out.println(Arrays.toString(data));
		System.out.println(System.currentTimeMillis()-time);
		}
	static int swap(int[] data, int i1, int k){
		//if(data!=null){
		int c;
		//for(int i =0; i<data.length-1;i++){
			if(data[i1]>data[k]){
			c=data[k];
			data[k]=data[i1];
			data[i1]=c;
			return 1;
		}
			return 0;}
//		for(int i=0;i<data.length;i++){
//			if((i+1)<data.length){
//		for (int c:data){
//			c=data[i+1];
//			data[i]=c;
//			}}
		//}
		//System.out.println(Arrays.toString(data));
	
	//сортировка массива
	static void sort(int[] data){
		//if(data!=null){
		for(int j=0;j<data.length-1;j++){
		//	if(data[j]>data[j+1] ){
		for(int i = 0; i<data.length;i++){
			if(i+1<data.length){
			while(data[i]>data[i+1]){
				int c =data[i];
				data[i]=data[i+1];
				data[i+1]=c;
		}}}}
			//}
			//}
		System.out.println(Arrays.toString(data));
	}
	static void speed(int []data){
		long time=System.currentTimeMillis();
		sort(data);
		System.out.println(System.currentTimeMillis()-time);
	}
	}
