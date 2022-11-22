package com.bridgelabz.addressbookuc4;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {

	ArrayList<Contacts> arrayContact = new ArrayList<Contacts>();
	static Scanner scan = new Scanner(System.in);
	
	
	public void addContact() {
	
		Contacts contact = new Contacts();
		
		System.out.println("Enter the First Name");
		contact.setFirstName(scan.next());
		System.out.println("Enter The Last Name");
		contact.setLastName(scan.next());
		System.out.println("Enter The Address");
		contact.setAddress(scan.next());
		System.out.println("Enter The City");
		contact.setCity(scan.next());
		System.out.println("Enter the State");
		contact.setState(scan.next());
		System.out.println("Enter the zip");
		contact.setZip(scan.nextInt());
		System.out.println("Enter the Email");
		contact.setEmail(scan.next());
		System.out.println("Enter the Phone number");
		contact.setPhoneNumber(scan.nextLong());
		arrayContact.add(contact);
	}
	
	public void editContact() {
		System.out.println("Enter the First Name To Edit");
		String fName = scan.next();
		for(int i=0;i<arrayContact.size();i++) {
			if(arrayContact.get(i).getFirstName().equals(fName)) {
			System.out.println("\n1. First Name \n2.Last Name \n3.Address \n4.City \n5.State \n6.Zip \n7.Email \n8.Phone Number");
			int choice = scan.nextInt();
			switch(choice) {
			case 1:
				System.out.println("Enter new First Name");
				arrayContact.get(i).setFirstName(scan.next());
				break;
			case 2:
				System.out.println("Enter new Last Name");
				arrayContact.get(i).setLastName(scan.next());
				break;
			case 3:
				System.out.println("Enter new Address");
				arrayContact.get(i).setAddress(scan.next());
				break;
			case 4:
				System.out.println("Enter new City");
				arrayContact.get(i).setCity(scan.next());
				break;
			case 5:
				System.out.println("Enter new State");
				arrayContact.get(i).setState(scan.next());
				break;
			case 6:
				System.out.println("Enter new Zip");
				arrayContact.get(i).setZip(scan.nextInt());
				break;
			case 7:
				System.out.println("Enter new Email");
				arrayContact.get(i).setEmail(scan.next());
				break;
			case 8:
				System.out.println("Enter new Phone Number");
				arrayContact.get(i).setPhoneNumber(scan.nextLong());
			}
			System.out.println("Edited list is: ");
			System.out.println(arrayContact);

		}
		else
			System.out.println("Enter valid first name: ");
	}
}
	
	public void deleteContact() {
		System.out.println("Enter the First Name to delete");
		String fName= scan.next();
		for(int i=0;i<arrayContact.size();i++) {
			if(arrayContact.get(i).getFirstName().equals(fName)) {
				arrayContact.remove(i);
				System.out.println("Deleted");
				System.out.println("List after deleting contacts :"+arrayContact);
			}
			else {
				System.out.println("enter Valid FirstName");
			}
		}
	}
	
	public static void main(String[] args) {
		AddressBook addressBook = new AddressBook();
		addressBook.addContact();
		
		System.out.println("Enter your choice");
		System.out.println("1.Add Details.\n2.Edit Details.\n3.Delete contact\n4.Exit");

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
                System.out.println("Exiting");
                return;
                default:
                System.out.println("Invalid");
                break;
        }
	}
}
