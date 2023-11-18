package pages;

import org.openqa.selenium.By;

public class SignUpPage extends BasePage {
    public String signUpUrl = "https://www.rokomari.com/login";
    public By signInGoogle = By.xpath("//button[normalize-space()='Google']");
    public By EmailOrPhone = By.xpath("//input[@id='identifierId']");
    public By nextEmailButton = By.xpath("//span[normalize-space()='Next']");
    public By passwordField = By.xpath("//input[@name='Passwd']");
    public By nextPasswordButton = By.xpath("//span[normalize-space()='Next']");

   // public By emailField = By.xpath("input[placeholder='Email or phone']");
   // public By nextButton = By.xpath("//button[@id='js--btn-next']");

}
