package com.midgarb.day7.f5;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Student {
	private String name;
	private String secondName;

	public Student() {

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSecondName() {
		return secondName;
	}

	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name+" "+secondName;
	}
	
@Override
public boolean equals(Object obj) {
	// TODO Auto-generated method stub
	if(obj instanceof Student){
		Student s = (Student) obj;
		if(name != null && name.equals(s.getName()) && secondName != null && secondName.equals(s.getSecondName())){
			return true;
		}
	}
	return false;
}



	

}
