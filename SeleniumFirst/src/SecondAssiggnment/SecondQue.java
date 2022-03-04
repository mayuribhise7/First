package SecondAssiggnment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SecondQue {

	WebDriver driver;
	public void launchBrowser() 
	{

		System.setProperty("webdriver.chrome.driver","F:\\Downloads\\chromedriver\\chromedriver.exe");
	
		 driver = new ChromeDriver();

	 
	}
	public void navigate() throws InterruptedException
	{
		driver.navigate().to("https://www.google.co.in");
		driver.navigate().to("https://www.gmail.com/");
		Thread.sleep(4000);
		System.out.println("Gamil is exit");
		System.out.println("URL:- " +driver.getCurrentUrl());
		
	}
	
	
	public static void main(String[] args) throws InterruptedException 
	{
		SecondQue ob = new SecondQue();
		ob.launchBrowser();
		ob.navigate();
		
	}
}



