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
        app.getNavHelper().OpenVKDevPage();
        app.getCheckHelper()
                .CheckText("Документация", "//*[@id='dev_mlist_main']")
                .CheckText("Игры и приложения", "//*[@id='dev_mlist_native']")
                .CheckText("Standalone/Mobile", "//*[@id='dev_mlist_standalone']")
                .CheckText("Мобильные игры", "//*[@id='dev_mlist_mobile_games']")
                .CheckText("Сайты и виджеты", "//*[@id='dev_mlist_sites']");
        app.getNavHelper().Click("//*[@id='dev_mlist_apiusage']");
        app.getCheckHelper().CheckText("OAuth-авторизация", "//*[@id='dev_mlist_authentication']")
                .CheckText("Запросы к API", "//*[@id='dev_mlist_api_requests']")
                .CheckText("Open API для сайтов", "//*[@id='dev_mlist_openapi']")
                .CheckText("Загрузка файлов", "//*[@id='dev_mlist_upload_files']")
                .CheckText("Версии API", "//*[@id='dev_mlist_versions']")
                .CheckText("Возвращаемые ошибки", "//*[@id='dev_mlist_errors']");
        app.getNavHelper().Click("//*[@id='dev_mlist_SDK']");
        app.getCheckHelper().CheckText("Javascript SDK", "//*[@id='dev_mlist_Javascript_SDK']")
                .CheckText("Flash SDK", "//*[@id='dev_mlist_Flash_SDK']")
                .CheckText("Android SDK", "//*[@id='dev_mlist_android_sdk']")
                .CheckText("iOS SDK", "//*[@id='dev_mlist_ios_sdk']")
                .CheckText("Windows Phone SDK", "//*[@id='dev_mlist_wp_sdk']");
        app.getNavHelper().Click("//*[@id='dev_mlist_methods']");
        sleep(3000);
        app.getCheckHelper()
