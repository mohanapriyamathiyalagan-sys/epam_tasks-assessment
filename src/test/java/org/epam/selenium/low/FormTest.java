package org.epam.selenium.low;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class FormTest {

    public static void main(String[] args) throws Exception {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://demoqa.com/automation-practice-form");

        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("window.scrollBy(0,500)");

        driver.findElement(By.id("firstName")).sendKeys("Mohana");
        driver.findElement(By.id("lastName")).sendKeys("Priya");
        driver.findElement(By.id("userEmail")).sendKeys("test@mail.com");

        driver.findElement(By.xpath("//label[text()='Female']")).click();

        driver.findElement(By.id("userNumber")).sendKeys("9876543210");

        WebElement subject = driver.findElement(By.id("subjectsInput"));
        subject.sendKeys("Maths");
        subject.sendKeys(Keys.ENTER);

        driver.findElement(By.xpath("//label[text()='Sports']")).click();

        driver.findElement(By.id("currentAddress")).sendKeys("Chennai");

        WebElement submit = driver.findElement(By.id("submit"));

        js.executeScript("arguments[0].scrollIntoView(true);", submit);
        Thread.sleep(1000);

        js.executeScript("arguments[0].click();", submit);

        String message = driver.findElement(By.id("example-modal-sizes-title-lg")).getText();

        if (message.contains("Thanks for submitting the form")) {
            System.out.println("Form Submitted Successfully");
        } else {
            System.out.println("Form Submission Failed");
        }

        String name = driver.findElement(By.xpath("//td[text()='Student Name']/following-sibling::td")).getText();
        String email = driver.findElement(By.xpath("//td[text()='Student Email']/following-sibling::td")).getText();
        String gender = driver.findElement(By.xpath("//td[text()='Gender']/following-sibling::td")).getText();

        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Gender: " + gender);

        if (name.contains("Mohana") && email.contains("test@mail.com")) {
            System.out.println("Data Validation Successful");
        }

        driver.quit();
    }
}