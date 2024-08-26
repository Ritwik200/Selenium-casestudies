/*
 * DropdownBox Case Study:
    1.Open Chrome Browser use TestNG Framework
	2.Open URL: https://www.facebook.com/campaign/landing.php?
	3.By use methods SelectByIndex,SelectByValue,SelectByVisibleText
	  print values in date and Year fileds
	4.Count number items in date and Year fileds
	5.Close the Browser
 */

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class mtv24 {
	@Test
	public void showRes() {
		
		System.setProperty("webdriver.chrome.driver", "./ChromeDriverJars/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/campaign/landing.php");
		
		WebElement date_drpdn = driver.findElement(By.id("day"));
		Select date_d = new Select(date_drpdn);
		
		WebElement year_drpdn = driver.findElement(By.id("year"));
		Select year_d = new Select(year_drpdn);
		
		 date_d.selectByIndex(2);
		 year_d.selectByIndex(2007);
		 
		 System.out.println("SelectByIndex:");
		 System.out.println("Date :" +date_d.getFirstSelectedOption().getText() );
		 System.out.println("Year :" +year_d.getFirstSelectedOption().getText() );
		 
		 date_d.selectByValue("2");
		 year_d.selectByValue("2007");
		 System.out.println("selectByValue:");
		 System.out.println("Date :" +date_d.getFirstSelectedOption().getText() );
		 System.out.println("Year :" +year_d.getFirstSelectedOption().getText() );
		 
		 date_d.selectByVisibleText("2");
		 year_d.selectByVisibleText("2007");
		 System.out.println("selectByVisibleText:");
		 System.out.println("Date :" +date_d.getFirstSelectedOption().getText() );
		 System.out.println("Year :" +year_d.getFirstSelectedOption().getText() );
		 
		 
		 List<WebElement> dayOpt = date_d.getOptions();
	        List<WebElement> yearOpt = year_d.getOptions();
	        System.out.println("Number of days: " + dayOpt.size());
	        System.out.println("Number of years: " + yearOpt.size());
		 
		 driver.quit();
		
	}
}
