package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static utilities.DriverSetUp.getDriver;

public class BasePage {
    public WebElement getElement(By locator){
        return getDriver().findElement(locator);
    }

    public void writeOnElement(By locator, String inputText){
        getElement(locator).clear();
        getElement(locator).sendKeys(inputText);
    }

    public void clickOnElement(By locator){
        //getDriver().findElement(locator).click();
        getElement(locator).click();
    }
}
