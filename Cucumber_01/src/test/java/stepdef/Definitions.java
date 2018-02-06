package stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Definitions {
	public WebDriver driver;
	
	@Given("^browser has been launched$")
	public void browser_has_been_launched() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "Browsers/chromedriver.exe");
		driver = new ChromeDriver();
	}

	
	@When("^user opens url \"([^\"]*)\"$")
	public void user_opens_url(String url) throws Throwable {
		driver.get(url);
	}
	
	@Then("^a page with title \"([^\"]*)\" should appear$")
	public void a_page_with_title_should_appear(String title) throws Throwable {
		 String pageTitle = driver.getTitle();
		 Assert.assertEquals(pageTitle, title);
	}

	@When("^user search for a text in google search box and press enter$")
	public void user_search_for_a_text_in_google_search_box_and_press_enter() throws Throwable {
		driver.findElement(By.name("q")).sendKeys("cat"+Keys.ENTER);
	}

	@Then("^atleast (\\d+) links related to that text should appear$")
	public void atleast_links_related_to_that_text_should_appear(int linkSize) throws Throwable {
		Assert.assertTrue(driver.findElements(By.xpath("//a")).size() > linkSize);
	}

	@When("^user search for a text in amazon search box and press enter$")
	public void user_search_for_a_text_in_amazon_search_box_and_press_enter() throws Throwable {
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("cat"+Keys.ENTER);
	}
	
	@Then("^close the browser$")
	public void close_the_browser() throws Throwable {
	    driver.close();
	}
}
