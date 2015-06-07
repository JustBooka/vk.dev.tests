package com.vk.dev.tests.fillTests;

import com.vk.dev.page.CreateAppPage;
import com.vk.dev.tests.MyTestBase;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

/**
 * Created by User on 06.06.2015.
 */
public class CreateAppTest extends MyTestBase {

    //run with authorise

    WebDriver driver;
    CreateAppPage objCreateApp;

    @Test
    public void testCreateStandAloneAppNegative() throws InterruptedException {
        app.getNavHelper().openCreateAppPage();
        objCreateApp = new CreateAppPage(driver);
        objCreateApp.createStandAloneApp("");
        Thread.sleep(1000);
        app.getCheckHelper().checkText("Создание приложения", "css=div.label");
    }

    @Test
    public void testCreateStandAloneApp() throws InterruptedException {
        app.getNavHelper().openCreateAppPage();
        objCreateApp = new CreateAppPage(driver);
        objCreateApp.createStandAloneApp("StandAloneApp");
        Thread.sleep(1000);
        app.getCheckHelper().checkText("Подтверждение действия", "//div[@id='validation_box']/h2");
    }

    @Test
    public void testCreateWebSiteApp() throws InterruptedException {
        app.getNavHelper().openCreateAppPage();
        objCreateApp = new CreateAppPage(driver);
        objCreateApp.createWebSiteApp("TitleApp", "siteurl.com", "domainurl.com");
        Thread.sleep(1000);
        app.getCheckHelper().checkText("Подтверждение действия", "//div[@id='validation_box']/h2");
    }

    @Test
    public void testCreateWebSiteAppNegative() throws InterruptedException {
        app.getNavHelper().openCreateAppPage();
        objCreateApp = new CreateAppPage(driver);
        objCreateApp.createWebSiteApp("", "", "");
        Thread.sleep(1000);
        app.getCheckHelper().checkText("Создание приложения", "css=div.label");

        objCreateApp.createWebSiteApp("title", "", "");
        Thread.sleep(1000);
        app.getCheckHelper().checkText("Создание приложения", "css=div.label");

        objCreateApp.createWebSiteApp("", "url.com", "");
        Thread.sleep(1000);
        app.getCheckHelper().checkText("Создание приложения", "css=div.label");

        objCreateApp.createWebSiteApp("", "", "domain.com");
        Thread.sleep(1000);
        app.getCheckHelper().checkText("Создание приложения", "css=div.label");

        objCreateApp.createWebSiteApp("title", "", "domain.com");
        Thread.sleep(1000);
        app.getCheckHelper().checkText("Создание приложения", "css=div.label");

        objCreateApp.createWebSiteApp("title", "url.com", "");
        Thread.sleep(1000);
        app.getCheckHelper().checkText("Создание приложения", "css=div.label");

        objCreateApp.createWebSiteApp("", "url.com", "domain.com");
        Thread.sleep(1000);
        app.getCheckHelper().checkText("Создание приложения", "css=div.label");
    }

    @Test
    public void testCreateFlashApp() throws InterruptedException {
        app.getNavHelper().openCreateAppPage();
        objCreateApp = new CreateAppPage(driver);
        objCreateApp.createFlashApp("title", "description");
        Thread.sleep(1000);
        app.getCheckHelper().checkText("Подтверждение действия", "//div[@id='validation_box']/h2");
    }

    @Test
    public void testCreateFlashAppNegative() throws InterruptedException {
        app.getNavHelper().openCreateAppPage();
        objCreateApp = new CreateAppPage(driver);
        objCreateApp.createFlashApp("", "");
        Thread.sleep(1000);
        app.getCheckHelper().checkText("Создание приложения", "css=div.label");

        objCreateApp.createFlashApp("", "description");
        Thread.sleep(1000);
        app.getCheckHelper().checkText("Создание приложения", "css=div.label");
    }


}
