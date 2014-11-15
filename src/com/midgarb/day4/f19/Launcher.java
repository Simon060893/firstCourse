package com.midgarb.day4.f19;

public class Launcher {
	private static Tank[] tank;
	static Tank t ;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 tank = new Tank[5];
		 t = new Tank();
		//printTankInfo(tank);
		t.paintTank(t, "rrrrrrrr");
		System.out.println(t.getColor());
	}

	static void printTankInfo(Tank[] tanki) {
		String[]color = {"red","blue","yellow","black","gray"};
		for (int i = 0; i < 5; i++) {
			tanki[i] = new Tank();
			tanki[i].setColor(color[i]);
			tanki[i].setPeremennie(i+34);
			tanki[i].setPermennie(5%(i+1)==0)  ;
			System.out.println("COLOR "+tanki[i].getColor()+" MAXSPEED "+tanki[i].geteremennie()+" MOVE "+tanki[i].getePremennie());
		}
		
	}


}
