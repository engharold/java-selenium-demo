package com.demo.framework;

import com.demo.pages.*;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class PageManager {
    public WebDriver driver;
    private LoginPage loginPage;
    private ProductsListPage productsListPage;
    private CartPage cartPage;
    private CheckoutYourInformationPage checkoutYourInformationPage;
    private CheckoutOverviewPage checkoutOverviewPage;
    private CheckoutCompletePage checkoutCompletePage;

    JavascriptExecutor jsExecutor;

    public PageManager(WebDriver webDriver) {
        driver = webDriver;
    }

    public LoginPage getLoginPage(){
        return (loginPage == null) ? loginPage = new LoginPage(driver) : loginPage;
    }

    public ProductsListPage getProductsListPage(){
        return (productsListPage == null) ? productsListPage = new ProductsListPage(driver) : productsListPage;
    }

    public CartPage getCartPage(){
        return (cartPage == null) ? cartPage = new CartPage(driver) : cartPage;
    }

    public CheckoutYourInformationPage getCheckoutYourInformationPage(){
        return (checkoutYourInformationPage == null) ? checkoutYourInformationPage = new CheckoutYourInformationPage(driver) : checkoutYourInformationPage;
    }
    public CheckoutOverviewPage getCheckoutOverviewPage(){
        return (checkoutOverviewPage == null) ? checkoutOverviewPage = new CheckoutOverviewPage(driver) : checkoutOverviewPage;
    }

    public CheckoutCompletePage getCheckoutCompletePage(){
        return (checkoutCompletePage == null) ? checkoutCompletePage = new CheckoutCompletePage(driver) : checkoutCompletePage;
    }



}