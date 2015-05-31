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
}
