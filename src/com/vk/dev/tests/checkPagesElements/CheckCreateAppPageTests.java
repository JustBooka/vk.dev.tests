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
        app.getNavHelper().OpenVKDevPageAuthorize();
        app.getNavHelper().ClickAndWait("css=button.flat_button");
        app.getCheckHelper()
                .CheckText("Документация", "id=dev_mlist_main")
                .CheckText("Работа с API", "id=dev_mlist_apiusage")
                .CheckText("SDK", "id=dev_mlist_SDK")
                .CheckText("Список методов", "id=dev_mlist_methods")
                .CheckText("Поддержка", "id=dev_mlist_help")
                .CheckText("Правила", "id=dev_mlist_terms");
    }

    @Test
    public void testContentPageWhenOpen() throws Exception {
        app.getNavHelper().OpenVKDevPageAuthorize();
        app.getNavHelper().ClickAndWait("css=button.flat_button");
        app.getCheckHelper()
                .CheckText("Создание приложения", "css=div.label")
                .CheckText("Название:", "css=td.label.ta_r")
                .CheckText("Тип:", "css=#app_type > tbody > tr > td.label.ta_r")
                .CheckText("Standalone-приложение", "id=app_type_0")
                .CheckText("Веб-сайт", "id=app_type_1")
                .CheckText("IFrame/Flash приложение", "id=app_type_2")
                .CheckText("Подключить приложение", "id=apps_create_app_btn");
    }

    @Test
    public void testSelectWeb() throws Exception {
        app.getNavHelper().OpenVKDevPageAuthorize();
        app.getNavHelper().ClickAndWait("css=button.flat_button");
        app.getCheckHelper()
                .CheckText("Создание приложения", "css=div.label")
                .Click("id=app_type_1")
                .CheckText("Адрес сайта:", "css=#apps_edit_connect_options > table.apps_edit_table > tbody > tr > td.label.ta_r")
                .CheckText("Базовый домен:", "//div[@id='apps_edit_connect_options']/table/tbody/tr[2]/td")
                .CheckText("", "id=app_base_domain")
                .CheckText("", "id=app_site_url")
                .CheckText("Подключить сайт", "id=apps_create_app_btn");
    }

    @Test
    public void testSelectIFrameFlashApp() throws Exception {
        app.getNavHelper().OpenVKDevPageAuthorize();
        app.getNavHelper().ClickAndWait("css=button.flat_button");
        app.getCheckHelper()
                .CheckText("Создание приложения", "css=div.label")
                .Click("id=app_type_2")
                .CheckText("Описание:", "css=#apps_edit_iframe_options > #app_type > tbody > tr > td.label.ta_r")
                .CheckText("Тип:", "xpath=(//table[@id='app_type']/tbody/tr[2]/td)[3]")
                .CheckText("Игра", "id=app_category_0")
                .CheckText("Приложение", "id=app_category_1")
                .CheckText("Категория:", "xpath=(//table[@id='app_type']/tbody/tr[3]/td)[3]")
                .CheckText("Загружая приложение, Вы соглашаетесь с правилами размещения приложений", "css=td.apps_edit_agree")
                .CheckText("Перейти к загрузке приложения", "id=apps_create_app_btn");
        app.getNavHelper().ScrollDown();
        app.getInputHelper().TypeText("id=app_desc", "test");
        app.getNavHelper().PressTab("id=app_desc");
        Thread.sleep(2000);
        app.getNavHelper().Click("id=app_category_1")
                .Click("id=app_category_0")
                .Click("css=#app_category_1 > div")
                .Click("css=#app_category_0 > div");
//        app.getCheckHelper().CheckText("Аркады", "//*[@id='container1']/table/tbody/tr/td[1]");
//        app.getNavHelper().Click("//*[contains(text(),'Аркады')]");
//        Thread.sleep(2000);
    }

    @Test
    public void testCheckPostedRules() throws Exception {
        app.getNavHelper().OpenVKDevPageAuthorize();
        app.getNavHelper().ClickAndWait("css=button.flat_button");
        app.getCheckHelper()
                .CheckText("Создание приложения", "css=div.label");
        app.getNavHelper().Click("id=app_type_2");
        app.getNavHelper().Click("css=td.apps_edit_agree > a");
        sleep(1000);
        app.getCheckHelper()
                .CheckText("Правила размещения приложений", "css=div.box_title")
                .CheckText("Закрыть", "css=div.box_x_button")
                .CheckText("Правила платформы", "css=div.wk_header")
                .CheckText("правила размещения рекламных приложений", "//a[contains(@href, '/dev/ad_apps')]")
                .CheckText("кабинет Таргетированной рекламы", "//a[@href='http://vk.com/ads?act=office']")
                .CheckText("Правила размещения рекламы в приложениях", "//a[contains(@href, '/dev/adterms')]")
                .CheckText("Правила размещения магазинов в приложениях", "//a[contains(@href, '/dev/ecommerce_terms')]")
                .CheckText("Правила размещения рекламных приложений", "//blockquote/a[3]")
                .CheckText("Условий размещения приложений на сайте VK.com", "//a[contains(@href, '/dev/appterms')]")
                .CheckText("Закрыть", "//div[@id='box_layer']/div[2]/div/div[3]/div/table/tbody/tr/td/button");
    }
}
