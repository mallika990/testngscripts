package testingtestng;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v115.log.Log;
import org.openqa.selenium.devtools.v115.log.model.LogEntry;
import org.openqa.selenium.devtools.v115.network.model.TrustTokenOperationDone.Status;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class CDPTest {
	ChromeDriver driver;
	DevTools devtools;
	
	@BeforeMethod
	
	public void setup(){
		driver= new ChromeDriver();
		devtools = driver.getDevTools();
		devtools.createSession();	
	}
	@Test
	public void devicemodetest() {
		Map devicemeterics = new HashMap() {{
			put("width",600);
			put("height",1000);
			put("devicescalefactor",50);
			put("mobile",true);
		}
		};
		driver.get("https://www.selenium.dev/");
	}
	@Test
	public void locationtest() {
		Map devicemeterics = new HashMap() {{
			put("latitude",33.74);
			put("longitude",-84.38);
			put("accuracy",100);
		}
		};
		driver.executeCdpCommand("Emulation.setGeolocationOverride", devicemeterics);
		driver.get("https://oldnavy.gap.com/stores");
	}
	@Test
	public void captureConsolelogtest() {
		devtools.send(Log.enable());
		devtools.addListener(Log.entryAdded(), 
				new Consumer<LogEntry>() {
			public void accept(LogEntry logentry) {
				System.out.println("log"+logentry.getText());
				System.out.println("log"+logentry.getLevel());
			}
		});
		driver.get("http://the-internet.herokuapp.com/");
	}
}
	
