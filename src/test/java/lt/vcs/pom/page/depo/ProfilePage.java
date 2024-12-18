package lt.vcs.pom.page.depo;

import lt.vcs.pom.page.Common;

import static lt.vcs.pom.page.Locator.Depo.Profile.*;

public class ProfilePage {
    public static void clickOnButtonAddDeliveryAddress() {
        Common.waitForPageLoadAndAjaxComplete(8);
        Common.clickOnElement(divButtonAddAddress);
    }

    public static void enterAddress(String value) {
        Common.waitForPageLoadAndAjaxComplete(8);
        Common.waitElementIsVisible(inputAddress, 5);
        Common.sendKeysToElement(inputAddress, value);
    }

    public static void enterCity(String value) {
        Common.sendKeysToElement(inputCity, value);
    }

    public static void chooseCountryLithuania() {
        Common.clickOnElement(labelDrowpdownList);
        Common.clickOnElement(divButtonCountryLithuania);
    }

    public static void enterPostCode(String value) {
        Common.sendKeysToElement(inputPostalCode, value);
    }

    public static void clickOnButtonSave() {
        Common.clickOnElement(buttonSaveAddress);
    }

    public static String readLastAddedAddress() {
        Common.waitElementIsNotVisible(buttonSaveAddress, 8);
        return Common.getTextFromElement(divLastAddress);
    }

    public static String readLastAddedCity() {
        return Common.getTextFromElement(divLastCity);
    }

    public static String readLastAddedPostCode() {
        return Common.getTextFromElement(divLastPostCode);
    }

    public static String readLastAddedCountry() {
        return Common.getTextFromElement(divLastCountry);
    }
}
