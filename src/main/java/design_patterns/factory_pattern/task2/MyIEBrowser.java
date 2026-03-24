package org.epam.design_patterns.factory_pattern.task2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class MyIEBrowser implements BrowserDriver{
    @Override
    public WebDriver launchBrowser() {
        WebDriver driver = new InternetExplorerDriver();
        driver.get("https://google.com");
        return driver;
    }
}
