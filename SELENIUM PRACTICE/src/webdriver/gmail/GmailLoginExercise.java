package webdriver.gmail;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.firefox.FirefoxDriver;

 

public class GmailLoginExercise {


    public static void main(String[] args) {

              

// objects and variables instantiation

    	   WebDriver driver;
    	   System.setProperty("webdriver.gecko.driver", "/Users/Manju/Documents/geckodriver");
    	   driver =new FirefoxDriver();
           String appUrl = "https://accounts.google.com";

             

// launch the FireFox browser and open the application URL

            driver.get(appUrl);

              
// maximize the browser window

            driver.manage().window().maximize();
           

// declare and initialize the variable to store the expected title of the web page.

            String expectedTitle = "Sign in - Google Accounts";
    

// fetch the title of the web page and save it into a string variable

            String actualTitle = driver.getTitle();
   

// compare the expected title of the page with the actual title of the page and print the result

             
            if (expectedTitle.equals(actualTitle))

              {

                     System.out.println("Verification Successful - The correct title is displayed on the web page.");

              }

             else

              {
            	 System.out.println("Verification Failed - An incorrect title is displayed on the web page.");
            	 
            	               }
            	 
            	  
            	 
         // enter a valid User name in the email text box
            	 
            WebElement username = driver.findElement(By.id("identifierId"));
            	 
            username.clear();
            	 
            username.sendKeys("gmail_username");
            	 
          // click on the Next button
            	            	 
            WebElement NextButton = driver.findElement(By.xpath("//span[contains(.,'Next')]"));
            	 
            NextButton.click();
            	               
          // wait for page load
            	               
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            	               
          // enter a valid password in the password text box
            	 
             WebElement password = driver.findElement(By.xpath("//input[@aria-label='Enter your password']"));
            	 
             password.clear();
            	 
             password.sendKeys("gmail_password");
            	 
            	               
            	 
          // click on the Sign in button
            	 
             WebElement SignInButton = driver.findElement(By.id("signIn"));
            	 
             SignInButton.click();
            	 
            	               
            	 
          // close the web browser
            	 
             driver.close();
            	 
             System.out.println("Test script executed successfully.");
            	 
            	               
            	 
          // terminate the program
            	 
             System.exit(0);
            	 
            	        }
            	 
            	 }
