package com.vk.dev.tests.checkPagesElements;

import com.vk.dev.page.MainVKPage;
import com.vk.dev.tests.MyTestBase;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

/**
 * Created by User on 06.06.2015.
 */
public class CheckStandAloneAppEditingPage extends MyTestBase {

    //run with authorize
    //work with +79043395299

    WebDriver driver;
    MainVKPage objMainVK;

    @Test
    public void testAuthorize() throws Exception {
        app.getNavHelper().openVKMainPage();
        objMainVK = new MainVKPage(driver);
        objMainVK.LogIn("+79043395299", "awedxzs123");
        Thread.sleep(2000);
        app.getCheckHelper().checkText("Моя Страница", "css=span.left_label.inl_bl");
    }

    @Test
    public void testCheckInfoPage() throws InterruptedException {
        app.getNavHelper().openVKDevPageAuthorize()
                .clickAndWait("//*[@id='dev_top_apps']")
                .clickAndWait("//a[contains(@href, 'editapp?id=4948066')]");
        Thread.sleep(3000);
        app.getCheckHelper().checkText("Настройки", "//*[@id='apps_nav_options']")
                .checkText("Хранимые процедуры", "//*[@id='apps_nav_functions']");
        app.getCheckHelper().checkText("Информация", "//*[@id='app_edit_cont']/div[1]/div")
                .checkText("Название:", "//*[@id='app_edit_cont']/div[2]/table/tbody/tr/td/table/tbody/tr[1]/td[1]")
                .checkText("Описание:", "//*[@id='app_edit_cont']/div[2]/table/tbody/tr/td/table/tbody/tr[2]/td[1]")
                .checkText("Группа приложения:", "//*[@id='app_edit_cont']/div[2]/table/tbody/tr/td/table/tbody/tr[5]/td[1]")
                .checkText("Иконка 16×16:", "//*[@id='app_edit_cont']/div[2]/table/tbody/tr/td/table/tbody/tr[7]/td[1]")
                .checkText("Выбрать файл", "//*[@id='app_icon_cont']/a")
                .checkText("Сохранить изменения", "//*[@id='app_save_btn']");
        app.getCheckHelper().checkText("Обложки и скриншоты", "//*[@id='apps_edit_bottom_info']/div[1]/div")
                .checkText("Квадратная обложка", "//*[@id='apps_edit_bottom_info']/div[2]/table[1]/tbody/tr/td[2]/div[1]")
                .checkText("Используется везде, кроме каталога приложений.\n" +
                        "Размеры загружаемого изображения – 150×150px.", "//*[@id='apps_edit_bottom_info']/div[2]/table[1]/tbody/tr/td[2]/div[2]")
                .checkText("Квадратная обложка для каталога", "//*[@id='apps_edit_bottom_info']/div[2]/table[2]/tbody/tr/td[2]/div[1]")
                .checkText("Используется в каталоге приложений.\n" +
                        "Изменять обложку можно не чаще 2 раз в 2 недели.\n" +
                        "Размеры загружаемого изображения – 256×256px.", "//*[@id='apps_edit_bottom_info']/div[2]/table[2]/tbody/tr/td[2]/div[2]")
                .checkText("Выберите изображение", "//*[@id='apps_edit_upload_photo']/button")
                .checkText("Выберите изображение", "//*[@id='apps_edit_upload_catalog_photo']/button")
                .checkText("Скриншоты приложения", "//*[@id='apps_edit_bottom_info']/div[2]/div[3]")
                .checkText("Используются на экране установки приложения.\n" +
                        "Высота не менее 600px, отношение сторон не более 2 к 1.", "//*[@id='apps_edit_bottom_info']/div[2]/div[5]")
                .checkText("Выберите изображение", "//*[@id='apps_edit_upload_screenshot']/button")
                .checkText("Размеры изображений удвоены для использования на экранах высокой чёткости", "//*[@id='apps_edit_bottom_info']/div[3]");
        app.getCheckHelper().isPresent("//*[@id='apps_edit_photo']")
                .isPresent("//*[@id='apps_edit_catalog_photo']");
    }

