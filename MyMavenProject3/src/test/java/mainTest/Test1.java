package mainTest;

import org.testng.annotations.Test;

import BaseTest1.BaseTest;
import Pages_01.MainPage;
import Pages_01.homePage;

public class Test1 extends BaseTest {
	
	homePage hp;
	
	MainPage mp;
	@Test
	public void mainTest1(){
		
		hp= new homePage(driver);
		
		hp.search();
		
		mp=new MainPage(driver);
		
		mp.verify();
		
	}
}

