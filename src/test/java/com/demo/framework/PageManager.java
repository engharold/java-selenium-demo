package com.demo.framework;

import com.demo.pages.LoginPage;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class PageManager {
    public WebDriver driver;
    private LoginPage loginPage;
    JavascriptExecutor jsExecutor;

    public PageManager(WebDriver webDriver) {
        driver = webDriver;
    }

    public LoginPage getLoginPage(){
        return (loginPage == null) ? loginPage = new LoginPage(driver) : loginPage;
    }
}