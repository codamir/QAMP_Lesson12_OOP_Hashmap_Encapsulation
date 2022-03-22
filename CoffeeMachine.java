package Lesson_12;

import java.util.Scanner;

public class CoffeeMachine {
    private String esspresso;
    private String macchiato;
    private String cappuccino;
    private String milk;
    private String hotChocolate;

    public CoffeeMachine(String esspresso, String macchiato, String cappuccino, String milk, String hotChocolate) {
        this.esspresso = esspresso;
        this.macchiato = macchiato;
        this.cappuccino = cappuccino;
        this.milk = milk;
        this.hotChocolate = hotChocolate;
    }

    private String [] drinkList(){
        String[] drinkList = {this.esspresso,this.macchiato,this.cappuccino,this.milk,this.hotChocolate};
        return drinkList;
    }

    public void getDrink() {
        System.out.println("Choose your drink:");
        int n = 0;
        String[] menu = drinkList();
        for (int i=0; i< menu.length; i++) {
            System.out.println(++n + " | " + menu[i]);
        }
        makeChoice();
    }

    private void makeChoice() {
        Scanner reader = new Scanner(System.in);
        int answer = reader.nextInt();

        if (answer == 1) {
            addSugar();
            System.out.println("Your " + this.esspresso + " is now ready." +  "\n-------------------------");
        }else if (answer == 2) {
            addSugar();
            System.out.println("Your " + this.macchiato + " is now ready." + "\n-------------------------");
        }else if (answer == 3) {
            addSugar();
            System.out.println("Your " + this.cappuccino + " is now ready." + "\n-------------------------");
        }else if (answer == 4) {
            addSugar();
            System.out.println("Your " + this.milk + " is now ready." + "\n-------------------------");
        }else if (answer == 5) {
            addSugar();
            System.out.println("Your " + this.hotChocolate + " is now ready." + "\n-------------------------");
        }else {
            System.out.println("Incorrect option chosen. Please choose options from 1 to 5. Thank you.");
            getDrink();
        }
        anotherDrink();
    }

    private void anotherDrink () {
        Scanner reader = new Scanner(System.in);
        char choice;

        do{
            System.out.println("Do you want to make another drink? y/n");
            choice = reader.next().toLowerCase().charAt(0);
            if(choice == 'y') {
                System.out.println("Plase remove the cup, and choose another drink.");
                getDrink();
            } else {
                System.out.println("Please remove the cup.");
            }
            break;

        } while (choice == 'y');
    }

    private void addSugar() {
        Scanner reader = new Scanner(System.in);

        System.out.println("Do you want to add sugar? y/n");
        char yesNo = reader.next().toLowerCase().charAt(0);

        if (yesNo == 'y'){
            System.out.println("Sugar added to your drink."+ "\n-------------------------");
        } else if (yesNo == 'n'){
            System.out.println("Your drink will be made without sugar."+"\n-------------------------");
        } else {
            System.out.println("Incorrect letter entered. You need to type letter 'y' or 'n'.");
            addSugar();
        }
    }
}

//Enkapsulacija:
//        3. Napraviti CoffeeMachine klasu primjenjujuci koncept enkapsulacije.
//        Potrebno je da klasa sadrzi skup public i private metoda
//        Sam code unutar metoda moze biti jednostavni ispis poruke na System.out.println.
//
//        Ono sto je bitno je da postoje user facing metode
//        ali i one koje se interno koriste u samoj klasi.