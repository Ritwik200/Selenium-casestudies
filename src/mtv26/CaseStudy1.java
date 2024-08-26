/*
 * Automate the following test scenarios:(Alerts)
Simple, Prompt, and Confirmation Alert.
	1.User TestNG Framework and Launch
	  URL "https://the-internet.herokuapp.com/javascript_alerts "
		a.Chrome Browser
		b.Edge
       Perform Below Alerts and Compare or Validate Results
        2.Click on 'Click for JS Alert'      //Accept Alert Means OK
	3.Click on 'Click for JS Comfirm'    //Accept/Dismiss Alert Means OK/Cancel
	4.Click on 'Click for JS Prompt'     // Enter Some message then get the mes values

 */

package mtv26;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class CaseStudy1 {
	
	public class AlertPopus {
		WebDriver driver;
		@BeforeTest
		public void setup(){
			System.setProperty("webdriver.chrome.driver", "./ChromeDriverJars/chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		}
		
		@Test
		public void example() throws Exception{
			driver.navigate().to("https://the-internet.herokuapp.com/javascript_alerts");
			
			driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();
			Alert alert = driver.switchTo().alert();
			Thread.sleep(8000);
			alert.accept();
			String result = driver.findElement(By.cssSelector("#result")).getText();
			System.out.println(result);
			Assert.assertEquals("You successfully clicked an alert", result);
			
			driver.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']")).click();
			Alert alert2 = driver.switchTo().alert();
			Thread.sleep(5000);
			alert2.dismiss();
			String result2 = driver.findElement(By.cssSelector("#result")).getText();
			System.out.println(result2);
			Assert.assertEquals("You clicked: Cancel", result2);
			
			driver.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']")).click();
			Alert alert3 = driver.switchTo().alert();
			Thread.sleep(5000);
			alert3.accept();
			String result3 = driver.findElement(By.cssSelector("#result")).getText();
			System.out.println(result3);
			Assert.assertEquals("You clicked: Ok", result3);
			
			driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();
			driver.switchTo().alert().sendKeys("Hello");
			Thread.sleep(5000);
			driver.switchTo().alert().accept();
			String result4 = driver.findElement(By.cssSelector("#result")).getText();
			System.out.println(result4);
			Assert.assertEquals("You entered: Hi", result4);
		}
	}
}
