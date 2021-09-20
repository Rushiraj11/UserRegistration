package com.bridgelabz.userregistration;
import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {

    UserRegistration userRegistration = new UserRegistration();


    @Test
    public void givenFirstName_WhenInFormat_ShouldReturnTrue() {
        boolean result = userRegistration.firstName("Rushiraj");
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenFirstName_WhenOurOfFormat_ShouldReturnFlase() {
        boolean result = userRegistration.firstName("rushiraj");
        Assert.assertEquals(false, result);
    }

    @Test
    public void givenLastName_WhenInFormat_ShouldReturnTrue() {
        boolean result = userRegistration.lastName("Ghatge");
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenLastName_WhenOurOfFormat_ShouldReturnFalse() {
        boolean result = userRegistration.lastName("ghatge");
        Assert.assertEquals(false, result);

    }

    @Test
    public void givenEmail_WhenInFormat_ShouldReturnTrue() {
        boolean result = userRegistration.emailAddress("abc@gmail.com");
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenEmail_WhenOurOfFormat_ShouldReturnFalse() {
        boolean result = userRegistration.emailAddress("abc#/@gmail.com");
        Assert.assertEquals(false, result);
    }

    @Test
    public void givenPhoneNumber_WhenInFormat_ShouldReturnTrue() {
        boolean result = userRegistration.phoneNumber("91 9809874523");
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenPhoneNumber_WhenOurOfFormat_ShouldReturnFlase() {
        boolean result = userRegistration.phoneNumber("+91 99660315270");
        Assert.assertEquals(false, result);
    }

    @Test
    public void givenPassword_WhenInFormat_ShouldReturnTrue() {
        boolean result = userRegistration.passwordRule1("aklmojmu");
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenPassword_WhenOurOfFormat_ShouldReturnFalse() {
        boolean result = userRegistration.passwordRule1("abARd");
        Assert.assertEquals(false, result);
    }
}
