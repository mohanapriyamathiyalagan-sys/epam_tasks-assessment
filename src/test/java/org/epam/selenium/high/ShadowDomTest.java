package org.epam.selenium.high;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ShadowDomTest {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().setSize(new Dimension(1920, 1080));

        driver.get("https://books-pwakit.appspot.com/");

        JavascriptExecutor js = (JavascriptExecutor) driver;

        WebElement input = null;

        for (int i = 0; i < 10; i++) {
            try {
                input = (WebElement) js.executeScript(
                        "return document.querySelector('book-app')" +
                                "?.shadowRoot.querySelector('app-header')" +
                                "?.shadowRoot.querySelector('app-toolbar')" +
                                "?.shadowRoot.querySelector('book-input-decorator')" +
                                "?.shadowRoot.querySelector('input')"
                );

                if (input != null) {
                    break;
                }

                Thread.sleep(1000);

            } catch (Exception e) {
                Thread.sleep(1000);
            }
        }

        if (input == null) {
            throw new RuntimeException("Element not found in Shadow DOM");
        }

        input.sendKeys("Selenium");
        input.sendKeys(Keys.ENTER);

        Thread.sleep(3000);
        driver.quit();

    }

}