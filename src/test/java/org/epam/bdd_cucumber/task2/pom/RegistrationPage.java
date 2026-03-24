package org.epam.bdd_cucumber.task2.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegistrationPage {
    WebDriver driver;

    public RegistrationPage(WebDriver driver){
        this.driver = driver;
    }

    By signupLink = By.linkText("Signup / Login");
    By name = By.name("name");
    By email = By.xpath("//input[@data-qa='signup-email']");
    By signupBtn = By.xpath("//button[@data-qa='signup-button']");

    public void openSite(){
        driver.get("https://www.automationexercise.com/");
    }

    public void register(){
        driver.findElement(signupLink).click();
        driver.findElement(name).sendKeys("TestUser");
        driver.findElement(email).sendKeys("test" + System.currentTimeMillis() + "@gmail.com");
        driver.findElement(signupBtn).click();
    }
}
