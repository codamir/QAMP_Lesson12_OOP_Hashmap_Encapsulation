package Lesson_12;

import java.util.HashMap;
import java.util.Scanner;

public class Student {
    private HashMap<Integer, String> studentInfo;

    public Student(HashMap<Integer, String> studentInfo) {
        this.studentInfo = studentInfo;
    }

    public void addAnotherStudent() {
        Scanner reader = new Scanner(System.in);

        int count = 0;
        char answer = 0;

        do {
            addStudents(++count);
            System.out.println("Do you want to add another student? y/n");
            answer = reader.next().toLowerCase().charAt(0);
        } while (answer == 'y');
    }

    private void addStudents(int studentNumber) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Please type the student name and surname:");
        String name = reader.nextLine();
        this.studentInfo.put(studentNumber, name);
    }

    public void listAllStudents() {
        System.out.println("Student list:");
        for (HashMap.Entry singleStudent : studentInfo.entrySet()) {
            System.out.println(singleStudent.getKey() + ". " + singleStudent.getValue());
        }
    }

    public void removeStudent(int ordinalNumber) {
        this.studentInfo.remove(ordinalNumber);
    }

    public void changeStudent(int ordinalNumber) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Please type the changes for the student you chose:");
        String newValue = reader.nextLine();
        studentInfo.replace(ordinalNumber, newValue);
    }

}


//2. Napravite klasu Student koja u konstruktoru prima HashMap<Integer, String> studentInfo
//        gdje studentInfo hash mapa sadrzi redni broj (key) i name (value) svakog studenta koji je dat na inputu.
//        U klasi student treba da bude definisana mogucnost da:
//        - ispisemo imena svih studenata na outputu  *
//        - ispisemo redne brojeve svih studenata na outputu  *
//        - dodavati nove studente u hash mapu
//        - mijenjati postojece studente u hash mapi
//        - brisati postojece studente iz hash mape