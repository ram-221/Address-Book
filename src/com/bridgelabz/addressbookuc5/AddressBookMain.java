package com.bridgelabz.addressbookuc5;


import java.util.Scanner;

public class AddressBookMain {

	public static void main(String[] args) {
		AddressBook addressBook = new AddressBook();
		Scanner scan = new Scanner(System.in);

		boolean mainMethod = true;
		while(mainMethod) {
			System.out.println("Enter your choice");
			System.out.println("1.Add Contact.\n2.Edit Contact.\n3.Delete Contact"
					+ "\n4.DisPlay Contact \n5.AddMultiple Contact");

			int choice = scan.nextInt();
			switch (choice) {
			case 1:
				addressBook.addContact();
				break;
			case 2:
				addressBook.editContact();
				break;
			case 3:
				addressBook.deleteContact();
				break;
			case 4:
				addressBook.dispaly();
				break;
			case 5:
				addressBook.addMultipleContacts();
				break;

			default:
				System.out.println("Invalid");
				break;
			}
		}
		scan.close();
	}
}
