package com.bridgelabz.addressbookuc3;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {

	ArrayList<Contacts> arrayDetails = new ArrayList<Contacts>();
	static Scanner scan = new Scanner(System.in);

	public void addDetails () {

		Contacts contact = new Contacts();

		System.out.print("Enter the first name: ");
		contact.setFirstName(scan.nextLine());
		System.out.print("Enter the last name: ");
		contact.setLastName(scan.nextLine());
		System.out.print("Enter the address: ");
		contact.setAddress(scan.nextLine());
		System.out.print("Enter the city: ");
		contact.setCity(scan.nextLine());
		System.out.print("Enter the state: ");
		contact.setState(scan.nextLine());
		System.out.print("Enter the email: ");
		contact.setEmail(scan.nextLine());
		System.out.print("Enter the zip code: ");
		contact.setZip(scan.nextInt());
		System.out.print("Enter the phone number: ");
		contact.setPhoneNumber(scan.nextLong());
		arrayDetails.add(contact);
	}
	public void editDetails() {
		System.out.println("Enter The first Name to Edit: " );
		String confirmName = scan.next();
		for (int i=0; i < arrayDetails.size(); i++) {
			if (arrayDetails.get(i).getFirstName().equals(confirmName)) {
				System.out.println("\n1.First Name\n2.last Name\n3.Address\n4.city\n5.state\n6.Email\n7.Zip code\n8.Phone number");
				int choice = scan.nextInt();
				switch (choice) {
				case 1 :
					System.out.println("Enter First name: ");
					arrayDetails.get(i).setFirstName(scan.next());
					break;
				case 2 :
					System.out.println("Enter last name: ");
					arrayDetails.get(i).setLastName(scan.next());
					break;
				case 3 :
					System.out.println("Enter Address: ");
					arrayDetails.get(i).setAddress(scan.next());
					break;
				case 4 :
					System.out.println("Enter City : ");
					arrayDetails.get(i).setCity(scan.next());
					break;

				case 5 :
					System.out.println("Enter State: ");
					arrayDetails.get(i).setState(scan.next());
					break;

				case 6 :
					System.out.println("Enter Email: ");
					arrayDetails.get(i).setEmail(scan.next());
					break;

				case 7 :
					System.out.println("Enter Zip: ");
					arrayDetails.get(i).setZip(scan.nextInt());
					break;
				case 8 :
					System.out.println("Enter Phone Number: ");
					arrayDetails.get(i).setPhoneNumber(scan.nextLong());
					break;
				default:
					System.out.println("Enter valid first name: ");
				}
				
			}
			else
				System.out.println("Edited list is: ");
			System.out.println(arrayDetails);
		}
	}

	public static void main (String[]args){

		AddressBook addressBook = new AddressBook();

		addressBook.addDetails();
		int i=0;
		while (i==0) {

			System.out.println("Enter your choice: ");
			System.out.println("1.Add Details.\n2.Edit Details.\n3.Exit");
			int choice = scan.nextInt();
			switch (choice) {
			case 1:
				addressBook.addDetails();
				break;
			case 2:
				addressBook.editDetails();
				break;
			case 3:
				System.out.println("Thank You We are Exiting");
				return;
			default:
				i = 1;
				System.out.println("Invalid");
				break;
			}
		}
	}
}
