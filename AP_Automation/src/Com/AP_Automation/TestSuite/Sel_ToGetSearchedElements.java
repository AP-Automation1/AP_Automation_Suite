package Com.AP_Automation.TestSuite;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sel_ToGetSearchedElements {

	public static void main(String[] args) throws InterruptedException {
		
		        //To Launch Chrome Browser
				ChromeDriver driver = new ChromeDriver();
				
				//To open the google page
				driver.get("https://google.com");
				
				//To maximize the page
				driver.manage().window().maximize();
				
				//To show the entered text in text area
				driver.findElement(By.xpath("//textarea[@title='Search']")).sendKeys("Google Sign Up Form");
				Thread.sleep(1000);
				
				//To get the 
				driver.findElements(By.xpath("//ul[@role='listbox']/li"));
			
	}
}
