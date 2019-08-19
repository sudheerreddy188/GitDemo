package objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LinkedInLoginpage_Page_Object_pattern {
	
		
		WebDriver driver;
		public  LinkedInLoginpage_Page_Object_pattern(WebDriver driver_ref) {
			this.driver = driver_ref;
		}


		
		
		
		By username = By.xpath("//input[@id='username']");
		By password = By.xpath("//input[@id='password']");
		By signin = By.xpath("//button[@aria-label='Sign in']");
		By join_now = By.xpath("//a[text()='Join now']");
		
		public WebElement EmailID() {
			return driver.findElement(username);
		}

		public WebElement Password() {
			return driver.findElement(password);
		}
		
		public WebElement signin() {
			return driver.findElement(signin);
		}
		
		public WebElement join_now() {
			return driver.findElement(join_now);
		}
		
}
