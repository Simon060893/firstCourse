package com.midgarb.day7.gameOfTank;

import com.midgarb.day7.gameOfTank.server.Action;
import com.midgarb.day7.gameOfTank.server.ActionField;

public class Louncher {
	private static Action a;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
	ActionField af = new ActionField();
	af.runTheGame();
} catch (Exception e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
 	
	}
	

}
