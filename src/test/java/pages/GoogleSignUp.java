package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class GoogleSignUp {
    @Test
    public void testGoogleSignUp() throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
//        driver.get("https://gmail.google.com/");
//        WebElement email= driver.findElement(By.xpath("//input[@id='identifierId']"));
//        email.sendKeys("polokhack123@gmail.com");
//        driver.findElement(By.xpath("//span[normalize-space()='Next']")).click();

        driver.get("https://www.google.com/gmail/about/");
        driver.findElement(By.xpath("//a[normalize-space()='Sign in']")).click();
        WebElement email = driver.findElement(By.xpath("//input[@id='identifierId']"));
        email.sendKeys("pujatest123myself@gmail.com");
        driver.findElement(By.xpath("//span[normalize-space()='Next']")).click();
        WebElement password = driver.findElement(By.xpath("//input[@name='Passwd']"));
        password.sendKeys("puja123abc");
        driver.findElement(By.xpath("//span[normalize-space()='Next']")).click();
        Thread.sleep(2000);
    }
}
