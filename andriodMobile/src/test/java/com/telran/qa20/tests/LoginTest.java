package com.telran.qa20.tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {
    @Test
    public void testLogin() throws InterruptedException {
app.getSession().clickLoginButton();
app.getSession().fillLoginForm("narishkaalex@gmail.com", "301184Alex");
app.getSession().confirmLogin();
app.getSession().pause(10000);
        Assert.assertTrue(app.getSession().isElrmrntPresent(By.id("Search")));
    }
}
