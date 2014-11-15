package com.midgarb.day6.hw3;

import java.net.InetSocketAddress;

public class Louncher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
catcher();
System.out.println("g");
	}
	public static void catcher(){
		try{
			throw new Exception();
		}catch(Exception e){
				// TODO Auto-generated catch block
			throw new IllegalStateException();
			
	}finally{
		System.out.println("I want to be printed!");
	}
	}
}
