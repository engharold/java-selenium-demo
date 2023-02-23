package com.demo.pages;

import com.demo.framework.PageManager;
import com.demo.stepdefinitions.CommonSteps;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutCompletePage extends PageManager {

    CommonSteps commonSteps = new CommonSteps();
    By resultMessage = By.xpath("//div[@class='complete-text']");

    public CheckoutCompletePage(WebDriver driver) {
        super(driver);
    }

    public String getResultMessage() {
        return commonSteps.getElementText(resultMessage);
    }
}