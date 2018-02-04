package com.codecool;

import java.io.*;
import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static Attack attack;
    private static Attack enemy;

    public static void main(String[] args){
        attack = new Attack();
        enemy.army = enemy.createArmy(2, 2, 1);

        while (true) {
            System.out.println("Available commands: :list, :create, :battle, :save, :load, :units, :exit");
            String line = scanner.nextLine();
            if (":exit".equals(line)) {
                break;

            } else if (":list".equals(line)) {
                handleList();

            } else if (":units".equals(line)) {
                handleUnits();

            } else if (":create".equals(line)) {
                handleCreate();

            } else if (":attack".equals(line)) {
                handleBattle();

            } else if (":save".equals(line)) {
                handleSave();

            } else if (":load".equals(line)) {
                handleLoad();

            }
        }
    }

    private static void handleList(){
        try {
            System.out.println("Your army!");
            int numOfShort = attack.army.get("Short Range").size();
            int numOfLong = attack.army.get("Long Range").size();
            int numOfHev = attack.army.get("Heavy").size();
            int totalNum = numOfHev + numOfLong + numOfShort;
            System.out.printf("Number of short range soldiers: %d\nNumber of long range soldiers: %d\nNumber of heavy soldiers: %d\nTotal number of soldiers: %d\n", numOfShort, numOfLong, numOfHev, totalNum);
        } catch (NullPointerException e) {
            System.out.println("You have no army!\n");
        }
    }

    private static void handleUnits(){
        System.out.println("The available units in the game: (case-sensitive)\n");
        for (Units unit : Units.values()) {
            System.out.println(unit);
        }
        System.out.println("\n");
    }

    private static void handleCreate(){
        System.out.println("Give me the number of short range soldiers you want in your army!");
        int numOfSoldiers = Integer.parseInt(scanner.nextLine());
        System.out.println("Give me the number of long range rangers you want in your army!");
        int numOfRangers = Integer.parseInt(scanner.nextLine());
        System.out.println("Give me the number of heavy soldiers you want in your army!");
        int numOfHeavies = Integer.parseInt(scanner.nextLine());

        attack.army = attack.createArmy(numOfSoldiers, numOfRangers, numOfHeavies);

        System.out.println("done");
    }

    private static void handleBattle(){}

    private static void handleSave(){
        if (!attack.equals(null)){
            try {
                FileOutputStream fileOut =
                new FileOutputStream("myArmy.ser");
                ObjectOutputStream out = new ObjectOutputStream(fileOut);
                out.writeObject(attack);
                out.close();
                fileOut.close();
                System.out.println("Your army is saved!");
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("You have no army!\n");
        }
    }

    private static void handleLoad(){
        try {
            FileInputStream fileIn = new FileInputStream("myArmy.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            attack = (Attack) in.readObject();
            in.close();
            fileIn.close();
         } catch (IOException e) {
            System.out.println("You have no army saved!\n");
         } catch (ClassNotFoundException c) {
            return;
         }
    }
}
