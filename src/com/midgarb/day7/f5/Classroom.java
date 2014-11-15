package com.midgarb.day7.f5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Classroom {
	static List<Student> students = new ArrayList<>();
	private Student e;
	private Student e1;
	private Student e2;
	private Student e3;

	public Classroom() {
		e = new Student();
		e1 = new Student();
		e2 = new Student();
		e3 = new Student();
		e.setName("Vasia");
		e.setSecondName("Karaivan");
		e1.setName("Misha");
		e1.setSecondName("Milevskiy");
		e2.setName("Katia");
		e2.setSecondName("Vysotskaya");
		e3.setName("Vika");
		e3.setSecondName("Vysotskayi");
		enter(e);
		enter(e2);
		enter(e3);
		enter(e1);
		// enter(e1);
		leave(e1);
	enter(e1);

	}

	public void enter(Student s) {
		students.add(s);

	}

	public void leave(Student s) {
		for (int i = 0; i < students.size(); i++) {
			if (students.get(i).equals(s)) {
				students.remove(i);
			}
		}

	}

	public void printStudentInfo() {

		for (int i = 0; i < students.toArray().length; i++) {
			System.out.println(students.get(i).getName() + " "
					+ students.get(i).getSecondName());
		}
	}

	public int studentCount() {
		return students.size();
	}

	public boolean isPresent(String name, String secondName) {
		for (int i = 0; i < students.toArray().length; i++) {
			if (students.get(i).getName().equals(name)
					&& students.get(i).getSecondName().equals(secondName)) {
				return true;
			}
		}
		return false;
	}

	public boolean isPresent1(Student a) {
		return students.contains(a);
	}

	public boolean g() {
		return isPresent1(e1);
	}

	public void getStudent() {
		for (int i = 0; i < students.size(); i++) {
			System.out.println(students.get(i));
		}
		// return new ArrayList<>(students);
	}

}
