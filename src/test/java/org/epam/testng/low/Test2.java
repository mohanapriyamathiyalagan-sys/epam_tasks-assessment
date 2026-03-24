package org.epam.testng.low;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test2 {

    @Test
    public void getSubSubItem2() throws Exception {

        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/menu#");

        WebElement main2 = driver.findElement(By.xpath("//a[text()='Main Item 2']"));
        new org.openqa.selenium.interactions.Actions(driver).moveToElement(main2).perform();

        WebElement subList = driver.findElement(By.xpath("//a[text()='SUB SUB LIST »']"));
        new org.openqa.selenium.interactions.Actions(driver).moveToElement(subList).perform();

        String text = driver.findElement(By.xpath("//a[text()='Sub Sub Item 2']")).getText();

        System.out.println("Thread ID: " + Thread.currentThread().getId());
        System.out.println("Text: " + text);

        driver.quit();
    }
}
