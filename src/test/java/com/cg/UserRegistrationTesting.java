 package com.cg;

import org.junit.Test;
import org.junit.Assert;

public class UserRegistrationTesting {
    
	 @Test
	    public void givenFirstName_Proper_ReturnTrue() {
	        UserRegistrationMain user = new UserRegistrationMain();
	        try {
	        boolean result = user.firstNameValidator("Arijit");
	        Assert.assertTrue(true);
	        }catch(UserRegistrationException e) {
	        	Assert.assertEquals("Please enter proper fname", e.getMessage());
	        }
	 }
	 @Test
	    public void givenFirstName_Improper_ReturnFalse() {
	        UserRegistrationMain user = new UserRegistrationMain();
	        try {
	        boolean result = user.firstNameValidator("arijit");
	        Assert.assertTrue(true);
	        }catch(UserRegistrationException e) {
	        	Assert.assertEquals("Please enter proper firstname", e.getMessage());
	        }
	 }
	 @Test
	    public void givenLastName_Proper_ReturnTrue() {
	        UserRegistrationMain user = new UserRegistrationMain();
	        try {
	        boolean result = user.lastNameValidator("Dey");
	        Assert.assertTrue(true);
	        }catch(UserRegistrationException e) {
	        	Assert.assertEquals("Please enter proper lastname", e.getMessage());
	        }
	 }
	 @Test
	    public void givenLastName_Improper_ReturnFalse() {
	        UserRegistrationMain user = new UserRegistrationMain();
	        try {
	        boolean result = user.lastNameValidator("dey");
	        Assert.assertTrue(true);
	        }catch(UserRegistrationException e) {
	        	Assert.assertEquals("Please enter proper lastname", e.getMessage());
	        }
	 }
	 @Test
	    public void givenEmail_Proper_ReturnTrue() {
	        UserRegistrationMain user = new UserRegistrationMain();
	        try {
	        boolean result = user.emailValidator("arijit.dey@yahoo.co.in");
	        Assert.assertTrue(true);
	        }catch(UserRegistrationException e) {
	        	Assert.assertEquals("Please enter proper email", e.getMessage());
	        }
	 }
	 @Test
	    public void givenEmail_Imroper_ReturnFalse() {
	        UserRegistrationMain user = new UserRegistrationMain();
	        try {
	        boolean result = user.emailValidator("arijit");
	        Assert.assertTrue(true);
	        }catch(UserRegistrationException e) {
	        	Assert.assertEquals("Please enter proper email", e.getMessage());
	        }
	 }
	 @Test
	    public void givenPassword_Proper_ReturnTrue() {
	        UserRegistrationMain user = new UserRegistrationMain();
	        try {
	        boolean result = user.passwordValidator("Arijit124@");
	        Assert.assertTrue(true);
	        }catch(UserRegistrationException e) {
	        	Assert.assertEquals("Please enter proper password", e.getMessage());
	        }
	 }
	 @Test
	    public void givenPassword_Imroper_ReturnFalse() {
	        UserRegistrationMain user = new UserRegistrationMain();
	        try {
	        boolean result = user.passwordValidator("dey");
	        Assert.assertTrue(true);
	        }catch(UserRegistrationException e) {
	        	Assert.assertEquals("Please enter proper password", e.getMessage());
	        }
	 }
	 @Test
	    public void givenMobileNo_Proper_ReturnTrue() {
	        UserRegistrationMain user = new UserRegistrationMain();
	        try {
	        boolean result = user.mobileNoValidator("91 1234567895");
	        Assert.assertTrue(true);
	        }catch(UserRegistrationException e) {
	        	Assert.assertEquals("Please enter proper mobile no", e.getMessage());
	        }
	 }
	 @Test
	    public void givenMobileNo_Improper_ReturnFalse() {
	        UserRegistrationMain user = new UserRegistrationMain();
	        try {
	        boolean result = user.mobileNoValidator("12345");
	        Assert.assertTrue(true);
	        }catch(UserRegistrationException e) {
	        	Assert.assertEquals("Please enter proper mobile no", e.getMessage());
	        }
	 }
	 /*
	  @Test
	    public void givenFirstName_Proper_ReturnTrue() {
	        UserRegistrationMain user = new UserRegistrationMain();
	        boolean result = user.firstNameValidator("Arijit");
	        Assert.assertTrue(true);
	    }
	 @Test
	    public void givenFirstName_Improper_ReturnFalse() {
	        UserRegistrationMain user = new UserRegistrationMain();
	        boolean result = user.firstNameValidator("arijit");
	        Assert.assertFalse(false);
	    }
	 @Test
	    public void givenLastName_Proper_ReturnTrue() {
	        UserRegistrationMain user = new UserRegistrationMain();
	        boolean result = user.lastNameValidator("Dey");
	        Assert.assertTrue(true);
	    }
	 @Test
	    public void givenLastName_Improper_ReturnFalse() {
	        UserRegistrationMain user = new UserRegistrationMain();
	        boolean result = user.lastNameValidator("dey");
	        Assert.assertFalse(false);
	    }
	 @Test
	    public void givenEmail_Proper_ReturnTruee() {
	        UserRegistrationMain user = new UserRegistrationMain();
	        boolean result = user.emailValidator("arijit.dey@yahoo.co.in");
	        Assert.assertTrue(true);
	    }
	 @Test
	    public void givenEmail_Improper_ReturnFalse() {
	        UserRegistrationMain user = new UserRegistrationMain();
	        boolean result = user.emailValidator("arijit");
	        Assert.assertFalse(false);
	    }
	 @Test
	    public void givenPassword_Proper_ReturnTrue() {
	        UserRegistrationMain user = new UserRegistrationMain();
	        boolean result = user.passwordValidator("Arijit124@");
	        Assert.assertTrue(true);
	    }
	 @Test
	    public void givenPassword_Improper_ReturnFalse() {
	        UserRegistrationMain user = new UserRegistrationMain();
	        boolean result = user.passwordValidator("dey");
	        Assert.assertFalse(false);
	    }
	 @Test
	    public void givenMobileNo_Proper_ReturnTrue() {
	        UserRegistrationMain user = new UserRegistrationMain();
	        boolean result = user.mobileNoValidator("91 1234567895");
	        Assert.assertTrue(true);
	    }
	 @Test
	    public void givenMobileNo_Improper_ReturnFalse() {
	        UserRegistrationMain user = new UserRegistrationMain();
	        boolean result = user.firstNameValidator("12345");
	        Assert.assertFalse(false);
	    }
	 */
}
