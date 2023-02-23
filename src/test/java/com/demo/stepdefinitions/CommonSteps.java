package com.demo.stepdefinitions;

import com.demo.framework.FrameworkManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonSteps extends FrameworkManager {
    int defaultTimeOut = 20;

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

    public String getElementText(By locator) {
        WebDriverWait wait = new WebDriverWait(getDriver(), defaultTimeOut);
        wait.until(ExpectedConditions.elementToBeClickable(locator));
        WebElement element = getDriver().findElement(locator);

        return element.getText();
    }
}