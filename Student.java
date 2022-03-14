package Lesson_12;

import java.util.HashMap;
import java.util.Scanner;

public class Student {
    private HashMap<Integer,String>studentInfo = new HashMap<>();
    private String name;
    private int number;
    private int studentNumber;
    private String newValue;
    private int ordinalNumberCheck;

    public Student(){
        this.studentInfo=studentInfo;
        this.name = name;
        this.number=number;
        this.studentNumber=studentNumber;
        this.newValue=newValue;
        this.ordinalNumberCheck=ordinalNumberCheck;
    }


    public void addAnotherStudent(){
        Scanner reader = new Scanner(System.in);

        int count=0;
        char answer=0;

        do {
            addStudents(++count);
            System.out.println("Do you want to add another student? y/n");
            answer = reader.next().toLowerCase().charAt(0);
        }while (answer == 'y');
    }

    private void addStudents(int studentNumber){
        int number = 0;
        this.studentNumber=studentNumber;
        Scanner reader = new Scanner(System.in);
        System.out.println("Please type the student name and surname:");
        this.name = reader.nextLine();
        this.studentInfo.put(this.studentNumber,this.name);
        }

    public void listAllStudents(){
        System.out.println("Student list:");
        for(HashMap.Entry singleStudent : studentInfo.entrySet()){
            System.out.println(singleStudent.getKey() + ". " +singleStudent.getValue());
        }
    }

    public void listAllStudentNames(){
        System.out.println("Students names are: ");
        for(HashMap.Entry singleStudent : studentInfo.entrySet()){
            System.out.println(singleStudent.getValue());
        }
    }

    public void removeStudent(int number){
        this.studentNumber=number;
        this.studentInfo.remove(this.studentNumber);
    }

    public void changeStudent (int ordinalNumber){
        Scanner reader = new Scanner(System.in);

        System.out.println("Please type the changes for the student you chose:");
        this.newValue = reader.nextLine();
        studentInfo.replace(ordinalNumber,this.newValue);
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