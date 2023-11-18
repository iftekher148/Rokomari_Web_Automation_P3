package testcases;

import org.testng.annotations.Test;
import pages.HomePage;
import pages.SignUpPage;
import utilities.DriverSetUp;

public class TestSignUpPage extends DriverSetUp {
   SignUpPage signUpPage = new SignUpPage();
   HomePage homePage = new HomePage();

   @Test
    public void testSignUpPage(){
      getDriver().get(homePage.baseUrl);
      homePage.clickOnElement(homePage.signInButton);
      signUpPage.clickOnElement(signUpPage.signInGoogle);
      signUpPage.writeOnElement(signUpPage.EmailOrPhone,"polokhack123@gmail.com");
      signUpPage.clickOnElement(signUpPage.nextEmailButton);
      signUpPage.writeOnElement(signUpPage.passwordField,"polok123abc");
      signUpPage.clickOnElement(signUpPage.nextPasswordButton);
       //getDriver().get(signUpPage.signUpUrl);
      // signUpPage.clickOnElement(signUpPage.signInGoogle);
//       signUpPage.writeOnElement(signUpPage.emailField,"istaktest123@gmail.com");
//       signUpPage.clickOnElement(signUpPage.nextButton);
   }
}
