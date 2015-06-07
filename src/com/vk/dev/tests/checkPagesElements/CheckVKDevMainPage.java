package com.vk.dev.tests.checkPagesElements;

import com.vk.dev.tests.MyTestBase;
import org.testng.annotations.Test;

import static com.opera.core.systems.scope.AbstractService.sleep;

/**
 * Created by User on 30.05.2015.
 */
public class CheckVKDevMainPage extends MyTestBase {

    @Test
    public void testCheckLeftSideMenu() throws Exception {
        app.getNavHelper().openVKDevPage();
        app.getCheckHelper()
                .checkText("Документация", "//*[@id='dev_mlist_main']")
                .checkText("Игры и приложения", "//*[@id='dev_mlist_native']")
                .checkText("Standalone/Mobile", "//*[@id='dev_mlist_standalone']")
                .checkText("Мобильные игры", "//*[@id='dev_mlist_mobile_games']")
                .checkText("Сайты и виджеты", "//*[@id='dev_mlist_sites']");
        app.getNavHelper().click("//*[@id='dev_mlist_apiusage']");
        app.getCheckHelper().checkText("OAuth-авторизация", "//*[@id='dev_mlist_authentication']")
                .checkText("Запросы к API", "//*[@id='dev_mlist_api_requests']")
                .checkText("Open API для сайтов", "//*[@id='dev_mlist_openapi']")
                .checkText("Загрузка файлов", "//*[@id='dev_mlist_upload_files']")
                .checkText("Версии API", "//*[@id='dev_mlist_versions']")
                .checkText("Возвращаемые ошибки", "//*[@id='dev_mlist_errors']");
        app.getNavHelper().click("//*[@id='dev_mlist_SDK']");
        app.getCheckHelper().checkText("Javascript SDK", "//*[@id='dev_mlist_Javascript_SDK']")
                .checkText("Flash SDK", "//*[@id='dev_mlist_Flash_SDK']")
                .checkText("Android SDK", "//*[@id='dev_mlist_android_sdk']")
                .checkText("iOS SDK", "//*[@id='dev_mlist_ios_sdk']")
                .checkText("Windows Phone SDK", "//*[@id='dev_mlist_wp_sdk']");
        app.getNavHelper().click("//*[@id='dev_mlist_methods']");
        sleep(3000);
        app.getCheckHelper()
//                .checkText("Серверные методы API", "//*[@id='dev_mlist_secure']")
//                .checkText("Платежный API", "//*[@id='dev_mlist_payments']")
//                .checkText("Рекламный API ", "//*[@id='dev_mlist_ads']")
                .checkText("Формат настроек Push-уведомлений", "//*[@id='dev_mlist_push_settings']")
                .checkText("Offers API", "//*[@id='dev_mlist_leads']")
                .checkText("Типы данных", "//*[@id='dev_mlist_datatypes']")
                .checkText("Формат приватности", "//*[@id='dev_mlist_privacy_setting']");
        app.getNavHelper().click("//*[@id='dev_mlist_help']");
        app.getCheckHelper()
                .checkText("Обратная связь", "//*[@id='dev_mlist_feedback']")
                .checkText("Баг-трекер", "//*[@id='dev_mlist_bugs']")
                .checkText("Партнерская модель", "//*[@id='dev_mlist_partnership']")
                .checkText("Состояние платформы", "//*[@id='dev_mlist_health']");
        app.getNavHelper().click("//*[@id='dev_mlist_terms']");
        app.getCheckHelper()
                .checkText("Правила платформы", "//*[@id='dev_mlist_rules']")
                .checkText("Реклама в приложениях", "//*[@id='dev_mlist_adterms']")
                .checkText("Рекламные приложения", "//*[@id='dev_mlist_ad_apps']")
                .checkText("Приложения-магазины", "//*[@id='dev_mlist_ecommerce_terms']");
    }

