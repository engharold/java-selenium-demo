package com.demo.pages;

import com.demo.framework.PageManager;
import com.demo.stepdefinitions.CommonSteps;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage extends PageManager {

    CommonSteps commonSteps = new CommonSteps();
    By cartProductName = By.xpath("//*[@class='cart_list']//*[@class='inventory_item_name']");
    By btnCheckout = By.xpath("//button[@id='checkout']");

    public CartPage(WebDriver driver) {
        super(driver);
    }

    public String getProduct() {
        return commonSteps.getElementText(cartProductName);
    }

    public void clickCheckoutButton(){
        commonSteps.click(btnCheckout);
    }
}