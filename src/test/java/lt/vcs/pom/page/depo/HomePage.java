package lt.vcs.pom.page.depo;

import lt.vcs.pom.page.Common;

import static lt.vcs.pom.page.Locator.Depo.Home.*;

public class HomePage {
    public static void open() {
        Common.setUpChrome(8);
        Common.openUrl("https://online.depo-diy.lt/");
        acceptCookies();
        chooseKaunasStore();
        clickButtonSignIn();
    }

    public static void acceptCookies() {
        Common.waitElementIsVisible(spanAcceptCookies, 5);
        Common.clickOnElement(spanAcceptCookies);
    }

    public static void chooseKaunasStore() {
        Common.waitElementIsClickable(divButtonStoreDropList, 5);
        Common.clickOnElement(divButtonStoreDropList);
        Common.clickOnElement(labelButtonKaunasStoreVakarinis);
        Common.clickOnElement(buttonStoreDropListOk);
    }

    public static void clickButtonSignIn() {
        Common.clickOnElement(divSignIn);
    }

    public static String readNewUrl() {
        return Common.getCurrentUrl();
    }

    public static String readFullName() {
        return Common.getTextFromElement(divFullName);
    }

    public static boolean isAccountIsVisible() {
        Common.clickOnElement(divFullName);
        Common.waitForPageLoadAndAjaxComplete(8);
        return Common.isElementDisplayed(divAccount);
    }

    public static void enterProductBarcodeInSearchInput(String value) {
        Common.waitForPageLoadAndAjaxComplete(8);
        Common.sendKeysToElement(inputSearchBox, value);
    }

    public static void clickOnButtonSearch() {
        Common.clickOnElement(divSearchButton);
    }

    public static void clickOnFirstFoundProduct() {
        Common.waitForPageLoadAndAjaxComplete(5);
        Common.clickOnElement(divFirstSearchProduct);
    }
}
