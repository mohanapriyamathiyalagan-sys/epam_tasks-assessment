package org.epam.testng.medium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class DependencyTest {
    WebDriver driver;
    WebDriverWait wait;

    @Test
    public void test1_launchAndVerifyTitle() {

        driver = new ChromeDriver();
        driver.get("https://demoqa.com/webtables");

        String title = driver.getTitle();
        System.out.println("Title: " + title);

        Assert.assertTrue(title.toLowerCase().contains("demo"),
                "Title validation failed!");
    }

    @Test(dependsOnMethods = "test1_launchAndVerifyTitle")
    public void test2_addRecord() {

        driver.findElement(By.id("addNewRecordButton")).click();

        driver.findElement(By.id("firstName")).sendKeys("John");
        driver.findElement(By.id("lastName")).sendKeys("Doe");
        driver.findElement(By.id("userEmail")).sendKeys("john@example.com");
        driver.findElement(By.id("age")).sendKeys("30");
        driver.findElement(By.id("salary")).sendKeys("50000");
        driver.findElement(By.id("department")).sendKeys("QA");

        driver.findElement(By.id("submit")).click();
    }

    @Test(dependsOnMethods = "test2_addRecord")
    public void test3_verifyRecord() {

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("rt-table")));

        String tableText = driver.findElement(By.className("rt-table")).getText();

        System.out.println("Table Data: " + tableText);

        Assert.assertTrue(tableText.contains("John"), "Record not found!");
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
