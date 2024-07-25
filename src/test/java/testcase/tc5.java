package testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

//5th Flow
public class tc5 {
    @Test
    public void function1() throws InterruptedException{

        WebDriver driver = CommonUtils.setBrowser();

        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(By.xpath("//li[@data-test='li-WOMEN']/a/span"))).perform();//Hovered to Women's category
        actions.moveToElement(driver.findElement(By.xpath("//li[@data-test='li-WOMEN']/div/ul/li[2]/a"))).perform();//Brands
        actions.moveToElement(driver.findElement(By.xpath("//header/div[@class='header-right']/div/ul/li[2]/div/ul/li[2]/div/div/div[4]/div/div[2]/span/a[@title='Carlton London']"))).click().perform();//Brand selected (Carlton London)
        actions.moveToElement(driver.findElement(By.xpath("//label[@class='facet-linkname facet-linkname-l1l3nestedcategory facet-linkname-Women - Flip Flop & Slippers']"))).click().perform();//Filters(Flip Flops)
        actions.moveToElement(driver.findElement(By.xpath("//div[@class='item rilrtl-products-list__item item']"))).click().perform();//Item selected

        Thread.sleep(2000);
        actions.moveToElement(driver.findElement(By.xpath("//div[@class='item rilrtl-products-list__item item']"))).click().perform();
        // go to next window
        CommonUtils.goToNewTab(driver);

        actions.moveToElement(driver.findElement(By.xpath("//div[@class='circle size-variant-item size-instock ']"))).click().perform();//Select size of item selected
        actions.moveToElement(driver.findElement(By.xpath("//div[@class='pdp-cart-buttons']/div/div/div/span[2]"))).click().perform();//Add to Cart button

        driver.quit();
    }
}
