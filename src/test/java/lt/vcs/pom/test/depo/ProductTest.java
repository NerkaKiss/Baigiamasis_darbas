package lt.vcs.pom.test.depo;

import lt.vcs.pom.page.depo.HomePage;
import lt.vcs.pom.page.depo.ProductPage;
import lt.vcs.pom.page.depo.SignInPage;
import lt.vcs.pom.test.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ProductTest extends TestBase {

    @BeforeMethod
    @Override
    public void setUp() {
        HomePage.open();
        SignInPage.login();
    }

    @Test
    public void testPositive_SearchProductWithBarcode() {
        String productBarcode = "4750366001017";
        String expectedBarcode = "4750366001017";
        String expectedUrl = "https://online.depo-diy.lt/product/114718";
        String expectedProductName = "Baldų priežiūros priemonė KVADR 300ml";

        HomePage.enterProductBarcodeInSearchInput(productBarcode);
        HomePage.clickOnButtonSearch();
        HomePage.clickOnFirstFoundProduct();
        String actualUrl = ProductPage.readNewUrl();
        String actualBarcode = ProductPage.readBarcode();
        String actualProductName = ProductPage.readProductName();

        Assert.assertTrue(actualUrl.contains(expectedUrl),
                "\nActual: %s\nExpected contains: %s".formatted(actualUrl, expectedUrl));
        Assert.assertTrue(actualProductName.contains(expectedProductName),
                "\nActual: %s\nExpected contains: %s".formatted(actualProductName, expectedProductName));
        Assert.assertTrue(actualBarcode.contains(expectedBarcode),
                "\nActual: %s\nExpected contains: %s".formatted(actualBarcode, expectedBarcode));
    }
}
