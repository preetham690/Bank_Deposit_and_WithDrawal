package com.bankaccount;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BankAccount bankacc = new BankAccount();
        System.out.println("Please enter the Amount : ");
        Scanner sc = new Scanner(System.in);
        Float amount = sc.nextFloat();
        System.out.println("Would you like to deposit or withdraw , Press 1 or 2 : ");
        int choice = sc.nextInt();
        switch (choice){
            case 1 :
                bankacc.deposit(amount);
                break;
            case 2 :
                bankacc.withdrawal(amount);
                break;
            default:
                System.out.println("You have entered Invalid Choice .");
        }

    }
}