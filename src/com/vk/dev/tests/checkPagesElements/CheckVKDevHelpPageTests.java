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

    @Test
    public void testCheckFeedbackBlock() throws InterruptedException {
        app.getNavHelper().OpenVKDevHelpPage();
        app.getCheckHelper().CheckText("Обратная связь", "xpath=(//a[contains(@href, '/dev/feedback')])[2]");
        app.getNavHelper().Click("//*[@id='dev_mlist_feedback']");
        Thread.sleep(1000);
        app.getCheckHelper().CheckText("Задать вопрос по API", "//a[@href='http://vk.com/support?act=new_api']");
        app.getNavHelper().Click("//*[@id='dev_mlist_help']");
        Thread.sleep(1000);
        app.getNavHelper().Click("//*[@id='dev_page_cont']/div[1]/div[1]/a");
        Thread.sleep(1000);
        app.getCheckHelper().CheckText("Задать вопрос по API", "//*[@id='dev_page_cont']/div[1]/blockquote/ul/li[1]/span/a")
                .CheckText("Задать вопрос по приложениям", "//a[@href='http://vk.com/support?act=new_app']")
                .CheckText("Поддержку", "//a[@href='http://vk.com/support?act=new']")
                .CheckText("API ВКонтакте — новости и информация о развитии платформы", "//div[@id='dev_page_cont']/div[2]/ul/li/span")
                .CheckText("API ВКонтакте", "//a[@href='http://vk.com/apiclub']")
                .CheckText("Официальный клуб разработчиков — общение разработчиков", "//div[@id='dev_page_cont']/div[2]/ul/li[2]/span")
                .CheckText("Официальный клуб разработчиков", "//a[@href='http://vk.com/devclub']")
                .CheckText("Обратная связь", "//*[@id='dev_page_cont']/div[1]/div[1]/text()")
                .CheckText("Если у Вас возникли вопросы по использованию API ВКонтакте, разработке приложений, или Вы обнаружили неточность в документации, пожалуйста, обратитесь к нам:", "//*[@id='dev_page_cont']/div[1]/text()[3]")
                .CheckText("Задать любой другой вопрос можно в", "//*[@id='dev_page_cont']/div[1]/blockquote/ul/li[2]/span/span/b/text()[1]")
                .CheckText("Для ускорения рассмотрения укажите:", "//*[@id='dev_page_cont']/div[1]/text()[5]")
                .CheckText("API_ID приложения;", "//*[@id='dev_page_cont']/div[1]/ul/li[1]/span/text()")
                .CheckText("адрес страницы, на которой возникает ошибка;", "//*[@id='dev_page_cont']/div[1]/ul/li[2]/span/text()")
                .CheckText("содержимое запроса к API, с которым возникают неполадки;", "//*[@id='dev_page_cont']/div[1]/ul/li[3]/span/text()")
                .CheckText("содержимое ответа сервера на запрос, с которым возникают неполадки.", "//*[@id='dev_page_cont']/div[1]/ul/li[4]/span/text()");
    }
}
