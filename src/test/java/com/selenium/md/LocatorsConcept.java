package com.selenium.md;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LocatorsConcept {

    static WebDriver driver;

    public static void main(String[] args) {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(options);
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().fullscreen();

        //1.
       /* WebElement userField = driver.findElement(By.id("user-name"));
        WebElement pwdField = driver.findElement(By.id("password"));

        userField.sendKeys("standard_user");
        pwdField.sendKeys("secret_sauce");*/

        //2.
       /* By userField = By.id("user-name");
        By pwdField = By.id("password");

        WebElement userField1 = driver.findElement(userField);
        WebElement pwdField1 = driver.findElement(pwdField);

        userField1.sendKeys("standard_user");
        pwdField1.sendKeys("secret_sauce");*/

        //3.
        /*By userField = By.id("user-name");
        By pwdField = By.id("password");

        getElement(userField).sendKeys("standard_user");
        getElement(pwdField).sendKeys("secret_sauce");
*/
        By userField = By.id("user-name");
        By pwdField = By.id("password");

        ElementUtil elementUtil  = new ElementUtil(driver);
        elementUtil.doSendKeys(userField,"standard_user");
        elementUtil.doSendKeys(pwdField,"secret_sauce");


       /* elementUtil.getElement("id","user-name");
        elementUtil.getElement("id","password");*/

    }


}
