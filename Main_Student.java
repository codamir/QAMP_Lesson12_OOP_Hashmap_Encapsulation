package Lesson_12;

import java.util.HashMap;
import java.util.Scanner;

public class Main_Student {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        Student myUniversity = new Student();

        char answer = 0;
        int choice = 0;
        int ordinalNumber = 0;


        System.out.println("-----------------------------------------"+
                            "\nType the number what would you like to do: " +
                            "\n-----------------------------------------");

        do {
            String[] menu = {
                    "Enter student name and surname",
                    "List all students names by ordinal numbers",
                    "Add new student",
                    "Change student data",
                    "Delete student from list",

            };

            menuFromArray(menu);

            choice=reader.nextInt();

            if (choice == 1) {
                myUniversity.addAnotherStudent();
            } else if (choice == 2) {
                myUniversity.listAllStudents();
            } else if (choice == 3) {
                myUniversity.addAnotherStudent();
            } else if (choice == 4) {
                System.out.println("Type the ordinal number of the student to change its data.");
                myUniversity.listAllStudents();
                ordinalNumber = reader.nextInt();
                myUniversity.changeStudent(ordinalNumber);
            } else if (choice == 5) {
                System.out.println("Type the ordinal number of the student you want to delete.");
                ordinalNumber = reader.nextInt();
                myUniversity.removeStudent(ordinalNumber);
            }

            System.out.println("Do you want to do something else from the menu? y/n");
            answer = reader.next().toLowerCase().charAt(0);
        }while (answer=='y');

    }

    public static String[] menuFromArray(String[] array){
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            System.out.println(++counter + " - " + array[i]);
        }
        return array;
    }

}




