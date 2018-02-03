package com.codecool;

import java.util.Scanner;

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

    private static void handleCreate(){}

    private static void handleAttack(){}

    private static void handleSave(){}

    private static void handleLoad(){}
}
