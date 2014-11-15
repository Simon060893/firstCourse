package com.midgarb.day2.f2;

public class Tanki {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(getQuadent("d","5"));
		printCordinates("d","5");
		int i =1;
		while(i<=10){
			System.out.println(i);
			if (i<10){
				i++;
				continue;
			}
			
				break;	
		}
	}
	static String getQuadent(String v, String h){
		int hor = Integer.valueOf(h);
		int vert = 1;
		if(v.equals("a")){
		vert  = 2;
		}
		else if(v.equals("b")){
			vert  = 3;
			}
		else if(v.equals("c")){
			vert  = 3;
			}
		else if(v.equals("d")){
			vert  = 4;
			}
		else if(v.equals("e")){
			vert  = 5;
			}
		else if(v.equals("f")){
			vert  = 6;
			}
		else if(v.equals("g")){
			vert  = 7;
			}
		else if(v.equals("h")){
			vert  = 8;
			}
		else if(v.equals("i")){
			vert  = 9;
			}
		return (vert - 1)*64 + "_"+ (hor-1)*64;
	}
	static void printCordinates(String k, String u){
		String x= getQuadent(k, u).substring(0,getQuadent(k, u).indexOf("_"));
		String y= getQuadent(k, u).substring(getQuadent(k, u).indexOf("_")+1);
		System.out.println(k+u+":("+x+"px, "+y+"px);");
		
	}

}