    @Test
    public void testCheckMakeAppBlock() throws Exception {
        app.getNavHelper().openVKDevPage();
        app.getCheckHelper()
                .checkText("Создание приложения", "//*[@id='dev_page_cont']/div[1]/div[1]")
                .checkText("создавать", "//a[@href='http://vk.com/editapp?act=create']")
                .checkText("Игры и приложения", "xpath=(//a[contains(@href, '/dev/native')])[2]")
                .checkText("Игры и приложения для ВКонтакте. Доступны для запуска внутри социальной сети и интегрируются внутри сайта при помощи Flash или IFrame-элемента. Этим приложениям доступно большинство методов API, а также методы Payments API для приема платежей.", "//*[@id='dev_page_cont']/div[1]/ul[1]/li/span")
                .checkText("Flash", "//a[contains(@href, '/dev/Flash_apps')]")
                .checkText("IFrame", "//a[contains(@href, '/dev/IFrame_apps')]")
                .checkText("методов API", "xpath=(//a[contains(@href, '/dev/methods')])[2]")
                .checkText("Payments API", "xpath=(//a[contains(@href, '/dev/payments')])[2]")
                .checkText("Standalone/Mobile-приложения. Клиентские приложения для различных платформ (для Desktop и мобильных устройств). Требуют авторизации по протоколу OAuth. Взаимодействие с API происходит стандартным способом.", "//div[@id='dev_page_cont']/div/ul[2]/li/span")
                .checkText("Standalone/Mobile-приложения", "xpath=(//a[contains(@href, '/dev/standalone')])[2]")
                .checkText("авторизации по протоколу OAuth", "//a[contains(@href, '/dev/auth_mobile')]")
                .checkText("стандартным способом", "xpath=(//a[contains(@href, '/dev/api_requests')])[2]")
                .checkText("Сторонние сайты и виджеты. Внешние веб-сервисы или установленные на сайтах виджеты. Сайты используют для авторизации и вызова методов либо серверную авторизацию OAuth, либо клиентскую авторизацию Open API. Доступно большинство методов API.", "//div[@id='dev_page_cont']/div/ul[3]/li/span")
                .checkText("Сторонние сайты и виджеты", "xpath=(//a[contains(@href, '/dev/sites')])[2]")
                .checkText("серверную авторизацию OAuth", "//a[contains(@href, '/dev/auth_sites')]")
                .checkText("клиентскую авторизацию Open API", "xpath=(//a[contains(@href, '/dev/openapi')])[2]")
                .checkText("методов API", "xpath=(//a[contains(@href, '/dev/methods')])[3]");
    }

    @Test
    public void testCheckAuthorizationBlock() throws Exception {
        app.getNavHelper().openVKDevPage();
        app.getCheckHelper()
                .checkText("Авторизация", "//div[@id='dev_page_cont']/div[2]/div")
                .checkText("Авторизация\n В Standalone/Mobile-приложениях и сайтах, а также серверных частях любых типов приложений перед вызовом большинства методов API необходимо проводить авторизацию пользователя (или приложения). Авторизация OAuth (клиентская и серверная). Механизмы авторизации хотя и схожи для Standalone/Mobile-приложений и для сайтов, но имеют и отличия, которые делают их не взаимозаменяемыми. Авторизация Open API (только клиентская). Доступна только для сайтов.", "//div[@id='dev_page_cont']/div[2]")
                .checkText("Авторизация OAuth (клиентская и серверная). Механизмы авторизации хотя и схожи для Standalone/Mobile-приложений и для сайтов, но имеют и отличия, которые делают их не взаимозаменяемыми.", "//div[@id='dev_page_cont']/div[2]/ul/li/span")
                .checkText("Авторизация Open API (только клиентская). Доступна только для сайтов.", "//div[@id='dev_page_cont']/div[2]/ul/li[2]/span")
                .checkText("Авторизация OAuth", "xpath=(//a[contains(@href, '/dev/authentication')])[2]")
                .checkText("Авторизация Open API", "xpath=(//a[contains(@href, '/dev/openapi')])[3]");
    }

    @Test
    public void testCheckAPIBlocks() throws Exception {
        app.getNavHelper().openVKDevPage();
        app.getCheckHelper()
                .checkText("Взаимодействие с API", "//div[@id='dev_page_cont']/div[3]/div")
                .checkText("Выполнение запросов к API", "xpath=(//a[contains(@href, '/dev/api_requests')])[3]")
                .checkText("Процесс загрузки файлов на сервер ВКонтакте", "xpath=(//a[contains(@href, '/dev/upload_files')])[2]")
                .checkText("Методы API", "//div[@id='dev_page_cont']/div[4]/div")
                .checkText("Описание методов API", "xpath=(//a[contains(@href, '/dev/methods')])[4]")
                .checkText("Payments API", "xpath=(//a[contains(@href, '/dev/payments')])[3]")
                .checkText("Ads API", "xpath=(//a[contains(@href, '/dev/ads')])[2]")
                .checkText("Типы данных", "xpath=(//a[contains(@href, '/dev/datatypes')])[2]")
                .checkText("Описание методов API – Список всех доступных методов API.", "//div[@id='dev_page_cont']/div[4]/ul/li/span")
                .checkText("Payments API – Платёжный API для приложений.", "//div[@id='dev_page_cont']/div[4]/ul/li[2]/span")
                .checkText("Ads API – Методы для работы с рекламным кабинетом.", "//div[@id='dev_page_cont']/div[4]/ul/li[3]/span")
                .checkText("Типы данных – описание типов данных, возвращаемых разными методами API.", "//div[@id='dev_page_cont']/div[4]/ul/li[4]/span");
    }

