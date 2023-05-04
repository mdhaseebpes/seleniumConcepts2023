package seleniumsessions;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class TopCastingOptions {

	public static void main(String[] args) {

		//1. valid
		// WebDriver driver = new ChromeDriver();
		
		//2. valid
		//WebDriver driver = new FirefoxDriver();
		
		//3. valid -- remote execution
		//WebDriver driver = new RemoteWebDriver(url, caps);
		
		//4. not useful
		//SearchContext driver = new ChromeDriver();
		
		//5. not useful
		//SearchContext driver = new RemoteWebDriver(remoteAddress, capabilities);
		
		//6. valid
		// RemoteWebDriver driver = new ChromeDriver();

		 // Invalid
		// ChromiumDriver driver = new ChromiumDriver();
		//ChromiumDriver class contains protected constructor that’s why we cannot create an object of that class
		//'ChromiumDriver(org.openqa.selenium.remote.CommandExecutor, org.openqa.selenium.Capabilities, java.lang.String)'
		// has protected access in 'org.openqa.selenium.chromium.ChromiumDriver'
		
	}

}
