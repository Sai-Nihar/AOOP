package com.library;
public class LibraryManagementSystem {
	public static void main(String[] args) {
		 Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald");
	     Book book2 = new Book("1984", "George Orwell");
	     
	     Member john = new Member("Sai", 1);
	     PremiumMember jane = new PremiumMember("Srujan", 2);
	     
	     Library library = new Library();
	     
	     library.borrowBook(john, book1); 
	     library.borrowBook(jane, book2); 

	     library.returnBook(john, book1); 
	     library.returnBook(jane, book2);

}
}
