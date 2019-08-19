package objectRepository;

public class Sec_24_Lec_181_to_188_Pageobject_Pattern_page_Factory {
	
	/*

		Sec-24 Framework part-8 page object pattern & page factory
		
		L-181 what is page object model
		This explains how to store the objects & write scripts effectively 
		page object pattern -> uses: easy to maintain, easy readability of scripts, reduce or eliminate duplicacy
		re-usability of code and reliability
		
		L-182 creating page object constructor in classes
		lets say rediff.com
		home page - java class(rediffhomepage)- objects of home page
		login page - java class (login page) - objects of login page
		in case of an change in the objects of a particular page we will make the change in the corresponding class and we share the usage of these objects
		while writing tc's (web/mobile same concept)
		
		L-183 object repository mechanism
		code snippet
		
		L-184 practical exercise explaining page object model
		if we create object for any class by default constructor will be executed which belongs to that particular class
		this.driver = driver; we are passing the tc driver into constructor & giving that to local driver(this.driver).
		so that it has the capability like which browser it has to execute.
		By username = By.xpath("");
		pub webelement emailid(){
		return d.findelementby("");
		}
		
		L-185 Page object factory and its advantages
		code snippet
		
		L-186 page factory annotations findby
		its the simplified version of page object pattern/classes
		here we use page object factory class
		@findBy(xpath="")
		webelement username;
		
		L-187 practical example explaining page factory model 
		code snippet
		
		L-188 code snippet

	 */

}
