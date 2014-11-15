package com.midgarb.day3.f27;

import java.util.Arrays;

public class dvumrniiMassic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] country ={
			{"china","pekin","8548664"},
			{"sadf","sadf","58476"},
			{"sdfa",".d","65464"},
			{"adfa","sdfa","46023505"}
		};
		String [][] cauntry = new String[3][];
		cauntry[0]  = new String[6];
		cauntry[0][0] = "China ";
		cauntry[0][1] = "India ";
		cauntry[0][2] = "Usa ";
		cauntry[0][3] = "indonesia ";
		cauntry[0][4] = "Brazil ";
		cauntry[0][5] = "pakistan ";
		cauntry[1]  = new String[6];
		cauntry[1][0] = "Pekim";
		cauntry[1][1] = "Niu-Deli ";
		cauntry[1][2] = "Washington ";
		cauntry[1][3] = "Ia ebu";
		cauntry[1][4] = "Amazonka";
		cauntry[1][5] = "Arabi";
		cauntry[2]  = new String[6];
		cauntry[2][0] = "242350755";
		cauntry[2][1] = "442514055";
		cauntry[2][2] = "421123121";
		cauntry[2][3] = "245024351";
		cauntry[2][4] = "412202135";
		cauntry[2][5] = "112122012";
		
	//System.out.println(getPopulation(country));
		//System.out.println(Arrays.toString(cauntry[2]));
		//country[0][0]="Peking";
		//country[0][0]=
	int[] f1 = {1,2,3,4,4,4};
	int[] f2 = {5,6,7,8};
	System.out.println(Arrays.toString(union(f1,f2)));
	}
	static long getPopulation(String [][] data ){
		long sum = 0;
		for(int i=0; i<data.length;i++){
			//if(long==Long.valuaOf(data[j][i]))
		sum += Long.valueOf(data[i][2]);
		}	return sum;	
	}
	static int[] union(int[]data,int[] data1){
		int[] data2 = new int[(data1.length+data.length)];
		//int i =0;
		for (int i =0; i<data.length; i++){	
		 data2[i] = data[i];	 
	}
		for (int k =data.length; k<data2.length; k++){	
			 data2[k] = data1[k-data.length];	 
			// data2[i++]=data1[k];
		}
		return data2;

	}
}
