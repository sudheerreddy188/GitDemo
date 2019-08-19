package objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LinkedInLoginpage_Page_Factory {
	
		
		WebDriver driver;
		public  LinkedInLoginpage_Page_Factory(WebDriver driver_ref) {
			this.driver = driver_ref;
			PageFactory.initElements(driver_ref, this);
		}


		
		@FindBy(xpath="//input[@id='username']")
		WebElement username;
		
		@FindBy(xpath="//input[@id='password']")
		WebElement password;
		
		@FindBy(xpath="//button[@aria-label='Sign in']")
		WebElement signin;
		
		@FindBy(xpath="//a[text()='Join now']")
		WebElement join_now;
		
		
		public WebElement EmailID() {
			return username;
		}

		public WebElement Password() {
			return password;
		}
		
		public WebElement signin() {
			return signin;
		}
		
		public WebElement join_now() {
			return join_now;
		}
		
}
