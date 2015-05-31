package com.vk.dev.tests;

import org.testng.annotations.Test;

/**
 * Created by alexey.bukin on 28.05.2015.
 */
public class LogOutTests extends MyTestBase {

    @Test
    public void testLogOut() throws Exception {
        app.getCheckHelper().CheckDevMainPage();
        app.getNavHelper().ClickAndWait("css=img");
        app.getNavHelper().ClickAndWait("id=logout_link");
        app.getCheckHelper().CheckMainVKPage();
    }
}
