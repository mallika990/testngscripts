package testingtestng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v115.network.model.TrustTokenOperationDone.Status;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class googlepage {
	private static final String priority = null;
	private static final String extentTest = null;
	private static final String Utility = null;
	WebDriver driver;
	private Object MediaEntityBulider;
	
	
	@BeforeTest
	public void setup(String strBrowser) {
		if(strBrowser.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		}
		else if(strBrowser.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
	}
//  @Test(priority=1)
//  public void javatest() {
//	  WebDriver driver=new ChromeDriver();
//	  driver.navigate().to("http:/www.google.com/");
//	  SoftAssert softassert = new SoftAssert();
//	  softassert.assertEquals(driver.getTitle(), "Google Page");
//	  WebElement src = driver.findElement(By.id("APjFqb"));
//	  src.sendKeys("Java Tutorial");
//	  src.submit();
//	  softassert.assertEquals(driver.getTitle(),"Java tutorial - google search");
//	  softassert.assertAll();
//	  
//}

	@Test(alwaysRun= true, dependsOnMethods= "seleniumtest")
	public void javatest() {
		 // WebDriver driver= new ChromeDriver();
		  driver.navigate().to("http:/www.google.com/");
		  Assert.assertEquals(driver.getTitle(),"Google");
		  WebElement src = driver.findElement(By.id("APjFqb"));
		  src.sendKeys("java Tutorial");
		  src.submit();
		 Assert.assertEquals(driver.getTitle(),"Java Tutorial - Google Search");
		 
	}
	
@Test
public void seleniumtest() {
	 // WebDriver driver= new ChromeDriver();
	  driver.navigate().to("http:/www.google.com/");
	  WebElement src = driver.findElement(By.id("APjFqb"));
	  src.sendKeys("Selenium Tutorial");
	  src.submit();
	 Assert.assertEquals(driver.getTitle(),"Selenium tutorial - Google Search");
	 
}



@Test(enabled=false)
public void Cucumbertest() {
	  WebDriver driver= new ChromeDriver();
	  driver.navigate().to("http:/www.google.com/");
	  WebElement src = driver.findElement(By.id("APjFqb"));
	  src.sendKeys("Cucumber Tutorial");
	  src.submit();
	 Assert.assertEquals(driver.getTitle(),"Cucumber tutorial - google search");
	 
}
@AfterMethod
public void teardown(ITestResult result) {
	if(ITestResult.FAILURE== result.getStatus()) {
		extentTest.log(Status.Fail,result.getThrowable().getMessage());
		String strpath = Utility.getScreenshotpath(driver);
		extentTest.fail(
				 MediaEntityBulider.createScreenCaptureFromPath(strpath).bulid());
	}
	driver.close();
}
	
}
