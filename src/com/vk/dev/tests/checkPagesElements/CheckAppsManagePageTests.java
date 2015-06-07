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
        app.getNavHelper().openVKDevPageAuthorize()
                .clickAndWait("//*[@id='dev_top_apps']");
        app.getCheckHelper().checkText("Документация", "id=dev_mlist_main")
                .checkText("Работа с API","id=dev_mlist_apiusage")
                .checkText("SDK","id=dev_mlist_SDK")
                .checkText("Список методов","id=dev_mlist_methods")
                .checkText("Поддержка", "id=dev_mlist_help")
                .checkText("Правила", "id=dev_mlist_terms")
                .checkText("Мои приложения", "css=div.label.fl_l > div.fl_l")
                .checkText("Создать приложение", "css=button.flat_button.fl_r")
                .checkText("", "id=s_search");
//                .checkText("Вы ещё не являетесь администратором ни одного приложения.\nСоздать приложение »","id=no_apps"); // when user don`t have any apps
        app.getNavHelper().clickAndWait("//a[contains(@href, '/editapp?act=create')]");
        app.getCheckHelper().checkText("Создание приложения","css=div.label");
        app.getNavHelper().clickAndWait("id=dev_top_apps").clickAndWait("css=button.flat_button.fl_r");
        app.getCheckHelper().checkText("Создание приложения","css=div.label");
    }
}
