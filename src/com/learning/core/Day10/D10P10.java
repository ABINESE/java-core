package com.learning.core.Day10;
import static org.junit.Assert.*;

import org.junit.Test;

public class D10P10 {

	UserProfile userProfile = new UserProfile();
	
	@Test
	public void userProfileTest() {
		assertEquals(true, userProfile.validateUserName("UserName"));
		assertEquals(false, userProfile.validateUserName("UserName1"));
		assertEquals(true, userProfile.validatePassword("Pswd1234"));
		assertEquals(false, userProfile.validatePassword("password"));
		assertEquals(false, userProfile.validatePassword("passwd"));
		assertEquals(false, userProfile.validatePassword("passwor@"));
	}
}
