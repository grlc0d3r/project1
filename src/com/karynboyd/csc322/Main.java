package com.karynboyd.csc322;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner get = new Scanner(System.in);
	    int accountID;
	    int selection;
	    boolean quit = false;

	    Account[] accounts = new Account[10];
	    for (int i = 0; i < accounts.length; i++)
        {
            accounts[i] = new Account();
        }

	    do {
            System.out.println("Please enter an account id: ");
            accountID = get.nextInt();
            System.out.println("Main menu");
            System.out.println("1. Check Balance");
            System.out.println("2. Withdrawal");
            System.out.println("3. Deposit");
            System.out.println("4. Exit");
            selection = get.nextInt();

            switch (selection) {
                case 1:
                    System.out.println(accounts[accountID].getBalance());
                    break;
                case 2:
                    accounts[accountID].withdraw();
                    break;
                case 3:
                    accounts[accountID].deposit();
                    break;
            }
        } while (!quit);
    } // end main()
} // end class
