package testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class tc10 {
    @Test
    public void tc10() throws Throwable{

        // run on node machine
        WebDriver driver = CommonUtils.setSeleniumGrid();

//        WebDriver driver = CommonUtils.setBrowser();

        // click on Ajio Luxe
        driver.findElement(By.xpath("//a[@aria-label='Visit Ajioluxe']")).click();

        // close location popup
        try{
            driver.findElement(By.id("closeBtn")).click();
        }catch (Exception e){
            System.out.println("No such element");
        }

        // hover over men
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(By.xpath("//a[@title='HOME']"))).build().perform();
        driver.findElement(By.xpath("//a[@title='Organisers']")).click();

        WebDriverWait explicitWait = new WebDriverWait(driver, Duration.ofSeconds(2));
        explicitWait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='loader']")));
        driver.findElement(By.xpath("//div[@class='item rilrtl-luxe-products-list__item item']")).click();

        // switch to new tab
        CommonUtils.goToNewTab(driver);

        // select size
        driver.findElement(By.xpath("//div[@class='oval size-variant-item size-instock selected'][@role='button']")).click();

        // click add to cart
        driver.findElement(By.xpath("//div[@class='btn-gold btn-dark'][@role='button']")).click();

        // click go to bag
        driver.findElement(By.xpath("//div[@class='pdp-addtocart-button'][@role='button']")).click();

        driver.quit();

    }
}
