package stepdef;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import cucumber.api.DataTable;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Definitions {
	public WebDriver driver;
	int num1;
	int num2;
	int sum;
	String name;
	
	@Given("^browser has been launched$")
	public void browser_has_been_launched() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "Browsers/chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	
	@Before()
	public void intiateBrowser(Scenario scenario){
		System.out.println("Started execution for "+scenario.getName());
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
	
	@Given("^user enters two numbers as (\\d+) and (\\d+)$")
	public void user_enters_two_numbers_as_and(int arg1, int arg2) throws Throwable {
	   num1 = arg1;
	   num2 = arg2;
	}

	@When("^it get adds up with name as \"([^\"]*)\"$")
	public void it_get_adds_up_with_name_as(String arg1) throws Throwable {
		sum = num1 + num2;
		name  = arg1;
	}

	@Then("^it should print the result$")
	public void it_should_print_the_result() throws Throwable {
	   System.out.println(name+":"+sum);
	}
	
	@When("^user check for groceries list$")
	public void user_check_for_groceries_list(DataTable arg1) throws Throwable {
		List<List<String>> tableData = arg1.raw();
		for(int i =0;i<tableData.size();i++){
			List<String> rowData = tableData.get(i);
			for(int j=0;j<rowData.size();j++){
				System.out.print(rowData.get(j)+"\t");
			}
			System.out.println();
		}
	}
	
	@After
	public void closeBrowser(){
		driver.close();
	}
	
	@Then("^close the browser$")
	public void close_the_browser() throws Throwable {
	    driver.close();
	}
}
