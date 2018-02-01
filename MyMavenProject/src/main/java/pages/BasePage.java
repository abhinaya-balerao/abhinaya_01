package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BasePage {
	protected WebDriver driver;
	
	By signin_by = By.xpath("//a[@class='login']");
	
	public BasePage(WebDriver driver){
		this.driver = driver;
	}
	
	public SignInPage signIn(){
		driver.findElement(signin_by).click();
		return new SignInPage(driver);
	}
	
}
