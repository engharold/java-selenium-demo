package com.demo.pages;

import com.demo.framework.PageManager;
import com.demo.stepdefinitions.CommonSteps;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductsListPage extends PageManager {

    CommonSteps commonSteps = new CommonSteps();
    By btnAddToCart = By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']");
    By lnkViewCart = By.xpath("//a[@class='shopping_cart_link']");

    public ProductsListPage(WebDriver driver) {
        super(driver);
    }

    public void addProductToCart(String product) {
        btnAddToCart = By.xpath("//div[@class='inventory_item_name'][text()='" + product
                + "']/../../following-sibling::div[@class='pricebar']/button[text()='Add to cart']");
        commonSteps.click(btnAddToCart);
    }

    public void viewCart() {
        commonSteps.click(lnkViewCart);
    }
}