/*
1.User TestNG Framework  and Open URL By any browser
   a.ChromeBrowser
2.Open URL: <https://store.webkul.com>
3.Get Page Title name 
4.Take Screen shot of home page(Not Requried)
5. Count Number links and Print all the links
6. Close the Browser
 */

package mtv22;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CaseStudy3 {
	
	@Test
	public void showRes() throws Exception {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "chromeDriverJars/Chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://store.webkul.com");
		driver.manage().window().maximize();
		
		System.out.println("title:"+driver.getTitle());
		List<WebElement> links = driver.findElements(By.tagName("a"));
	
		System.out.println("Number of links:" + links.size());
		
		System.out.println("Print all links:");
		for(WebElement link:links) {
			System.out.println(link.getText());
		}
		driver.quit();
}
}