package com.demo.pages;

import com.demo.framework.PageManager;
import com.demo.stepdefinitions.CommonSteps;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutYourInformationPage extends PageManager {

    CommonSteps commonSteps = new CommonSteps();
    By txtFirstName = By.xpath("//input[@id='first-name']");
    By txtLastName = By.xpath("//input[@id='last-name']");
    By txtZipCode = By.xpath("//input[@id='postal-code']");
    By btnContinue = By.xpath("//*[@id='continue']");


    public CheckoutYourInformationPage(WebDriver driver) {
        super(driver);
    }

    public void inputFirstName(String firstName) {
        commonSteps.input(txtFirstName, firstName);
    }

    public void inputLastName(String lastName) {
        commonSteps.input(txtLastName, lastName);
    }

    public void inputZipCode(String zipCode) {
        commonSteps.input(txtZipCode, zipCode);
    }

    public void clickContinueButton() {
        commonSteps.click(btnContinue);
    }
}