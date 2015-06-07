package com.vk.dev.tests.checkPagesElements;

import com.vk.dev.tests.MyTestBase;
import org.testng.annotations.Test;

/**
 * Created by User on 31.05.2015.
 */
public class CreateAppPageTests extends MyTestBase {

    //run with authorise

    @Test
    public void testCreateStandAloneApp() throws InterruptedException {
        app.getNavHelper().openVKDevPageAuthorize()
                .clickAndWait("css=button.flat_button");
        app.getInputHelper().typeText("id=app_title", "Test App");
        app.getNavHelper().click("//*[@id='apps_create_app_btn']");
        Thread.sleep(3000);
        app.getCheckHelper().checkText("Подтверждение действия", "//div[@id='validation_box']/h2")
                .checkText("Отмена", "//div[@id='validation_box']/a")
                .checkText("Для подтверждения действия мы вышлем на Ваш мобильный телефон бесплатное SMS-сообщение с кодом.", "//div[@id='validation_box']/div")
                .checkText("Мобильный телефон", "//div[@id='validation_phone_wrap']/div")
                .checkText("Изменить номер", "//div[@id='validation_phone_row']/a")
                .checkText("Получить код", "id=validation_send_phone")
                .isPresent("css=div.validation_img")
                .isPresent("id=validation_phone");
    }

    @Test
    public void testOpenFromDevMain() throws Exception {
        app.getNavHelper().openVKDevPageAuthorize()
                .clickAndWait("//*[@id='dev_top_docs']")
                .clickAndWait("//a[@href='http://vk.com/editapp?act=create']");
        Thread.sleep(2000);
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
