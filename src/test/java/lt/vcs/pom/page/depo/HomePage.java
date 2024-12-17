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
        Common.waitForPageLoadAndAjaxComplete(8);
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

    public static void enterProductNameInSearchInput(String value) {
        Common.waitForPageLoadAndAjaxComplete(8);
        Common.sendKeysToElement(inputSearchBox, value);
    }

    public static void clickOnButtonProfileFullName() {
        Common.waitForPageLoadAndAjaxComplete(8);
        Common.clickOnElement(divFullName);
    }

    public static void clickOnButtonAccount() {
        Common.clickOnElement(divAccount);
    }

    public static boolean isSignInIsVisible() {
        return Common.isElementDisplayed(divSignIn);
    }

    public static boolean isSessionDataIsNull() {
        System.out.println(Common.getItemOfSessionStorageWithJSExecutor("UserInfo"));
        return Common.getItemOfSessionStorageWithJSExecutor("UserInfo").equals("undefined");
    }

    public static void clickButtonLogout() {
        Common.waitForPageLoadAndAjaxComplete(8);
        Common.clickOnElementWithActions(divFullName);
        Common.clickOnElementWithActions(divLogout);
    }

    public static boolean isAcceptCookiesVisible() {
        return Common.isElementDisplayed(spanAcceptCookies);
    }
}
