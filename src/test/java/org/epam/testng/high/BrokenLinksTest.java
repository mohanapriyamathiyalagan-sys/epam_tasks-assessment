package org.epam.testng.high;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

@Listeners(CustomListener.class)

public class BrokenLinksTest {
    @Test
    public void validateBrokenLinks() {

        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/broken");

        List<WebElement> links = driver.findElements(By.tagName("a"));

        for (WebElement link : links) {

            String url = link.getAttribute("href");

            if (url == null || url.isEmpty()) {
                continue;
            }

            try {
                HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();
                conn.setRequestMethod("HEAD");
                conn.connect();

                int responseCode = conn.getResponseCode();

                System.out.println(url + " -> " + responseCode);

                Assert.assertTrue(responseCode < 400, "Broken link found: " + url);

            } catch (Exception e) {
                Assert.fail("Exception for URL: " + url);
            }
        }

        driver.quit();
    }
}
