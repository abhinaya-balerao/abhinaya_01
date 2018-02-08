package Pages_01;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class homePage {
	
	 protected WebDriver driver;
	 
	 public homePage(WebDriver driver){
		 this.driver=driver;
	 }

	 By SearchBox=By.id("lst-ib");
	 
	
public void search(){
	
	driver.findElement(SearchBox).clear();
	driver.findElement(SearchBox).sendKeys("Maps"+Keys.ENTER);	
	
}
}