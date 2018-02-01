package initalSetup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserLaunch {

	public static void main(String[] args) {

		//System.setProperty("webdriver.chrome.driver", "binaries/chromedriver.exe");
		//WebDriver driver  = new ChromeDriver();
	
		
		System.setProperty("webdriver.ie.driver", "binaries/IEDriverServer.exe");
	    WebDriver driver  = new InternetExplorerDriver();
	    driver.get("http://www.seleniumhq.org/");
	}

}
