package newTraining;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class homePage {
	
	/*public WebDriver driver;
	
	public homePage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
*/	
  @FindBy(xpath="//h1[@class='page-heading']")
	
	public WebElement myAccountVerify;

	
	
public boolean verifyText(String vExpect){
	
	String ActualText=myAccountVerify.getText();
	
	System.out.println("Actual Text is:"+ActualText);
	
	if(ActualText.equals(vExpect)){
		
		return true;
		
	}else{
	
	return false;
	
	}
	
}
}
