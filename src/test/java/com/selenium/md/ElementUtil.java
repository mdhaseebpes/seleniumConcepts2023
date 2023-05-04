package com.selenium.md;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ElementUtil {

    private  WebDriver driver;
    public ElementUtil(WebDriver driver) {
        this.driver=driver;
    }

    public  WebElement getElement(By locator){
        return driver.findElement(locator);
    }

    public  void doSendKeys(By locator, String value){
        driver.findElement(locator).sendKeys(value);
    }

    public By getBy(String locatorType , String locatorValue){
        By locator = null;
        switch (locatorType.toLowerCase()) {
            case "id":
                locator = By.id(locatorValue);
                break;

            case "name":
                locator = By.name(locatorValue);
                break;

            case "classname":
                locator = By.className(locatorValue);
                break;

            case "xpath":
                locator = By.xpath(locatorValue);
                break;

            case "cssselector":
                locator = By.cssSelector(locatorValue);
                break;

            case "linktext":
                locator = By.linkText(locatorValue);
                break;

            case "partiallinktext":
                locator = By.partialLinkText(locatorValue);
                break;

            case "tagname":
                locator = By.tagName(locatorValue);
                break;

            default:
                break;
        }
       return locator;

    }
}
