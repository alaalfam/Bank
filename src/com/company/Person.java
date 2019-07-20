package com.company;

import java.util.ArrayList;

public class Person {
    private ArrayList<BankAccount> bankAccounts = new ArrayList<>();
    private String fName;
    private String lName;
    private String idNumber;
    private boolean validPerson = true;

    public Person(String fName, String lName, String idNumber) {
        if (isName(fName)) {
            this.fName = fName;
        } else {
            System.out.println("The first name was wrong.");
            validPerson = false;
            return;
        }
        if (isName(lName)) {
            this.lName = lName;
        } else {
            System.out.println("The last name was wrong.");
            validPerson = false;
            return;
        }
        if (isNumber(idNumber)) {
            this.idNumber = idNumber;
        } else {
            System.out.println("The id number was wrong.");
            validPerson = false;
            return;
        }
    }

    private boolean isNumber(String idNumber) {
        for (int i = 0; i < idNumber.length(); i++) {
            if (!(idNumber.charAt(i) >= '0' && idNumber.charAt(i) <= '9')) {
                return false;
            }
        }
        return true;
    }

    private boolean isName(String fName) {
        for (int i = 0; i < fName.length(); i++) {
            if (!(fName.charAt(i) >= 'a' && fName.charAt(i) <= 'z')) {
                return false;
            }
        }
        return true;
    }

    public void addAccount(BankAccount account) {

    }

    public boolean isValidPerson() {
        return validPerson;
    }
}
