package com.cg;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class UserRegistrationMain {

	Scanner in = new Scanner(System.in);

	public boolean firstNameValidator(String firstName) throws UserRegistrationException {
		//System.out.println("Enter your first name :");
		//System.out.println("First letter should be capital and should have min 3 characters");
		//String firstName = in.next();
		Pattern pattern = Pattern.compile("^([A-Z])[a-zA-Z]{2,}$");
		Matcher matcher = pattern.matcher(firstName);
		Boolean b = matcher.find();
		/*if (b)
			System.out.println("First Name is Validated");
		else
			System.out.println("Please enter the First name as mentioned");
			*/
		if(!b)
			throw new UserRegistrationException ("Please enter proper firstname");
		return b;
	}

	public boolean lastNameValidator(String lastName) throws UserRegistrationException {
		//System.out.println("Enter your last name :");
		//System.out.println("First letter should be capital and should have min 3 characters");
		//String lastName = in.next();
		Pattern pattern = Pattern.compile("^([A-Z])[a-zA-Z]{2,}$");
		Matcher matcher = pattern.matcher(lastName);
		Boolean b = matcher.find();
		/*if (b)
			System.out.println("Last Name is Validated");
		else
			System.out.println("Please enter the Last name as mentioned");
			*/
		if(!b)
			throw new UserRegistrationException ("Please enter proper lastname");
		return b;
	}

	public boolean emailValidator(String email) throws UserRegistrationException {
		//System.out.println("Enter your Email :");
		//String email = in.next();
		Pattern pattern = Pattern.compile(
				"^([a-z]){1,}[a-z0-9]*([.+_-]){0,1}[0-9a-z]+(@){1}([0-9a-z]+)(\\.([a-z]){2,}){1}(\\.[a-z]{2,})?$");
		Matcher matcher = pattern.matcher(email);
		Boolean b = matcher.find();
		/*if (b)
			System.out.println("Email is Validated");
		else
			System.out.println("Please enter the correct mail id");
		//in.hasNextLine();
		 */
		if(!b)
			throw new UserRegistrationException ("Please enter proper email");
		return b;
	}

	public boolean mobileNoValidator(String mobileNo) throws UserRegistrationException {
		//System.out.println("Enter your Mobile No :");
		//String mobileNo = in.nextLine();
		Pattern pattern = Pattern.compile("^\\d{2} [1-9]\\d{9}$");
		Matcher matcher = pattern.matcher(mobileNo);
		Boolean b = matcher.find();
		/*if (b)
			System.out.println("Mobile No is Validated");
		else
			System.out.println("Please enter the correct mobile no");
			*/
		if(!b)
			throw new UserRegistrationException ("Please enter proper mobile no");
		return b;
	}

	public boolean passwordValidator(String password) throws UserRegistrationException {
		//System.out.println("Enter your Password :");
		//String password = in.next();
		Pattern pattern = Pattern.compile("^(?=.*\\d)(?=.*[A-Z])(?=.*\\W)(?!.*\\W\\w*\\W)(?!.*\\s).{8,}$");
		Matcher matcher = pattern.matcher(password);
		Boolean b = matcher.find();
		/*if (b)
			System.out.println("Password is Validated");
		else
			System.out.println("Please enter the correct password");
			*/
		if(!b)
			throw new UserRegistrationException ("Please enter proper password");
		return b;
	}

	public static void main(String[] args) {
		System.out.println("Welcome to User Registration Page");
	/*	UserRegistrationMain newUser = new UserRegistrationMain();
		newUser.firstNameValidator();
		newUser.lastNameValidator();
		newUser.emailValidator();
		newUser.mobileNoValidator();
		newUser.passwordValidator();
		*/
	}
}
