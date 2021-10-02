package com.bridgelabz.userregjunit;


import org.junit.Assert;
import org.junit.Test;
public class UserValidationTest {
	@Test
	public void givenFirstName_WhenProper_ShouldReturnTrue1() {

		UserValidation userValidator = new UserValidation();
		boolean isValid = userValidator.validateName("Chethan");
		boolean isValid1 = false;
		try {
			isValid1 = userValidator.validateName("Chethan");
		} catch (UserValidatorException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Assert.assertTrue(isValid1);

	}
	public void givenFirstName_WhenShort_ShouldReturnFalse1() {

		UserValidation userValidator = new UserValidation();
		boolean isValid = userValidator.validateName("Ch");
		boolean isValid1 = false;
		try {
			isValid1 = userValidator.validateName("Ch");
		} catch (UserValidatorException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Assert.assertFalse(isValid1);

	}
	public void givenFirstName_WhenFirstLetterNotCapital_ShouldReturnFalse() {

		UserValidation userValidator = new UserValidation();
		boolean isValid = userValidator.validateName("chethan");
		boolean isValid1 = false;
		try {
			isValid1 = userValidator.validateName("chethan");
		} catch (UserValidatorException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Assert.assertFalse(isValid1);

	}
	@Test
	public void givenFirstName_Empty_ShouldReturnFalse() {

		UserValidation userValidator = new UserValidation();
		boolean isValid = userValidator.validateName("");
		boolean isValid1 = false;
		try {
			isValid1 = userValidator.validateName("");
		} catch (UserValidatorException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Assert.assertFalse(isValid1);

	}
	@Test
	public void givenFirstName_WhenContainsSpecialCharacters_ShouldReturnFalse() {

		UserValidation userValidator = new UserValidation();
		boolean isValid = userValidator.validateName("Chethan@");
		boolean isValid1 = false;
		try {
			isValid1 = userValidator.validateName("Chethan@");
		} catch (UserValidatorException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Assert.assertFalse(isValid1);

	}
	@Test
	public void givenFirstName_WhenContainsNumbers_ShouldReturnFalse() {

		UserValidation userValidator = new UserValidation();
		boolean isValid = userValidator.validateName("Chethan123");
		boolean isValid1 = false;
		try {
			isValid1 = userValidator.validateName("Chethan123");
		} catch (UserValidatorException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Assert.assertFalse(isValid1);

	}
	@Test
	public void givenLastName_WhenProper_ShouldReturnTrue() {

		UserValidation userValidator = new UserValidation();
		boolean isValid = userValidator.validateName("Shetty");
		boolean isValid1 = false;
		try {
			isValid1 = userValidator.validateName("Shetty");
		} catch (UserValidatorException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Assert.assertTrue(isValid1);

	}
	@Test
	public void givenLastName_WhenShort_ShouldReturnFalse() {

		UserValidation userValidator = new UserValidation();
		boolean isValid = userValidator.validateName("Sh");
		boolean isValid1 = false;
		try {
			isValid1 = userValidator.validateName("Sh");
		} catch (UserValidatorException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Assert.assertFalse(isValid1);

	}
	@Test
	public void givenLastName_WhenFirstLetterNotCapital_ShouldReturnFalse() {

		UserValidation userValidator = new UserValidation();
		boolean isValid = userValidator.validateName("shetty");
		boolean isValid1 = false;
		try {
			isValid1 = userValidator.validateName("shetty");
		} catch (UserValidatorException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Assert.assertFalse(isValid1);

	}
	@Test
	public void givenLastName_WhenEmpty_ShouldReturnFalse() {

		UserValidation userValidator = new UserValidation();
		boolean isValid = userValidator.validateName("");
		boolean isValid1 = false;
		try {
			isValid1 = userValidator.validateName("");
		} catch (UserValidatorException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Assert.assertFalse(isValid1);

	}
	@Test
	public void givenLastName_WhenContainsSpecialCharacters_ShouldReturnFalse() {

		UserValidation userValidator = new UserValidation();
		boolean isValid = userValidator.validateName("Shetty@");
		boolean isValid1 = false;
		try {
			isValid1 = userValidator.validateName("Shetty@");
		} catch (UserValidatorException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Assert.assertFalse(isValid1);

	}
	@Test
	public void givenLastName_WhenContainsNumbers_ShouldReturnFalse() {

		UserValidation userValidator = new UserValidation();
		boolean isValid = userValidator.validateName("shetty123");
		boolean isValid1 = false;
		try {
			isValid1 = userValidator.validateName("shetty123");
		} catch (UserValidatorException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Assert.assertFalse(isValid1);

	}
	@Test
	public void givenEmail_WhenValid_ShouldReturnTrue1() {

		UserValidation userValidator = new UserValidation();
		boolean isValid = userValidator.validateEMail("abc@gmail.com");
		boolean isValid1 = false;
		try {
			isValid1 = userValidator.validateEMail("abc@gmail.com");
		} catch (UserValidatorException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Assert.assertTrue(isValid1);

	}
	public void givenEmail_WhenInValid_ShouldReturnFalse() {

		UserValidation userValidator = new UserValidation();
		boolean isValid = userValidator.validateEMail("abcgmail.com");
		boolean isValid1 = false;
		try {
			isValid1 = userValidator.validateEMail("abcgmail.com");
		} catch (UserValidatorException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Assert.assertFalse(isValid1);

	}
	@Test
	public void givenEmail_WhenEmpty_ShouldReturnFalse() {

		UserValidation userValidator = new UserValidation();
		boolean isValid = userValidator.validateEMail("");
		boolean isValid1 = false;
		try {
			isValid1 = userValidator.validateEMail("");
		} catch (UserValidatorException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Assert.assertFalse(isValid1);

	}
	@Test
	public void givenPhoneNumber_WhenValid_ShouldReturnTrue() {

		UserValidation userValidator = new UserValidation();
		boolean isValid = userValidator.validateMobileNumber("91 9191123498");
		boolean isValid1 = false;
		try {
			isValid1 = userValidator.validateMobileNumber("91 9191123498");
		} catch (UserValidatorException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Assert.assertTrue(isValid1);

	}
	@Test
	public void givenPhoneNumber_WhenInValid_ShouldReturnFalse() {

		UserValidation userValidator = new UserValidation();
		boolean isValid = userValidator.validateMobileNumber("123456789");
		boolean isValid1 = false;
		try {
			isValid1 = userValidator.validateMobileNumber("123456789");
		} catch (UserValidatorException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Assert.assertFalse(isValid1);

	}
	@Test
	public void givenPhoneNumber_WhenEmpty_ShouldReturnFalse() {

		UserValidation userValidator = new UserValidation();
		boolean isValid = userValidator.validateMobileNumber("");
		boolean isValid1 = false;
		try {
			isValid1 = userValidator.validateMobileNumber("");
		} catch (UserValidatorException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Assert.assertFalse(isValid1);

	}
	@Test
	public void givenPassword_WhenValid_ShouldReturnTrue() 
	{

		UserValidation userValidator = new UserValidation();
		boolean isValid=userValidator.validatePassword("Abc12@we3");
		boolean isValid1 = false;
		try {
			isValid1 = userValidator.validatePassword("Abc12@we3");
		} catch (UserValidatorException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Assert.assertTrue(isValid1);
	}
	@Test
	public void givenPassword_WhenLessThanEightCharacters_ShouldReturnFalse()
	{
		UserValidation userValidator = new UserValidation();
		boolean isValid=userValidator.validatePassword("A3bc1@");
		boolean isValid1 = false;
		try {
			isValid1 = userValidator.validatePassword("A3bc1@");
		} catch (UserValidatorException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Assert.assertFalse(isValid1);

	}
	@Test
	public void givenPassword_WhenNoUpperCaseLetters_ShouldReturnFalse()
	{
		UserValidation userValidator = new UserValidation();
		boolean isValid=userValidator.validatePassword("azaz3bc1@");
		boolean isValid1 = false;
		try {
			isValid1 = userValidator.validatePassword("azaz3bc1@");
		} catch (UserValidatorException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Assert.assertFalse(isValid1);

	}
	@Test
	public void givenPassword_WhenNoNumbers_ShouldReturnFalse()
	{
		UserValidation userValidator = new UserValidation();
		boolean isValid=userValidator.validatePassword("Abcdef@ghij");
		boolean isValid1 = false;
		try {
			isValid1 = userValidator.validatePassword("Abcdef@ghij");
		} catch (UserValidatorException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Assert.assertFalse(isValid1);

	}
	@Test
	public void givenPassword_WhenNoSpecialCharacters_ShouldReturnFalse()
	{
		UserValidation userValidator = new UserValidation();
		boolean isValid=userValidator.validatePassword("Abc123456av");
		boolean isValid1 = false;
		try {
			isValid1 = userValidator.validatePassword("Abc123456av");
		} catch (UserValidatorException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Assert.assertFalse(isValid1);

	}
	@Test
	public void givenPassword_WhenMoreThanOneSpecialCharacters_ShouldReturnFalse()
	{
		UserValidation userValidator = new UserValidation();
		boolean isValid=userValidator.validatePassword("Abc12345@@@");
		boolean isValid1 = false;
		try {
			isValid1 = userValidator.validatePassword("Abc12345@@@");
		} catch (UserValidatorException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Assert.assertFalse(isValid1);

	}
	@Test
	public void givenPassword_WhenEmpty_ShouldReturnFalse()
	{
		UserValidation userValidator = new UserValidation();
		boolean isValid=userValidator.validatePassword("");
		boolean isValid1 = false;
		try {
			isValid1 = userValidator.validatePassword("");
		} catch (UserValidatorException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Assert.assertFalse(isValid1);

	}
}