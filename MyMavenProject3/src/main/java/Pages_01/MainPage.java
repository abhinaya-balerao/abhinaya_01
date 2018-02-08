package Pages_01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage extends homePage {
	
	public MainPage(WebDriver driver){
		
		super(driver);
	}
	
	By target =By.linkText("Google Maps");
	
	public void verify(){
		
		String vActualText=driver.findElement(target).getText();
		
		System.out.println(vActualText);
	}

}
