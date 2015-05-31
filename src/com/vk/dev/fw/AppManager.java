package com.vk.dev.fw;

/**
 * Created by alexey.bukin on 27.05.2015.
 */
public class AppManager {


    private static AppManager app;
    private SeleniumHelper seleniumHelper;
    private NavHelper navHelper;
    private CheckHelper checkHelper;
    private InputHelper inputHelper;

    public static AppManager getInstance() {
        if (app == null) {
            app = new AppManager();
        }
        return app;
    }



    public SeleniumHelper getSeleniumHelper() {
        if (seleniumHelper == null) {
            seleniumHelper = new SeleniumHelper();
        }
        return seleniumHelper;
    }

    public NavHelper getNavHelper() {
        if (navHelper == null) {
            navHelper = new NavHelper(this);
        }
        return navHelper;
    }

    public CheckHelper getCheckHelper() {
        if (checkHelper == null) {
            checkHelper = new CheckHelper(this);
        }
        return checkHelper;
    }

    public InputHelper getInputHelper() {
        if (inputHelper == null) {
            inputHelper = new InputHelper(this);
        }
        return inputHelper;
    }

    public void dismiss() {
        if (seleniumHelper != null) {
            seleniumHelper.dismiss();
        }
    }
}
