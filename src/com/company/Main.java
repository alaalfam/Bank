package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scan = new Scanner(System.in);
        ArrayList<Person> people = new ArrayList<>();
        while (true){
            System.out.println("Enter a person first name.");
            String fName = scan.nextLine();
            System.out.println("Enter a person last name.");
            String lName = scan.nextLine();
            System.out.println("Enter a id number.");
            String idNumber = scan.nextLine();
            Person person = new Person(fName, lName, idNumber);
            if (person.isValidPerson()){
                System.out.println("Pay some mony for your balance bank account.");
                int mony = scan.nextInt();
                scan.nextLine();
                BankAccount account = new BankAccount(mony);
                people.add(person);
            }
            System.out.println("if you don't want to add any other person. enter (N)");
            String ans = scan.nextLine();
            if (ans.toUpperCase().equals("N")){
                break;
            }
        }


    }
}
