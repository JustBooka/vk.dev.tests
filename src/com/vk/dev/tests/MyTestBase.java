package com.vk.dev.tests;

import com.vk.dev.fw.AppManager;
import org.testng.annotations.*;

/**
 * Created by alexey.bukin on 27.05.2015.
 */
public class MyTestBase {

    static protected AppManager app;

    @BeforeClass
    public void setUp() throws Exception {
       app = AppManager.getInstance();
    }

    @AfterTest
    public void tearDown() throws Exception {
        app.dismiss();
    }
}
