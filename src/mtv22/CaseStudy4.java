
/*
 * 1.Use HeadLess Browser Concept and Open URL 
2.URL: <https://store.webkul.com>
3.Get Page Title name 
4.Take Screen shot of home page
5.Close the Browser
 */ 
package mtv22;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class CaseStudy4 {
	@Test
	public void screenshot() throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "./ChromeDriverJars/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://store.webkul.com");
		
		
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("./SS/homepage.png"));
		driver.quit();
	}
}
