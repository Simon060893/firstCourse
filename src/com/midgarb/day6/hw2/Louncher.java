package com.midgarb.day6.hw2;

public class Louncher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		catcher();
		System.out.println("Fine");
	}
	public static void catcher(){
		try{
			System.out.println("Return");
			return;
		
		}
		catch(Exception e){
			e.printStackTrace();
		}
		finally{
			System.out.println("I want to be executed!");
		}
	}

}
