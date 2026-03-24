package org.epam.selenium.medium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AlertsTest extends BaseSetup{

    public static void main(String[] args) throws Exception {
        AlertsTest obj = new AlertsTest();
        obj.testAlerts();
    }
    public void testAlerts() throws Exception {
        setup();

        driver.get("https://demoqa.com/alerts");

        JavascriptExecutor js = (JavascriptExecutor) driver;

        driver.findElement(By.id("alertButton")).click();

        Alert alert1 = driver.switchTo().alert();
        System.out.println("Alert1: " + alert1.getText());
        alert1.accept();

        driver.findElement(By.id("timerAlertButton")).click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        Alert alert2 = wait.until(ExpectedConditions.alertIsPresent());

        System.out.println("Alert2: " + alert2.getText());
        alert2.accept();

        driver.findElement(By.id("confirmButton")).click();

        Alert alert3 = driver.switchTo().alert();
        System.out.println("Alert3: " + alert3.getText());

        alert3.dismiss();

        String result = driver.findElement(By.id("confirmResult")).getText();
        System.out.println("Result: " + result);

        tearDown();
    }
}
