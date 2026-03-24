package org.epam.selenium.high;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class InfiniteScrollTest {

    public static void main(String[] args) throws Exception {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://the-internet.herokuapp.com/infinite_scroll");

        JavascriptExecutor js = (JavascriptExecutor) driver;
        Actions actions = new Actions(driver);

        for (int i = 0; i < 5; i++) {

            js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
            Thread.sleep(2000);

            actions.sendKeys(Keys.PAGE_DOWN).perform();
        }

        List<WebElement> paras = driver.findElements(By.className("jscroll-added"));

        System.out.println("Latest 10 paragraphs:");

        int count = Math.min(10, paras.size());

        for (int i = paras.size() - count; i < paras.size(); i++) {
            System.out.println(paras.get(i).getText());
        }

        driver.quit();
    }
}