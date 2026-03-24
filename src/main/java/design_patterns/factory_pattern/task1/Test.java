package org.epam.design_patterns.factory_pattern.task1;

public class Test {
    public static void main(String[] args) {
        BrowserDriver driver = DriverFactory.getDriver("chrome");
        driver.start();
    }
}
