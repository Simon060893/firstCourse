package com.midgarb.day4.f3;

public class GreetingService {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//System.out.println("Hello " + args[0]);
PrintTankInfo();
	}
static void PrintTankInfo(){
	Tank f = new Tank();
	//f.color = "red";
	f.crew = 1;
	f.maxSpeed = 5;
	System.out.println("color " + f.color +" crew " + f.crew + " maxSpeed " + f.maxSpeed);
}

}
