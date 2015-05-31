package com.vk.dev.tests.fillingPagesTests;

import com.vk.dev.tests.MyTestBase;
import org.testng.annotations.Test;

/**
 * Created by User on 31.05.2015.
 */
public class CreateAppPageTests extends MyTestBase {

    //run with authorise

    @Test
    public void testPressConfirmButtonWithEmptyFields1() throws InterruptedException {
        app.getNavHelper().OpenVKDevPageAuthorize()
                .ClickAndWait("css=button.flat_button");
        app.getNavHelper().Click("//*[@id='apps_create_app_btn']");
        Thread.sleep(3000);
        app.getCheckHelper().CheckText("Создание приложения", "css=div.label");
    }

    @Test
    public void testPressConfirmButtonWithEmptyFields2() throws InterruptedException {
        app.getNavHelper().OpenVKDevPageAuthorize()
                .ClickAndWait("css=button.flat_button");
        app.getNavHelper().Click("css=#app_type_1 > div")
                .Click("//*[@id='apps_create_app_btn']");
        Thread.sleep(3000);
        app.getCheckHelper().CheckText("Создание приложения", "css=div.label");
    }

    @Test
    public void testPressConfirmButtonWithEmptyFields3() throws InterruptedException {
        app.getNavHelper().OpenVKDevPageAuthorize()
                .ClickAndWait("css=button.flat_button");
        app.getNavHelper().Click("css=#app_type_2 > div")
                .Click("//*[@id='apps_create_app_btn']");
        Thread.sleep(3000);
        app.getCheckHelper().CheckText("Создание приложения", "css=div.label");
    }

    @Test
    public void testPressConfirmButtonWithEmptyFields4() throws InterruptedException {
        app.getNavHelper().OpenVKDevPageAuthorize()
                .ClickAndWait("css=button.flat_button");
        app.getNavHelper().Click("css=#app_type_2 > div")
                .Click("css=#app_category_1 > div")
                .Click("//*[@id='apps_create_app_btn']");
        Thread.sleep(3000);
        app.getCheckHelper().CheckText("Создание приложения", "css=div.label");
    }

    @Test
    public void testCreateStandAloneApp() throws InterruptedException {
        app.getNavHelper().OpenVKDevPageAuthorize()
                .ClickAndWait("css=button.flat_button");
        app.getInputHelper().TypeText("id=app_title", "Test App");
        app.getNavHelper().Click("//*[@id='apps_create_app_btn']");
        Thread.sleep(3000);
        app.getCheckHelper().CheckText("Подтверждение действия", "//div[@id='validation_box']/h2")
                .CheckText("Отмена", "//div[@id='validation_box']/a")
                .CheckText("Для подтверждения действия мы вышлем на Ваш мобильный телефон бесплатное SMS-сообщение с кодом.", "//div[@id='validation_box']/div")
                .CheckText("Мобильный телефон", "//div[@id='validation_phone_wrap']/div")
                .CheckText("Изменить номер", "//div[@id='validation_phone_row']/a")
                .CheckText("Получить код", "id=validation_send_phone")
                .IsPresent("css=div.validation_img")
                .IsPresent("id=validation_phone");
    }

