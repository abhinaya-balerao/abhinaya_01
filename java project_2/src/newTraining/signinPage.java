package newTraining;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class signinPage {
	
	/*public WebDriver driver;
	
	public signinPage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	*/
    @FindBy(xpath="//input[@id='email']")
	
	public WebElement emailID;
	
    @FindBy(xpath="//button[@id='SubmitLogin']")
	
	public WebElement loginButton;
	
    @FindBy(xpath="//input[@id='passwd']")
	
	public WebElement passWrd;
	
	
  public void Login( String username, String password) {
	  
	  emailID.sendKeys(username);
	  
	  passWrd.sendKeys(password);
	  
	  loginButton.click();
  }
}
