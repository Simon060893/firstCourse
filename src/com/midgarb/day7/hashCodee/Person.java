package com.midgarb.day7.hashCodee;

public class Person {
	public   String name;
	int age;
	long salary;
	Address a;
	public Person(){
		
	}
	public Person(String name, int age){
		this.name = name;
		this.age = age;
		salary = 1000;
//		a= new Address("Odessa", "Deribasovskaya",5);
		
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name;
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(obj instanceof Person){
			Person o1 = (Person)obj;
			if(name != null && name.equals(o1.name) && o1.age == age && o1.salary == salary ){
				return true;
			}
		}
		return false;
	}
@Override
public int hashCode() {
	// TODO Auto-generated method stub
	int result=25;
	int c = name.hashCode();
	result = 37*result+name.hashCode();
	result = 37*result+new Integer(age).hashCode();
	result = 37 * result + new Long(salary).hashCode();
	if(a != null){
		result = 37* result + a.hashCode();
	}
		//result = 37 * result +((int)(value ^ (value >>> 32));
	return result;
}
}
