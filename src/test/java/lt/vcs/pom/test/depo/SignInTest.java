package lt.vcs.pom.test.depo;

import lt.vcs.pom.page.depo.HomePage;
import lt.vcs.pom.page.depo.SignInPage;
import lt.vcs.pom.test.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SignInTest extends TestBase {
    @BeforeMethod
    @Override
    public void setUp() {
        HomePage.open();
        HomePage.acceptCookies();
        HomePage.chooseKaunasStore();
        HomePage.clickButtonSignIn();
    }

    @Test
    public void testPositiveLogin() {
        String email = "mite.trudge7178@eagereverest.com";
        String password = "BuzBfCd&6454";
        String expectedUrl = "https://online.depo-diy.lt/";
        String expectedFullName = "Vardenis Pavardenis";
        SignInPage.enterEmail(email);
        SignInPage.enterPassword(password);
        SignInPage.clickButtonOk();
        boolean isAccountIsVisible = HomePage.isAccountIsVisible();
        String actualUrl = HomePage.readNewUrl();
        String actualFullName = HomePage.readFullName();

        Assert.assertTrue(actualUrl.contains(expectedUrl),
                "\nActual: %s\nExpected contains: %s".formatted(actualUrl, expectedUrl));
        Assert.assertTrue(actualFullName.contains(expectedFullName),
                "\nActual: %s\nExpected contains: %s".formatted(actualFullName, expectedFullName));
        Assert.assertTrue(isAccountIsVisible, "Account is not visible");
    }
}
