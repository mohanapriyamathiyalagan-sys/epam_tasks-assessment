package org.epam.bdd_cucumber.task3.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage {

    WebDriver driver;
    WebDriverWait wait;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    By signupLoginBtn = By.xpath("//a[contains(text(),'Signup / Login')]");
    By email = By.xpath("//input[@data-qa='login-email']");
    By password = By.xpath("//input[@data-qa='login-password']");
    By loginBtn = By.xpath("//button[@data-qa='login-button']");
    By errorMsg = By.xpath("//p[contains(text(),'incorrect')]");

    public void openSite() {
        driver.get("https://automationexercise.com/");
        driver.manage().window().maximize();
    }

    public void goToLoginPage() {
        wait.until(ExpectedConditions.elementToBeClickable(signupLoginBtn)).click();
    }

    public void enterCredentials(String user, String pass) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(email)).sendKeys(user);
        driver.findElement(password).sendKeys(pass);
    }

    public void clickLogin() {
        driver.findElement(loginBtn).click();
    }

    public boolean isErrorDisplayed(){

        try {
            Thread.sleep(3000); // wait for UI (important)

            return driver.getPageSource().contains("incorrect");

        } catch (Exception e){
            return false;
        }
    }
}
