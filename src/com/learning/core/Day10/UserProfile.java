package com.learning.core.Day10;

public class UserProfile {
 int  maxLength = 8;

 public boolean validateUserName(String name) {
	 boolean valid = false;
	 String regex = "[a-zA-Z]+";
	 if(name.matches(regex))
		 valid = true;
	 return valid;
 } 
 public  boolean validatePassword(String password) {
	 boolean valid = false;
	 if(password.length()==maxLength && checkPassword(password))
		 valid = true;
	 return valid;
 }
 
 public  boolean checkPassword(String password) {
	 boolean digitValid = false;
	 boolean charValid = false;
	 for(int i=0; i<password.length(); i++) {
		 if(password.charAt(i)>= '0' && password.charAt(i)<='9')
			 digitValid = true;
		 else if((password.charAt(i)>='A' && password.charAt(i)<='Z')|| password.charAt(i)>='a' && password.charAt(i)<='z')
	         charValid = true;
		 else
			 return false;
	 }
	 
	 return digitValid && charValid;
 }
}
