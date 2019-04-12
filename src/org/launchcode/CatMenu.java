package org.launchcode;

import java.util.Scanner;

public class CatMenu {
    private Cat cat;

    public void run() {
        int choice;
        Scanner keyboard = new Scanner(System.in);
        this.cat = getCatDetails();
        do {
            System.out.println("\n");

            System.out.println("What would you like to do with " +
                            cat.getName() + "?");
            showOptions();
            choice = keyboard.nextInt();
            keyboard.skip("\n");
            if(choice != 0) doAction(choice);
        } while (choice != 0);
        System.out.println(cat.getName() + " will miss you!");
    }

    private Cat getCatDetails(){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("What would you like to name your cat?");
        String name = keyboard.nextLine();
        System.out.println("What color is your cat?");
        String color = keyboard.nextLine();
        System.out.println("What breed is your cat?");
        String breed = keyboard.nextLine();
        return new Cat(name, color, breed);
    }

    private void showOptions(){
        System.out.println("1. Rename the cat");
        System.out.println("2. Celebrate the cat's birthday");
        System.out.println("3. Feed the cat");
        System.out.println("4. Pet the cat");
        System.out.println("0. Quit");
    }

    private void doAction(int choice){
        switch (choice){
            case 1:
                renameCat();
                break;
            case 2:
                doBirthday();
                break;
            case 3:
                cat.feedCat();
                System.out.println(cat.getName() + " is happy... For now...");
                break;
            case 4:
                cat.petCat();
                break;
                default:
                    System.out.println("Invalid choice.");
        }
    }

    private void doBirthday() {
        cat.setAge(cat.getAge() + 1);
        System.out.println("HAPPY BIRTHDAY, " + cat.getName());
        System.out.println(cat.getName() + " is now " + cat.getAge() + " years old!");
    }

    private void renameCat() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("What do you want to name the cat?");
        cat.setName(keyboard.nextLine());
        System.out.println("The cat is now named " + cat.getName());
    }
}
