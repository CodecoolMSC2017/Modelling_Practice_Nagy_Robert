package com.codecool;

import java.util.*;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static Attack attack;

    public static void main(String[] args){
        attack = new Attack();

        while (true) {
            System.out.println("Available commands: :list, :create, :attack, :save, :load, :units, :exit");
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
                handleAttack();

            } else if (":save".equals(line)) {
                handleSave();

            } else if (":load".equals(line)) {
                handleLoad();

            }
        }
    }

    private static void handleList(){}

    private static void handleUnits(){}

    private static void handleCreate(){
        System.out.println("Give me the number of short range soldiers you want in your army!");
        int numOfSoldiers = scanner.nextLine();
        System.out.println("Give me the number of long range rangers you want in your army!");
        int numOfRangers = scanner.nextLine();
        System.out.println("Give me the number of heavy soldiers you want in your army!");
        int numOfHeavies = scanner.nextLine();

        attack.createArmy(numOfSoldiers, numOfRangers, numOfHeavies);

        System.out.println("done");
        System.out.println(Integers.toString(attack.army.length));

    }

    private static void handleAttack(){}

    private static void handleSave(){}

    private static void handleLoad(){}
}
