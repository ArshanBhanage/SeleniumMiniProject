package testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class tc7 {

	@Test
	public void Test1() throws Throwable {

		// run on node machine
		WebDriver driver = CommonUtils.setSeleniumGrid();

//		WebDriver driver = CommonUtils.setBrowser();

		WebElement ele = driver.findElement(By.xpath("//span[@aria-label='HOME AND KITCHEN']")); // Locate the home in navbar
		Actions action = new Actions(driver);
		action.moveToElement(ele).perform(); // Perform the mouse hover action'

		WebElement ele1 = driver.findElement(By.xpath("//a[normalize-space()='Brands']")); //locate  brands
		action.moveToElement(ele1).perform(); // Perform the mouse hover action'

		//click on Marks & Spencer
		driver.findElement(By.xpath("//div[@class='column column-2']//a[@title='Marks & Spencer'][normalize-space()='Marks & Spencer']")).click();
		//click on first item
		driver.findElement(By.xpath("//body/div[@id='app']/div[@class='regular-store']/div[@id='appContainer']/div[@class='content']/div/div[contains(@class,'false main-view page page--category-desktop product-view')]/div/div[@class='plp-view']/div[@id='products']/div[@id='main-content']/div[@aria-label='grid']/div[@role='rowgroup']/div[1]")).click();

		// switch to new tab
		CommonUtils.goToNewTab(driver);

		//click pincode
		driver.findElement(By.xpath("//span[@aria-label='Enter Pin-code To Know Estimated Delivery Date']")).click();
		//enters pincode
		driver.findElement(By.xpath("//input[@name='pincode']")).sendKeys("560021");
		//confirm pincode
		driver.findElement(By.xpath("//button[normalize-space()='CONFIRM PINCODE']")).click();
		//add to cart
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='btn-gold']")).click();
		//clicks go to bag
		driver.findElement(By.xpath("//span[@aria-label='GO TO BAG']")).click();

		//clicks on proceed to shipping
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@aria-label='Proceed to shipping']")).click();

		driver.quit();

	}

}