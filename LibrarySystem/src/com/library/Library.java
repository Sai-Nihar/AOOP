package com.library;
public class Library {
	private BorrowingProcesses borrowingProcess = new BorrowingProcesses();

    public void borrowBook(Member member, Book book) {
        borrowingProcess.borrowBook(member, book);
    }

    public void returnBook(Member member, Book book) {
        borrowingProcess.returnBook(member, book);
    }

}
