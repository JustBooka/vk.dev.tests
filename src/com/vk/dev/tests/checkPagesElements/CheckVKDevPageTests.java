package com.vk.dev.tests.checkPagesElements;

import com.vk.dev.tests.MyTestBase;
import org.testng.annotations.Test;

/**
 * Created by alexey.bukin on 28.05.2015.
 */
public class CheckVKDevPageTests extends MyTestBase {
        //should run with authorize
    @Test
    public void testCheckMainDevPageWhenUnAuthorize() throws Exception {
        app.getCheckHelper().checkDevMainPage();
        app.getCheckHelper()
                .checkText("ВКонтакте — самый быстрорастущий сайт европейского интернета. Его аудитория стремительно увеличивается, и сейчас на ВКонтакте приходится более половины русскоязычного трафика. Если Вы хотите заниматься разработкой приложений в интернете, Вы можете приобщиться к этому успеху и получить доступ к аудитории свыше 170 миллионов пользователей.", "css=div.dev_main_desc")
                .checkText("Создать приложение", "css=div.dev_create_app_btn.fl_l > button.flat_button")
                .checkText("Список моих приложений →", "//div[3]/a")
                .checkText("Статус платформы", "css=div.dev_info_status_header")
                .checkText("Правила", "id=dev_top_terms")
                .checkText("Поддержка", "id=dev_top_help")
                .checkText("Мои приложения", "id=dev_top_apps")
                .checkText("Документация", "id=dev_top_docs")
                .checkText("Developers", "link=Developers")
                .checkText("Игры и приложения ВКонтакте", "css=div.dev_sect_label")
                .checkText("Mobile/Standalone приложения", "css=a.dev_sect.dev_sect_standalone > div.dev_sect_label")
                .checkText("Авторизация и виджеты для сайтов", "css=a.dev_sect.dev_sect_widgets > div.dev_sect_label")
                .checkText("Последние новости", "css=div.dev_info_header")
                .checkText("Документация платформы", "css=div.dev_part_name")
                .checkText("Описание возможностей платформы ВКонтакте: процедура авторизации приложения, серверные и клиентские методы API, создание приложений и подключение сайтов.", "css=div.dev_part_desc")
                .checkText("Поддержка", "//div[@id='dev_page_wrap']/div[3]/div/div/div/a[2]/div")
                .checkText("Разрешение вопросов, связанных с платформой: инструменты для связи со службой поддержки, попадание в каталог приложений, статус работы платформы.", "//div[@id='dev_page_wrap']/div[3]/div/div/div/a[2]/div[2]")
                .checkText("Правила платформы", "//div[@id='dev_page_wrap']/div[3]/div/div/div/a[3]/div")
                .checkText("Правила публикации приложений на площадке ВКонтакте, размещение рекламы в приложениях, прием платежей от пользователей.", "//div[@id='dev_page_wrap']/div[3]/div/div/div/a[3]/div[2]")
                .checkText("Баг-трекер", "//div[@id='dev_page_wrap']//a[4]/div")
                .checkText("Инструмент для информирования разработчиков о проблемах в API и документации платформы.", "//div[@id='dev_page_wrap']//a[4]/div[2]")
                .checkText("ВКонтакте © 2015", "css=div.dev_footer_copy.fl_l")
                .checkText("правила", "//div[3]/a[3]")
                .checkText("о сайте", "//div[2]/div/div[3]/a")
                .checkText("реклама", "//div[3]/a[4]")
                .checkText("разработчикам", "//div[3]/a[5]")
                .checkText("Язык:Русский", "css=div.dev_footer_lang.fl_r");
    }

        @Test
        public void testCheckMainDevPageWhenAuthorize() throws Exception {
                app.getCheckHelper().checkDevMainPage();
                app.getCheckHelper()
                        .checkText("ВКонтакте — самый быстрорастущий сайт европейского интернета. Его аудитория стремительно увеличивается, и сейчас на ВКонтакте приходится более половины русскоязычного трафика. Если Вы хотите заниматься разработкой приложений в интернете, Вы можете приобщиться к этому успеху и получить доступ к аудитории свыше 170 миллионов пользователей.", "css=div.dev_main_desc")
                        .checkText("Создать приложение", "css=div.dev_create_app_btn.fl_l > button.flat_button")
                        .checkText("Список моих приложений →", "//div[3]/a")
                        .checkText("Статус платформы", "css=div.dev_info_status_header")
                        .checkText("Правила", "id=dev_top_terms")
                        .checkText("Поддержка", "id=dev_top_help")
                        .checkText("Мои приложения", "id=dev_top_apps")
                        .checkText("Документация", "id=dev_top_docs")
                        .checkText("Developers", "link=Developers")
                        .checkText("Игры и приложения ВКонтакте", "css=div.dev_sect_label")
                        .checkText("Mobile/Standalone приложения", "css=a.dev_sect.dev_sect_standalone > div.dev_sect_label")
                        .checkText("Авторизация и виджеты для сайтов", "css=a.dev_sect.dev_sect_widgets > div.dev_sect_label")
                        .checkText("Последние новости", "css=div.dev_info_header")
                        .checkText("Документация платформы", "css=div.dev_part_name")
                        .checkText("Описание возможностей платформы ВКонтакте: процедура авторизации приложения, серверные и клиентские методы API, создание приложений и подключение сайтов.", "css=div.dev_part_desc")
                        .checkText("Поддержка", "//div[@id='dev_page_wrap']/div[3]/div/div/div/a[2]/div")
                        .checkText("Разрешение вопросов, связанных с платформой: инструменты для связи со службой поддержки, попадание в каталог приложений, статус работы платформы.", "//div[@id='dev_page_wrap']/div[3]/div/div/div/a[2]/div[2]")
                        .checkText("Правила платформы", "//div[@id='dev_page_wrap']/div[3]/div/div/div/a[3]/div")
                        .checkText("Правила публикации приложений на площадке ВКонтакте, размещение рекламы в приложениях, прием платежей от пользователей.", "//div[@id='dev_page_wrap']/div[3]/div/div/div/a[3]/div[2]")
                        .checkText("Баг-трекер", "//div[@id='dev_page_wrap']//a[4]/div")
                        .checkText("Инструмент для информирования разработчиков о проблемах в API и документации платформы.", "//div[@id='dev_page_wrap']//a[4]/div[2]")
                        .checkText("ВКонтакте © 2015", "css=div.dev_footer_copy.fl_l")
                        .checkText("правила", "//div[3]/a[3]")
                        .checkText("о сайте", "//div[2]/div/div[3]/a")
                        .checkText("реклама", "//div[3]/a[4]")
                        .checkText("разработчикам", "//div[3]/a[5]")
                        .checkText("Язык:Русский", "css=div.dev_footer_lang.fl_r");
        }

}
