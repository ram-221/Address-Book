package com.bridgelabz.addressbookuc6;

public class Contacts {

	 private String firstName, lastName, address, city, state, email,phoneNumber;
	    private int zip;
	    

	    public String getFirstName() {
	        return firstName;
	    }

	    public void setFirstName(String firstName) {
	        this.firstName = firstName;
	    }

	    public String getLastName() {
	        return lastName;
	    }

	    public void setLastName(String lastName) {
	        this.lastName = lastName;
	    }

	    public String getAddress() {
	        return address;
	    }

	    public void setAddress(String address) {
	        this.address = address;
	    }

	    public String getCity() {
	        return city;
	    }

	    public void setCity(String city) {
	        this.city = city;
	    }

	    public String getState() {
	        return state;
	    }

	    public void setState(String state) {
	        this.state = state;
	    }

	    public String getEmail() {
	        return email;
	    }

	    public void setEmail(String email) {
	        this.email = email;
	    }

	    public int getZip() {
	        return zip;
	    }

	    public void setZip(int zip) {
	        this.zip = zip;
	    }

	    public String getPhoneNumber() {
	        return phoneNumber;
	    }

	    public void setPhoneNumber(String phoneNumber) {
	        this.phoneNumber = phoneNumber;
	    }

	    public String toString() {

	        return "Contacts = {"+
	        		"firstName ='"+ firstName +'\''+
	        		",lastName ='"+ lastName + '\''+
	        		",address ='"+ address + '\''+
	        		",city ='"+ city +'\''+
	        		",state ='" + state +'\''+
	        		",email ='" + email +'\''+
	        		",zip ='" +zip +'\''+
	        		",phoneNumber ='" +phoneNumber +'}';

	    }
}
