package com.vk.dev.tests;

import org.testng.annotations.Test;

/**
 * Created by alexey.bukin on 28.05.2015.
 */
public class LogOutTests extends MyTestBase {

    @Test
    public void testLogOut() throws Exception {
        app.getCheckHelper().checkDevMainPage();
        app.getNavHelper().clickAndWait("css=img");
        app.getNavHelper().clickAndWait("id=logout_link");
        app.getCheckHelper().checkMainVKPage();
    }
}
