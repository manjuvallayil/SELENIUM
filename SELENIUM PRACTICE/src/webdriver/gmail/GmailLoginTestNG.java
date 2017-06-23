package webdriver.gmail;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class GmailLoginTestNG {
	
	
@Test	
  public void loadGoogleIndia() throws InterruptedException {
	

	 
	 System.setProperty("webdriver.gecko.driver", "/Users/Manju/Documents/geckodriver");
	 WebDriver driver = new FirefoxDriver(); 
	  driver.get("https://www.google.co.in");
	  driver.manage().window().maximize();
	  String ExpTitle = "Google";
	  String ActTitle = driver.getTitle();
	  System.out.println(ActTitle);
	  Assert.assertEquals(ExpTitle,ActTitle);
	  
	  WebElement SignButton = driver.findElement(By.id("gb_70"));
	  SignButton.click();
	
	  String Title = driver.getTitle();
	  Thread.sleep(5000);
	 if(Title== "Sign in - Google Accounts") 
	 {
		 System.out.println("Succesfully landed in login page");
	 }
	 else
	 {
		 System.out.println("Not landed");
	 }
	 
	driver.findElement(By.id("Email")).sendKeys("gmail-username");
	driver.findElement(By.id("next")).click();
	Thread.sleep(5000);
	
	driver.findElement(By.id("Passwd")).sendKeys("gmail_password");
	driver.findElement(By.id("signIn")).click();
	
  }

 
	 
 
  }

