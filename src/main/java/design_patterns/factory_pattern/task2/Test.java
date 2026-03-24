package org.epam.design_patterns.factory_pattern.task2;

import org.openqa.selenium.WebDriver;

public class Test {
    public static void main(String[] args) {
        DriverFactory factory = new ChromeDriverFactoryWithCapabilities();

        BrowserDriver browser = factory.createDriver();

        WebDriver driver = browser.launchBrowser();

    }
}
