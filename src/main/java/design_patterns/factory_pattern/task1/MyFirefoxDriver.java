package org.epam.design_patterns.factory_pattern.task1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MyFirefoxDriver implements BrowserDriver{

    @Override
    public void start() {
        WebDriver firefoxDriver = new FirefoxDriver();
        firefoxDriver.get("https://google.com");
        System.out.println("Firefox started");
    }
}
