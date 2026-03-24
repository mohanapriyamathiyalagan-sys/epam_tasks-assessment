package org.epam.design_patterns.factory_pattern.task1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyChromeDriver implements BrowserDriver{

    @Override
    public void start() {
        WebDriver chromeDriver = new ChromeDriver();
        chromeDriver.get("https://google.com");
        System.out.println("Chrome started");// start in loggers

    }
}
