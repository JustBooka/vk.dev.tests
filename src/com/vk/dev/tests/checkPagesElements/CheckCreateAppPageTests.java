package com.vk.dev.tests.checkPagesElements;

import com.vk.dev.tests.MyTestBase;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.*;

/**
 * Created by alexey.bukin on 28.05.2015.
 */
public class CheckCreateAppPageTests extends MyTestBase {
//should run with authorize

    @Test
    public void testCheckLeftSideMenu() throws Exception {
        app.getNavHelper().openVKDevPageAuthorize();
        app.getNavHelper().clickAndWait("css=button.flat_button");
        app.getCheckHelper()
                .checkText("Документация", "id=dev_mlist_main")
                .checkText("Работа с API", "id=dev_mlist_apiusage")
                .checkText("SDK", "id=dev_mlist_SDK")
                .checkText("Список методов", "id=dev_mlist_methods")
                .checkText("Поддержка", "id=dev_mlist_help")
                .checkText("Правила", "id=dev_mlist_terms");
    }

    @Test
    public void testContentPageWhenOpen() throws Exception {
        app.getNavHelper().openVKDevPageAuthorize();
        app.getNavHelper().clickAndWait("css=button.flat_button");
        app.getCheckHelper()
                .checkText("Создание приложения", "css=div.label")
                .checkText("Название:", "css=td.label.ta_r")
                .checkText("Тип:", "css=#app_type > tbody > tr > td.label.ta_r")
                .checkText("Standalone-приложение", "id=app_type_0")
                .checkText("Веб-сайт", "id=app_type_1")
                .checkText("IFrame/Flash приложение", "id=app_type_2")
                .checkText("Подключить приложение", "id=apps_create_app_btn");
    }


    @Test
    public void testSelectWeb() throws Exception {
        app.getNavHelper().openVKDevPageAuthorize()
                .clickAndWait("css=button.flat_button");
        app.getCheckHelper()
                .checkText("Создание приложения", "css=div.label")
                .click("id=app_type_1")
                .checkText("Адрес сайта:", "css=#apps_edit_connect_options > table.apps_edit_table > tbody > tr > td.label.ta_r")
                .checkText("Базовый домен:", "//div[@id='apps_edit_connect_options']/table/tbody/tr[2]/td")
                .checkText("", "id=app_base_domain")
                .checkText("", "id=app_site_url")
                .checkText("Подключить сайт", "id=apps_create_app_btn");
    }

    @Test
    public void testSelectIFrameFlashApp() throws Exception {
        app.getNavHelper().openVKDevPageAuthorize();
        app.getNavHelper().clickAndWait("css=button.flat_button");
        app.getCheckHelper()
                .checkText("Создание приложения", "css=div.label")
                .click("id=app_type_2")
                .checkText("Описание:", "css=#apps_edit_iframe_options > #app_type > tbody > tr > td.label.ta_r")
                .checkText("Тип:", "xpath=(//table[@id='app_type']/tbody/tr[2]/td)[3]")
                .checkText("Игра", "id=app_category_0")
                .checkText("Приложение", "id=app_category_1")
                .checkText("Категория:", "xpath=(//table[@id='app_type']/tbody/tr[3]/td)[3]")
                .checkText("Загружая приложение, Вы соглашаетесь с правилами размещения приложений", "css=td.apps_edit_agree")
                .checkText("Перейти к загрузке приложения", "id=apps_create_app_btn");
        app.getNavHelper().scrollDown();
        app.getInputHelper().typeText("id=app_desc", "test");
        app.getNavHelper().pressTab("id=app_desc");
        Thread.sleep(2000);
        app.getNavHelper().click("id=app_category_1")
                .click("id=app_category_0")
                .click("css=#app_category_1 > div")
                .click("css=#app_category_0 > div");
//        app.getCheckHelper().checkText("Аркады", "//*[@id='container1']/table/tbody/tr/td[1]");
//        app.getNavHelper().click("//*[contains(text(),'Аркады')]");
//        Thread.sleep(2000);
    }

    @Test
    public void testCheckPostedRules() throws Exception {
        app.getNavHelper().openVKDevPageAuthorize()
                .clickAndWait("css=button.flat_button");
        app.getCheckHelper()
                .checkText("Создание приложения", "css=div.label");
        app.getNavHelper().click("id=app_type_2")
                .click("css=td.apps_edit_agree > a");
        sleep(1000);
        app.getCheckHelper()
                .checkText("Правила размещения приложений", "css=div.box_title")
                .checkText("Закрыть", "css=div.box_x_button")
                .checkText("Правила платформы", "css=div.wk_header")
                .checkText("правила размещения рекламных приложений", "//a[contains(@href, '/dev/ad_apps')]")
                .checkText("кабинет Таргетированной рекламы", "//a[@href='http://vk.com/ads?act=office']")
                .checkText("Правила размещения рекламы в приложениях", "//a[contains(@href, '/dev/adterms')]")
                .checkText("Правила размещения магазинов в приложениях", "//a[contains(@href, '/dev/ecommerce_terms')]")
                .checkText("Правила размещения рекламных приложений", "//blockquote/a[3]")
                .checkText("Условий размещения приложений на сайте VK.com", "//a[contains(@href, '/dev/appterms')]")
                .checkText("Закрыть", "//div[@id='box_layer']/div[2]/div/div[3]/div/table/tbody/tr/td/button");
    }

    @Test
    public void testOpenFromDevMain() throws Exception {
        app.getNavHelper().openVKDevPageAuthorize()
                .clickAndWait("//*[@id='dev_top_docs']")
                .clickAndWait("//a[@href='http://vk.com/editapp?act=create']");
        app.getCheckHelper()
                .checkText("Создание приложения", "//div[@id='apps_edit_create_cont']/div/div")
                .checkText("Название:", "css=td.label.ta_r")
                .checkText("Тип:", "css=#app_type > tbody > tr > td.label.ta_r")
                .checkText("Standalone-приложение", "id=app_type_0")
                .checkText("Веб-сайт", "id=app_type_1")
                .checkText("IFrame/Flash приложение", "id=app_type_2")
                .checkText("Подключить приложение", "id=apps_create_app_btn");
    }
}
