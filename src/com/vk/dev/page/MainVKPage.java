package com.vk.dev.page;

import com.vk.dev.tests.MyTestBase;
import org.openqa.selenium.WebDriver;

/**
 * Created by User on 06.06.2015.
 */
public class MainVKPage extends MyTestBase {

    WebDriver driver;

    String Email = "id=quick_email";
    String Password  = "id=quick_pass";
    String Login = "id=quick_login_button";

    public MainVKPage(WebDriver driver){
        this.driver = driver;
    }

    public void setEmail(String strEmail){
        app.getInputHelper().typeText(Email, strEmail);
    }

    public void setPassword(String strPassword){
        app.getInputHelper().typeText(Password, strPassword);
    }

    public void clickLogin(){
        app.getNavHelper().click(Login);
    }


    public void LogIn(String strEmail, String strPassword){
        this.setEmail(strEmail);
        this.setPassword(strPassword);
        this.clickLogin();
    }

}
