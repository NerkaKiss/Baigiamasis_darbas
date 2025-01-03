package lt.vcs.pom.page.depo;

import lt.vcs.pom.page.Common;

import static lt.vcs.pom.page.Locator.Depo.SignIn.*;

public class SignInPage {
    public static void enterEmail(String value) {
        Common.waitForPageLoadAndAjaxComplete(8);
        Common.waitElementIsVisible(inputEmail, 8);
        Common.clickOnElementWithActions(inputEmail);
        Common.sendKeysToElement(inputEmail, value);
    }

    public static void enterPassword(String value) {
        Common.sendKeysToElement(inputPassword, value);
    }

    public static void clickButtonOk() {
        Common.clickOnElement(buttonSubmit);
    }

    public static String readNewUrl() {
        return Common.getCurrentUrl();
    }

    public static boolean isSignInIsVisible() {
        return Common.isElementDisplayed(divSignIn);
    }

    public static String readErrorMessage() {
        return Common.getTextFromElement(divErrorMessage);
    }

    public static void login() {
        String email = "mite.trudge7178@eagereverest.com";
        String password = "BuzBfCd&6454";
        SignInPage.enterEmail(email);
        SignInPage.enterPassword(password);
        SignInPage.clickButtonOk();
    }
}
