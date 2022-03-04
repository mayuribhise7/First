package fi;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Entry
{
	public void launchBrowser() 
	{
		System.setProperty("webdriver.chrome.driver","F:\\Downloads\\chromedriver\\chromedriver.exe");
		WebDriver dr = new ChromeDriver();
		dr.get("https://www.cdac.in/");
	}
	
	

	public static void main(String[] args) 
	{
		Entry obj = new Entry();
		obj.launchBrowser();
	}
}
