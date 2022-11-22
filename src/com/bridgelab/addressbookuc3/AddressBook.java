package com.bridgelab.addressbookuc3;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {

	ArrayList<Contacts> arrayContact = new ArrayList<Contacts>();
	static Scanner scan = new Scanner(System.in);

	Contacts contact = new Contacts();
	public void addContact () {

		System.out.print("Enter the first name: ");
		contact.setFirstName(scan.nextLine());
		System.out.println("Enter the last name: ");
		contact.setLastName(scan.nextLine());
		System.out.println("Enter the address: ");
		contact.setAddress(scan.nextLine());
		System.out.println("Enter the city: ");
		contact.setCity(scan.nextLine());
		System.out.println("Enter the state: ");
		contact.setState(scan.nextLine());
		System.out.println("Enter the email: ");
		contact.setEmail(scan.nextLine());
		System.out.println("Enter the zip code: ");
		contact.setZip(scan.nextInt());
		System.out.println("Enter the phone number: ");
		contact.setPhoneNumber(scan.nextLong());
		arrayContact.add(contact);
	}
	public void editContact() {
		System.out.println("Enter The first Name to Edit Contact: " );
		String fName = scan.next();
		for (int i=0; i < arrayContact.size(); i++) {
			if (arrayContact.get(i).getFirstName().equals(fName)) {
				System.out.println("\n1.First Name\n2.last Name\n3.Address\n4.city\n5.state\n6.Email\n7.Zip code\n8.Phone number");
				int choice = scan.nextInt();
				switch (choice) {
				case 1 :
					System.out.println("Enter First name: ");
					arrayContact.get(i).setFirstName(scan.next());
					break;
				case 2 :
					System.out.println("Enter last name: ");
					arrayContact.get(i).setLastName(scan.next());
					break;
				case 3 :
					System.out.println("Enter Address: ");
					arrayContact.get(i).setAddress(scan.next());
					break;
				case 4 :
					System.out.println("Enter City : ");
					arrayContact.get(i).setCity(scan.next());
					break;

				case 5 :
					System.out.println("Enter State: ");
					arrayContact.get(i).setState(scan.next());
					break;

				case 6 :
					System.out.println("Enter Email: ");
					arrayContact.get(i).setEmail(scan.next());
					break;

				case 7 :
					System.out.println("Enter Zip: ");
					arrayContact.get(i).setZip(scan.nextInt());
					break;
				case 8 :
					System.out.println("Enter Phone Number: ");
					arrayContact.get(i).setPhoneNumber(scan.nextLong());
					
				}
				System.out.println("Edited list is: ");
				System.out.println(arrayContact);

			}
			else
				System.out.println("Enter valid first name: ");
		}
	}

	public static void main (String[]args){

		AddressBook addressBook = new AddressBook();

		addressBook.addContact();

			System.out.println("Enter your choice: ");
			System.out.println("1.Add Details.\n2.Edit Details.\n3.Exit");
			int choice = scan.nextInt();
			switch (choice) {
			case 1:
				addressBook.addContact();
				break;
			case 2:
				addressBook.editContact();
				break;
			case 3:
				System.out.println("You We are Exiting");
				return;
			default:
				System.out.println("Invalid");
				break;
			
		}
	}
}
