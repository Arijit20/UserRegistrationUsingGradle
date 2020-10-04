 package com.cg;

import org.junit.Test;

import org.junit.Assert;
import com.cg.IUserValidator;
import com.cg.UserRegistrationMain;

public class UserRegistrationTesting {
	UserRegistrationMain user = new UserRegistrationMain();
    
	 @Test
	    public void givenFirstName_Proper_ReturnTrue() {
	        try {
	         Assert.assertEquals(true, user.firstNameValidator.validate("Arijit"));
	        }catch(UserRegistrationException e) {
	        	Assert.assertEquals("Please enter proper firstname", e.getMessage());
	        }
	 }
	 @Test
	    public void givenFirstName_Improper_ReturnFalse() {
	        try {
	      Assert.assertEquals(false, user.firstNameValidator.validate("arijit"));
	        }catch(UserRegistrationException e) {
	        	Assert.assertEquals("Please enter proper firstname", e.getMessage());
	        }
	 }
	 @Test
	    public void givenLastName_Proper_ReturnTrue() {
	        try {
	        Assert.assertEquals(true, user.lastNameValidator.validate("Dey"));
	        }catch(UserRegistrationException e) {
	        	Assert.assertEquals("Please enter proper lastname", e.getMessage());
	        }
	 }
	 @Test
	    public void givenLastName_Improper_ReturnFalse() {
	        try {
	        Assert.assertEquals(false, user.lastNameValidator.validate("dey"));
	        }catch(UserRegistrationException e) {
	        	Assert.assertEquals("Please enter proper lastname", e.getMessage());
	        }
	 }
	 @Test
	    public void givenEmail_Proper_ReturnTrue() {
	        try {
	        Assert.assertEquals(true, user.emailValidator.validate("arijit.dey@yahoo.co.in"));
	        }catch(UserRegistrationException e) {
	        	Assert.assertEquals("Please enter proper email", e.getMessage());
	        }
	 }
	 @Test
	    public void givenEmail_Imroper_ReturnFalse() {
	        try {
	        Assert.assertEquals(false, user.emailValidator.validate("arijit"));
	        }catch(UserRegistrationException e) {
	        	Assert.assertEquals("Please enter proper email", e.getMessage());
	        }
	 }
	 @Test
	    public void givenPassword_Proper_ReturnTrue() {
	        try {
	        Assert.assertEquals(true, user.passwordValidator.validate("Arijit124@"));
	        }catch(UserRegistrationException e) {
	        	Assert.assertEquals("Please enter proper password", e.getMessage());
	        }
	 }
	 @Test
	    public void givenPassword_Imroper_ReturnFalse() {
	        try {
	        Assert.assertEquals(false, user.passwordValidator.validate("abcd"));
	        }catch(UserRegistrationException e) {
	        	Assert.assertEquals("Please enter proper password", e.getMessage());
	        }
	 }
	 @Test
	    public void givenMobileNo_Proper_ReturnTrue() {
	        try {
	        Assert.assertEquals(true, user.mobileNoValidator.validate("91 1234567895"));
	        }catch(UserRegistrationException e) {
	        	Assert.assertEquals("Please enter proper mobile no", e.getMessage());
	        }
	 }
	 @Test
	    public void givenMobileNo_Improper_ReturnFalse() {
	        try {
	        Assert.assertEquals(false, user.mobileNoValidator.validate("12345"));
	        }catch(UserRegistrationException e) {
	        	Assert.assertEquals("Please enter proper mobile no", e.getMessage());
	        }
	 }
	
}
