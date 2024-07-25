package testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class tc2 {
	SoftAssert st = new SoftAssert();

	@Test
	public void testcase2() throws InterruptedException {

		WebDriver driver = CommonUtils.setBrowser();

		//click on men
		WebElement men = driver.findElement(By.xpath("//*[@id=\"appContainer\"]/div[1]/div/header/div[3]/div[1]/ul/li[1]/a"));
		Actions actions = new Actions(driver);
		actions.moveToElement(men).perform();
		// click on jacket
		driver.findElement(By.xpath("//div[@class='column column-2']//a[@title='Jackets & Coats'][normalize-space()='Jackets & Coats']")).click();

		//click on first item
		driver.findElement(By.xpath("//*[@id=\"0\"]/a/div/div[1]/div[1]/img")).click();

		// switch to new tab
		CommonUtils.goToNewTab(driver);

		//select size
		driver.findElement(By.xpath("//div[@class='circle size-variant-item size-instock ']")).click();

		// click on add to bag
		driver.findElement(By.xpath("//*[@id=\"appContainer\"]/div[2]/div/div/div[2]/div/div[3]/div/div[10]/div[1]/div[1]/div/span[2]")).click();
		Thread.sleep(3000);
		//click on view bag
		driver.findElement(By.xpath("//*[@id=\"appContainer\"]/div[1]/div/header/div[3]/div[2]/div[2]")).click();
		Thread.sleep(3000);
		driver.quit();
		st.assertAll();

	}

}