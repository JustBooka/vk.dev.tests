package com.vk.dev.tests.checkPagesElements;

import com.vk.dev.tests.MyTestBase;
import org.testng.annotations.Test;

/**
 * Created by User on 31.05.2015.
 */
public class CheckVKDevHelpPageTests extends MyTestBase {

    @Test
    public void testDevHelpContent() {
        app.getNavHelper().openVKDevHelpPage();
        app.getCheckHelper().checkText("Обратная связь", "xpath=(//a[contains(@href, '/dev/feedback')])[2]")
                .checkText("Обратная связь\n Контакты для вопросов по API, размещению приложений и сообщению о неполадках. Информация об официальных сообществах.", "//div[@id='dev_page_cont']/div")
                .checkText("Баг-трекер", "xpath=(//a[contains(@href, '/dev/bugs')])[2]")
                .checkText("Баг-трекер\n Раздел для отслеживания статуса обнаруженных ошибок в работе платформы.", "//div[@id='dev_page_cont']/div[2]")
                .checkText("Партнерская модель", "//div[@id='dev_page_cont']/div[3]/div/a")
                .checkText("Партнерская модель\n Информация об условиях приема и вывода платежей из приложений ВКонтакте. \n В этом разделе освещены основные аспекты монетизации Вашего приложения.", "//div[@id='dev_page_cont']/div[3]")
                .checkText("Состояние платформы", "xpath=(//a[contains(@href, '/dev/health')])[2]")
                .checkText("Состояние платформы\n Актуальная информация о времени отклика и работоспособности групп методов.", "//div[@id='dev_page_cont']/div[4]");
    }

    @Test
    public void testCheckFeedbackBlock() throws InterruptedException {
        app.getNavHelper().openVKDevHelpPage();
        app.getCheckHelper().checkText("Обратная связь", "xpath=(//a[contains(@href, '/dev/feedback')])[2]");
        app.getNavHelper().click("//*[@id='dev_mlist_feedback']");
        Thread.sleep(1000);
        app.getCheckHelper().checkText("Задать вопрос по API", "//a[@href='http://vk.com/support?act=new_api']");
        app.getNavHelper().click("//*[@id='dev_mlist_help']");
        Thread.sleep(1000);
        app.getNavHelper().click("//*[@id='dev_page_cont']/div[1]/div[1]/a");
        Thread.sleep(1000);
        app.getCheckHelper().checkText("Задать вопрос по API", "//*[@id='dev_page_cont']/div[1]/blockquote/ul/li[1]/span/a")
                .checkText("Задать вопрос по приложениям", "//a[@href='http://vk.com/support?act=new_app']")
                .checkText("Поддержку", "//a[@href='http://vk.com/support?act=new']")
                .checkText("API ВКонтакте — новости и информация о развитии платформы", "//div[@id='dev_page_cont']/div[2]/ul/li/span")
                .checkText("API ВКонтакте", "//a[@href='http://vk.com/apiclub']")
                .checkText("Официальный клуб разработчиков — общение разработчиков", "//div[@id='dev_page_cont']/div[2]/ul/li[2]/span")
                .checkText("Официальный клуб разработчиков", "//a[@href='http://vk.com/devclub']")
                .checkText("Обратная связь", "//*[@id='dev_page_cont']/div[1]/div[1]/text()")
                .checkText("Если у Вас возникли вопросы по использованию API ВКонтакте, разработке приложений, или Вы обнаружили неточность в документации, пожалуйста, обратитесь к нам:", "//*[@id='dev_page_cont']/div[1]/text()[3]")
                .checkText("Задать любой другой вопрос можно в", "//*[@id='dev_page_cont']/div[1]/blockquote/ul/li[2]/span/span/b/text()[1]")
                .checkText("Для ускорения рассмотрения укажите:", "//*[@id='dev_page_cont']/div[1]/text()[5]")
                .checkText("API_ID приложения;", "//*[@id='dev_page_cont']/div[1]/ul/li[1]/span/text()")
                .checkText("адрес страницы, на которой возникает ошибка;", "//*[@id='dev_page_cont']/div[1]/ul/li[2]/span/text()")
                .checkText("содержимое запроса к API, с которым возникают неполадки;", "//*[@id='dev_page_cont']/div[1]/ul/li[3]/span/text()")
                .checkText("содержимое ответа сервера на запрос, с которым возникают неполадки.", "//*[@id='dev_page_cont']/div[1]/ul/li[4]/span/text()");
    }
}
