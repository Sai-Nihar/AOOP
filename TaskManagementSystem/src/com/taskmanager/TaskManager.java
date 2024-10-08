package com.taskmanager;

import java.util.ArrayList;
import java.util.Scanner;

public class TaskManager {
    public static void main(String[] args) {
        ArrayList<String> tasks = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int choice;
        
        do {
            System.out.println("1. Add Task  2. Update Task  3. Remove Task  4. Display Tasks  5. Exit");
            choice = sc.nextInt();
            sc.nextLine();  // Consume newline
            
            switch (choice) {
                case 1 -> {
                    System.out.print("Enter task: ");
                    tasks.add(sc.nextLine());
                }
                case 2 -> {
                    System.out.print("Enter task index to update: ");
                    int index = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter new description: ");
                    tasks.set(index, sc.nextLine());
                }
                case 3 -> {
                    System.out.print("Enter task index to remove: ");
                    tasks.remove(sc.nextInt());
                }
                case 4 -> tasks.forEach(System.out::println);
            }
        } while (choice != 5);
        sc.close();
    }
}