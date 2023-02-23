package com.demo.stepdefinitions;

import com.demo.framework.FrameworkManager;
import com.demo.pages.LoginPage;
import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertTrue;

public class LoginSteps extends FrameworkManager{

    LoginPage loginPage;
    WebDriver driver;

    public LoginSteps() {
        super.setup();
        driver = super.getDriver();
        loginPage = super.getPageManager().getLoginPage();
//        mainPage = super.getPageManager().getMainPage();
    }

    @Given("I log in to the application")
    public void LogInToTheApplication() {
        loginPage.inputUserName("standard_user");
        loginPage.inputPassword("secret_sauce");
        loginPage.clickLoginButton();
//        assertTrue(mainPage.getWelcomeMessage().contains("Welcome"));
        tearDown();
    }
}