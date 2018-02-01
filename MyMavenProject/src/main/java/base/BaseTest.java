package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import utilities.Configuration;

public class BaseTest {
	public WebDriver driver;
	
	@BeforeSuite
	public void preSetup(){
		Configuration.loadConfigurations();
	}
	
	@BeforeMethod
	public void initiateBrowser(){
		String browerName = Configuration.getBrowserName();
		switch(browerName.trim().toLowerCase()){
		case "chrome":
			System.setProperty("webdriver.chrome.driver", "binaries/chromedriver.exe");
			driver = new ChromeDriver();
			break;
		case "firefox":
		case "mozilla":
			System.setProperty("webdriver.gecko.driver", "binaries/geckodriver.exe");
			driver = new FirefoxDriver();
			break;
		case "ie":
		case "internet explorer":
			System.setProperty("webdriver.ie.driver", "binaries/IEDriverServer.exe");
			driver = new InternetExplorerDriver();
			break;
		default:
			System.out.println("Please enter a valid browser name. Entered value is "+browerName);
			System.exit(0);
		}
		driver.manage().window().maximize();
		driver.get(Configuration.getURL());
	}

	@AfterMethod
	public void cleanUp(){
		//driver.quit();
	}
	
}
