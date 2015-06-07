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

    public NavHelper clickAndWait(String s) {
        selenium.click(s);
        selenium.waitForPageToLoad("6000");
        return this;
    }

    public NavHelper click(String s) {
        selenium.click(s);
        return this;
    }

    public NavHelper pressTab(String s) {
        selenium.keyPress(s,"\t");
        return this;
    }

    public NavHelper openVKDevPageAuthorize() {
        selenium.open("/dev");
        assertThat("Разработчикам", is(selenium.getTitle()));
        return this;
    }

    public NavHelper openVKDevPage(){
        selenium.open("/dev");
        assertThat("Разработчикам | ВКонтакте", is(selenium.getTitle()));
        app.getNavHelper().clickAndWait("//*[@id='dev_top_docs']");
        return this;
    }

    public NavHelper openVKDevHelpPage(){
        selenium.open("/dev");
        assertThat("Разработчикам | ВКонтакте", is(selenium.getTitle()));
        app.getNavHelper().clickAndWait("//*[@id='dev_top_help']");
        return this;
    }

    public NavHelper scrollDown(){
        selenium.getEval("window.scrollBy(0,200)");
        return this;
    }

    public NavHelper openCreateAppPage() {
        app.getNavHelper().openVKDevPageAuthorize()
                .clickAndWait("css=button.flat_button");
        return this;
    }

    public NavHelper openVKMainPage(){
        app.getCheckHelper().checkDevMainPage();
        app.getNavHelper().clickAndWait("css=div.dev_create_app_btn.fl_l > button.flat_button");
        app.getCheckHelper().checkMainVKPage();
        return this;
    }

    public NavHelper openStandAloneAppOptions() {
        selenium.open("/editapp?id=4948066&section=options");
        return this;
    }

    public NavHelper openStandAloneAppFunctions() {
        selenium.open("/editapp?id=4948066&section=functions");
        return this;
    }

    public NavHelper openStandAloneAppStats() {
        selenium.open("/stats?aid=4948066");
        return this;
    }

    public NavHelper openStandAloneAppAdmins() {
        selenium.open("/editapp?id=4948066&section=admins");
        return this;
    }

}