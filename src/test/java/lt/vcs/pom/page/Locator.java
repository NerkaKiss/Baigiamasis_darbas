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
            public static final By divLogout = By.xpath(
                    "//div[normalize-space()='Atsijungti']");
        }

        public static class Product {
            public static final By divBarcode = By.xpath(
                    "//div[contains(@class,'relative w-full')]/div/div/div[2]");
            public static final By divProductName = By.xpath(
                    "//div[contains(@class,'relative w-full')]/div/div/div[1]");
        }

        public static class Profile {
            public static final By divButtonAddAddress = By.xpath(
                    "//div[contains(@class, 'page-content')]//button");
            public static final By inputAddress = By.xpath(
                    "//input[@name='address']");
            public static final By inputCity = By.xpath(
                    "//input[@name='city']");
            public static final By inputPostalCode = By.xpath(
                    "//input[@name='postalCode']");
            public static final By labelDrowpdownList = By.xpath(
                    "//label[contains(@id, 'Dropdown') and contains(@id, '-label')]/following-sibling::div[1]"
            );
            public static final By divButtonCountryLithuania = By.xpath(
                    "//div[contains(@id, 'Dropdown') and contains(@id, '-list')]//button[2]");
            public static final By buttonSaveAddress = By.xpath(
                    "//button[contains(text(),'Išsaugoti')]");
            public static final By divLastAddress = By.xpath(
                    "(//div[contains(@class, 'page-content')]//div[contains(@class, 'grid')]//div[contains(@class, 'w-full')])[last()]//p[1]");
            public static final By divLastCity = By.xpath(
                    "(//div[contains(@class, 'page-content')]//div[contains(@class, 'grid')]//div[contains(@class, 'w-full')])[last()]//p[2]");
            public static final By divLastPostCode = By.xpath(
                    "(//div[contains(@class, 'page-content')]//div[contains(@class, 'grid')]//div[contains(@class, 'w-full')])[last()]//p[5]");
            public static final By divLastCountry = By.xpath(
                    "(//div[contains(@class, 'page-content')]//div[contains(@class, 'grid')]//div[contains(@class, 'w-full')])[last()]//p[4]");
        }
    }
}
