package com.demo.pages;

import com.demo.framework.PageManager;
import com.demo.stepdefinitions.CommonSteps;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends PageManager {

    CommonSteps commonSteps = new CommonSteps();
    By txtUserName = By.xpath("//input[@id='user-name']");
    By txtPassword = By.xpath("//input[@id='password']");
    By btnLogin = By.xpath("//*[@id='login-button']");

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void inputUserName(String userName) {
        commonSteps.input(txtUserName, userName);
    }

    public void inputPassword(String password) {
        commonSteps.input(txtPassword, password);
    }

    public void clickLoginButton() {
        commonSteps.click(btnLogin);
    }
}