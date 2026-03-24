package org.epam.bdd_cucumber.task2.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage{

    WebDriver driver;
    WebDriverWait wait;

    public LoginPage(WebDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    By loginLink = By.xpath("//a[contains(text(),'Signup / Login')]");
    By email = By.xpath("//input[@data-qa='login-email']");
    By password = By.xpath("//input[@data-qa='login-password']");
    By loginBtn = By.xpath("//button[@data-qa='login-button']");
    By logoutBtn = By.xpath("//a[contains(text(),'Logout')]");

    public void openSite(){
        driver.get("https://www.automationexercise.com/");
        try {
            Thread.sleep(4000);
            if(driver.getTitle().toLowerCase().contains("inmotion")){
                driver.findElement(By.tagName("body")).click();
                driver.navigate().refresh();
            }
        } catch(Exception e){}
    }

    public void goToLogin(){
        wait.until(ExpectedConditions.elementToBeClickable(loginLink)).click();
    }

    public void login(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(email)).sendKeys("test@gmail.com");
        driver.findElement(password).sendKeys("123456");
        driver.findElement(loginBtn).click();
    }

    public void logout(){
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(logoutBtn)).click();
        } catch(Exception e){
            System.out.println(" Logout not visible (user not really logged in)");
        }
    }
}
