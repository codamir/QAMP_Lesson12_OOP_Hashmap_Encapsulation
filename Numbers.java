package Lesson_12;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Numbers {
    ArrayList<Integer> numbersList;


    public Numbers (ArrayList<Integer> numberslist) {
        this.numbersList = numberslist;
    }

    public int sumOfNumbersInList(){
        int count = 0;
        int sum = 0;

        for (int number : this.numbersList) {
            sum += number;
        }
        return sum;
    }

    public int maxNumberInList () {
        return Collections.max(this.numbersList);
    }

    public int minNumberInList() {
        return Collections.min(this.numbersList);
    }

    public Boolean isPrimeNumber() {
        ArrayList<Boolean> status = new ArrayList<>();
        int numberCheck;
        BigInteger number;

        for (Integer integer : this.numbersList) {
            numberCheck = integer;
            number = BigInteger.valueOf(numberCheck);

            Boolean numberIsPrime = number.isProbablePrime(100);
            if (numberIsPrime) {
                status.add(true);
            }
        }

        if (status.size() != 0) {
            return true;
        } else {
            return false;
        }
    }

    public void displayOnlyPrimeNumbers(){
        int numberToCheck;
        int count = 0;
        BigInteger number;
        ArrayList<BigInteger> primeNumbers = new ArrayList<>();

        for (Integer integer : this.numbersList) {
            numberToCheck = integer;
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