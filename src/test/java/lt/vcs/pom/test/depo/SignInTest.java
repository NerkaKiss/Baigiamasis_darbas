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
    }

    @Test
    public void testPositive_Login_ExpectedAccountIsVisible() {
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

    @Test
    public void testNegative_LoginWithEmptyEmail_ExpectedErrorMessage() {
        String email = "";
        String password = "BuzBfCd&6454";
        String expectedUrl = "https://online.depo-diy.lt/sign-in";
        String expectedFullName = "Būtinai užpildomas laukelis!";
        SignInPage.enterEmail(email);
        SignInPage.enterPassword(password);
        SignInPage.clickButtonOk();
        boolean isSignInIsVisible = SignInPage.isSignInIsVisible();
        String actualUrl = SignInPage.readNewUrl();
        String actualErrorMessage = SignInPage.readErrorMessage();

        Assert.assertTrue(actualUrl.contains(expectedUrl),
                "\nActual: %s\nExpected contains: %s".formatted(actualUrl, expectedUrl));
        Assert.assertTrue(actualErrorMessage.contains(expectedFullName),
                "\nActual: %s\nExpected contains: %s".formatted(actualErrorMessage, expectedFullName));
        Assert.assertTrue(isSignInIsVisible, "SignIn is not visible");
    }

    @Test
    public void testNegative_LoginWithEmptyPassword_ExpectedErrorMessage() {
        String email = "mite.trudge7178@eagereverest.com";
        String password = "";
        String expectedUrl = "https://online.depo-diy.lt/sign-in";
        String expectedFullName = "Būtinai užpildomas laukelis!";
        SignInPage.enterEmail(email);
        SignInPage.enterPassword(password);
        SignInPage.clickButtonOk();
        boolean isSignInIsVisible = SignInPage.isSignInIsVisible();
        String actualUrl = SignInPage.readNewUrl();
        String actualErrorMessage = SignInPage.readErrorMessage();

        Assert.assertTrue(actualUrl.contains(expectedUrl),
                "\nActual: %s\nExpected contains: %s".formatted(actualUrl, expectedUrl));
        Assert.assertTrue(actualErrorMessage.contains(expectedFullName),
                "\nActual: %s\nExpected contains: %s".formatted(actualErrorMessage, expectedFullName));
        Assert.assertTrue(isSignInIsVisible, "SignIn is not visible");
    }

    @Test
    public void testLogout() {
        SignInPage.login();
        HomePage.clickButtonLogout();
        boolean isSignInIsVisible = HomePage.isSignInIsVisible();
        boolean isSessionDataIsEmpty = HomePage.isSessionDataIsNull();
        boolean isAcceptCookiesVisible = HomePage.isAcceptCookiesVisible();
        Assert.assertTrue(isSignInIsVisible, "SignIn is not visible");
        Assert.assertTrue(isSessionDataIsEmpty, "Session data is not empty");
        Assert.assertTrue(isAcceptCookiesVisible, "Accept cookies is not visible");
    }
}
