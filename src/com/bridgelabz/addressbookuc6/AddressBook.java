package com.bridgelabz.addressbookuc6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class AddressBook {

	ArrayList<Contacts> arrayContact = new ArrayList<Contacts>();
	/*
	    create scanner class object
	 */
	static Scanner scan = new Scanner(System.in);

	static HashMap<String, ArrayList> hashmap = new HashMap<>();
	static AddressBook details = new AddressBook();

	public void addContact() {

		//create object of Contact class as contact
		Contacts contact = new Contacts();

		System.out.print("Enter the first name: ");
		contact.setFirstName(scan.next());
		System.out.print("Enter the last name: ");
		contact.setLastName(scan.next());
		System.out.print("Enter the address: ");
		contact.setAddress(scan.next());
		System.out.print("Enter the city: ");
		contact.setCity(scan.next());
		System.out.print("Enter the state: ");
		contact.setState(scan.next());
		System.out.print("Enter the email: ");
		contact.setEmail(scan.next());
		System.out.print("Enter the zip code: ");
		contact.setZip(scan.nextInt());
		System.out.print("Enter the phone number: ");
		contact.setPhoneNumber(scan.nextLine());
		arrayContact.add(contact);
		
	}

	public void display() {
		System.out.println(arrayContact);
	}

	public void editContact() {
		System.out.println("Confirm first name to edit details: ");
		String confirmName =scan.next();
		for (int i = 0; i < arrayContact.size(); i++) {
			if (arrayContact.get(i).getFirstName().equals(confirmName)) {

				System.out.println("\n1.First Name\n2.last Name\n3.Address\n4.city\n5state\n6.Email\n7.Zip code\n8.Phone number");

				int edit = scan.nextInt();
				switch (edit) {
				case 1:
					System.out.println("Enter First name: ");
					arrayContact.get(i).setFirstName(scan.next());
					break;
				case 2:
					System.out.println("Enter last name: ");
					arrayContact.get(i).setLastName(scan.next());
					break;
				case 3:
					System.out.println("Enter Address: ");
					arrayContact.get(i).setAddress(scan.next());
					break;
				case 4:
					System.out.println("Enter City : ");
					arrayContact.get(i).setCity(scan.next());
					break;

				case 5:
					System.out.println("Enter State: ");
					arrayContact.get(i).setState(scan.next());
					break;

				case 6:
					System.out.println("Enter Email: ");
					arrayContact.get(i).setEmail(scan.next());
					break;

				case 7:
					System.out.println("Enter Zip: ");
					arrayContact.get(i).setZip(scan.nextInt());
					break;
				case 8:
					System.out.println("Enter Phone Number: ");
					arrayContact.get(i).setPhoneNumber(scan.nextLine());
					break;
				}
				System.out.println("Edited list is: ");
				System.out.println(arrayContact);
			} else
				System.out.println("Enter valid first name: ");
		}
	}


	public void deleteContact() {

		System.out.println("Confirm the first name to delete contacts: ");

		String ConfirmName = scan.next();
		for (int i = 0; i < arrayContact.size(); i++) {
			if (arrayContact.get(i).getFirstName().equals(ConfirmName)) {
				arrayContact.remove(i);
				System.out.println("Contact Deleted Successfully.....");
				System.out.println("List after removing details: " + arrayContact);
			} else {
				System.out.println("Enter valid first name: ");
			}
		}
	}
	
	public void createAddressBook() {
		System.out.println("Enter name of address book:");
		String AddressBookName = scan.next();
		ArrayList<Contacts> newAddressBook = new ArrayList<>();
		arrayContact =newAddressBook;
		 hashmap.put(AddressBookName, arrayContact);
         System.out.println(hashmap);
	}
}