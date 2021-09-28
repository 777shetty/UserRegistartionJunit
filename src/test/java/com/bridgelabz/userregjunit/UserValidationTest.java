package com.bridgelabz.userregjunit;

import org.junit.Assert;
import org.junit.Test;
public class UserValidationTest {
	@Test
	public void givenFirstName_WhenProper_ShouldReturnTrue() {
		UserValidation userValidation =new UserValidation();
		boolean isValid = userValidation.validateName("Chethan");
		Assert.assertTrue(isValid);
	}
	@Test
	public void givenFirstName_WhenFirstLetterIsSmall_ShouldReturnFalse() {
		UserValidation userValidation =new UserValidation();
		boolean isNotValid = userValidation.validateName("chethan");
		Assert.assertFalse(isNotValid);
	}
	@Test
	public void givneFirstName_WhenLesserThanThreeCharcaters_ShouldReturnFalse() {
		UserValidation userValidation = new UserValidation();
		boolean isNotValid = userValidation.validateName("ch");
		Assert.assertFalse(isNotValid);
	}
	@Test
	public void givenLastName_WhenProper_ShouldReturnTrue() {
		UserValidation userValidation =new UserValidation();
		boolean isValid = userValidation.validateName("Shetty");
		Assert.assertTrue(isValid);
	}
	@Test
	public void givenLastName_WhenFirstLetterIsSmall_ShouldReturnFalse() {
		UserValidation userValidation =new UserValidation();
		boolean isNotValid = userValidation.validateName("shetty");
		Assert.assertFalse(isNotValid);
	}
	@Test
	public void givneLastName_WhenLesserThanThreeCharcaters_ShouldReturnFalse() {
		UserValidation userValidation = new UserValidation();
		boolean isNotValid = userValidation.validateName("sh");
		Assert.assertFalse(isNotValid);
	}

}