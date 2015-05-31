package com.vk.dev.tests.fillingPagesTests;

import com.vk.dev.tests.MyTestBase;
import org.testng.annotations.Test;

/**
 * Created by User on 31.05.2015.
 */
public class CreateAppPageTests extends MyTestBase {

    @Test
    public void testPressConfirmButtonWithEmptyFields1 () throws InterruptedException {
        app.getNavHelper().OpenVKDevPageAuthorize()
                .ClickAndWait("css=button.flat_button");
        app.getNavHelper().Click("//*[@id='apps_create_app_btn']");
        Thread.sleep(3000);
        app.getCheckHelper().CheckText("Создание приложения","css=div.label");
    }

    @Test
    public void testPressConfirmButtonWithEmptyFields2 () throws InterruptedException {
        app.getNavHelper().OpenVKDevPageAuthorize()
                .ClickAndWait("css=button.flat_button");
        app.getNavHelper().Click("css=#app_type_1 > div")
                .Click("//*[@id='apps_create_app_btn']");
        Thread.sleep(3000);
        app.getCheckHelper().CheckText("Создание приложения","css=div.label");
    }

    @Test
     public void testPressConfirmButtonWithEmptyFields3 () throws InterruptedException {
        app.getNavHelper().OpenVKDevPageAuthorize()
                .ClickAndWait("css=button.flat_button");
        app.getNavHelper().Click("css=#app_type_2 > div")
                .Click("//*[@id='apps_create_app_btn']");
        Thread.sleep(3000);
        app.getCheckHelper().CheckText("Создание приложения","css=div.label");
    }

    @Test
    public void testPressConfirmButtonWithEmptyFields4 () throws InterruptedException {
        app.getNavHelper().OpenVKDevPageAuthorize()
                .ClickAndWait("css=button.flat_button");
        app.getNavHelper().Click("css=#app_type_2 > div")
                .Click("css=#app_category_1 > div")
                .Click("//*[@id='apps_create_app_btn']");
        Thread.sleep(3000);
        app.getCheckHelper().CheckText("Создание приложения","css=div.label");
    }
}
