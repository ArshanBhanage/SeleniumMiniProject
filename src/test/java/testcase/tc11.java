package testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class tc11 {

	@Test
	public void Test1() throws Throwable{

		// run on node machine
		WebDriver driver = CommonUtils.setSeleniumGrid();
//
//		WebDriver driver = CommonUtils.setBrowser();

		SoftAssert st=new SoftAssert();

		//click on faqs
		driver.findElement(By.xpath("//a[@title='Frequently Asked Questions']")).click();
		//driver.findElement(By.xpath(""));
		//click on shipping fags
		driver.findElement(By.xpath("//a[@id='left-tabs-example-tab-0']")).click();
		//click on cancel order
		driver.findElement(By.xpath("//*[@id=\"left-tabs-example-tabpane-0\"]/div[1]")).click();
		String txt = driver.findElement(By.xpath("//div[@class='qa-content section-three']")).getText();
		//div[contains(@aria-label,'As soon as the order is cancelled, we refund the entire amount paid for the order.')]")).getText();
		String text="It's really quick! We strive to deliver all our orders / products in the fastest time possible. Depending upon your address, the delivery time may vary between 2 - 9 working days. That still won't stop us from trying to get you your order faster. On each product's display page, you can enter your location's pin code to check when you can expect to receive the delivery.";
		//System.out.print(txt);
		//assertion
		st.assertEquals(text,txt);

		// click on loyalty points
		driver.findElement(By.xpath("//a[@id='left-tabs-example-tab-6']")).click();
		//click on closet
		driver.findElement(By.xpath("//*[@id=\"left-tabs-example-tabpane-6\"]/div")).click();
		String txt1 = driver.findElement(By.xpath("//div[@class='qa-content section-three']")).getText();
		//assertion
		String text1="Loylty Rewardz manages the end - to - end loyalty program for most of the largest banks and retail brands in India today. It awards Reward Points to the customers who transact using their partner bank’s debit/credit card and also to customers who transact at their partner brands.";
		st.assertEquals(text1,txt1);

		driver.quit();
		st.assertAll();

	}

}