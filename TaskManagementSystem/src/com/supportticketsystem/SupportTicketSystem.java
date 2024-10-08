package com.supportticketsystem;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class SupportTicketSystem {
    public static void main(String[] args) {
        Queue<String> tickets = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("1. Add Ticket  2. Process Ticket  3. Display Tickets  4. Exit");
            choice = sc.nextInt();
            sc.nextLine();  // Consume newline

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter ticket description: ");
                    tickets.add(sc.nextLine());
                }
                case 2 -> System.out.println("Processed: " + tickets.poll());
                case 3 -> tickets.forEach(System.out::println);
            }
        } while (choice != 4);
        sc.close();
    }
}

