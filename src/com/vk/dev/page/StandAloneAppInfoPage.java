package com.vk.dev.page;

import com.vk.dev.tests.MyTestBase;
import org.openqa.selenium.WebDriver;

/**
 * Created by User on 07.06.2015.
 */
public class StandAloneAppInfoPage extends MyTestBase {

    WebDriver driver;

String appName = "//*[@id='app_name']";
    String appDescription = "//*[@id='app_desc']";
    String addIconBtn = "//*[@id='app_icon_cont']/a";
    String chooseFileBtn = "//*[@id='apps_edit_upload_cont']/button";
    String appSaveBtn= "//*[@id='app_save_btn']";


    public StandAloneAppInfoPage(WebDriver driver){
        this.driver = driver;
    }

    public void setAppName(String strAppName){
        app.getInputHelper().typeText(appName, strAppName);
    }

    public void setAppDescription(String strAppDescription){
        app.getInputHelper().typeText(appDescription, strAppDescription);
    }

    public void clickAddIconBtn(){
        app.getNavHelper().click(addIconBtn);
    }

    public void clickChooseFileBtn(String fileLocation){
        app.getInputHelper().attachFile(chooseFileBtn, fileLocation);
    }

    public void clickAppSaveBtn(){
        app.getNavHelper().click(appSaveBtn);
    }


    public void fillStandAloneAppInfo(String strAppTitle, String strAppDescription){
        this.setAppName(strAppTitle);
        this.setAppDescription(strAppDescription);
        this.clickAppSaveBtn();
    }

}
