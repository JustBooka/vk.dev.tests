package com.vk.dev.tests.unauthorizedUser;

import com.vk.dev.tests.MyTestBase;
import org.testng.annotations.Test;

public class OpenMainPageTests extends MyTestBase {
    //Check that main vk page opened when unauthorized user click on elements.

    @Test
    public void testUnLoginClickOnCreateApp() throws Exception {
        app.getCheckHelper().CheckDevMainPage();
        app.getNavHelper().ClickAndWait("css=div.dev_create_app_btn.fl_l > button.flat_button");
        app.getCheckHelper().CheckMainVKPage();
    }

    @Test
    public void testUnLoginClickOnMyApp() throws Exception {
        app.getCheckHelper().CheckDevMainPage();
        app.getNavHelper().ClickAndWait("id=dev_top_apps");
        app.getCheckHelper().CheckMainVKPage();
    }

    @Test
      public void testUnLoginClickOnListMyApps() throws Exception {
        app.getCheckHelper().CheckDevMainPage();
        app.getNavHelper().ClickAndWait("link=Список моих приложений →");
        app.getCheckHelper().CheckMainVKPage();
    }

    @Test
    public void testUnLoginClickOnBugTracker() throws Exception {
        app.getCheckHelper().CheckDevMainPage();
        app.getNavHelper().ClickAndWait("//div[@id='dev_page_wrap']/div[3]/div/div/div/a[4]/div");
        app.getCheckHelper().CheckMainVKPage();
    }
}
