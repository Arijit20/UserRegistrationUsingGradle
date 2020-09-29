package com.cg;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class UserRegistrationMain {
	
	Scanner in = new Scanner(System.in);
	
	public void firstNameValidator() {
		System.out.println("Enter your first name :");
        System.out.println("First letter should be capital and shuold have min 3 characters");
        String firstName = in.next();
		Pattern pattern = Pattern.compile("^([A-Z])[a-zA-Z]{2,}$");
		Matcher matcher = pattern.matcher(firstName);
		Boolean b = matcher.find();
		if(b)
        	System.out.println("First Name is Validated");
        else
        	System.out.println("Please enter the First name as mentioned");
	}
	public void lastNameValidator() {
		System.out.println("Enter your last name :");
        System.out.println("First letter should be capital and shuold have min 3 characters");
        String lastName = in.next();
		Pattern pattern = Pattern.compile("^([A-Z])[a-zA-Z]{2,}$");
		Matcher matcher = pattern.matcher(lastName);
		Boolean b = matcher.find();
	    if(b)
        	System.out.println("Last Name is Validated");
        else
        	System.out.println("Please enter the Last name as mentioned");
        }
	public void emailValidator() {
		System.out.println("Enter your Email :");
        String email = in.next();
		Pattern pattern = Pattern.compile("^([a-z]){1,}[a-z0-9]*([.+_-]){0,1}[0-9a-z]+(@){1}([0-9a-z]+)(\\.([a-z]){2,}){1}(\\.[a-z]{2,})?$");
		Matcher matcher = pattern.matcher(email);
		Boolean b = matcher.find();
	    if(b)
        	System.out.println("Email is Validated");
        else
        	System.out.println("Please enter the correct mail id");  
	}


	public static void main(String[] args) {
		System.out.println("Welcome to User Registration Page");
		UserRegistrationMain newUser = new UserRegistrationMain();
		//for first name
       newUser.firstNameValidator();
        //for last name
       newUser.lastNameValidator();
     //for email
       newUser.emailValidator();
	}
}
