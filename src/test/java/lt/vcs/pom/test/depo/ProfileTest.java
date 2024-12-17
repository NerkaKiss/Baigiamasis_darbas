package lt.vcs.pom.test.depo;

import lt.vcs.pom.page.depo.HomePage;
import lt.vcs.pom.page.depo.ProfilePage;
import lt.vcs.pom.page.depo.SignInPage;
import lt.vcs.pom.test.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ProfileTest extends TestBase {

    @BeforeMethod
    @Override
    public void setUp() {
        HomePage.open();
        SignInPage.login();
        HomePage.clickOnButtonProfileFullName();
        HomePage.clickOnButtonAccount();
    }

    @DataProvider(name = "checkAddDeliveryAddressDataProvider")
    public Object[][] provideDataAddDeliveryAddressData() {

        return new Object[][]{
                {"Mano pirma gatvė", "Kaunas", "46391"},
                {"Mano antra gatvė", "Vilnius", "36594"},
                {"Studentų gatvė", "Palanga", "72654"},
        };
    }

    @Test(dataProvider = "checkAddDeliveryAddressDataProvider")
    public void testPositive_AddDeliveryAddress(String address, String city, String postCode) {
        String country = "Lithuania";
        ProfilePage.clickOnButtonAddDeliveryAddress();
        ProfilePage.enterAddress(address);
        ProfilePage.enterCity(city);
        ProfilePage.chooseCountryLithuania();
        ProfilePage.enterPostCode(postCode);
        ProfilePage.clickOnButtonSave();

        String actualAddress = ProfilePage.readLastAddedAddress();
        String actualCity = ProfilePage.readLastAddedCity();
        String actualPostCode = ProfilePage.readLastAddedPostCode();
        String actualCountry = ProfilePage.readLastAddedCountry();

        Assert.assertTrue(actualAddress.contains(address),
                "\nActual: %s\nExpected contains: %s".formatted(actualAddress, address));
        Assert.assertTrue(actualCity.contains(city),
                "\nActual: %s\nExpected contains: %s".formatted(actualCity, city));
        Assert.assertTrue(actualPostCode.contains(postCode),
                "\nActual: %s\nExpected contains: %s".formatted(actualPostCode, postCode));
        Assert.assertTrue(actualCountry.contains(country),
                "\nActual: %s\nExpected contains: %s".formatted(actualCountry, country));
    }
}
