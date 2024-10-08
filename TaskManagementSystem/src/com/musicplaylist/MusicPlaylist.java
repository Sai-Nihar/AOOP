package com.musicplaylist;

import java.util.LinkedList;
import java.util.Scanner;

public class MusicPlaylist {
    public static void main(String[] args) {
        LinkedList<String> playlist = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("1. Add Song  2. Remove Song  3. Move Song  4. Display Playlist  5. Exit");
            choice = sc.nextInt();
            sc.nextLine();  // Consume newline
            
            switch (choice) {
                case 1 -> {
                    System.out.print("Enter song name: ");
                    playlist.add(sc.nextLine());
                }
                case 2 -> {
                    System.out.print("Enter song name to remove: ");
                    playlist.remove(sc.nextLine());
                }
                case 3 -> {
                    System.out.print("Enter song index to move: ");
                    int fromIndex = sc.nextInt();
                    System.out.print("Enter new position: ");
                    int toIndex = sc.nextInt();
                    sc.nextLine();
                    String song = playlist.remove(fromIndex);
                    playlist.add(toIndex, song);
                }
                case 4 -> playlist.forEach(System.out::println);
            }
        } while (choice != 5);
        sc.close();
    }
}

