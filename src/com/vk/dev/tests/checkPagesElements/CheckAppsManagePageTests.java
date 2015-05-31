package com.vk.dev.tests.checkPagesElements;

import com.vk.dev.tests.MyTestBase;
import org.testng.annotations.Test;

/**
 * Created by User on 31.05.2015.
 */
public class CheckAppsManagePageTests extends MyTestBase {
//run with authorize
    @Test
    public void testkEmptyAppsManagePage() {
        app.getNavHelper().OpenVKDevPageAuthorize()
                .ClickAndWait("//*[@id='dev_top_apps']");
        app.getCheckHelper().CheckText("Документация", "id=dev_mlist_main")
                .CheckText("Работа с API","id=dev_mlist_apiusage")
                .CheckText("SDK","id=dev_mlist_SDK")
                .CheckText("Список методов","id=dev_mlist_methods")
                .CheckText("Поддержка","id=dev_mlist_help")
                .CheckText("Правила","id=dev_mlist_terms")
                .CheckText("Мои приложения","css=div.label.fl_l > div.fl_l")
                .CheckText("Создать приложение","css=button.flat_button.fl_r")
                .CheckText("","id=s_search")
                .CheckText("Вы ещё не являетесь администратором ни одного приложения.\nСоздать приложение »","id=no_apps");
        app.getNavHelper().ClickAndWait("//a[contains(@href, '/editapp?act=create')]");
        app.getCheckHelper().CheckText("Создание приложения","css=div.label");
        app.getNavHelper().ClickAndWait("id=dev_top_apps").ClickAndWait("css=button.flat_button.fl_r");
        app.getCheckHelper().CheckText("Создание приложения","css=div.label");
    }
}
