package com.midgarb.day7.f5;

public class Louncher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Classroom d = new Classroom();
d.printStudentInfo();
System.out.println(d.studentCount());
System.out.println(d.isPresent("Vika", "Vysotskayi"));
d.getStudent();
System.out.println(d.g());
	}

}
