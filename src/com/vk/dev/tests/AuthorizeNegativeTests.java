package com.vk.dev.tests;

import com.vk.dev.page.MainVKPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

/**
 * Created by User on 06.06.2015.
 */
public class AuthorizeNegativeTests extends MyTestBase {

    WebDriver driver;
    MainVKPage objMainVK;

    @Test
    public void testAuthorizeNegative(){
        app.getNavHelper().openVKMainPage();
        objMainVK = new MainVKPage(driver);
        objMainVK.LogIn("", "");
        app.getCheckHelper().checkMainVKPage();
        objMainVK.LogIn("+79043395299", "");
        app.getCheckHelper().checkMainVKPage();
        objMainVK.LogIn("", "awedxzs123");
        app.getCheckHelper().checkMainVKPage();
    }

    @Test
    public void testAuthorizeWithWrongPassword() throws Exception {
        app.getNavHelper().openVKMainPage();
        objMainVK = new MainVKPage(driver);
        objMainVK.LogIn("+79043395299", "123");
        Thread.sleep(2000);
        app.getCheckHelper().checkText("Не удается войти.","//*[@id='message']/b[1]");
    }
}
