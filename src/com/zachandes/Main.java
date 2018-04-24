package com.zachandes;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String name;
        String tempChoice;
        Character basicCharacter;

        System.out.println("Please enter the name of your character: ");
        name = keyboard.nextLine();

        System.out.println("Choose your weapon:\n"
        + "Sword\n"
        + "Spear\n"
        + "Shield\n"
        + "Fists\n"
        + "Magic");
        tempChoice = keyboard.nextLine().toUpperCase();

        switch (tempChoice){
            case "SWORD": basicCharacter = new Sword(new BasicCharacter(name));
                break;
            case "SPEAR": basicCharacter = new Spear(new BasicCharacter(name));
                break;
            case "SHIELD": basicCharacter = new Shield(new BasicCharacter(name));
                break;
            case "FISTS": basicCharacter = new Fists(new BasicCharacter(name));
                break;
            case "MAGIC": basicCharacter = new Magic(new BasicCharacter(name));
                break;
            default: basicCharacter = new Peasant(new BasicCharacter(name));
        }

        checkLife(basicCharacter);

        System.out.println("Would you like to BEGIN your quest, or get SUPPLIES?");
        tempChoice = keyboard.nextLine().toUpperCase();

        if(tempChoice != "SUPPLIES"){
            basicCharacter = new Starving(basicCharacter);
        }

        checkLife(basicCharacter);

        System.out.println("The sun sets on your first day of travel, do you REST or CONTINUE?");
        tempChoice = keyboard.nextLine().toUpperCase();

        if(tempChoice != "REST"){
            basicCharacter = new Tired(basicCharacter);
        }

        checkLife(basicCharacter);

        System.out.println("Project terminated due to lack of funds.");
    }

    private static void checkLife(Character basicCharacter){
        System.out.println("Name: " + basicCharacter.getName());
        System.out.println("Health: " + basicCharacter.getHealth());

        if(basicCharacter.getHealth() <= 0){
            System.out.println("You have died");
            System.exit(0);
        }
    }
}
