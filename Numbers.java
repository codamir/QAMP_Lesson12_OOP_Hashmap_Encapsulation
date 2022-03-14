package Lesson_12;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Numbers {
    ArrayList<Integer> numbersList = new ArrayList<>();
    char choice;
    boolean isPrime=true;

    public Numbers (){
        this.numbersList=numbersList;
        this.choice=choice;
        this.isPrime=isPrime;
    }


    public ArrayList addNumbersToList(char inputChoice) {
        Scanner reader = new Scanner(System.in);
        Integer addNumber = 0;
        if (inputChoice == 'y') {
            do {
                System.out.println("Type any number:");
                addNumber = reader.nextInt();
                this.numbersList.add(addNumber);
                System.out.println("Add another number? y/n");
                this.choice = reader.next().toLowerCase().charAt(0);
            } while (this.choice == 'y');
        }else System.out.println("Ok. Thank you.");
        return this.numbersList;
    }

    public void printList (){
        System.out.println(this.numbersList);
    }

    public int sumOfNumbersInList(){
        int count = 0;
        int sum = 0;
        while (this.numbersList.size() > count) {
            sum += this.numbersList.get(count);
            count++;
        }
        return sum;
    }

    public int maxNumberInList (){
        return Collections.max(this.numbersList);
    }

    public int minNumberInList(){
        return Collections.min(this.numbersList);
    }

    public Boolean isPrimeNumber(){
        ArrayList<Boolean> status = new ArrayList<>();
        int numberCheck;
        BigInteger number = null;

        for (int i=0;i<this.numbersList.size();i++) {

            numberCheck = this.numbersList.get(i);
            number = BigInteger.valueOf(numberCheck);

            Boolean numberIsPrime = number.isProbablePrime(100);
            if (numberIsPrime) {
                status.add(true);
            }
        }

        if (status.size()!=0){
            return true;
        }else return false;
    }

    public void displayOnlyPrimeNumbers(){
        int numberToCheck;
        int count=0;
        BigInteger number= BigInteger.valueOf(0);
        ArrayList<BigInteger> primeNumbers = new ArrayList<>();

        for (int i=0;i<this.numbersList.size();i++){

            numberToCheck = this.numbersList.get(i);
            number = BigInteger.valueOf(numberToCheck);

            Boolean numberIsPrime = number.isProbablePrime(100);
            if (numberIsPrime) {
                primeNumbers.add(number);
            }
        }

        System.out.println(primeNumbers);
    }

}



//Kolekcije:
//        1. Napraviti klasu Numbers koja ima mogucnost da iz liste brojeva koja je data na inputu izracuna:
//        - min broj
//        - max broj
//        - sum svih brojeva
//        - provjeri da li je broj prost ili ne
//        - provjeri da li ima brojeva u listi koji nisu prosti i te brojeve eliminira iz liste
//        Za ovaj zadatak je potrebno koristiti ArrayList kolekciju