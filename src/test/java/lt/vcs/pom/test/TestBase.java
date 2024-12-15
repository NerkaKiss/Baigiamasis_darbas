package lt.vcs.pom.test;

import lt.vcs.pom.page.Common;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public abstract class TestBase {
    @BeforeMethod
    public abstract void setUp();

    @AfterMethod
    public void tearDown(){
        Common.close();
    }
}
