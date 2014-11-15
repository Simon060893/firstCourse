package com.midgarb.day7.f09;

import java.util.Iterator;
import java.util.List;

public class Louncher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleLinkedList str =  new SimpleLinkedList();
//		System.err.println("ADd to first");
		str.addFirst("t1");
		str.addFirst("t2");
		str.addFirst("t3");
		str.printList();
		
		String mg= new String("f4");
		str.addLast(mg);
//		System.err.println("ADdAfter");
		str.addAfter("t2", "t4");
		str.printList();
		str.addLast("t5");
		str.addLast("t6");
		str.printList();
//		System.err.println(str.getSize());
		SimpleLinkedList str1 =  new SimpleLinkedList();
		str.addAfter(mg,"fg");
		str.printList();
//		System.err.println(str1.getSize());
		str1.addFirst("jkl");
		str1.addAfter("jkl", "jj");
		str1.addLast("r4");
		str1.printList();
//		Iterator<Object> o = str.iterator();
		int t =0;
//for(Iterator<Object> o = str.iterator(); o.hasNext();){
//			
////			Object o1 = o.next();
//			System.out.println(o.next());
//			t+=1;
//			o.remove();
//			
//		}
//Iterator<Object> o1 = str.iterator();
//o1.remove();
//o1.remove();

for(Iterator<Object> o = str.iterator(); o.hasNext();){
	
	Object o1 = o.next();
	System.out.println(o1);
//	t+=1;
	
	o.remove();
//	break;
}

		System.out.println(str.getSize());
		
		
	}

}
