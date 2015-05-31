package com.vk.dev.fw;

import com.thoughtworks.selenium.Selenium;

/**
 * Created by alexey.bukin on 27.05.2015.
 */
public class HelperBase {

    protected final AppManager app;
    protected Selenium selenium;

    public HelperBase(AppManager app){
        this.app = app;
        selenium = app.getSeleniumHelper().getSelenium();
    }
}
