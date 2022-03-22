package Lesson_12;

import java.util.ArrayList;
import java.util.Scanner;

public class Main_Numbers {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        char answer = 0;
        int choice = 0;


        do {
        System.out.println("\nDo you want to add numbers? y/n");
        answer = reader.next().toLowerCase().charAt(0);
        if (answer == 'n') {
            break;
        }

        ArrayList<Integer> listOfNumbers = new ArrayList<>();

        Numbers myNumbers = new Numbers(listOfNumbers = addNumbersToList(answer));

        System.out.println("Now please choose what would you like to do with your list of numbers?");

        String[] arrayMenu = {
                "Get highest number from your list",
                "Get smallest number from your list",
                "Sum of all numbers in a list",
                "Check if there are prime numbers in a list",
                "Remove all numbers that are not prime numbers",
        };

        menuFromArray(arrayMenu);

        choice=reader.nextInt();
            if (choice == 1) {
                int maxNumber = myNumbers.maxNumberInList();
                System.out.println(maxNumber);
            } else if (choice == 2) {
                int minNumber = myNumbers.minNumberInList();
                System.out.println(minNumber);
            } else if (choice == 3) {
                int sum = myNumbers.sumOfNumbersInList();
                System.out.println("The sum of the numbers is: " + sum);
            } else if (choice == 4) {
                if (myNumbers.isPrimeNumber()) {
                    System.out.println("Prime numbers detected in your list.");
                } else System.out.println("No prime numbers in your list.");
            } else if (choice == 5) {
                System.out.println("Your list with only prime numbers included looks like this: ");
                myNumbers.displayOnlyPrimeNumbers();
            }
            System.out.println("Would you like to start again? y/n");
            answer=reader.next().toLowerCase().charAt(0);
    } while (answer=='y');

    }

    public static String[] menuFromArray(String[] array){
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            System.out.println(++counter + " - " + array[i]);
        }
        return array;
    }

    public static ArrayList addNumbersToList(char inputChoice) {
        Scanner reader = new Scanner(System.in);

        char choice = 0;
        Integer addNumber = 0;
        ArrayList numbersList = new ArrayList<>();

        if (inputChoice == 'y') {
            do {
                System.out.println("Type any number:");
                addNumber = reader.nextInt();
                numbersList.add(addNumber);
                System.out.println("Add another number? y/n");
                choice = reader.next().toLowerCase().charAt(0);
            } while (choice == 'y');
        } else {
            System.out.println("You need to type 'y' or 'n'.");
        }
        return numbersList;
    }
}
