package com.demo.pages;

import com.demo.framework.PageManager;
import com.demo.stepdefinitions.CommonSteps;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutOverviewPage extends PageManager {

    CommonSteps commonSteps = new CommonSteps();
    By checkoutProductName = By.xpath("//*[@class='cart_list']//*[@class='inventory_item_name']");
    By btnFinish = By.xpath("//button[@id='finish']");

    public CheckoutOverviewPage(WebDriver driver) {
        super(driver);
    }

    public String getProduct() {
        return commonSteps.getElementText(checkoutProductName);
    }

    public void clickFinishButton(){
        commonSteps.click(btnFinish);
    }
}