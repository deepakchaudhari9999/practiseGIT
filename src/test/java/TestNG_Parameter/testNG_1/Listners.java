package TestNG_Parameter.testNG_1;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.SkipException;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Listners {
	
	public void listen() throws InterruptedException {

		int a=2; int b=5; int c=6;
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://omayo.blogspot.com");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		if(a==1) {
			Assert.assertTrue(b<c);
		}
		
		else if(a==2) {
			Assert.assertTrue(b>c);
		}
		
		else if(a==3) {
			throw new SkipException("Test skipped");
		}
		
		
		

	}}

