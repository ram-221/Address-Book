package com.bridgelabz.addressbookuc1;

public class AddressBook {

	 public static void main(String[] args) {
		  
	        Contacts contact = new Contacts("Ramesh", "Malli", "Tarapur", "Vijayapur", 
	        		"Karnataka", "ram@gmail.com", 586202, "8431510221");
	        
	        System.out.println("Firstname --: " + contact.getFirstName());
	        System.out.println("Lastname ---: " + contact.getLastName());
	        System.out.println("Address-----: " + contact.getAddress());
	        System.out.println("City--------: " + contact.getCity());
	        System.out.println("State-------: " + contact.getState());
	        System.out.println("Email ------: " + contact.getEmail());
	        System.out.println("Zip --------: " + contact.getZip());
	        System.out.println("PhoneNumber : " + contact.getPhoneNumber());
	    }
}
