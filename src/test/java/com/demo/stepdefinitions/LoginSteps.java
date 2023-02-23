package com.demo.stepdefinitions;

import com.demo.framework.FrameworkManager;
import com.demo.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;
import static org.junit.Assert.assertTrue;

public class LoginSteps extends FrameworkManager{

    LoginPage loginPage;
    WebDriver driver;

    public LoginSteps() {
        setup();
        driver = getDriver();
        loginPage = getPageManager().getLoginPage();
    }

    @Given("I am on the application page")
    public void OpenApplicationPage() {
        driver.get("https://www.saucedemo.com");
    }

    @And("I log in to the application")
    public void LogInToTheApplication() {
        loginPage.inputUserName("standard_user");
        loginPage.inputPassword("secret_sauce");
        loginPage.clickLoginButton();
        assertTrue(driver.getCurrentUrl().contains("inventory"));
    }
}