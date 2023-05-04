package com.selenium.md;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.sql.SQLOutput;

public class WebDriverBasics {

    //automation steps + validation points/check points/act vs exp result /assertions == Automation testing
    public static void main(String[] args) {

        // 4.6 and above
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        System.setProperty("webdriver.chrome.driver","./Driver/chromedriver");


        WebDriver driver = new ChromeDriver(options);
        driver.get("https://www.google.com");
       String title = driver.getTitle();

       if(title.equalsIgnoreCase("Google")){
           System.out.println("correct title");
       }else{
           System.out.println("Incorrect title");
       }

        System.out.println(driver.getCurrentUrl().contains("google"));
        System.out.println(driver.getPageSource());

        driver.quit();
    }
}
