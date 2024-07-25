package testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class tc8 {

    @Test
    public void AjioLuxury() throws Throwable {

        // run on node machine
        WebDriver driver = CommonUtils.setSeleniumGrid();

        // WebDriver driver = CommonUtils.setBrowser();

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
        actions.moveToElement(driver.findElement(By.xpath("//a[@title='MEN']"))).build().perform();
        driver.findElement(By.xpath("//a[@title='Casual Shoes']")).click();

        // select men
        driver.findElement(By.xpath("//div[@id='facets']/div[2]/ul/li[1]/div/div/div[2]/ul/li[1]")).click();

        // click prices dropdown
        WebDriverWait explicitWait = new WebDriverWait(driver, Duration.ofSeconds(1));
        explicitWait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='loader']")));

        driver.findElement(By.xpath("(//div[@class='cat-facets '])[3]")).click();

        // scroll down
//        JavascriptExecutor jse = (JavascriptExecutor) driver;
//        jse.executeScript("window.scrollBy(0,200)");

        // click prices
        driver.findElement(By.xpath("(//li[@class='rilrtl-list-item'])[11]")).click();
        explicitWait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='loader']")));
        driver.findElement(By.xpath("(//li[@class='rilrtl-list-item'])[12]")).click();

        explicitWait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='loader']")));
        driver.findElement(By.xpath("//div[@class='item rilrtl-luxe-products-list__item item']")).click();

        // switch to new tab
        CommonUtils.goToNewTab(driver);

        // select size
        driver.findElement(By.xpath("//div[@class='circle size-variant-item size-instock '][@role='button']")).click();

        // click add to cart
        driver.findElement(By.xpath("//div[@class='btn-gold btn-dark'][@role='button']")).click();

        // click go to bag
        try{
            driver.findElement(By.xpath("//div[@class='pdp-addtocart-button'][@role='button']")).click();
        }catch (Exception e){
            System.out.println("No such element");
        }

        driver.quit();
    }

}
