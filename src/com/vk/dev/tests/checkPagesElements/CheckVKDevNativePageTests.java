package com.vk.dev.tests.checkPagesElements;

import com.vk.dev.tests.MyTestBase;
import org.testng.annotations.Test;

/**
 * Created by User on 31.05.2015.
 */
public class CheckVKDevNativePageTests extends MyTestBase {

    @Test
    public void OpenVKDevNativePage() throws InterruptedException {
        app.getNavHelper().OpenVKDevPage();
        app.getCheckHelper().CheckText("Создание приложения", "css=div.wk_header");
        app.getNavHelper().Click("id=dev_mlist_native");
        Thread.sleep(1000);
        app.getCheckHelper().CheckText("Игры и приложения ВКонтакте", "//*[@id='dev_page_cont']/div[1]/div[1]/text()");
        app.getNavHelper().Click("id=dev_mlist_main");
        Thread.sleep(1000);
        app.getCheckHelper().CheckText("Создание приложения", "css=div.wk_header");
        app.getNavHelper().Click("css=b > a");
        Thread.sleep(1000);
        app.getCheckHelper().CheckText("Игры и приложения ВКонтакте", "css=div.wk_header");
    }

    @Test
    public void ChckVKDevNativePage() throws InterruptedException {
        app.getNavHelper().OpenVKDevPage();
        app.getCheckHelper().CheckText("Создание приложения", "css=div.wk_header");
        app.getNavHelper().Click("id=dev_mlist_native");
        Thread.sleep(1000);
        app.getCheckHelper()
                .CheckText("Игры и приложения ВКонтакте", "//*[@id='dev_page_cont']/div[1]/div[1]/text()")
                .CheckText("C помощью платформы для разработчиков Вы можете создать приложение, которое будет доступно миллионам пользователей прямо из интерфейса ВКонтакте.", "//*[@id='dev_page_cont']/div[1]/text()[3]")
                .IsPresent("//div[@id='dev_page_cont']/div/center/img")
                .CheckText("Создание приложения", "//*[@id='dev_page_cont']/div[2]/div[1]")
                .CheckText("Создайте Flash/IFrame приложение и укажите его основные данные", "//*[@id='dev_page_cont']/div[2]/text()[4]")
                .CheckText("Данные о приложении", "//a[contains(@href, '/dev/native_create')]")
                .CheckText("Выберите подходящий Вашему приложению тип SDK для интеграции с ВКонтакте", "//*[@id='dev_page_cont']/div[2]/text()[7]")
                .CheckText("Интеграция API ВКонтакте", "xpath=(//a[contains(@href, '/dev/native_create')])[2]")
                .CheckText("Реализуйте внутриигровые покупки и показывайте игрокам релевантную рекламу", "//*[@id='dev_page_cont']/div[2]/text()[10]")
                .CheckText("Интеграция платежной и рекламной системы", "xpath=(//a[contains(@href, '/dev/native_create')])[3]")
                .CheckText("Дайте пользователям возможность взаимодействовать с друзьями", "//*[@id='dev_page_cont']/div[2]/text()[13]")
                .CheckText("Интеграция социальных механик", "xpath=(//a[contains(@href, '/dev/native_create')])[4]");
        app.getCheckHelper()
                .CheckText("Размещение в каталоге", "//*[@id='dev_page_cont']/div[3]/div[1]/text()")
                .CheckText("Проверьте приложение на соответствие требованиям размещения", "//*[@id='dev_page_cont']/div[3]/text()[4]")
                .CheckText("Требования к приложениям", "//a[contains(@href, '/dev/native_catalog')]")
                .CheckText("Разместите приложение в каталоге, чтобы миллионы игроков могли найти его", "//*[@id='dev_page_cont']/div[3]/text()[7]")
                .CheckText("Отправка заявки на публикацию", "xpath=(//a[contains(@href, '/dev/native_catalog')])[2]")
                .CheckText("Следите за процессом проверки Вашего приложения модераторами ВКонтакте", "//*[@id='dev_page_cont']/div[3]/text()[10]")
                .CheckText("Статус заявки", "xpath=(//a[contains(@href, '/dev/native_catalog')])[3]");
        app.getCheckHelper()
                .CheckText("Продвижение", "//*[@id='dev_page_cont']/div[4]/div[1]")
                .CheckText("Используйте каналы социального взаимодействия для привлечения и удержания игроков", "//*[@id='dev_page_cont']/div[4]/text()[4]")
                .CheckText("Социальные механики", "//a[contains(@href, '/dev/native_promo')]")
                .CheckText("Разместите приложение на главной странице каталога", "//*[@id='dev_page_cont']/div[4]/text()[7]")
                .CheckText("Фичеринг", "xpath=(//a[contains(@href, '/dev/native_promo')])[2]")
                .CheckText("Найдите свою целевую аудиторию", "//*[@id='dev_page_cont']/div[4]/text()[10]")
                .CheckText("Реклама", "xpath=(//a[contains(@href, '/dev/native_promo')])[3]");
        app.getCheckHelper()
                .CheckText("Монетизация", "//*[@id='dev_page_cont']/div[5]/div[1]/text()")
                .CheckText("Внедрите внутриигровые покупки", "//*[@id='dev_page_cont']/div[5]/text()[4]")
                .CheckText("Платежная система", "//a[contains(@href, '/dev/native_monetization')]")
                .CheckText("Монетизируйте неплатящую аудиторию", "//*[@id='dev_page_cont']/div[5]/text()[7]")
                .CheckText("Реклама", "xpath=(//a[contains(@href, '/dev/native_monetization')])[2]");
        app.getCheckHelper()
                .CheckText("С чего начать?", "//*[@id='dev_page_cont']/div[6]/div/text()")
                .CheckText("Узнайте,", "//*[@id='dev_page_cont']/div[6]/text()[2]")
                .CheckText("как создать приложение ВКонтакте", "xpath=(//a[contains(@href, '/dev/native_create')])[5]");

    }
}
