package Com.AP_Automation.TestSuite;

import org.openqa.selenium.chrome.ChromeDriver;

public class Sel_Introduction {

	public static void main(String[] args) {
		
		//Invoking the Browser
		//System.setProperty("webdriver.chrome.driver","/Users/ananyapriyadarshinisahoo/Documents/chromedriver");
		

		//To Launch Firefox
		//WebDriver driver = new FirefoxDriver();
		
		//To Launch Chrome Browser
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://google.com");
		System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        driver.close();
		
		
		
		

	}

}
