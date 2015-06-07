package com.vk.dev.tests;


import com.vk.dev.page.MainVKPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

/**
 * Created by alexey.bukin on 28.05.2015.
 */
public class AuthorizeTests extends MyTestBase {

    WebDriver driver;
    MainVKPage objMainVK;

    @Test
    public void testAuthorize() throws Exception {
     app.getNavHelper().openVKMainPage();
        objMainVK = new MainVKPage(driver);
        objMainVK.LogIn("+79043395299", "awedxzs123");
        Thread.sleep(2000);
        app.getCheckHelper().checkText("Моя Страница", "css=span.left_label.inl_bl");
    }
}
