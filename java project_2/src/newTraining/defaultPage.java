package newTraining;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class defaultPage {

	/*public WebDriver driver;

	public defaultPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
*/
	@FindBy(xpath = "//a[@class='login']")
	public WebElement signinButton;

	@FindBy(xpath = "//input[@id='search_query_top']")
	public WebElement searchBox;

	@FindBy(xpath = "//button[@class='btn btn-default button-search']")
	public WebElement searchIcon;

	public void Signin() {
		signinButton.click();

	}

	public void enterdetails(String vMsg) {

		searchBox.sendKeys(vMsg);
		searchIcon.click();

	}
}
