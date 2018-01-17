package initalSetup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunch {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "binaries/chromedriver.exe");
		WebDriver driver  = new ChromeDriver();
		driver.get("http://www.seleniumhq.org/");
	}

}
