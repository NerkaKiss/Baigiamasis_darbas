package lt.vcs.pom.page;

import org.openqa.selenium.By;

public class Locator {
    public static class Depo {
        public static class SignIn {
            public static final By inputEmail = By.xpath(
                    "//input[@name='email']");
            public static final By inputPassword = By.xpath(
                    "//input[@name='password']");
            public static final By buttonSubmit = By.xpath(
                    "//button[@type='submit']");
            public static final By divSignIn = By.xpath(
                    "//div[contains(text(),'Prisijungti')]");
            public static final By divErrorMessage = By.xpath(
                    "//div[contains(@class, 'ms-motion-fadeIn')]");
        }
        public static class Home {
            public static final By spanAcceptCookies = By.xpath(
                    "//span[contains(text(),'Patvirtinti tik')]");
            public static final By divButtonStoreDropList = By.xpath(
                    "//div[contains(@id, 'ModalFocusTrapZone')]//button[contains(@class, 'outline-none')]");
            public static final By labelButtonKaunasStoreVakarinis = By.xpath(
                    "(//label[contains(text(), 'Kaunas, Vakarinis')])[2]");
            public static final By buttonStoreDropListOk = By.xpath(
                    "//button[normalize-space()='OK']");
            public static final By divSignIn = By.xpath(
                    "//div[contains(text(),'Prisijungti')]");
            public static final By divFullName = By.xpath(
                    "//div[@role='menubar']//div[contains(@class, 'ellipsis')]");
            public static final By divAccount = By.xpath(
                    "//div[normalize-space()='Paskyra']");
        }
    }
}
