package testcase;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class tc3 {

	@Test
	public void Test1() throws InterruptedException {

		WebDriver driver = CommonUtils.setBrowser();

		WebElement ele = driver.findElement(By.xpath("//span[@aria-label='MEN']")); // Locate the men in navbar
		Actions action = new Actions(driver);
		action.moveToElement(ele).perform(); // Perform the mouse hover action'

		WebElement ele1 = driver.findElement(By.xpath("//li[contains(@data-test,'li-MEN')]//a[normalize-space()='BRANDS']")); //locate  brands
		action.moveToElement(ele1).perform(); // Perform the mouse hover action'

		//click on adidas
		driver.findElement(By.xpath("//div[@class='column column-2']//a[@title='ADIDAS'][normalize-space()='ADIDAS']")).click();
		//click on men radio button
		driver.findElement(By.cssSelector("label[for='Men']")).click();
		//click on casual shoes radio button
		driver.findElement(By.cssSelector("label[for='Men - Casual Shoes']")).click();
		//click on first item
		WebDriverWait explicitWait = new WebDriverWait(driver, Duration.ofSeconds(2));
		explicitWait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='loader']")));
		driver.findElement(By.xpath("//body/div[@id='app']/div[@class='regular-store']/div[@id='appContainer']/div[@class='content']/div/div[@class=' false main-view page page--category-desktop product-view']/div/div[@class='plp-view']/div[@id='products']/div[@id='main-content']/div[@aria-label='grid']/div[@role='rowgroup']/div[4]")).click();

		// switch to new tab
		CommonUtils.goToNewTab(driver);

		//clicks shoe size
		driver.findElement(By.xpath("//span[normalize-space()='12']")).click();
		//click pincode
		driver.findElement(By.xpath("//span[contains(@aria-label,'Enter Pin-code To Know Estimated Delivery Date')]")).click();
		//enters pincode
		driver.findElement(By.xpath("//input[@name='pincode']")).sendKeys("560021");
		//confirm pincode
		driver.findElement(By.xpath("//button[normalize-space()='CONFIRM PINCODE']")).click();
		//add to cart
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(@aria-label,'ADD TO BAG')]")).click();
		//clicks go to bag
		driver.findElement(By.xpath("//span[@aria-label='GO TO BAG']")).click();
		//CLICKS ON COUPON RADIO BUTTON
		driver.findElement(By.xpath("(//div[@class='voucher-list-item'])[1]")).click(); //input[@id='RED10']
		//clicks on apply button
		driver.findElement(By.xpath("//button[@aria-label='Apply']")).click();

		//clicks on procced to shipping
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@aria-label='Proceed to shipping']")).click();

		driver.quit();

	}

}