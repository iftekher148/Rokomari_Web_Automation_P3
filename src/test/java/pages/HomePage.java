package pages;

import org.openqa.selenium.By;

public class HomePage extends BasePage {
    public String baseUrl = "https://www.rokomari.com/";
    public By signInButton = By.xpath("//a[normalize-space()='Sign in']");
    public By emailField = By.xpath("input[placeholder='Email or phone']");
    public By nextButton = By.xpath("//button[@id='js--btn-next']");

    public void userSignUpUsingGoogle(){
        clickOnElement(signInButton);
        //clickOnElement(signInGoogle);
    }

}
