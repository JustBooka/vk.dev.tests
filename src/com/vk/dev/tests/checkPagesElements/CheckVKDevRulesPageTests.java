package com.vk.dev.tests.checkPagesElements;

import com.vk.dev.tests.MyTestBase;
import org.testng.annotations.Test;

/**
 * Created by User on 31.05.2015.
 */
public class CheckVKDevRulesPageTests extends MyTestBase{

    @Test
    public void testRulesPageContent(){
        app.getNavHelper().OpenVKDevPage()
                .ClickAndWait("//*[@id='dev_top_terms']");
        app.getCheckHelper().CheckText("Правила платформы\n Условия размещения приложений на сайте ВКонтакте. \n Пожалуйста, ознакомьтесь с содержимым этого раздела перед началом работы с API ВКонтакте и при возникновении спорных ситуаций.","//div[@id='dev_page_cont']/div")
                .CheckText("Правила платформы","xpath=(//a[contains(@href, '/dev/rules')])[2]")
                .CheckText("Реклама в приложениях","xpath=(//a[contains(@href, '/dev/adterms')])[2]")
                .CheckText("Приложения-магазины","xpath=(//a[contains(@href, '/dev/ecommerce_terms')])[2]")
                .CheckText("Приложения-магазины\n Правила размещения приложений-магазинов.","//div[@id='dev_page_cont']/div[3]")
                .CheckText("Рекламные приложения","xpath=(//a[contains(@href, '/dev/ad_apps')])[2]")
                .CheckText("Реклама в приложениях\n Правила размещения рекламы в приложениях ВКонтакте. \n\n Рекламные приложения\n Правила размещения рекламных приложений.","//div[@id='dev_page_cont']/div[2]");

    }
}
