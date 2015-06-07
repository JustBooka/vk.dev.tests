package com.vk.dev.tests.fillTests;


import com.vk.dev.page.StandAloneAppInfoPage;
import com.vk.dev.tests.MyTestBase;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

/**
 * Created by User on 07.06.2015.
 */
public class StandAloneAppInfoTests extends MyTestBase {

    //run with authorize

    WebDriver driver;
    StandAloneAppInfoPage objSAAInfo;


    @Test
    public void testFillInfoPage() throws InterruptedException {
        app.getNavHelper().openVKDevPageAuthorize()
                .clickAndWait("//*[@id='dev_top_apps']")
                .clickAndWait("//a[contains(@href, 'editapp?id=4948066')]");
        app.getNavHelper().openCreateAppPage();
        objSAAInfo = new StandAloneAppInfoPage(driver);
        objSAAInfo.fillStandAloneAppInfo("appname","app description");
        Thread.sleep(1000);
        app.getCheckHelper().checkText("Информация о приложении отредактирована.", "//*[@id='apps_options_saved']");
    }
}
