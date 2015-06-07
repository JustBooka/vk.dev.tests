package com.vk.dev.tests.unauthorizedUser;

import com.vk.dev.tests.MyTestBase;
import org.testng.annotations.Test;

public class OpenMainPageTests extends MyTestBase {
    //Checking that main vk page opened when unAuthorized user click on elements.

    @Test
    public void testUnLoginClickOnCreateApp() throws Exception {
        app.getCheckHelper().checkDevMainPage();
        app.getNavHelper().clickAndWait("css=div.dev_create_app_btn.fl_l > button.flat_button");
        app.getCheckHelper().checkMainVKPage();
    }

    @Test
    public void testUnLoginClickOnMyApp() throws Exception {
        app.getCheckHelper().checkDevMainPage();
        app.getNavHelper().clickAndWait("id=dev_top_apps");
        app.getCheckHelper().checkMainVKPage();
    }

    @Test
      public void testUnLoginClickOnListMyApps() throws Exception {
        app.getCheckHelper().checkDevMainPage();
        app.getNavHelper().clickAndWait("//div[@id='dev_page_wrap']/div/div/div/div[3]/a");
        app.getCheckHelper().checkMainVKPage();
    }

    @Test
    public void testUnLoginClickOnBugTracker() throws Exception {
        app.getCheckHelper().checkDevMainPage();
        app.getNavHelper().clickAndWait("//div[@id='dev_page_wrap']/div[3]/div/div/div/a[4]/div");
        app.getCheckHelper().checkMainVKPage();
    }
}
