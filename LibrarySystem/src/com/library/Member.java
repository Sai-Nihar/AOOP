package com.library;
public class Member implements Borrowable{
	private String name;
    private int id;

    public Member(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

	@Override
	public void borrowBook(Book book) {
		// TODO Auto-generated method stub
		if (book.isAvailable()) {
            book.setAvailable(false);
            System.out.println(name + " borrowed the book: " + book.getTitle());
        } else {
            System.out.println("The book is already borrowed.");
        }
	}

	@Override
	public void returnBook(Book book) {
		// TODO Auto-generated method stub
		book.setAvailable(true);
        System.out.println(name + " returned the book: " + book.getTitle());
    }


}