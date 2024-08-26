

package mtv23;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CaseStudy1 {
	
	@Test
	public void showRes() {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "chromeDriverJars/Chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.easycalculation.com/index.php");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("/html/body/div[3]/div[1]/div[6]/div[2]/div[1]/ul/li[1]/a")).click();
		driver.quit();
		
	}
}
