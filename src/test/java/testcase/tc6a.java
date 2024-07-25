package testcase;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class tc6a {


	@Test
	public void searchSerum() throws Throwable {

		WebDriver driver = CommonUtils.setBrowser();

		driver.findElement(By.xpath("//input[@placeholder='Search AJIO']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Search AJIO']")).sendKeys("Serum", Keys.RETURN);
		driver.findElement(By.xpath("//img[@alt='Product image of Cosrx Advanced Snail 96 Mucin Power Essence']"))
				.click();
		
		CommonUtils.goToNewTab(driver);

		driver.findElement(By.xpath("//span[text()='ADD TO BAG']")).click();
		driver.findElement(By.xpath("//span[text()='GO TO BAG']")).click();

		driver.quit();

	}
}
