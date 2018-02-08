package newTraining;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class pageFactory_1 {

	public WebDriver driver;

	defaultPage dF;
	homePage hP;
	resultsPage rP;
	signinPage sP;

	@BeforeClass

	public void oneTime() {

		System.setProperty("webdriver.chrome.driver", "Browsers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://www.automationpractice.com/");

	}

	@Test

	public void Test1() {
	
		dF=PageFactory.initElements(driver, defaultPage.class);
		dF.Signin();
		//sP = new signinPage(driver);
		sP=PageFactory.initElements(driver, signinPage.class);
		sP.Login("abhinaya1306@gmail.com", "rayaan18");
		//hP = new homePage(driver);
		hP.verifyText("MY ACCOUNT");
	}

	@Test

	public void Test2() {
		dF=PageFactory.initElements(driver, defaultPage.class);
		dF.enterdetails("Summer");
		//rP = new resultsPage(driver);
		rP=PageFactory.initElements(driver, resultsPage.class);
		rP.verify2();
	}

	@AfterClass

	public void afterClass() {

		// driver.close();

	}

}
