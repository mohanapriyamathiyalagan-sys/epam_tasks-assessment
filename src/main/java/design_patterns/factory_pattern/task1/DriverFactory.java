package org.epam.design_patterns.factory_pattern.task1;

public class DriverFactory {

    public static BrowserDriver getDriver(String browser){
        if(browser.equalsIgnoreCase("chrome")){
            return new MyChromeDriver();
        }
        else if(browser.equalsIgnoreCase("firefox")) {
            return new MyFirefoxDriver();
        }
        else if(browser.equalsIgnoreCase("ie")){
            return new MyIEDriver();
        }
        else{
            throw new IllegalArgumentException("Invalid browser");
        }

    }
}
