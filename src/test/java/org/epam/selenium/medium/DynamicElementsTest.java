package org.epam.selenium.medium;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;
import java.util.List;

public class DynamicElementsTest extends BaseSetup{

    public static void main(String[] args) throws Exception {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");

        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();

        driver.get("https://www.seleniumeasy.com/test/");

        Thread.sleep(3000);

        List<WebElement> links = driver.findElements(By.tagName("a"));

        System.out.println("Titles and URLs:");

        for (WebElement link : links) {
            String title = link.getText();
            String url = link.getAttribute("href");

            if (title != null && !title.isEmpty() && url != null) {
                System.out.println(title + " -> " + url);
            }
        }

        int count = 0;
        for (WebElement link : links) {
            if (link.getText() != null && !link.getText().isEmpty()) {
                count++;
                if (count == 2) {
                    link.click();
                    System.out.println("Clicked second result ✅");
                    break;
                }
            }
        }

        driver.quit();
    }
}