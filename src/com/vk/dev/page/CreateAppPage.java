package com.vk.dev.page;


import com.vk.dev.tests.MyTestBase;
import org.openqa.selenium.WebDriver;

/**
 * Created by User on 06.06.2015.
 */
public class CreateAppPage extends MyTestBase {

    WebDriver driver;

    String appTitle = "//*[@id='app_title']";
    String standAloneApp = "//*[@id='app_type_0']";
    String webSiteApp = "//*[@id='app_type_1']";
    String flashApp = "//*[@id='app_type_2']";
    String siteURL ="//*[@id='app_site_url']";
    String domainURL="//*[@id='app_base_domain']";
    String appDescription = "//*[@id='app_desc']";
    String categoryGame = "//*[@id='app_category_0']";
    String categoryApp = "//*[@id='app_category_1']";
    String createAppButton = "//*[@id='apps_create_app_btn']";

    public CreateAppPage(WebDriver driver){
        this.driver = driver;
    }

    public void setAppTitle(String strAppTitle){
        app.getInputHelper().typeText(appTitle, strAppTitle);
    }

    public void clickStandAloneApp(){
        app.getNavHelper().click(standAloneApp);
    }

    public void clickWebSiteApp(){
        app.getNavHelper().click(webSiteApp);
    }

    public void clickFlashApp(){
        app.getNavHelper().click(flashApp);
    }

    public void setSiteURL(String strSiteURl){
        app.getInputHelper().typeText(siteURL, strSiteURl);
    }

    public void setDomainURL(String strDomainURL){
        app.getInputHelper().typeText(domainURL, strDomainURL);
    }

    public void setAppDescription(String strAppDescription){
        app.getInputHelper().typeText(appDescription, strAppDescription);
    }

    public void clickCategoryGame(){
        app.getNavHelper().click(categoryGame);
    }

    public void clickCategoryApp(){
        app.getNavHelper().click(categoryApp);
    }

    public void clickCreateApp(){
        app.getNavHelper().click(createAppButton);
    }



    public void createStandAloneApp(String strAppTitle){
        this.setAppTitle(strAppTitle);
        this.clickStandAloneApp();
        this.clickCreateApp();
    }

    public void createWebSiteApp(String strAppTitle, String strSiteURL, String strDomainURL){
        this.setAppTitle(strAppTitle);
        this.clickWebSiteApp();
        this.setSiteURL(strSiteURL);
        this.setDomainURL(strDomainURL);
        this.clickCreateApp();
    }

    public void createFlashApp(String strAppTitle, String strDescriptionApp){
        this.setAppTitle(strAppTitle);
        this.clickFlashApp();
        this.setAppDescription(strDescriptionApp);
        this.clickCategoryApp();
        this.clickCategoryGame();
        this.clickCreateApp();
    }



}
