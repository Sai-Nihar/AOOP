package com.library;
public class PremiumMember extends Member{

	public PremiumMember(String name, int id) {
		super(name, id);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void borrowBook(Book book) {
        if (book.isAvailable()) {
            book.setAvailable(false);
            System.out.println(getName() + " (Premium) borrowed the book: " + book.getTitle());
        } else {
            System.out.println("The book is already borrowed.");
        }
    }

}