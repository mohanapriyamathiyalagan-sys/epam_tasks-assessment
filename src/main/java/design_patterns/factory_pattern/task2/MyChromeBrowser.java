package org.epam.design_patterns.factory_pattern.task2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyChromeBrowser implements BrowserDriver{
    @Override
    public WebDriver launchBrowser() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");
        return driver;
    }
}
