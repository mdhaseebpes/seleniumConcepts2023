package com.selenium.md;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.sql.SQLOutput;

public class FrameHandle {

    static WebDriver driver;

    public static void main(String[] args) {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(options);

        driver.get("http://londonfreelance.org/courses/frames/index.html");

        //driver.switchTo().frame(2); //By index
        //driver.switchTo().frame("main"); // By name
        driver.switchTo().frame(driver.findElement(By.name("main"))); // By WebElement

        //frame is also a webElement
        //frame has its own HTML DOM : #document
        // html tags : frame ,iframe

       String header = driver.findElement(By.xpath("/html/body/h2")).getText();
        System.out.println(header);

        driver.switchTo().parentFrame();  // available from Selenium 4.X
        //driver.switchTo().defaultContent(); // navigates to main page or parent frame
    }
}
