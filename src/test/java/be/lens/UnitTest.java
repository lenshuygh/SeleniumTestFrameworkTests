package be.lens;

import org.junit.After;
import org.junit.Assert;
import org.junit.Test;

public class UnitTest {
    @Test
    public void canGoToHomepage(){
        Pages.homePage().goTo();
        Assert.assertTrue(Pages.homePage().isAt());
    }

    @After
    public void cleanup(){
        Browser.close();
    }
}
