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
	@Test
	public void givenEmailAddress_WhenProper_ShouldReturnTrue() {
		UserValidation userValidation =new UserValidation();
		boolean isValid = userValidation.validateEmail("chethanshetty777@gmail.com");
		Assert.assertTrue(isValid);
	}
	@Test
	public void givenEmailAddress_WhenNotProper_ShouldReturnFalse() {
		UserValidation userValidation =new UserValidation();
		boolean isValid = userValidation.validateEmail("chethanshetty777@gmail.com");
		Assert.assertFalse(isValid);
	}
	@Test
	public void givenMobileNumber_WhenProper_ShouldReturnTrue() {
		UserValidation userValidation =new UserValidation();
		boolean isValid = userValidation.validateMobileNumber("91 9798364309");
		Assert.assertTrue(isValid);
	}
	@Test
	public void givenMobileNumber_WhenNoSpace_ShouldReturnFalse() {
		UserValidation userValidation =new UserValidation();
		boolean isValid = userValidation.validateMobileNumber("919798364309");
		Assert.assertFalse(isValid);
	}
	@Test
	public void givenMobileNumber_WhenGreaterThanTenDigit_ShouldReturnFalse() {
		UserValidation userValidation =new UserValidation();
		boolean isValid = userValidation.validateMobileNumber("91 8659369652");
		Assert.assertFalse(isValid);
	}
	@Test
	public void givenMobileNumber_WhenLessThanTenDigit_ShouldReturnFalse() {
		UserValidation userValidation =new UserValidation();
		boolean isValid = userValidation.validateMobileNumber("91 85695623");
		Assert.assertFalse(isValid);
	}

}