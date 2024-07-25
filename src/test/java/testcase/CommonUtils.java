package testcase;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.URL;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

public class CommonUtils {

    static WebDriver driver;
    static String browser = "chrome";

    static String homeIP =  "http://192.168.0.108:4444/wd/hub";
    static String IbmIP = "http://9.113.180.30:4444/wd/hub";

    public static WebDriver setBrowser(){
        if (browser.equalsIgnoreCase("Chrome")) {
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("firefox")) {
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("edge")) {
            driver = new EdgeDriver();
        }

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.ajio.com/");
        driver.manage().window().maximize();

        return driver;
    }

    public static WebDriver setSeleniumGrid() throws Throwable{
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setPlatform(Platform.WINDOWS);

        if (browser.equalsIgnoreCase("chrome")) {
            ChromeOptions options = new ChromeOptions();
            cap.merge(options);
            driver = new RemoteWebDriver(new URL(homeIP), cap);
        } else if (browser.equalsIgnoreCase("firefox")) {
            FirefoxOptions options = new FirefoxOptions();
            cap.merge(options);
            driver = new RemoteWebDriver(new URL(homeIP), cap);
        } else if (browser.equalsIgnoreCase("edge")) {
            EdgeOptions options = new EdgeOptions();
            cap.merge(options);
            driver = new RemoteWebDriver(new URL(homeIP), cap);
        }

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.ajio.com/");
        driver.manage().window().maximize();

        return driver;
    }

    public static void goToNewTab(WebDriver driver){
        Set<String> windows = driver.getWindowHandles();
        Iterator<String> it = windows.iterator();
        String parentWindow = it.next();
        String childWindow = it.next();
        driver.switchTo().window(childWindow);
    }
}
