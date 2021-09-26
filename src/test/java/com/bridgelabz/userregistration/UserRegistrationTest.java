package com.bridgelabz.userregistration;
import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {

    UserRegistration userRegistration = new UserRegistration();


    @Test
    public void givenFirstName_WhenInFormat_ShouldReturnTrue() throws UserRegistrationException {
        boolean result = userRegistration.validateFirstName.validate("Rushiraj");
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenFirstName_WhenOurOfFormat_ShouldReturnFlase() throws UserRegistrationException {
        boolean result = userRegistration.validateFirstName.validate("rushiraj");
        Assert.assertEquals(false, result);
    }

    @Test
    public void givenLastName_WhenInFormat_ShouldReturnTrue() throws UserRegistrationException {
        boolean result = userRegistration.validateLastName.validate("Ghatge");
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenLastName_WhenOurOfFormat_ShouldReturnFalse() throws UserRegistrationException {
        boolean result = userRegistration.validateLastName.validate("ghatge");
        Assert.assertEquals(false, result);

    }

    @Test
    public void givenEmail_WhenInFormat_ShouldReturnTrue() throws UserRegistrationException {
        boolean result = userRegistration.validateEmailId.validate("abc@gmail.com");
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenEmail_WhenOurOfFormat_ShouldReturnFalse() throws UserRegistrationException {
        boolean result = userRegistration.validateEmail.validate("abc#/@gmail.com");
        Assert.assertEquals(false, result);
    }

    @Test
    public void givenPhoneNumber_WhenInFormat_ShouldReturnTrue() throws UserRegistrationException {
        boolean result = userRegistration.validatePhoneNumber.validate("91 9809874523");
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenPhoneNumber_WhenOurOfFormat_ShouldReturnFlase() throws UserRegistrationException {
        boolean result = userRegistration.validatePhoneNumber.validate("+91 99660315270");
        Assert.assertEquals(false, result);
    }

    @Test
    public void givenPassword_WhenInFormat_ShouldReturnTrue() throws UserRegistrationException {
        boolean result = userRegistration.validatePassword1.validate("aklmojmu");
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenPassword_WhenOurOfFormat_ShouldReturnFalse() throws UserRegistrationException {
        boolean result = userRegistration.validatePassword1.validate("abARd");
        Assert.assertEquals(false, result);
    }

    @Test
    public void givenPasswordRule2_WhenInFormat_ShouldReturnTrue() throws UserRegistrationException {
        boolean result = userRegistration.validatePassword2.validate("Abcdefghij");
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenPasswordRule2_WhenOurOfFormat_ShouldReturnFalse() throws UserRegistrationException {
        boolean result = userRegistration.validatePassword2.validate("abcdefghij");
        Assert.assertEquals(false, result);
    }

    @Test
    public void givenPasswordRule3_WhenInFormat_ShouldReturnTrue() throws UserRegistrationException {
        boolean result = userRegistration.validatePassword3.validate("RUfgioa22");
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenPasswordRule3_WhenOurOfFormat_ShouldReturnFalse() throws UserRegistrationException {
        boolean result = userRegistration.validatePassword3.validate("hkishK");
        Assert.assertEquals(false, result);
    }

    @Test
    public void givenPasswordRule4_WhenInFormat_ShouldReturnTrue() throws UserRegistrationException {
        boolean result = userRegistration.validatePassword4.validate("Mikidhie@22");
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenPasswordRule4_WhenOurOfFormat_ShouldReturnFalse() throws UserRegistrationException {
        boolean result = userRegistration.validatePassword4.validate("mikdhos");
        Assert.assertEquals(false, result);
    }

    @Test
    public void givenEmail1_WhenProper_ShouldReturnTrue() throws UserRegistrationException {
        boolean result = userRegistration.validateEmailId.validate("abc.100@abc.com.au");
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenEmail1_WhenNotProper_ShouldReturnFalse() throws UserRegistrationException {
        boolean result = userRegistration.validateEmailId.validate("abc()*@gmail.com");
        Assert.assertEquals(false, result);

    }

    @Test
    public void givenMessage_WhenHappy_ShouldReturnEntrySuccessful() {
        String result = MoodAnalyser.analyseMood("User is Happy");
        Assert.assertEquals("Entry Successful", result);
    }

    @Test
    public void givenEmail2_WhenNotProper_ShouldReturnEntryFailed() {
        String result = MoodAnalyser.analyseMood("User is Sad");
        Assert.assertEquals("Entry Failed", result);
    }

}
