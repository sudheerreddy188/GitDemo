package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import objectRepository.LinkedInLoginpage_Page_Factory;
import objectRepository.LinkedInLoginpage_Page_Object_pattern;

public class Login_Application_page_factory {

	@Test
	public void login_PF() {
		
		System.out.println(" Welcome to the show .!!! :-) ");
		
		//setting the property of ChromeDriver class
		System.setProperty("webdriver.chrome.driver", "D:\\ATM_Useful-Softwares\\ATM_Drivers_and_Libraries\\chromedriver.exe");
		//creating the object for the chrome driver as it implements Web-driver interface. we follow the below syntax to 
		//give all the knowledge of WebDriver methods to chrome driver
		WebDriver ch_driver_1 = new ChromeDriver();
		ch_driver_1.get("https://www.linkedin.com/login?trk=guest_homepage-basic_nav-header-signin"); //To hit a specific URL in the browser 
		ch_driver_1.manage().window().maximize(); //to maximize the browser window
		
		LinkedInLoginpage_Page_Factory login_page_obj_ref = new LinkedInLoginpage_Page_Factory(ch_driver_1);
		login_page_obj_ref.EmailID().sendKeys("hi");
		login_page_obj_ref.Password().sendKeys("hello");
		login_page_obj_ref.signin().click();
		login_page_obj_ref.join_now().click();
		
		ch_driver_1.close();
		
		
	}


}
