package org.epam.selenium.low;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DropdownTest {

    public static void main(String[] args) throws Exception {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://demoqa.com/select-menu");

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)");

        driver.findElement(By.id("react-select-2-input")).sendKeys("Group 1");
        driver.findElement(By.id("react-select-2-input")).sendKeys(Keys.ENTER);

        Select oldSelect = new Select(driver.findElement(By.id("oldSelectMenu")));
        oldSelect.selectByVisibleText("Purple");

        String selected = oldSelect.getFirstSelectedOption().getText();
        System.out.println("Selected: " + selected);

        Select multi = new Select(driver.findElement(By.id("cars")));
        multi.selectByVisibleText("Volvo");
        multi.selectByVisibleText("Audi");

        List<WebElement> selectedOptions = multi.getAllSelectedOptions();
        for (WebElement ele : selectedOptions) {
            System.out.println("Multi Selected: " + ele.getText());
        }

        driver.quit();
    }
}