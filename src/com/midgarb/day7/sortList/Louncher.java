package com.midgarb.day7.sortList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Louncher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<String> t = new ArrayList<>();

t.add("YFD");
t.add("GFD");
t.add("KJH");
t.add("Bsd");
t.add("AGH");
Collections.sort(t);
for(String s:t){
	System.out.print(s+" ");
}
System.out.println();
Collections.sort(t, new Comparator(){
	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		String s1 = (String)o1;
		String s2 = (String)o2;
		int result  = s1.compareToIgnoreCase(s2);
		if(result  < 0){
			return  1;
		}else if(result >0){
			return -1;
		}
		return 0;
	}
});
for(String s:t){
	System.out.print(s+" ");
}
//sortCollection(t,c);
	}
//	public static void sortCollection(List r, Comparator c){
//		for(Iterator<Object> o = r.iterator(); o.hasNext();){
////			o.next();
//			Object y =  (Object)o.next();
//			while(c.compator(y, o.next()) != 1){
//				if(o.hasNext()){
//				y= o.next();
//				}else{
//					break;
//				}
//			}
//			System.out.print(o.next()+" ");
//		}
//	}
}
