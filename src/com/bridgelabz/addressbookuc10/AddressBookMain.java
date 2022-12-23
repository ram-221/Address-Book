package com.bridgelabz.addressbookuc10;

import java.util.Scanner;

public class AddressBookMain {

	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("\n***Welcome To Address Book Program***\n");

		AddressBook details = new AddressBook();

		int choice;
		do {
			System.out.println("1.Add new address book"
					+ "\n2.Add contact"
					+ "\n3.Show Contact"
					+ "\n4.Edit Contact"
					+ "\n5.Delete Contact"
					+ "\n6.Select address book"
					+ "\n7.searchContact"
					+ "\n8.Count Contact\n");
			
			System.out.println("Enter your choice: ");
			choice = input.nextInt();
			switch (choice) {
			case 1:
				details.addNewAddressBook();
				break;
			case 2:
				Contact Contact = details.getContactInput();
				details.addContact(Contact);	
				break;
			case 3:
				details.viewContacts();
				break;
			case 4:
				details.editContact();
				break;
			case 5:
				details.deleteContact();
				break;
			case 6:
				details.selectAddressBook();
				break;
			case 7:
				details.searchContact();
				break;
			case 8:
				details.countContact();
				break;
			
			default:
				System.out.println(" Plz Enter Valid Input...");
			}
		} while (choice != 8);
	}
}