    @Test
    public void testCheckOptionsPage() throws InterruptedException {
        app.getNavHelper().openStandAloneAppOptions();
        Thread.sleep(3000);
        app.getCheckHelper().checkText("ID приложения:", "//*[@id='app_edit_cont']/div[2]/table[1]/tbody/tr[1]/td[1]");
        app.getCheckHelper().checkText("Защищенный ключ:", "//*[@id='app_edit_cont']/div[2]/table[1]/tbody/tr[2]/td[1]");
        app.getCheckHelper().checkText("Состояние:", "//*[@id='app_edit_cont']/div[2]/div[3]/table[1]/tbody/tr[1]/td[1]");
        app.getCheckHelper().checkText("Первый запрос к API:", "//*[@id='app_edit_cont']/div[2]/div[3]/table[1]/tbody/tr[2]/td[1]");
        app.getCheckHelper().checkText("Установка приложения:", "//*[@id='app_edit_cont']/div[2]/div[3]/table[1]/tbody/tr[3]/td[1]");
        app.getCheckHelper().checkText("Не требуется", "//*[@id='privacy_edit_install']");
        app.getCheckHelper().checkText("Open API:", "//*[@id='app_edit_cont']/div[2]/div[3]/table[3]/tbody/tr/td[1]");
        app.getCheckHelper().checkText("Выключен", "//*[@id='privacy_edit_openapi']");
        app.getCheckHelper().checkText("Push-уведомления:", "//*[@id='app_edit_cont']/div[2]/table[2]/tbody/tr/td[1]");
        app.getCheckHelper().checkText("Не подключены", "//*[@id='privacy_edit_push']");
        app.getCheckHelper().checkText("Настройки SDK", "//*[@id='apps_edit_sdk']/div");
        app.getCheckHelper().checkText("App Bundle для iOS:", "//*[@id='apps_edit_sdk_list']/tbody/tr[1]/td[1]");
        app.getCheckHelper().checkText("App Id для iOS:", "//*[@id='apps_edit_sdk_list']/tbody/tr[2]/td[1]");
        app.getCheckHelper().checkText("Название пакета\n" +
                "для Android:", "//*[@id='apps_edit_sdk_list']/tbody/tr[3]/td[1]");
        app.getCheckHelper().checkText("Main activity для Android:", "//*[@id='apps_edit_sdk_list']/tbody/tr[4]/td[1]");
        app.getCheckHelper().checkText("Отпечаток сертификата\n" +
                "для Android:\n" +
                "Добавить ещё", "//*[@id='apps_edit_sdk_list']/tbody/tr[5]/td[1]");
        app.getCheckHelper().checkText("Добавить ещё", "//*[@id='apps_edit_sdk_list']/tbody/tr[5]/td[1]/div/a");
        app.getCheckHelper().checkText("Windows App ID:", "//*[@id='apps_edit_sdk_list']/tbody/tr[6]/td[1]");
        app.getCheckHelper().checkText("Сохранить изменения", "//*[@id='app_save_btn']");
        app.getCheckHelper().checkText("Удаление приложения", "//*[@id='apps_edit_other_delete']/div[1]/div");
        app.getCheckHelper().checkText("Если Вы удалите это приложение, Вы уже не сможете его восстановить.", "//*[@id='apps_edit_other_delete']/div[2]/div");
        app.getCheckHelper().checkText("Удалить приложение", "//*[@id='apps_edit_other_delete']/div[2]/button");
    }


    @Test
    public void testCheckFunctionsPage() throws InterruptedException {
        app.getNavHelper().openStandAloneAppFunctions();
        Thread.sleep(3000);
        app.getCheckHelper().checkText("Хранимые процедуры", "//*[@id='app_edit_wrap']/div/div[1]/div");
        app.getCheckHelper().checkText("Добавить новую процедуру", "//*[@id='app_edit_wrap']/div/div[1]/button");
        app.getCheckHelper().checkText("У приложения ещё нет ни одной хранимой процедуры", "//*[@id='apps_edit_funcs_empty']");
        app.getCheckHelper().checkText("Хранимые процедуры позволяют исполнять код на стороне сервера API аналогично методу execute, но без передачи кода процедуры по сети.\n" +
                "\n" +
                "Использование хранимых процедур рекомендовано для мобильных приложений с целью экономии трафика.\n" +
                "Вы можете вызвать созданные в интерфейсе хранимые процедуры, используя следующую конструкцию:\n" +
                "\n" +
                "https://api.vk.com/method/execute.ИМЯ_ПРОЦЕДУРЫ?СПИСОК_ПАРАМЕТРОВ\n" +
                "\n" +
                "Переданные параметры будут доступны внутри кода процедуры в виде полей объекта Args, например, если Вы передали ?user=123, то значение этой переменной будет доступно в Args.user.", "//*[@id='app_edit_wrap']/div/div[3]/div[3]");
        app.getCheckHelper().checkText("execute", "//*[@id='app_edit_wrap']/div/div[3]/div[3]/b[2]/a");
    }


    @Test
    public void testCheckStatsPage() throws InterruptedException {
        app.getNavHelper().openStandAloneAppStats();
        Thread.sleep(3000);
        app.getCheckHelper().checkText("Запросы к API","//*[@id='app_edit_api_first_block']/div[1]/div")
                .checkText("Режим просмотра:","//*[@id='app_edit_api_first_block']/div[2]/div/div[1]/div[1]")
                .checkText("сравнение по дням","//*[@id='api_interval_selector_2days']")
                .checkText("неделя","//*[@id='api_interval_selector_week']")
                .checkText("месяц","//*[@id='api_interval_selector_month']");
        app.getCheckHelper().checkText("Количество ошибок","//*[@id='app_edit_api_bottom_graphs_wrap']/div[1]/div/div[1]/div")
                .checkText("Среднее время работы, мс","//*[@id='app_edit_api_bottom_graphs_wrap']/div[2]/div/div[1]/div")
                .checkText("Количество вызовов","//*[@id='app_stat_api_counters_wrap']/div[5]/div[1]/div")
                .checkText("Вызовов с начала дня","//*[@id='app_stat_api_counters_wrap']/div[2]/div/div[2]")
                .checkText("Процент ошибок","//*[@id='app_stat_api_counters_wrap']/div[3]/div/div[2]")
                .checkText("Среднее время работы","//*[@id='app_stat_api_counters_wrap']/div[4]/div/div[2]");
    }


    @Test
    public void testCheckAdminsPage() throws InterruptedException {
        app.getNavHelper().openStandAloneAppAdmins();
        Thread.sleep(3000);
        app.getCheckHelper().checkText("Руководство", "//*[@id='apps_edit_admins']/div[1]/div/div[1]")
                .checkText("1","//*[@id='apps_edit_summary']")
                .checkText("Добавить администратора","//*[@id='apps_edit_admins']/div[1]/button")
                .isPresent("//*[@id='apps_edit_admin306915588']/div[1]/a/img")
                .checkText("Just Test","//*[@id='apps_edit_admin306915588']/div[2]/div[1]/a")
                .checkText("главный администратор","//*[@id='apps_edit_admin306915588']/div[2]/div[2]");

    }


}
