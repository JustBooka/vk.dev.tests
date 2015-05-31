package com.vk.dev.fw;

/**
 * Created by alexey.bukin on 28.05.2015.
 */
public class InputHelper extends HelperBase{

    public InputHelper(AppManager app) {
        super(app);
    }

    public InputHelper TypeText(String element, String text) {
        selenium.type(element, text);
        return this;
    }

}
