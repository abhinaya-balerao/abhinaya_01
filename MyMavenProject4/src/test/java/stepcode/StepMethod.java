package stepcode;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepMethod {

	public  WebDriver driver;
int num1, num2;
int sum;
String name;
@Given("^browser has been launched$")
public void browser_has_been_launched() throws Throwable {
  System.getProperty("webdriver.chrome.driver", "Browsers/chomedriver.exe");
  driver= new ChromeDriver();
}

@When("^user passed the url \"([^\"]*)\"$")
public void user_passed_the_url(String arg1) throws Throwable {
   driver.get(arg1);
}

@Then("^validate title of the page as \"([^\"]*)\"$")
public void validate_title_of_the_page_as(String vExp) throws Throwable {
    String ActualTitle=driver.getTitle();
    Assert.assertEquals(ActualTitle, vExp);
}

@When("^click on the searchbox and search for fashion and press enter$")
public void click_on_the_searchbox_and_search_for_fashion_and_press_enter() throws Throwable {
 driver.findElement(By.id("lst-ib")).sendKeys("fashion"+Keys.ENTER);
}

@Then("^validate that there are more than (\\d+) links$")
public void validate_that_there_are_more_than_links(int size) throws Throwable {
  
	Assert.assertTrue(driver.findElements(By.xpath("//a")).size()>size);
}

@Given("^I want to have two numbers (\\d+) and (\\d+)$")
public void i_want_to_have_two_numbers_and(int arg1, int arg2) throws Throwable {
  num1=arg1;
		  num2=arg2;
}

@When("^I will add the string \"([^\"]*)\"$")
public void i_will_add_the_string(String arg3) throws Throwable {
    sum=num1+num2;
    name=arg3;
}

@Then("^I verify to print the result$")
public void i_verify_to_print_the_result() throws Throwable {
    System.out.println(name+":"+sum);
}
}
