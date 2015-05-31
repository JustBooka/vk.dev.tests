package com.vk.dev.fw;

import com.thoughtworks.selenium.DefaultSelenium;
import com.thoughtworks.selenium.Selenium;

/**
 * Created by alexey.bukin on 27.05.2015.
 */
public class SeleniumHelper {

    static protected Selenium selenium;

    public SeleniumHelper() {
        selenium = new DefaultSelenium("localhost", 4444, "*chrome", "http://vk.com/");
        selenium.start();
    }

    public Selenium getSelenium() {
        return selenium;
    }

    public void dismiss() {
        selenium.stop();
    }
}
