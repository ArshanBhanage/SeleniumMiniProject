package testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class tc9 {

	@Test
	public void test1() throws Throwable {

		// run on node machine
		WebDriver driver = CommonUtils.setSeleniumGrid();

//		WebDriver driver = CommonUtils.setBrowser();

		Actions action = new Actions(driver);
		driver.findElement(By.xpath("//li[@class=\"visit-ajio\"]")).click(); //clicks on ajioluxe

		WebElement e1 = driver.findElement(By.xpath("//span[@aria-label=\"WOMEN\"]")); //clicks on women
		action.moveToElement(e1).perform();

		driver.findElement(By.xpath("//a[normalize-space()='Jewellery']")).click(); //clicks on specific jewellery
		driver.findElement(By.xpath("//div[@aria-label='Hole-In-One Club Brass Ring']")).click();

		// switch to new tab
		CommonUtils.goToNewTab(driver);

		driver.findElement(By.xpath("//div[normalize-space()='6']")).click();
		driver.findElement(By.xpath("//span[@aria-label='ADD TO CART']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[@aria-label='GO TO CART']")).click();

		driver.findElement(By.xpath("//button[@class='rilrtl-button button shipping-button']")).click();
		driver.quit();
	}

}