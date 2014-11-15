package com.midgarb.day3.hw03;

public class louncher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	static String inverse(String str) {
		String sot = null;
		if (str != null) {
			char[] st = str.toCharArray();// перевожу каждый элемент строки в
											// елемент массива st
			// char[] st1 = new char[st.length];
			// for(int j =0, i = st.length-1; j<st.length && i>=0;j++,i--){
			// st1[j]=st[i];
			// }
			char st1;
			for (int i = 0; i < st.length / 2; i++) {
				st1 = st[i];
				st[i] = st[st.length - 1 - i];// меняем только половинку массива
				st[st.length - 1 - i] = st1;
			}
			sot = new String(st);// массив в строку
		}
		return sot;
	}
}
