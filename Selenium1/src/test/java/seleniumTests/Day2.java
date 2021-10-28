package seleniumTests;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Day2 {

	//@Test
	public void scorllTest()
	{
		 
		System.setProperty("webdriver.chrome.driver","E:\\SeleniumTest\\Selenium1\\Webdrivers\\chromedriver.exe");       
		WebDriver driver =new ChromeDriver();

		driver.get("https://www.javatpoint.com/selenium-webdriver-scrolling-web-page");   
	    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	        //Scroll down the webpage by 4500 pixels  
	    JavascriptExecutor js = (JavascriptExecutor)driver;
	        
	    js.executeScript("scrollBy(0, 4500)");  
	  }
	
	//@Test
	public void RefreshTest() throws Exception
	{
		System.setProperty("webdriver.chrome.driver","E:\\SeleniumTest\\Selenium1\\Webdrivers\\chromedriver.exe"); 
	           
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.guru99.com");
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//Refresh with get current URL
		
		Thread.sleep(5000);
		driver.get(driver.getCurrentUrl()); 
		
		Thread.sleep(5000);
		//Refresh with navigate Refresh
		driver.navigate().refresh();
		
		Thread.sleep(5000);
		//Refresh with navigate and current URL
		driver.navigate().to(driver.getCurrentUrl());
		
		Thread.sleep(5000);
		driver.quit();
	  }
	
	@Test
	public void KeyboardEvent() throws Exception
	{
		System.setProperty("webdriver.chrome.driver","E:\\SeleniumTest\\Selenium1\\Webdrivers\\chromedriver.exe"); 
	           
		WebDriver driver =new ChromeDriver();
		driver.get("https://extendsclass.com/text-compare.html");
		driver.manage().window().maximize();
		WebElement texta = driver.findElement(By.xpath("//*[@id=\"dropZone\"]//div[7]/pre/span"));
		
		Actions action = new Actions(driver);
		Thread.sleep(2000);
		action.keyDown(texta, Keys.CONTROL).sendKeys("a").sendKeys("c").build().perform();
		
		WebElement textb = driver.findElement(By.xpath("//*[@id=\"dropZone2\"]//div[5]/pre/span "));
		Thread.sleep(2000);
		action.keyDown(textb, Keys.CONTROL).sendKeys("a").sendKeys("v").build().perform();
		 
	}
}
