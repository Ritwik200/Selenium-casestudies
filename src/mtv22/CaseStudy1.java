
//Open using any Browser  
//		a.	Chrome Browser
//		b.	Firefox
//		c.	Edge Enter values using Locator ID
//	2.Open URL: 
//
//     
//    	3.Print Page Title
//    	4.Get page Source and Page Source length
//    	5.Close the Browser


package mtv22;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CaseStudy1 {
	@Test
	public void showRes() throws Exception {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "chromeDriverJars/Chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.login.hiox.com/register?referrer=easycalculation.com");
		driver.manage().window().maximize();
		System.out.println("title:"+driver.getTitle());
		String pageSrc = driver.getPageSource();
		System.out.println("Page source:"+ pageSrc);
		System.out.println("Page source length: "+ pageSrc.length());
		driver.quit();
	}

}
