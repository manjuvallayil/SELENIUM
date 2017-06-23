package VisibilityConditionsExercise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class VisibilityConditions {
	 
	
	
	
  @Test
  public void checkConditions() throws InterruptedException {
	  System.setProperty("webdriver.gecko.driver", "/Users/Manju/Documents/geckodriver");
	  WebDriver driver = new FirefoxDriver();
	 
	  String AppURL = "https://www.google.co.nz/";
	  driver.get(AppURL);
	  String ExpTitle = "Google";
	  String ActTitle = driver.getTitle();
	//  Thread.sleep(5000);
	  System.out.println(ActTitle);
	  if (ExpTitle.equals(ActTitle))
	  
		  System.out.println("Page Verified: Title same");
	  
	  else
		  System.out.println("Page verification failed: Title mismatch");
	  
	  boolean SearchBoxPresence = driver.findElement(By.id("lst-ib")).isDisplayed();
	  System.out.println("Google Search Box Presence: " + SearchBoxPresence);
	  
	  boolean SearchButtonDisplay = driver.findElement(By.name("btnK")).isDisplayed();
	  System.out.println("Search Button Presence: "+SearchButtonDisplay);
	  
	  boolean SearchButtonEnable = driver.findElement(By.name("btnK")).isEnabled();
	  // is enabled() check is useful in cases when button is disabled until an entry
	  System.out.println("Search Button Enabled: "+SearchButtonEnable);
	  
	  WebElement SearchBox = driver.findElement(By.xpath("//input[@aria-autocomplete='both']"));
	  SearchBox.click();
	  SearchBox.sendKeys("Selenium");
	  System.out.println(driver.getCurrentUrl());
	  
	
	  
 driver.quit();
  }
  

}
