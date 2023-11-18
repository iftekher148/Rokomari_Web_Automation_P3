package testcases;

import org.testng.annotations.Test;
import pages.HomePage;
import utilities.DriverSetUp;

public class TestHomePage extends DriverSetUp {
    HomePage homePage = new HomePage();
    @Test
    public void testSignUpFunction(){
        getDriver().get(homePage.baseUrl);
       // signUp.clickOnElement(signUp.signInButton);
        homePage.userSignUpUsingGoogle();
    }

}
