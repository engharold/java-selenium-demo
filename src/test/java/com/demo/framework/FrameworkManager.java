package com.demo.framework;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class FrameworkManager {
    static WebDriver driver;
    public JavascriptExecutor jsExecutor;
    PageManager pageManager;

//    public FrameworkManager() {
//        setup();
//    }

    public void setup() {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.manage().timeouts().setScriptTimeout(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        jsExecutor = (JavascriptExecutor) driver;
        pageManager = new PageManager(driver);
        driver.get("https://www.saucedemo.com");
    }

    public void tearDown() {
        driver.close();
        driver.quit();
    }

    public PageManager getPageManager() {
        return pageManager;
    }

    public WebDriver getDriver() {
        return driver;
    }
}