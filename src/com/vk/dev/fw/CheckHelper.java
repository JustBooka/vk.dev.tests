package com.vk.dev.fw;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.*;

/**
 * Created by alexey.bukin on 27.05.2015.
 */
public class CheckHelper extends HelperBase{

    public CheckHelper(AppManager app) {
        super(app);
    }

    public CheckHelper checkMainVKPage() {
       assertThat("Добро пожаловать", is(selenium.getText("id=title")));
        return this;
    }

    public CheckHelper checkDevMainPage() {
        selenium.open("/dev");
        return this;
    }

    public CheckHelper checkText(String text, String element) {
        assertThat(text, is(selenium.getText(element)));
        return this;
    }

    public CheckHelper click(String element) {
        selenium.click(element);
        return this;
    }

    public CheckHelper isPresent(String element){
        selenium.isElementPresent(element);
        return this;
    }


    public CheckHelper CheckThenUnAuthorized() {
        assertThat("Телефон или email", is(selenium.getText("css=div.label")));
        return this;
    }


}
