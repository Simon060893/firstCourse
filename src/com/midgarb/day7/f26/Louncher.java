package com.midgarb.day7.f26;

import java.util.HashMap;
import java.util.Map;

import com.midgarb.day7.hashCodee.Person;

public class Louncher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person n = new Person("joker", 5);
		Person n1 = new Person("Mate", 5);
		Person n2 = new Person("Dude", 5);
		Map list1 = new HashMap();
		list1.put(n.name, n);
		list1.put(n1.name, n1);
		list1.put(n2.name, n2);
		
//		for(Object k : list1.keySet()){
//			String g = (String)k;
//			System.out.print(g +" ");
//		}
//		System.out.println();
//		for(Object k : list1.values()){
//			if(k instanceof Person){
//				Person k1 = (Person)k;
//				System.out.print(k1.hashCode()+" "+k1);
//			}
//		}
		for (Object entry1 : list1.entrySet()) {
			Map.Entry entry = (Map.Entry)entry1;
		    System.out.println("Key: " + entry.getKey() + " Value: "
		        + entry.getValue());
		}
		
	}

}
