package lt.vcs.pom.util;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Driver {
    private static WebDriver driver;

    public static void setChromeDriver() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--start-maximized");
        chromeOptions.addArguments("--force-device-scale-factor=0.7");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(chromeOptions);
    }

    public static WebDriver getDriver() {
        return driver;
    }

    public static void quitDriver() {
        driver.quit();
    }
}
