package com.vk.dev.tests.checkPagesElements;

import com.vk.dev.tests.MyTestBase;
import org.testng.annotations.Test;

/**
 * Created by User on 31.05.2015.
 */
public class CheckVKDevHelpPageTests extends MyTestBase {

    @Test
    public void testDevHelpContent() {
        app.getNavHelper().OpenVKDevHelpPage();
        app.getCheckHelper().CheckText("Обратная связь", "xpath=(//a[contains(@href, '/dev/feedback')])[2]")
                .CheckText("Обратная связь\n Контакты для вопросов по API, размещению приложений и сообщению о неполадках. Информация об официальных сообществах.", "//div[@id='dev_page_cont']/div")
                .CheckText("Баг-трекер", "xpath=(//a[contains(@href, '/dev/bugs')])[2]")
                .CheckText("Баг-трекер\n Раздел для отслеживания статуса обнаруженных ошибок в работе платформы.", "//div[@id='dev_page_cont']/div[2]")
                .CheckText("Партнерская модель", "//div[@id='dev_page_cont']/div[3]/div/a")
                .CheckText("Партнерская модель\n Информация об условиях приема и вывода платежей из приложений ВКонтакте. \n В этом разделе освещены основные аспекты монетизации Вашего приложения.", "//div[@id='dev_page_cont']/div[3]")
                .CheckText("Состояние платформы", "xpath=(//a[contains(@href, '/dev/health')])[2]")
                .CheckText("Состояние платформы\n Актуальная информация о времени отклика и работоспособности групп методов.", "//div[@id='dev_page_cont']/div[4]");
    }
}
