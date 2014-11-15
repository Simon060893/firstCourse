package com.midgarb.day8.game;

import com.midgarb.day8.game.server.ActionField;
import com.midgarb.day8.sort.copy.Action;



public class Louncher {
	private static Action a;
	static ActionField af;
//	Louncher g;
	public Louncher(){

		
		try {
			 af = new ActionField();
			af.runTheGame();
			af = null;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}

	public static void main(String[] args) {
		Louncher g = new Louncher(); 
		
	}
	public void startNewGAme(){
		
//		Louncher g = new Louncher();
	}

}
