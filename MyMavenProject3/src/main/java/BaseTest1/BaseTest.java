package BaseTest1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import Utilities1.configuration1;

public class BaseTest {
	
	public WebDriver driver;
	
	@BeforeSuite
	public void configuationMethod(){
		configuration1.configuration();
	}
	
	@BeforeMethod
	public void getconfig(){
		String BrowserName=configuration1.getBrowser();
		
		switch(BrowserName.trim().toLowerCase()){
		
		case "chrome":
		System.setProperty("webdriver.chrome.driver", "binaries/chromedriver.exe");
		driver=new ChromeDriver();
		break;
		case "firefox":
		case "mozirilla":
		System.setProperty("webdriver.gecko.driver", "binaries/geckodriver.exe");
		driver=new FirefoxDriver();
		break;
		case "ie":
		System.setProperty("webdriver.ie.driver", "binaries/IEDriverServer.exe");
		driver=new InternetExplorerDriver();
		break;
		default:
			
		System.out.println("Browser name"+BrowserName+"not valid");
		System.exit(0);
	}
		driver.manage().window().maximize();
		driver.get(configuration1.getURL());
	}
	
	@AfterMethod
	public void afterMethod(){
		
		driver.close();
	}

}

