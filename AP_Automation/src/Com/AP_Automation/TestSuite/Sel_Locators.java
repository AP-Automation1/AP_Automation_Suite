package Com.AP_Automation.TestSuite;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sel_Locators {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://google.com");
		//driver.findElements(By.id("input")).sendkeys("h");

	}

}
