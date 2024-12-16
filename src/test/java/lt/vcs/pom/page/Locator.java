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
            public static final By inputSearchBox = By.xpath(
                    "//input[contains(@id, 'SearchBox')]");
            public static final By divSearchButton = By.xpath(
                    "//div[@role='presentation']/../div[contains(@class, 'group')]");
            public static final By divFirstSearchProduct = By.xpath(
                    "//div[contains(@class,'ms-Image clickable absolute')]");
        }

        public static class Product {
            public static final By divBarcode = By.xpath(
                    "//div[contains(@class,'relative w-full')]/div/div/div[2]");
            public static final By divProductName = By.xpath(
                    "//div[contains(@class,'relative w-full')]/div/div/div[1]");
        }
    }
}
