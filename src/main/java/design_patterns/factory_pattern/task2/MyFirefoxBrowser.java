package org.epam.design_patterns.factory_pattern.task2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MyFirefoxBrowser implements BrowserDriver{
    @Override
    public WebDriver launchBrowser() {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://google.com");
        return driver;    }
}
