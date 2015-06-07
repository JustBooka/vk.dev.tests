package com.vk.dev.fw;

/**
 * Created by alexey.bukin on 28.05.2015.
 */
public class InputHelper extends HelperBase{

    public InputHelper(AppManager app) {
        super(app);
    }

    public InputHelper typeText(String element, String text) {
        selenium.type(element, text);
        return this;
    }

    public InputHelper attachFile(String field, String file){
        selenium.attachFile(field, file);
        return this;

    }

}
