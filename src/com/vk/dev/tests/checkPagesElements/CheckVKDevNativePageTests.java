package com.vk.dev.tests.checkPagesElements;

import com.vk.dev.tests.MyTestBase;
import org.testng.annotations.Test;

/**
 * Created by User on 31.05.2015.
 */
public class CheckVKDevNativePageTests extends MyTestBase {

    @Test
    public void OpenVKDevNativePage () throws InterruptedException {
        app.getNavHelper().OpenVKDevPage();
        app.getCheckHelper().CheckText("Создание приложения","css=div.wk_header");
        app.getNavHelper().Click("id=dev_mlist_native");
        Thread.sleep(1000);
        app.getCheckHelper().CheckText("Игры и приложения ВКонтакте","//*[@id='dev_page_cont']/div[1]/div[1]/text()");
        app.getNavHelper().Click("id=dev_mlist_main");
        Thread.sleep(1000);
        app.getCheckHelper().CheckText("Создание приложения","css=div.wk_header");
        app.getNavHelper().Click("css=b > a");
        Thread.sleep(1000);
        app.getCheckHelper().CheckText("Игры и приложения ВКонтакте","css=div.wk_header");




    }
}