    @Test
    public void testCheckSiteWidgetBlock() throws Exception {
        app.getNavHelper().openVKDevPage();
        app.getCheckHelper()
                .checkText("Виджеты для сайтов", "//div[@id='dev_page_cont']/div[5]/div")
                .checkText("Комментарии", "//a[contains(@href, '/dev/Comments')]")
                .checkText("Комментарии\n Виджет предоставляет возможность за несколько минут установить на сайт полнофункциональный блок для комментирования.", "//div[@id='dev_page_cont']/div[5]/ul/li/span")
                .checkText("«Запись на стене»\n Виджет предоставляет возможность встроить на свой сайт отдельную запись или комментарий пользователя или сообщества ВКонтакте.", "//div[@id='dev_page_cont']/div[5]/ul[2]/li/span")
                .checkText("«Запись на стене»", "//a[contains(@href, '/dev/Post')]")
                .checkText("Сообщества\n Виджет тесно свяжет сайт с группой или официальной страницей ВКонтакте. В виджете отображаются новости сообщества или фотографии участников.", "//div[@id='dev_page_cont']/div[5]/ul[3]/li/span")
                .checkText("Сообщества", "//a[contains(@href, '/dev/Community')]")
                .checkText("«Мне нравится»\n Виджет позволит пользователям выразить отношение к статье одним кликом или поделиться ссылкой на неё с друзьями.", "//div[@id='dev_page_cont']/div[5]/ul[4]/li/span")
                .checkText("«Мне нравится»", "//a[contains(@href, '/dev/Like')]")
                .checkText("«Мне нравится»\n Виджет позволит пользователям выразить отношение к статье одним кликом или поделиться ссылкой на неё с друзьями.", "//div[@id='dev_page_cont']/div[5]/ul[4]/li/span")
                .checkText("Рекомендации\n Виджет позволит посетителям быстро найти самые популярные материалы на Вашем сайте. Используются данные виджета «Мне нравится».", "//div[@id='dev_page_cont']/div[5]/ul[5]/li/span")
                .checkText("Рекомендации", "//a[contains(@href, '/dev/Recommended')]")
                .checkText("Опросы\n Виджет позволит организовать любое голосование на Вашем сайте и обеспечить вирусное распространение Вашего опроса по всему интернету.", "//div[@id='dev_page_cont']/div[5]/ul[6]/li")
                .checkText("Опросы", "//a[contains(@href, '/dev/Poll')]")
                .checkText("Авторизация\n Виджет позволит пользователю авторизоваться при помощи кнопки «Войти через ВКонтакте» и покажет его друзей, которые заходили на Ваш сайт.", "//div[@id='dev_page_cont']/div[5]/ul[7]/li/span")
                .checkText("Авторизация", "//a[contains(@href, '/dev/Auth')]")
                .checkText("Публикация ссылок\n Виджет позволит быстро разместить ссылку на материал с Вашего сайта на странице ВКонтакте.", "//div[@id='dev_page_cont']/div[5]/ul[8]/li/span")
                .checkText("Публикация ссылок", "//a[contains(@href, '/dev/Share')]")
                .checkText("Подписаться на автора\n Виджет позволит посетителям Вашего сайта в один клик подписаться на заданного Вами пользователя или группу, а также легко поддерживать информацию об авторах на Вашем сайте в актуальном состоянии.", "//div[@id='dev_page_cont']/div[5]/ul[9]/li/span")
                .checkText("Подписаться на автора", "//a[contains(@href, '/dev/Subscribe')]");
    }

    @Test
    public void testCheckOtherBlock() throws Exception {
        app.getNavHelper().openVKDevPage();
        app.getCheckHelper()
                .checkText("Другие разделы", "//div[@id='dev_page_cont']/div[6]/div")
                .checkText("API Change Log – Страница с новостями о последних изменениях в API.", "//div[@id='dev_page_cont']/div[6]/ul/li/span")
                .checkText("API Change Log", "//a[@href='http://vk.com/api_updates']")
                .checkText("Статус API – Страница с информацией о состоянии платформы.", "//div[@id='dev_page_cont']/div[6]/ul/li[2]/span")
                .checkText("Статус API","xpath=(//a[contains(@href, '/dev/health')])[2]");

    }

}
