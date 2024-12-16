package lt.vcs.pom.page.depo;

import lt.vcs.pom.page.Common;

import static lt.vcs.pom.page.Locator.Depo.Product.*;

public class ProductPage {
    public static String readNewUrl() {
        Common.waitForPageLoadAndAjaxComplete(8);
        return Common.getCurrentUrl();
    }

    public static String readBarcode() {
        return Common.getTextFromElement(divBarcode);
    }

    public static String readProductName() {
        return Common.getTextFromElement(divProductName);
    }
}
