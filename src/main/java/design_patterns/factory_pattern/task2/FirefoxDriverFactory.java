package org.epam.design_patterns.factory_pattern.task2;

public class FirefoxDriverFactory extends DriverFactory{
    @Override
    public BrowserDriver createDriver() {
        return new MyFirefoxBrowser();
    }
}
