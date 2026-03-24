package org.epam.design_patterns.factory_pattern.task2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class FirefoxBrowserCapabilities implements BrowserDriver{
    @Override
    public WebDriver launchBrowser() {

        FirefoxOptions options = new FirefoxOptions();
        options.addArguments("--headless");

        WebDriver driver = new FirefoxDriver();
        return driver;
    }
}
