package newTraining;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;


public class resultsPage {
	
	public WebDriver driver;
	public resultsPage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	  @FindBy(xpath="//span[@class='heading-counter']")
	  
      public WebElement verificationText;
  


public void verifyItems(){
	
	List<WebElement>Items=driver.findElements(By.xpath("//u1[@class='product_list grid row']"));
	
	int Itemssize =Items.size();
	
	System.out.println("Total items found under search criteria:"+Itemssize);

}

public boolean verify2(){
	try{
		
	Assert.assertEquals(verificationText,"4 results have been found.");
	
}catch(Exception e){

	return false;
}
	
	return true;
	
}
}
