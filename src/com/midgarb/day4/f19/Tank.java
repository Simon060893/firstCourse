package com.midgarb.day4.f19;

public class Tank {

	private String color;
	private boolean move;
	private  int maxspeed;

	Tank() {
		// System.out.println("zapusk konstructora");
		maxspeed = 45;
		color = "green";
		move = false;
//		System.out.println(maxspeed+" "+color+" "+move);
	}

	//
	public void setColor(String color){
		this.color = color;
	}
	public String getColor(){
		return color;
	}
	public  void setPeremennie( int maxspeed){
		this.maxspeed = maxspeed;
	}
	public int geteremennie(){
		return maxspeed;
	}
	public void setPermennie( boolean move){
		this.move = move;
	}
	public boolean getePremennie(){
		return move;
	}
	 public void paintTank(Tank tank, String color){
		 tank.setColor(color);
		 
	 }
}
