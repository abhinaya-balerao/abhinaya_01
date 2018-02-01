package tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import base.BaseTest;

public class LoginTest extends BaseTest{

	@Test
	public void checkValidCredentials(){
		driver.findElement(By.xpath("//a[@class='login']")).click();
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("abhinaya1306@gmail.com");
		driver.findElement(By.xpath("//input[@id='passwd']")).sendKeys("rayaan18");
		driver.findElement(By.xpath("//button[@id='SubmitLogin']")).click();
	}
}
