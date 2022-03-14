package Lesson_12;

import java.util.Scanner;

public class CoffeeMachine {
    private String esspresso = "Esspresso";
    private String macchiato = "Macchiato";
    private String cappuccino = "Cappuccino";
    private String milk = "Milk";
    private String hotChocolate = "Hot Chocolate";
    private String drinkChoice;
    private int answer;
    private char choice;
    private String[] drinkList = {"Espresso", "Macchiato", "Cappuccino"};

    public CoffeeMachine(){
        this.esspresso = esspresso;
        this.macchiato = macchiato;
        this.cappuccino = cappuccino;
        this.milk = milk;
        this.hotChocolate = hotChocolate;
        this.drinkChoice = drinkChoice;
        this.answer = answer;
        this.drinkList=drinkList;
        this.choice=choice;
    }

    public void getDrink(){
        System.out.println("Choose your drink");
        int n = 0;
        for (String menu:this.drinkList){
            System.out.println(++n+ " | " + menu);
        }
        makeChoice();
    }

    private void makeChoice(){
        Scanner reader = new Scanner(System.in);
        this.answer = reader.nextInt();

        if (this.answer==1){
            addSugar();
            System.out.println("Your " + this.esspresso + " is now ready." +  "\n-------------------------");
        }else if (this.answer==2){
            addSugar();
            System.out.println("Your " + this.macchiato + " is now ready." + "\n-------------------------");
        }else if (this.answer==3){
            addSugar();
            System.out.println("Your " + this.cappuccino + " is now ready." + "\n-------------------------");
        }
        anotherDrink();
    }

    private void anotherDrink (){
        Scanner reader = new Scanner(System.in);

        do{
            System.out.println("Do you want to make another drink? y/n");
            this.choice = reader.next().toLowerCase().charAt(0);
            if(this.choice=='y'){
                System.out.println("Plase remove the cup, and choose another drink.");
                getDrink();
            }else System.out.println("Please remove the cup.");
            break;

        }while(this.choice=='y');
    }

    private void addSugar(){
        Scanner reader = new Scanner(System.in);

        System.out.println("Do you want to add sugar?");
        char yesNo = reader.next().toLowerCase().charAt(0);

        if (yesNo=='y'){
            System.out.println("Sugar added to your drink"+ "\n-------------------------");
        }else System.out.println("Your drink will be made without sugar."+"\n-------------------------");

    }

}


//Enkapsulacija:
//        3. Napraviti CoffeeMachine klasu primjenjujuci koncept enkapsulacije.
//        Potrebno je da klasa sadrzi skup public i private metoda
//        Sam code unutar metoda moze biti jednostavni ispis poruke na System.out.println.
//
//        Ono sto je bitno je da postoje user facing metode
//        ali i one koje se interno koriste u samoj klasi.