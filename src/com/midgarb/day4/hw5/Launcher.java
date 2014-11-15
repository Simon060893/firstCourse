package com.midgarb.day4.hw5;

import java.util.Arrays;

public class Launcher {
	public static void main(String[] args) {
		Katalog k2 = new Katalog();
		int i=0;
		 for(Book book[] : k2.findbookToJanr(Janr.HISTORY)){
	 for(Book myBook : book){
		 if(myBook != null ){
		 System.out.print(myBook.getName() + " ");
//		 i++;
//		 if(i%5==0){
			// System.out.println();
		 }
		 }
		 System.out.println();
		// System.out.println();
		// System.out.println(Arrays.toString(k2.findBookToAuthor("Corner Cole")));
		// for(int i = 0; i < k2.bookByAuthor.length; i++)
		// {
		// for(int j = 0; j < k2.bookByName.length; j++){
		//
		//
//		for (Book book : k2.findBookToAuthor("Corner Cole")) {
//			if (book != null) {
//				System.out.println(book.getName());
//			}
//
//		}
		// }
	}
//		 for(Book book:k2.bookByJanr[Janr.History.getId()]){
//			 System.out.println(book.getAvtor());
//		 }
	}
}
