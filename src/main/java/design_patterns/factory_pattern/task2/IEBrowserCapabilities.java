package org.epam.design_patterns.factory_pattern.task2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;

public class IEBrowserCapabilities implements BrowserDriver {

    @Override
    public WebDriver launchBrowser() {
        InternetExplorerOptions options = new InternetExplorerOptions();
        options.ignoreZoomSettings();

        WebDriver driver = new InternetExplorerDriver(options);
        return driver;
    }
}
