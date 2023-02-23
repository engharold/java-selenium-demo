package com.demo.stepdefinitions;

import com.demo.framework.FrameworkManager;
import com.demo.pages.*;
import io.cucumber.java.After;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertTrue;

public class ProductCheckoutSteps extends FrameworkManager{

    ProductsListPage productsListPage;
    CartPage cartPage;
    CheckoutYourInformationPage checkoutYourInformationPage;
    CheckoutOverviewPage checkoutOverviewPage;
    CheckoutCompletePage checkoutCompletePage;

    public ProductCheckoutSteps() {
        productsListPage = getPageManager().getProductsListPage();
        cartPage = getPageManager().getCartPage();
        checkoutYourInformationPage = getPageManager().getCheckoutYourInformationPage();
        checkoutOverviewPage = getPageManager().getCheckoutOverviewPage();
        checkoutCompletePage = getPageManager().getCheckoutCompletePage();
    }

    @When("^I add the product (.*) to the cart$")
    public void IAddTheProductToTheCart(String product) {
        productsListPage.addProductToCart(product);
    }

    @When("^I validate that the product (.*) was added successfully$")
    public void ValidateThatTheProductWasAddedSuccessfully(String product) {
        productsListPage.viewCart();
        String cartProductName = cartPage.getProduct();
        assertTrue(cartProductName.equalsIgnoreCase(product));
    }

    @When("I click checkout button")
    public void ClickCheckoutButton() {
        cartPage.clickCheckoutButton();
    }

    @When("^I fill the (.*) (.*) (.*) at Checkout Your Information page")
    public void FillTheFieldsAtCheckoutYourInformationPage(String firstName, String lastName, String zipCode) {
        checkoutYourInformationPage.inputFirstName(firstName);
        checkoutYourInformationPage.inputLastName(lastName);
        checkoutYourInformationPage.inputZipCode(zipCode);
    }
    @When("I click continue button")
    public void ClickContinueButton() {
        checkoutYourInformationPage.clickContinueButton();
    }

    @When("^I validate the product (.*) at Checkout Overview page$")
    public void ValidateTheProductAtCheckoutOverviewPage(String product) {
        String checkoutProductName = checkoutOverviewPage.getProduct();
        assertTrue(checkoutProductName.equalsIgnoreCase(product));
    }

    @When("I finish the order")
    public void FinishTheOrder() {
        checkoutOverviewPage.clickFinishButton();
    }

    @Then("the order is completed successfully")
    public void TheOrderIsCompletedSuccessfully() {
        String resultMessage = checkoutCompletePage.getResultMessage();
        assertTrue(resultMessage.contains("Your order has been dispatched"));
    }

    @After
    public void tearDownTest(){
        tearDown();
    }
}