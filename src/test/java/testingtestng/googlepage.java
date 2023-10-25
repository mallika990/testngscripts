package testingtestng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class googlepage {
	WebDriver driver;
	
	@BeforeTest
	public void setup() {
		driver = new ChromeDriver();
	}
  @Test
  public void search() {
	  WebDriver driver=new ChromeDriver();
	  driver.navigate().to("http:/www.google.com/");
	  WebElement src = driver.findElement(By.id("APjFqb"));
	  src.sendKeys("Selenium Tutorial");
	  src.submit();
	  Assert.assertEquals(driver.getTitle(),"selenium tutorial - google search");
		 
  
}

@Test
public void searchsimple() {
	  WebDriver driver= new ChromeDriver();
	  driver.navigate().to("http:/www.google.com/");
	  WebElement src = driver.findElement(By.id("APjFqb"));
	  src.sendKeys("Java Tutorial");
	  src.submit();
	 Assert.assertEquals(driver.getTitle(),"Java tutorial - google search");
	 
}
@AfterMethod
public void teardown() {
	driver.close();
}
	
}
