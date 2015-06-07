package com.vk.dev.tests.checkPagesElements;

import com.vk.dev.tests.MyTestBase;
import org.testng.annotations.Test;

/**
 * Created by User on 31.05.2015.
 */
public class CheckVKDevNativePageTests extends MyTestBase {

    @Test
    public void OpenVKDevNativePage() throws InterruptedException {
        app.getNavHelper().openVKDevPage();
        app.getCheckHelper().checkText("Создание приложения", "css=div.wk_header");
        app.getNavHelper().click("id=dev_mlist_native");
        Thread.sleep(1000);
        app.getCheckHelper().checkText("Игры и приложения ВКонтакте", "//*[@id='dev_page_cont']/div[1]/div[1]/text()");
        app.getNavHelper().click("id=dev_mlist_main");
        Thread.sleep(1000);
        app.getCheckHelper().checkText("Создание приложения", "css=div.wk_header");
        app.getNavHelper().click("css=b > a");
        Thread.sleep(1000);
        app.getCheckHelper().checkText("Игры и приложения ВКонтакте", "css=div.wk_header");
    }

    @Test
    public void ChckVKDevNativePage() throws InterruptedException {
        app.getNavHelper().openVKDevPage();
        app.getCheckHelper().checkText("Создание приложения", "css=div.wk_header");
        app.getNavHelper().click("id=dev_mlist_native");
        Thread.sleep(1000);
        app.getCheckHelper()
                .checkText("Игры и приложения ВКонтакте", "//*[@id='dev_page_cont']/div[1]/div[1]/text()")
                .checkText("C помощью платформы для разработчиков Вы можете создать приложение, которое будет доступно миллионам пользователей прямо из интерфейса ВКонтакте.", "//*[@id='dev_page_cont']/div[1]/text()[3]")
                .isPresent("//div[@id='dev_page_cont']/div/center/img")
                .checkText("Создание приложения", "//*[@id='dev_page_cont']/div[2]/div[1]")
                .checkText("Создайте Flash/IFrame приложение и укажите его основные данные", "//*[@id='dev_page_cont']/div[2]/text()[4]")
                .checkText("Данные о приложении", "//a[contains(@href, '/dev/native_create')]")
                .checkText("Выберите подходящий Вашему приложению тип SDK для интеграции с ВКонтакте", "//*[@id='dev_page_cont']/div[2]/text()[7]")
                .checkText("Интеграция API ВКонтакте", "xpath=(//a[contains(@href, '/dev/native_create')])[2]")
                .checkText("Реализуйте внутриигровые покупки и показывайте игрокам релевантную рекламу", "//*[@id='dev_page_cont']/div[2]/text()[10]")
                .checkText("Интеграция платежной и рекламной системы", "xpath=(//a[contains(@href, '/dev/native_create')])[3]")
                .checkText("Дайте пользователям возможность взаимодействовать с друзьями", "//*[@id='dev_page_cont']/div[2]/text()[13]")
                .checkText("Интеграция социальных механик", "xpath=(//a[contains(@href, '/dev/native_create')])[4]");
        app.getCheckHelper()
                .checkText("Размещение в каталоге", "//*[@id='dev_page_cont']/div[3]/div[1]/text()")
                .checkText("Проверьте приложение на соответствие требованиям размещения", "//*[@id='dev_page_cont']/div[3]/text()[4]")
                .checkText("Требования к приложениям", "//a[contains(@href, '/dev/native_catalog')]")
                .checkText("Разместите приложение в каталоге, чтобы миллионы игроков могли найти его", "//*[@id='dev_page_cont']/div[3]/text()[7]")
                .checkText("Отправка заявки на публикацию", "xpath=(//a[contains(@href, '/dev/native_catalog')])[2]")
                .checkText("Следите за процессом проверки Вашего приложения модераторами ВКонтакте", "//*[@id='dev_page_cont']/div[3]/text()[10]")
                .checkText("Статус заявки", "xpath=(//a[contains(@href, '/dev/native_catalog')])[3]");
        app.getCheckHelper()
                .checkText("Продвижение", "//*[@id='dev_page_cont']/div[4]/div[1]")
                .checkText("Используйте каналы социального взаимодействия для привлечения и удержания игроков", "//*[@id='dev_page_cont']/div[4]/text()[4]")
                .checkText("Социальные механики", "//a[contains(@href, '/dev/native_promo')]")
                .checkText("Разместите приложение на главной странице каталога", "//*[@id='dev_page_cont']/div[4]/text()[7]")
                .checkText("Фичеринг", "xpath=(//a[contains(@href, '/dev/native_promo')])[2]")
                .checkText("Найдите свою целевую аудиторию", "//*[@id='dev_page_cont']/div[4]/text()[10]")
                .checkText("Реклама", "xpath=(//a[contains(@href, '/dev/native_promo')])[3]");
        app.getCheckHelper()
                .checkText("Монетизация", "//*[@id='dev_page_cont']/div[5]/div[1]/text()")
                .checkText("Внедрите внутриигровые покупки", "//*[@id='dev_page_cont']/div[5]/text()[4]")
                .checkText("Платежная система", "//a[contains(@href, '/dev/native_monetization')]")
                .checkText("Монетизируйте неплатящую аудиторию", "//*[@id='dev_page_cont']/div[5]/text()[7]")
                .checkText("Реклама", "xpath=(//a[contains(@href, '/dev/native_monetization')])[2]");
        app.getCheckHelper()
                .checkText("С чего начать?", "//*[@id='dev_page_cont']/div[6]/div/text()")
                .checkText("Узнайте,", "//*[@id='dev_page_cont']/div[6]/text()[2]")
                .checkText("как создать приложение ВКонтакте", "xpath=(//a[contains(@href, '/dev/native_create')])[5]");
    }
}
