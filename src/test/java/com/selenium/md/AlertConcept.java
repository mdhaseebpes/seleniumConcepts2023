package com.selenium.md;

import io.github.bonigarcia.wdm.WebDriverManager;
import jdk.nashorn.internal.scripts.JS;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

public class AlertConcept {
     static WebDriver driver;

     public static void simpleAlert(WebDriver driver){
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");

        driver.manage().window().fullscreen();

        driver.findElement(By.name("proceed")).click();

        Alert alert = driver.switchTo().alert();

        //Exception if there is no alert : NoAlertPresentException

        String alertText = alert.getText();
        System.out.println(alertText);

        //alert.sendKeys("testing");
        alert.accept();

        // alert.dismiss();
    }

    public static  void heroAlert(WebDriver driver){
         driver.get("https://the-internet.herokuapp.com/javascript_alerts");
         driver.findElement(By.xpath("//button[.='Click for JS Alert']")).click();
         Alert alert = driver.switchTo().alert();
         System.out.println(alert.getText());
         alert.accept();

        WebElement result = driver.findElement(By.id("result"));

        System.out.println(result.getText());
        Assert.assertEquals(result.getText(),"You successfully clicked an alert");

        System.out.println("----------");
        driver.findElement(By.xpath("//button[.='Click for JS Confirm']")).click();
        System.out.println(alert.getText());
        alert.dismiss();

        System.out.println(result.getText());
        Assert.assertEquals(result.getText(),"You clicked: Cancel");

        System.out.println("------------");
        driver.findElement(By.xpath("//button[.='Click for JS Prompt']")).click();
        System.out.println(alert.getText());
        alert.sendKeys("testing");
        alert.accept();

        System.out.println(result.getText());
        Assert.assertEquals(result.getText(),"You entered: testing");


    }

    public static void main(String[] args) {
      ChromeOptions options = new ChromeOptions();
      options.addArguments("--remote-allow-origins=*");

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(options);

       // simpleAlert(driver);

        heroAlert(driver);

        driver.quit();

    }
}
