package thirdAssinment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ThirdQuestion {

	WebDriver driver;
	public void launchBrowser() 
	{

		System.setProperty("webdriver.chrome.driver","F:\\Downloads\\chromedriver\\chromedriver.exe");
	
		 driver = new ChromeDriver();

	 
	}
	public void navigate() throws InterruptedException
	{
		driver.navigate().to("https://gcreddy.com/project/admin/login.php");
		
		
	}
	public void opengmail() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.findElement(By.name("username")).sendKeys("gcreddy");

		Thread.sleep(2000);
		
		driver.findElement(By.name("password")).sendKeys("Temp@2020");
	     Thread.sleep(2000);
		driver.findElement(By.id("tdb1")).click();
		System.out.println("URL:- " +driver.getCurrentUrl());
		  Thread.sleep(4000);
		driver.close();
	}
	
	
	public static void main(String[] args) throws InterruptedException 
	{
		ThirdQuestion ob = new ThirdQuestion();
		ob.launchBrowser();
		ob.navigate();
		ob.opengmail();
		
	}

}
