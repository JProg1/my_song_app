package com.qa;

import com.qa.data.Song;
import com.qa.data.SongDAO;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SongApp {
    private SongDAO songDAO;
    private boolean isRunning;
    private Scanner scanner;
    public SongApp(SongDAO songDAO) {
        this.songDAO = songDAO;
        this.scanner = new Scanner(System.in);
    }

    public void run() {
        isRunning = true;
        String input = null;

        while (isRunning){
            printMenu();
            System.out.print("> ");
            input = scanner.nextLine();

            switch (input.toUpperCase()){
                case "I":
                    readByID();
                    break;
                case "R":
                    readAll();
                    break;
                case "Q":
                    isRunning = false;
                    System.out.println("Goodbye.");
                    break;
                default:
                    System.out.println("Invalid commnad.");
                    break;
            }
        }
    }
    private void readByID() {
        boolean isDone = false;
        while (!isDone){
            try {
                System.out.print("ID? > ");
                int id = Integer.parseInt(scanner.nextLine());
                System.out.println(songDAO.readById(id));
                isDone = true;
            } catch (NumberFormatException e){
                System.out.println("Sorry, only whole numbers are valid.");
            } catch (SongNotFoundException e){
                System.out.println(e.getMessage());
            }
        }
    }
    private void readAll() {
        List<Song> songlist = songDAO.readAll();
        for(Song song : songlist){
            System.out.println(song.toString());
        }
    }
    private void printMenu() {
        System.out.println("==== MENU ====");
        System.out.println("> (I) Read by id.");
        System.out.println("> (R) Read all.");
        System.out.println("> (Q) to quit.");
    }
}
