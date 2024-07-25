package testcase;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class tc4 {
	WebDriver driver;
	String Browser ="chrome";
	
	@Test
	public void test() throws InterruptedException {
		
		WebDriver driver = CommonUtils.setBrowser();

		Actions action = new Actions(driver);
	    WebElement e1=	driver.findElement(By.xpath("//span[@aria-label=\"WOMEN\"]"));   //clicks on women
	    action.moveToElement(e1).perform();
	    driver.findElement(By.xpath("//div[contains(@class,'column column-2')]//a[contains(@title,'Kurtas')][normalize-space()='Kurtas']")).click(); //clicks on item i.r kurta set
		driver.findElement(By.xpath("//body/div[@id='app']/div[@class='regular-store']/div[@id='appContainer']/div[@class='content']/div/div[contains(@class,'false main-view page page--category-desktop product-view')]/div/div[@class='plp-view']/div[@id='products']/div[@id='main-content']/div[@aria-label='grid']/div[@role='rowgroup']/div[1]")).click();  //clicks on specific kurta

		// switch to new tab
		CommonUtils.goToNewTab(driver);
		
		Thread.sleep(2000);
         //WebElement e2= 
         JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
         jsExecutor.executeScript("window.scrollBy(0,400)");
         
         
         driver.findElement(By.xpath("(//div[@class='size-swatch'])[4]")).click();
         //action.moveToElement(e2).perform();
         Thread.sleep(2000);
           driver.findElement(By.xpath("//span[@aria-label=\"ADD TO BAG\"]")).click();
           Thread.sleep(10000);
           driver.findElement(By.xpath("//span[@aria-label=\"GO TO BAG\"]")).click();
           driver.findElement(By.xpath("//button[@class='rilrtl-button button shipping-button']")).click();
           driver.quit();

	}
	}
