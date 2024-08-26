 /*   Open using any Browser  
     	a.	Chrome Browser
     	b.	Firefox
     	c.	Edge Enter values using Locator ID,Name and Xpath
    2.Open URL: https://www.easycalculation.com/
    3.Enter "Bangalore" in Editbox then click serach button
    4.Print Page Title
    5.Get page Source and Page Source length
    6.Close the Browser
*/
package mtv22;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CaseStudy2 {
	@Test
	public void showRes() throws Exception {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "chromeDriverJars/Chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.easycalculation.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("googleSearchId")).sendKeys("Banglore");
		driver.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div/form/span[2]/button")).click();
		System.out.println("title:"+driver.getTitle());
		String pageSrc = driver.getPageSource();
		System.out.println("Page source:"+ pageSrc);
		System.out.println("Page source length: "+ pageSrc.length());
		driver.quit();
	}
}
