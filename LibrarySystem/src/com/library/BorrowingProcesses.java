package com.library;

public class BorrowingProcesses {
	public void borrowBook(Member member, Book book) {
        member.borrowBook(book);
    }

    public void returnBook(Member member, Book book) {
        member.returnBook(book);
    }

}