//                .CheckText("Серверные методы API", "//*[@id='dev_mlist_secure']")
//                .CheckText("Платежный API", "//*[@id='dev_mlist_payments']")
//                .CheckText("Рекламный API ", "//*[@id='dev_mlist_ads']")
                .CheckText("Формат настроек Push-уведомлений", "//*[@id='dev_mlist_push_settings']")
                .CheckText("Offers API", "//*[@id='dev_mlist_leads']")
                .CheckText("Типы данных", "//*[@id='dev_mlist_datatypes']")
                .CheckText("Формат приватности", "//*[@id='dev_mlist_privacy_setting']");
        app.getNavHelper().Click("//*[@id='dev_mlist_help']");
        app.getCheckHelper()
                .CheckText("Обратная связь", "//*[@id='dev_mlist_feedback']")
                .CheckText("Баг-трекер", "//*[@id='dev_mlist_bugs']")
                .CheckText("Партнерская модель", "//*[@id='dev_mlist_partnership']")
                .CheckText("Состояние платформы", "//*[@id='dev_mlist_health']");
        app.getNavHelper().Click("//*[@id='dev_mlist_terms']");
        app.getCheckHelper()
                .CheckText("Правила платформы", "//*[@id='dev_mlist_rules']")
                .CheckText("Реклама в приложениях", "//*[@id='dev_mlist_adterms']")
                .CheckText("Рекламные приложения", "//*[@id='dev_mlist_ad_apps']")
                .CheckText("Приложения-магазины", "//*[@id='dev_mlist_ecommerce_terms']");
    }

    @Test
    public void testCheckMakeAppBlock() throws Exception {
        app.getNavHelper().OpenVKDevPage();
        app.getCheckHelper()
                .CheckText("Создание приложения", "//*[@id='dev_page_cont']/div[1]/div[1]")
                .CheckText("создавать", "//a[@href='http://vk.com/editapp?act=create']")
                .CheckText("Игры и приложения", "xpath=(//a[contains(@href, '/dev/native')])[2]")
                .CheckText("Игры и приложения для ВКонтакте. Доступны для запуска внутри социальной сети и интегрируются внутри сайта при помощи Flash или IFrame-элемента. Этим приложениям доступно большинство методов API, а также методы Payments API для приема платежей.", "//*[@id='dev_page_cont']/div[1]/ul[1]/li/span")
                .CheckText("Flash", "//a[contains(@href, '/dev/Flash_apps')]")
                .CheckText("IFrame", "//a[contains(@href, '/dev/IFrame_apps')]")
                .CheckText("методов API", "xpath=(//a[contains(@href, '/dev/methods')])[2]")
                .CheckText("Payments API", "xpath=(//a[contains(@href, '/dev/payments')])[2]")
                .CheckText("Standalone/Mobile-приложения. Клиентские приложения для различных платформ (для Desktop и мобильных устройств). Требуют авторизации по протоколу OAuth. Взаимодействие с API происходит стандартным способом.", "//div[@id='dev_page_cont']/div/ul[2]/li/span")
                .CheckText("Standalone/Mobile-приложения", "xpath=(//a[contains(@href, '/dev/standalone')])[2]")
                .CheckText("авторизации по протоколу OAuth", "//a[contains(@href, '/dev/auth_mobile')]")
                .CheckText("стандартным способом", "xpath=(//a[contains(@href, '/dev/api_requests')])[2]")
                .CheckText("Сторонние сайты и виджеты. Внешние веб-сервисы или установленные на сайтах виджеты. Сайты используют для авторизации и вызова методов либо серверную авторизацию OAuth, либо клиентскую авторизацию Open API. Доступно большинство методов API.", "//div[@id='dev_page_cont']/div/ul[3]/li/span")
                .CheckText("Сторонние сайты и виджеты", "xpath=(//a[contains(@href, '/dev/sites')])[2]")
                .CheckText("серверную авторизацию OAuth", "//a[contains(@href, '/dev/auth_sites')]")
                .CheckText("клиентскую авторизацию Open API", "xpath=(//a[contains(@href, '/dev/openapi')])[2]")
                .CheckText("методов API", "xpath=(//a[contains(@href, '/dev/methods')])[3]");
    }

    @Test
    public void testCheckAuthorizationBlock() throws Exception {
        app.getNavHelper().OpenVKDevPage();
        app.getCheckHelper()
                .CheckText("Авторизация", "//div[@id='dev_page_cont']/div[2]/div")
                .CheckText("Авторизация\n В Standalone/Mobile-приложениях и сайтах, а также серверных частях любых типов приложений перед вызовом большинства методов API необходимо проводить авторизацию пользователя (или приложения). Авторизация OAuth (клиентская и серверная). Механизмы авторизации хотя и схожи для Standalone/Mobile-приложений и для сайтов, но имеют и отличия, которые делают их не взаимозаменяемыми. Авторизация Open API (только клиентская). Доступна только для сайтов.", "//div[@id='dev_page_cont']/div[2]")
                .CheckText("Авторизация OAuth (клиентская и серверная). Механизмы авторизации хотя и схожи для Standalone/Mobile-приложений и для сайтов, но имеют и отличия, которые делают их не взаимозаменяемыми.", "//div[@id='dev_page_cont']/div[2]/ul/li/span")
                .CheckText("Авторизация Open API (только клиентская). Доступна только для сайтов.", "//div[@id='dev_page_cont']/div[2]/ul/li[2]/span")
                .CheckText("Авторизация OAuth", "xpath=(//a[contains(@href, '/dev/authentication')])[2]")
                .CheckText("Авторизация Open API", "xpath=(//a[contains(@href, '/dev/openapi')])[3]");
    }

    @Test
    public void testCheckAPIBlocks() throws Exception {
        app.getNavHelper().OpenVKDevPage();
        app.getCheckHelper()
                .CheckText("Взаимодействие с API", "//div[@id='dev_page_cont']/div[3]/div")
                .CheckText("Выполнение запросов к API", "xpath=(//a[contains(@href, '/dev/api_requests')])[3]")
                .CheckText("Процесс загрузки файлов на сервер ВКонтакте", "xpath=(//a[contains(@href, '/dev/upload_files')])[2]")
                .CheckText("Методы API", "//div[@id='dev_page_cont']/div[4]/div")
                .CheckText("Описание методов API", "xpath=(//a[contains(@href, '/dev/methods')])[4]")
                .CheckText("Payments API", "xpath=(//a[contains(@href, '/dev/payments')])[3]")
                .CheckText("Ads API", "xpath=(//a[contains(@href, '/dev/ads')])[2]")
                .CheckText("Типы данных", "xpath=(//a[contains(@href, '/dev/datatypes')])[2]")
                .CheckText("Описание методов API – Список всех доступных методов API.", "//div[@id='dev_page_cont']/div[4]/ul/li/span")
                .CheckText("Payments API – Платёжный API для приложений.", "//div[@id='dev_page_cont']/div[4]/ul/li[2]/span")
                .CheckText("Ads API – Методы для работы с рекламным кабинетом.", "//div[@id='dev_page_cont']/div[4]/ul/li[3]/span")
                .CheckText("Типы данных – описание типов данных, возвращаемых разными методами API.", "//div[@id='dev_page_cont']/div[4]/ul/li[4]/span");
    }

    @Test
    public void testCheckSiteWidgetBlock() throws Exception {
        app.getNavHelper().OpenVKDevPage();
        app.getCheckHelper()
                .CheckText("Виджеты для сайтов", "//div[@id='dev_page_cont']/div[5]/div")
                .CheckText("Комментарии", "//a[contains(@href, '/dev/Comments')]")
                .CheckText("Комментарии\n Виджет предоставляет возможность за несколько минут установить на сайт полнофункциональный блок для комментирования.", "//div[@id='dev_page_cont']/div[5]/ul/li/span")
                .CheckText("«Запись на стене»\n Виджет предоставляет возможность встроить на свой сайт отдельную запись или комментарий пользователя или сообщества ВКонтакте.", "//div[@id='dev_page_cont']/div[5]/ul[2]/li/span")
                .CheckText("«Запись на стене»", "//a[contains(@href, '/dev/Post')]")
                .CheckText("Сообщества\n Виджет тесно свяжет сайт с группой или официальной страницей ВКонтакте. В виджете отображаются новости сообщества или фотографии участников.", "//div[@id='dev_page_cont']/div[5]/ul[3]/li/span")
                .CheckText("Сообщества", "//a[contains(@href, '/dev/Community')]")
                .CheckText("«Мне нравится»\n Виджет позволит пользователям выразить отношение к статье одним кликом или поделиться ссылкой на неё с друзьями.", "//div[@id='dev_page_cont']/div[5]/ul[4]/li/span")
                .CheckText("«Мне нравится»", "//a[contains(@href, '/dev/Like')]")
                .CheckText("«Мне нравится»\n Виджет позволит пользователям выразить отношение к статье одним кликом или поделиться ссылкой на неё с друзьями.", "//div[@id='dev_page_cont']/div[5]/ul[4]/li/span")
                .CheckText("Рекомендации\n Виджет позволит посетителям быстро найти самые популярные материалы на Вашем сайте. Используются данные виджета «Мне нравится».", "//div[@id='dev_page_cont']/div[5]/ul[5]/li/span")
                .CheckText("Рекомендации", "//a[contains(@href, '/dev/Recommended')]")
                .CheckText("Опросы\n Виджет позволит организовать любое голосование на Вашем сайте и обеспечить вирусное распространение Вашего опроса по всему интернету.", "//div[@id='dev_page_cont']/div[5]/ul[6]/li")
                .CheckText("Опросы", "//a[contains(@href, '/dev/Poll')]")
                .CheckText("Авторизация\n Виджет позволит пользователю авторизоваться при помощи кнопки «Войти через ВКонтакте» и покажет его друзей, которые заходили на Ваш сайт.", "//div[@id='dev_page_cont']/div[5]/ul[7]/li/span")
                .CheckText("Авторизация", "//a[contains(@href, '/dev/Auth')]")
                .CheckText("Публикация ссылок\n Виджет позволит быстро разместить ссылку на материал с Вашего сайта на странице ВКонтакте.", "//div[@id='dev_page_cont']/div[5]/ul[8]/li/span")
                .CheckText("Публикация ссылок", "//a[contains(@href, '/dev/Share')]")
                .CheckText("Подписаться на автора\n Виджет позволит посетителям Вашего сайта в один клик подписаться на заданного Вами пользователя или группу, а также легко поддерживать информацию об авторах на Вашем сайте в актуальном состоянии.", "//div[@id='dev_page_cont']/div[5]/ul[9]/li/span")
                .CheckText("Подписаться на автора", "//a[contains(@href, '/dev/Subscribe')]");
    }

    @Test
    public void testCheckOtherBlock() throws Exception {
        app.getNavHelper().OpenVKDevPage();
        app.getCheckHelper()
                .CheckText("Другие разделы", "//div[@id='dev_page_cont']/div[6]/div")
                .CheckText("API Change Log – Страница с новостями о последних изменениях в API.", "//div[@id='dev_page_cont']/div[6]/ul/li/span")
                .CheckText("API Change Log","//a[@href='http://vk.com/api_updates']")
                .CheckText("Статус API – Страница с информацией о состоянии платформы.","//div[@id='dev_page_cont']/div[6]/ul/li[2]/span")
                .CheckText("Статус API","xpath=(//a[contains(@href, '/dev/health')])[2]");

    }

}
