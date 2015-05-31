package com.vk.dev.tests;

import org.testng.annotations.Test;

/**
 * Created by alexey.bukin on 28.05.2015.
 */
public class AuthorizeTests extends MyTestBase {

    @Test
    public void testAuthorized() throws Exception {
        app.getCheckHelper().CheckDevMainPage();
        app.getNavHelper().ClickAndWait("css=div.dev_create_app_btn.fl_l > button.flat_button");
        app.getCheckHelper().CheckMainVKPage();
        app.getInputHelper()
                .TypeText("id=quick_email", "+79043395299")
                .TypeText("id=quick_pass", "awedxzs123");
        app.getNavHelper().ClickAndWait("id=quick_login_button");
        app.getCheckHelper().CheckText("Моя Страница", "css=span.left_label.inl_bl");
    }
}
