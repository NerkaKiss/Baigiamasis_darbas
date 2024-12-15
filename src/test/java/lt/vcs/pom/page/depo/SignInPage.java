package lt.vcs.pom.page.depo;

import lt.vcs.pom.page.Common;

import static lt.vcs.pom.page.Locator.Depo.SignIn.*;

public class SignInPage {
    public static void enterEmail(String value) {
        Common.waitForPageLoadAndAjaxComplete(8);
        Common.sendKeysToElement(inputEmail, value);
    }

    public static void enterPassword(String value) {
        Common.sendKeysToElement(inputPassword, value);
    }

    public static void clickButtonOk() {
        Common.clickOnElement(buttonSubmit);
    }
}
