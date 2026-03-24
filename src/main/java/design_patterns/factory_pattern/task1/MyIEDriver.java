package org.epam.design_patterns.factory_pattern.task1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class MyIEDriver implements BrowserDriver{
    @Override
    public void start() {
        WebDriver driver = new InternetExplorerDriver();
        driver.get("https://google.com");
        System.out.println("IE started");
    }
}
