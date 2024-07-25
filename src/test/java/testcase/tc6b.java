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

public class tc6b {

	@Test
	public void searchSerum() throws Throwable {

		WebDriver driver = CommonUtils.setBrowser();

		driver.findElement(By.xpath("//input[@placeholder='Search AJIO']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Search AJIO']")).sendKeys("Perfumes", Keys.RETURN);
		driver.findElement(By.xpath("//*[@id=\"facets\"]/div[2]/ul/li[1]/div/div/div[2]/ul/li[1]/div/div/label")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"facets\"]/div[2]/ul/li[2]/div/div/div[2]/ul/li[1]/div/div/label")).click();
		Thread.sleep(3000);
	    driver.findElement(By.xpath("//div[@class='item rilrtl-products-list__item item']")).click();
		
	    // next tab
		CommonUtils.goToNewTab(driver);
  
		driver.findElement(By.xpath("//span[text()='ADD TO BAG']")).click();
		driver.findElement(By.xpath("//span[text()='GO TO BAG']")).click();

		driver.quit();

	}
}
