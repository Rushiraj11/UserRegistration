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

}
