package com.demo.stepdefinitions;

import com.demo.framework.FrameworkManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonSteps extends FrameworkManager {
//    WebDriver driver;
    int defaultTimeOut = 20;
//    public CommonSteps() {
//        driver = super.getDriver();
//    }

    public void input(By locator, String value){
        WebDriverWait wait = new WebDriverWait(getDriver(), defaultTimeOut);
        wait.until(ExpectedConditions.elementToBeClickable(locator));
        WebElement element = getDriver().findElement(locator);

        Actions actions = new Actions(getDriver());
        actions.click(element);
        actions.keyDown(Keys.CONTROL);
        actions.sendKeys("a");
        actions.keyUp(Keys.CONTROL);
        actions.sendKeys(value);
        actions.build().perform();
    }

    public void click(By locator) {
        WebDriverWait wait = new WebDriverWait(getDriver(), defaultTimeOut);
        wait.until(ExpectedConditions.elementToBeClickable(locator));
        WebElement element = getDriver().findElement(locator);

        Actions actions = new Actions(getDriver());
        actions.click(element).build().perform();
    }
//    @When("I click on {string} menu option")
//    public void clickOnMenuOption(String menuOption) {
//        String option = "//b[text()='" + menuOption + "']";
//        page.click(option);
//    }
//
//    @And("click on {string} submenu option")
//    public void clickOnSubmenuOption(String subMenuOption) {
//        String option = "//a[text()='" + subMenuOption + "']";
//        page.click(option);
//    }
}