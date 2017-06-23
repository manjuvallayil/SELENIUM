package webdriver.amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class AmazonDropDownExercise {
	
  @Test
  public void selectDropDown() throws InterruptedException {
	    
	    System.setProperty("webdriver.gecko.driver", "/Users/Manju/Documents/geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		
	// selecting item from the drop down using Select class
	WebElement WE = driver.findElement(By.id("searchDropdownBox"));
	Select drop1 = new Select(WE);
	
	 drop1.selectByValue("search-alias=mobile-apps");
	 Thread.sleep(5000); 
	
	 drop1.selectByVisibleText("CDs & Vinyl");
	 Thread.sleep(5000); 
	
	 drop1.selectByIndex(2);
	 Thread.sleep(5000); 
	 
	
	 driver.quit();
  }
}
