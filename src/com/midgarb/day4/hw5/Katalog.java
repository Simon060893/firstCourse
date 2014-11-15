package com.midgarb.day4.hw5;

public class Katalog {
	private String alphabit = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	private Book[][] bookByName;
	private Book[][] bookByAuthor;
	 Book[][] bookByJanr;

	public Katalog() {
		bookByName = new Book[26][];
		fillDictionary(bookByName);
		bookByAuthor = new Book[26][];
		fillDictionary(bookByAuthor);
		bookByJanr = new Book[5][];
		fillDictionary(bookByJanr);
		createBook();
	}

	public Book[] findBookToAuthor(String author) {
		Book[] b = new Book[26];
		for (Book[] c : bookByAuthor) {
			for (Book x : c) {
				if (x != null) {
					if (x.getAvtor().equals(author)) {
						addToStarage(b, x);
					}
				}
			}
		}

		return b;

	}

	public Book[] findBookToName(String name) {
		Book[] b = new Book[26];
		for (Book[] c : bookByName) {
			for (Book x : c) {
				if (x != null) {
					if (x.getName().equals(name)) {
						addToStarage(b, x);
					}
				}
			}
		}

		return b;
	}

	public Book[][] findbookToJanr(Janr janr) {
		Book[][] b2 = new Book[5][];
		Book str[] = new Book[5];
		int i=0;
		for(int j = 0; j<b2.length;j++){
	
	
	for(int h = i; h<bookByJanr[janr.getId()].length;h++, i++){		
		
				for(Book g : bookByJanr[janr.getId()]){
					addToStarage(str,g );	
				}
		}
b2[j]=str;}
		// for(int j =0;j<5;j++){
		// b2[i][j] = "u";
		// }
		// }}
		return b2;
	}

	private void fillDictionary(Book[][] dictionary) {
		for (int i = 0; i < dictionary.length; i++) {
			dictionary[i] = new Book[10];
		}
	}

	private void addToKatolog(Book book) {
		int position = alphabit.indexOf(book.getName().charAt(0));
		addToStarage(bookByName[position], book);

		position = alphabit.indexOf(book.getAvtor().charAt(0));
		addToStarage(bookByAuthor[position], book);

		addToStarage(bookByJanr[book.getJ().getId()], book);

	}

	private void addToStarage(Book[] starage, Book book) {
		for (int i = 0; i < starage.length; i++) {
			if (starage[i] == null) {
				starage[i] = book;
				return;
			}
		}
	}

	private void createBook() {
		Book b = new Book();
		b.setAvtor("Corner Cole");
		b.setName("Blizneci");
		b.setJ(Janr.HISTORY);
		addToKatolog(b);

		b = new Book();
		b.setAvtor("Asd dsvle");
		b.setName("Adgfb");
		b.setJ(Janr.HISTORY);
		addToKatolog(b);

		b = new Book();
		b.setAvtor("Jsd dsvle");
		b.setName("Sdgfb");
		b.setJ(Janr.HISTORY);
		addToKatolog(b);

		b = new Book();
		b.setAvtor("Hl jk");
		b.setName("Gh");
		b.setJ(Janr.HISTORY);
		addToKatolog(b);

		b = new Book();
		b.setAvtor("Corner Cole");
		b.setName("Odregfb");
		b.setJ(Janr.HISTORY);
		addToKatolog(b);

		b = new Book();
		b.setAvtor("Tdxc dh");
		b.setName("Fby");
		b.setJ(Janr.HISTORY);
		addToKatolog(b);

		b = new Book();
		b.setAvtor("Vzd mjm");
		b.setName("Ckj");
		b.setJ(Janr.HISTORY);
		addToKatolog(b);

		b = new Book();
		b.setAvtor("Ncv dsvle");
		b.setName("Zdf");
		b.setJ(Janr.FANTASY);
		addToKatolog(b);

	}
}
