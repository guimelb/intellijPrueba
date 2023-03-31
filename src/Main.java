package VIRTUALPET02.src;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        char pet;
        int menu;
        String petName;
        Random random = new Random();
        int energy = random.nextInt(61 - 40) + 40;
        int fatigue = random.nextInt(61 - 40) + 40;
        int sleep = random.nextInt(61 - 40) + 40;
        int hygiene = random.nextInt(61 - 40) + 40;
        int weight = random.nextInt(61 - 40) + 40;

        System.out.println("Welcome to your virtual pet!");
        System.out.println("First of all choose your pet's name:");
        petName = Teclat.llegirString();

        System.out.println("Now let's choose your pet: ");
        System.out.println("A.- A dog");
        System.out.println("B.- A cat");
        pet = Teclat.llegirChar();
        pet= Character.toLowerCase(pet);

        System.out.println("The initial values for " + petName + " are: energy= " + energy + " fatigue= " + fatigue + " sleep= " + sleep + " hygiene= " + hygiene + " weight= " + weight);
        do {
            System.out.println("What do you want to do now?");
            System.out.println("1.- Sleep");
            System.out.println("2.- Play");
            System.out.println("3.- Eat");
            if (pet == 'a') {
                System.out.println("4.- Shower");
            } else {
                System.out.println("4.- Self-cleaning");
            }
            System.out.println("0.- Exit application");
            menu = Teclat.llegirInt();

            switch (menu) {
                case 1 -> {
                    if (pet == 'a') {
                        sleep = sleep - 25;
                    } else {
                        sleep = sleep - 20;
                    }
                    fatigue = fatigue - 15;
                    energy = energy + 15;
                    System.out.println("The initial values for " + petName + " are: energy= " + energy + " fatigue= " + fatigue + " sleep= " + sleep + " hygiene= " + hygiene + " weight= " + weight);
                }
                case 2 -> {
                    if (pet == 'a') {
                        sleep = sleep - 10;
                    } else {
                        sleep = sleep + 15;
                    }
                    fatigue = fatigue + 10;
                    energy = energy - 10;
                    hygiene = hygiene - 15;
                    weight = weight - 10;
                    System.out.println("The initial values for " + petName + " are: energy= " + energy + " fatigue= " + fatigue + " sleep= " + sleep + " hygiene= " + hygiene + " weight= " + weight);
                }
                case 3 -> {
                    if (pet == 'a') {
                        sleep = sleep + 15;
                    } else {
                        sleep = sleep + 10;
                    }
                    sleep = sleep + 15;
                    energy = energy + 10;
                    hygiene = hygiene - 10;
                    weight = weight + 10;
                    System.out.println("The initial values for " + petName + " are: energy= " + energy + " fatigue= " + fatigue + " sleep= " + sleep + " hygiene= " + hygiene + " weight= " + weight);
                }
                case 4 -> {
                    if (pet == 'a') {
                        sleep = sleep - 15;
                    } else {
                        sleep = sleep + 10;
                    }
                    sleep = sleep - 15;
                    hygiene = hygiene + 20;
                    System.out.println("The initial values for " + petName + " are: energy= " + energy + " fatigue= " + fatigue + " sleep= " + sleep + " hygiene= " + hygiene + " weight= " + weight);
                }
                default ->
                        System.out.println("The final values for your dog " + petName + " are: energy= " + energy + ", fatigue= " + fatigue + ", sleep= " + sleep + ", hygiene= " + hygiene + " and weight= " + weight);
            }
        } while (menu != 0 && energy <= 100 && energy >= 0 && fatigue <= 100 && fatigue >= 0 && sleep <= 100 && sleep >= 0 && hygiene <= 100 && hygiene >= 0 && weight <= 100 && weight >= 0);

        if (energy < 0) {
            System.out.println(petName + " has died due to lack of energy :(");
        } else if (energy > 100) {
            System.out.println(petName + " has exploded due to excess of energy");
        }

        if (fatigue < 0) {
            System.out.println(petName + " has died due to lack of fatigue :(");
        } else if (fatigue > 100) {
            System.out.println(petName + " has exploded due to excess of fatigue");
        }

        if (sleep < 0) {
            System.out.println(petName + " has exploded due to excess of sleep");
        } else if (sleep > 100) {
            System.out.println(petName + " has died due to lack of sleep :(");
        }

        if (hygiene < 0) {
            System.out.println(petName + " has died due to lack of hygiene :(");
        } else if (hygiene > 100) {
            System.out.println(petName + " has exploded due to excess of hygiene");
        }

        if (weight < 0) {
            System.out.println(petName + " has died due to lack of weight :(");
        } else if (weight > 100) {
            System.out.println(petName + " has exploded due to excess of weight");
        }
    }
}