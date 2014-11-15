package com.midgarb.day2.f2;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;



public class BattleFieldTemplate  extends JPanel{
	
boolean COLORDED_MODE = true;
	
	int tankX = 0;
	int tankY = 0;
	
	long speed = 225;
	
	/**
	 * Write your code here.
	 */
	public void runTheGame() throws Exception {
		//movetoQuadrant("a","5");
		getQuadent(2,5);
	
	
	
	}
	// Magic bellow. Do not worry about this now, you will understand everything in this course.
		// Please concentrate on your tasks only.

		final int BF_WIDTH = 576;
		final int BF_HEIGHT = 576;
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BattleFieldTemplate bf = new BattleFieldTemplate();
		bf.runTheGame();
		//bf.move(2);
		//bf.move(1);
		//bf.move(2);
		//bf.moveRandom();
//		bf.myRandom(5);
//		bf.myRandom(15);
//		bf.myRandom(55);
		//bf.movetoQuadrant("d","5");Thread.sleep(5000);
//		bf.movetoQuadrant("f","8");Thread.sleep(4000);
//		bf.movetoQuadrant("h","6");Thread.sleep(4000);
//		bf.movetoQuadrant("e","3");
	
	}
	 void move(int direction) throws Exception{
		 int step =64;
	if((direction ==1 && tankY==0)||(direction ==2 && tankY>=512)||
			(direction ==3 && tankX==0)||((direction ==4 && tankX>=512))){
		System.out.println("direction" + direction +" tabkX"+tankX+" tankY "+tankY);
	return;}
	if(direction ==1){
		tankY-=64;
		System.out.println("top"+ tankY);
	}else if(direction == 2){
		tankY+=64;
		System.out.println("bottom"+ tankY);
	}else if(direction == 3){
		tankX-=64;
		System.out.println("left"+ tankX);
	}else if(direction == 4){
		tankX+=64;
		System.out.println("right"+ tankX);
	}
			
	}
	 void moveRandom() throws Exception{
		int g;
		while(true){
		long f=System.currentTimeMillis();
		String f1 = String.valueOf(f);
		 g = Integer.parseInt(f1.substring(9,10));
		 System.out.println(g);
		if(g==1){
			move(g);
			repaint();
			Thread.sleep(250);	
		}
		else if(g==2){
			move(g);
			repaint();
			Thread.sleep(500);	
		}
		else if(g==3){
			move(g);
			repaint();
			Thread.sleep(1000);	
		}
		else if(g==4){
			move(g);
			repaint();
			Thread.sleep(1000);	
		}
		else if(g>4 && g<=6){
			move(2);
			repaint();
			Thread.sleep(1000);	
		}
		else if(g>6 && g<=8){
			move(4);
			repaint();
			Thread.sleep(1000);	
		}
		else if(g==9){
			move(1);
			repaint();
			Thread.sleep(1000);	
		}else{Thread.sleep(1000);}
			
	}

	}
//	 void myRandom(int i2) throws Exception{
//		 int g,k;
//	
//		 long f=System.currentTimeMillis();
//			String f1 = String.valueOf(f);
//			 g = Integer.parseInt(f1.substring(9,10));
//			 //System.out.println(g);
//			 if(i2<=9 && i2 >=0){
//				 if(i2<=g){
//		 k=g-i2;
//		 }
//				 else
//				 {
//					 k=i2-g;
//			}
//		 System.out.println(k);
//			 }
//			   if(i2%g > i2){
//				 k=i2/g;
//				 System.out.println(k);
//			 }else{
//				 k=i2-g*g;
//				 System.out.println(k);}
//		}
//	 void movetoQuadrant(String v, String h) throws Exception{
//		
//		String f1 = getQuadent(v,h);
//		int f2 = Integer.parseInt(f1.substring(0,f1.indexOf("_")));
//		int f3 = Integer.parseInt(f1.substring(f1.indexOf("_")+1));
//		if(tankX<f2){
//		while(tankX<f2 ){
//			repaint();
//			Thread.sleep(500);
//			move(4);
//		}
//	 if (tankX>f2){
//		 while(tankX>f2 ){
//			repaint();
//			Thread.sleep(700);
//			move(3);}	
//		}
//		if(tankY<f3){
//			while(tankY<f3){
//					repaint();
//					Thread.sleep(900);
//				move(2);}
//				}
//		}
//				if(tankY>f3){
//					while(tankY>f3){
//				
//					repaint();
//					Thread.sleep(1000);
//				move(1);
//				}
//				}
//					
//			
//			//tankY+=f3;
//
//		
//	 }
//	 static String getQuadent(String v, String h){
//			int hor = Integer.valueOf(h);
//			int vert = 1;
//			if(v.equals("a")){
//			vert  = 2;
//			}
//			else if(v.equals("b")){
//				vert  = 3;
//				}
//			else if(v.equals("c")){
//				vert  = 3;
//				}
//			else if(v.equals("d")){
//				vert  = 4;
//				}
//			else if(v.equals("e")){
//				vert  = 5;
//				}
//			else if(v.equals("f")){
//				vert  = 6;
//				}
//			else if(v.equals("g")){
//				vert  = 7;
//				}
//			else if(v.equals("h")){
//				vert  = 8;
//				}
//			else if(v.equals("i")){
//				vert  = 9;
//				}
//			return (vert - 1)*64 + "_"+ (hor-1)*64;
//		}
	 static void getQuadent(int v, int hor){
		// String coordinate = "0";
		 if((v>=0)&&(v<=8)||(hor>=0)&&(hor<9)){
		int x =(v - 1)*64;
		int y =(hor - 1)*64;
		//coordinate = x +"_"+y;
		System.out.println(x);
		System.out.println(y);
		}
		 
		
		}
	public BattleFieldTemplate() throws Exception {
		JFrame frame = new JFrame("BATTLE FIELD, DAY 2");
		frame.setLocation(500, 150);
		frame.setMinimumSize(new Dimension(BF_WIDTH, BF_HEIGHT + 32));
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		frame.getContentPane().add(this);
		frame.pack();
		frame.setVisible(true);
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		int i = 0;
		Color cc;
		for (int v = 0; v < 9; v++) {
			for (int h = 0; h < 9; h++) {
				if (COLORDED_MODE) {
					if (i % 2 == 0) {
						cc = new Color(252, 241, 177);
					} else {
						cc = new Color(233, 243, 255);
					}
				} else {
					cc = new Color(180, 180, 180);
				}
				i++;
				g.setColor(cc);
				g.fillRect(h * 64, v * 64, 64, 64);
			}
		}
		
		g.setColor(new Color(255, 0, 0));
		g.fillRect(tankX, tankY, 64, 64);
	}}