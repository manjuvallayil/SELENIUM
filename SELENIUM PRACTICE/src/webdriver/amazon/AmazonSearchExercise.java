package webdriver.amazon;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AmazonSearchExercise {
	
	public WebDriver driver;
	
	
	// method for launching browser
	public void lauchBrowser(){
  	    System.setProperty("webdriver.gecko.driver", "/Users/Manju/Documents/geckodriver");
  	    driver =new FirefoxDriver();
		driver.get("https://www.amazon.com/");
		String url = driver.getCurrentUrl();
		System.out.println("Launched @: "+url);
	}
	// method for closing browser
	public void closeBrowser(){
		driver.quit();
		System.out.println("Closed Browser");
	}
	// method for search function
	public void searchBox() throws InterruptedException{
		WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
		searchBox.clear();
		searchBox.sendKeys("box");
		driver.findElement(By.className("nav-input")).click();
		Thread.sleep(5000);
		String url = driver.getCurrentUrl();
		System.out.println("Search results of box: "+url);
	    driver.findElement(By.linkText("Home & Kitchen")).click();
		String url1 = driver.getCurrentUrl();
		System.out.println("Page loded by clicking Home & Kitchen link:  "+url1);
	}
   // main method
	public static void main(String[] args) throws InterruptedException  {
		AmazonSearchExercise ASE = new AmazonSearchExercise();
		ASE.lauchBrowser();
		ASE.searchBox();
		ASE.closeBrowser();

	}

}
