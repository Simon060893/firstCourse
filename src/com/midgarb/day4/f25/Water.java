package com.midgarb.day4.f25;

public class Water {
	private int countLitres;
	private String name;
	private boolean opacity;
	private static Cloud w1;
	private static Vapor g ;

	public static void  main(String[] args) {
		// TODO Auto-generated method stub
//		w1 = new Cloud();
//		g = new Vapor();
//		w1.setColor("gfh");
//		w1.setVolume(4);
//		System.out.println(w1.getColor() + " " + w1.getVolume()+" "+g.getOlume());
		Vapor f1 = new Vapor("f1");
		Vapor f2 = new Vapor("f2");
		Vapor f3 = new Vapor("f3");
		
		f1.setE(f2);
		f2.setE(f3);
		f3.setE(f1);
		System.out.println(f1.getE() + " " + f2.getE() + " " + f3.getE());
	}

	public String getName() {
		return name;
	}

}