    @Test
    public void testCreateWebApp() throws InterruptedException {
        app.getNavHelper().OpenVKDevPageAuthorize()
                .ClickAndWait("css=button.flat_button");
        app.getNavHelper().Click("css=#app_type_1 > div");
        app.getInputHelper().TypeText("id=app_title", "Test Web App");
        app.getNavHelper().Click("//*[@id='apps_create_app_btn']");
        Thread.sleep(1000);
        app.getCheckHelper().CheckText("Создание приложения","css=div.label");
        app.getInputHelper().TypeText("id=app_title", "")
                .TypeText("id=app_site_url", "testsite.com");
        app.getNavHelper().Click("//*[@id='apps_create_app_btn']");
        Thread.sleep(1000);
        app.getCheckHelper().CheckText("Создание приложения","css=div.label");
        app.getInputHelper().TypeText("id=app_title", "Test Web App")
                .TypeText("id=app_site_url", "testsite.com");
        app.getNavHelper().Click("//*[@id='apps_create_app_btn']");
        Thread.sleep(1000);
        app.getCheckHelper().CheckText("Создание приложения","css=div.label");
        app.getInputHelper().TypeText("id=app_base_domain", "test.test.test")
                .TypeText("id=app_title", "");
        app.getNavHelper().Click("//*[@id='apps_create_app_btn']");
        Thread.sleep(1000);
        app.getCheckHelper().CheckText("Создание приложения", "css=div.label");
        app.getInputHelper().TypeText("id=app_title", "Test Web App")
                .TypeText("id=app_site_url", "");
        app.getNavHelper().Click("//*[@id='apps_create_app_btn']");
        Thread.sleep(1000);
        app.getCheckHelper().CheckText("Создание приложения","css=div.label");
        app.getInputHelper().TypeText("id=app_site_url", "testsite.com");
        app.getNavHelper().Click("//*[@id='apps_create_app_btn']");
        Thread.sleep(1000);
        app.getCheckHelper().CheckText("Подтверждение действия", "//div[@id='validation_box']/h2")
                .CheckText("Отмена", "//div[@id='validation_box']/a")
                .CheckText("Для подтверждения действия мы вышлем на Ваш мобильный телефон бесплатное SMS-сообщение с кодом.", "//div[@id='validation_box']/div")
                .CheckText("Мобильный телефон", "//div[@id='validation_phone_wrap']/div")
                .CheckText("Изменить номер", "//div[@id='validation_phone_row']/a")
                .CheckText("Получить код", "id=validation_send_phone")
                .IsPresent("css=div.validation_img")
                .IsPresent("id=validation_phone");
    }

    @Test
    public void testCreateFlashApp() throws InterruptedException {
        app.getNavHelper().OpenVKDevPageAuthorize()
                .ClickAndWait("css=button.flat_button");
        app.getNavHelper().Click("css=#app_type_2 > div");
        app.getInputHelper().TypeText("id=app_desc","Description");
        app.getNavHelper().Click("//*[@id='apps_create_app_btn']");
        Thread.sleep(1000);
        app.getCheckHelper().CheckText("Создание приложения","css=div.label");
        app.getInputHelper().TypeText("id=app_title","test flash App")
                .TypeText("id=app_desc","");
        app.getNavHelper().Click("//*[@id='apps_create_app_btn']");
        Thread.sleep(1000);
        app.getCheckHelper().CheckText("Подтверждение действия", "//div[@id='validation_box']/h2");
        app.getNavHelper().Click("//div[@id='validation_box']/a");
        app.getInputHelper().TypeText("id=app_desc","Description again");
        app.getNavHelper().Click("//*[@id='apps_create_app_btn']");
        Thread.sleep(1000);
        app.getCheckHelper().CheckText("Подтверждение действия", "//div[@id='validation_box']/h2")
                .CheckText("Отмена", "//div[@id='validation_box']/a")
                .CheckText("Для подтверждения действия мы вышлем на Ваш мобильный телефон бесплатное SMS-сообщение с кодом.", "//div[@id='validation_box']/div")
                .CheckText("Мобильный телефон", "//div[@id='validation_phone_wrap']/div")
                .CheckText("Изменить номер", "//div[@id='validation_phone_row']/a")
                .CheckText("Получить код", "id=validation_send_phone")
                .IsPresent("css=div.validation_img")
                .IsPresent("id=validation_phone");
    }

    @Test
    public void testOpenFromDevMain() throws Exception {
        app.getNavHelper().OpenVKDevPageAuthorize()
                .ClickAndWait("//*[@id='dev_top_docs']")
                .ClickAndWait("//a[@href='http://vk.com/editapp?act=create']");
        Thread.sleep(2000);
        app.getCheckHelper()
                .CheckText("Создание приложения", "//div[@id='apps_edit_create_cont']/div/div")
                .CheckText("Название:", "css=td.label.ta_r")
                .CheckText("Тип:", "css=#app_type > tbody > tr > td.label.ta_r")
                .CheckText("Standalone-приложение", "id=app_type_0")
                .CheckText("Веб-сайт", "id=app_type_1")
                .CheckText("IFrame/Flash приложение", "id=app_type_2")
                .CheckText("Подключить приложение", "id=apps_create_app_btn");
    }
}
