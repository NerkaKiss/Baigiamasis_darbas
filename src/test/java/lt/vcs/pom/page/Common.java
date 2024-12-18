package lt.vcs.pom.page;

import lt.vcs.pom.util.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class Common {
    public static void setUpChrome(int sec) {
        Driver.setChromeDriver();
        Driver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(sec));
    }

    public static void openUrl(String url) {
        Driver.getDriver().get(url);
    }

    public static void close() {
        Driver.quitDriver();
    }

    private static JavascriptExecutor getJsExecutor() {
        return (JavascriptExecutor) Driver.getDriver();
    }

    public static String getCurrentUrl() {
        return Driver.getDriver().getCurrentUrl();
    }

    private static WebElement getElement(By locator) {
        return Driver.getDriver().findElement(locator);
    }

    private static List<WebElement> getElements(By locator) {
        return Driver.getDriver().findElements(locator);
    }

    public static void sendKeysToElement(By locator, String input) {
        getElement(locator).sendKeys(input);
    }

    public static void clickOnElement(By locator) {
        getElement(locator).click();
    }

    public static String getTextFromElement(By locator) {
        return getElement(locator).getText();
    }

    public static WebDriverWait getWebDriverWait(int seconds) {
        return new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(seconds));
    }

    public static void waitElementIsClickable(By locator, int seconds) {
        getWebDriverWait(seconds).until(ExpectedConditions.elementToBeClickable(locator));
    }

    public static void waitElementIsVisible(By locator, int seconds) {
        getWebDriverWait(seconds).until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public static void waitElementIsNotVisible(By locator, int seconds) {
        getWebDriverWait(seconds).until(ExpectedConditions.stalenessOf(getElement(locator)));
    }

    public static boolean isElementDisplayed(By locator) {
        return getElement(locator).isDisplayed();
    }

    public static void waitForPageLoadAndAjaxComplete(int seconds) {
        getWebDriverWait(seconds).until(driver -> {
            String readyState = (String) getJsExecutor().executeScript("return document.readyState");
            Boolean ajaxComplete = (Boolean) getJsExecutor().executeScript(
                    "return (typeof jQuery !== 'undefined' ? jQuery.active == 0 : true) && " +
                            "!(window.fetch && window.__pendingFetchCount > 0);"
            );
            return "complete".equals(readyState) && ajaxComplete;
        });
    }

    private static Actions getActions() {
        return new Actions(Driver.getDriver());
    }

    public static void clickOnElementWithActions(By locator) {
        getActions().click(getElement(locator)).perform();
    }

    public static String getItemOfSessionStorageWithJSExecutor(String value) {
        return (String) getJsExecutor().executeScript("return window.sessionStorage.getItem('%s');".formatted(value));
    }
}
