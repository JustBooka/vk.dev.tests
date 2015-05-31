package com.vk.dev.fw;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by alexey.bukin on 27.05.2015.
 */
public class NavHelper extends HelperBase {

    public NavHelper(AppManager app) {
        super(app);
    }

    public NavHelper ClickAndWait(String s) {
        selenium.click(s);
        selenium.waitForPageToLoad("6000");
        return this;
    }

    public NavHelper Click(String s) {
        selenium.click(s);
        return this;
    }

    public NavHelper PressTab(String s) {
        selenium.keyPress(s,"\t");
        return this;
    }

    public NavHelper OpenVKDevPageAuthorize() {
        selenium.open("/dev");
        assertThat("Разработчикам", is(selenium.getTitle()));
        return this;
    }

    public NavHelper OpenVKDevPage(){
        selenium.open("/dev");
        assertThat("Разработчикам | ВКонтакте", is(selenium.getTitle()));
        app.getNavHelper().ClickAndWait("//*[@id='dev_top_docs']");
        return this;
    }

    public NavHelper OpenVKDevHelpPage(){
        selenium.open("/dev");
        assertThat("Разработчикам | ВКонтакте", is(selenium.getTitle()));
        app.getNavHelper().ClickAndWait("//*[@id='dev_top_help']");
        return this;
    }

    public NavHelper ScrollDown(){
        selenium.getEval("window.scrollBy(0,200)");
        return this;
    }

    public NavHelper OpenCreateAppPage() {
        selenium.open("/editapp?act=create");
        assertThat("Создание приложения", is(selenium.getTitle()));
        return this;
    }
}
