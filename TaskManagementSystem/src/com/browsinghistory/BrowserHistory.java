package com.browsinghistory;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class BrowserHistory {
    public static void main(String[] args) {
        Deque<String> history = new ArrayDeque<>();
        Scanner sc = new Scanner(System.in);
        String currentPage = "";
        int choice;

        do {
            System.out.println("1. Visit Page  2. Go Back  3. Go Forward  4. Display Current Page  5. Exit");
            choice = sc.nextInt();
            sc.nextLine();  // Consume newline
            
            switch (choice) {
                case 1 -> {
                    System.out.print("Enter page URL: ");
                    history.push(currentPage);  // Save the current page
                    currentPage = sc.nextLine();
                }
                case 2 -> currentPage = history.isEmpty() ? "No history" : history.pop();
                case 4 -> System.out.println("Current Page: " + currentPage);
            }
        } while (choice != 5);
        sc.close();
    }
}

