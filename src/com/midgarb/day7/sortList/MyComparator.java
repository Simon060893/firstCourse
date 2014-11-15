package com.midgarb.day7.sortList;

import java.util.Comparator;

public class MyComparator  implements Comparator<String> {

@Override
public int compare(String o1, String o2) {
	// TODO Auto-generated method stub
	int result  = o1.compareToIgnoreCase(o2);
	if(result  < 0){
		return  1;
	}else if(result >0){
		return -1;
	}
	return 0;
}
}
