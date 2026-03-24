package org.epam.selenium.medium;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;
import java.io.FileWriter;
import java.util.HashMap;

public class FileUploadDownloadTest extends BaseSetup {

    public static void main(String[] args) throws Exception {

        String downloadPath = System.getProperty("user.dir");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");

        HashMap<String, Object> prefs = new HashMap<>();
        prefs.put("download.default_directory", downloadPath);
        options.setExperimentalOption("prefs", prefs);

        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();

        driver.get("https://demoqa.com/upload-download");

        String filePath = downloadPath + "/sample.txt";

        File file = new File(filePath);

        if (!file.exists()) {
            FileWriter writer = new FileWriter(file);
            writer.write("Hello Selenium");
            writer.close();
            System.out.println("File created automatically");
        } else {
            System.out.println("File already exists");
        }

        WebElement upload = driver.findElement(By.id("uploadFile"));
        upload.sendKeys(filePath);

        String uploadedText = driver.findElement(By.id("uploadedFilePath")).getText();
        System.out.println("Uploaded File: " + uploadedText);

        if (uploadedText.contains("sample.txt")) {
            System.out.println("Upload Successful");
        } else {
            System.out.println("Upload Failed");
        }

        driver.findElement(By.id("downloadButton")).click();

        Thread.sleep(4000);

        File downloadedFile = new File(downloadPath + "/sampleFile.jpeg");

        if (downloadedFile.exists()) {
            System.out.println("Download Successful");
        } else {
            System.out.println("Download Failed");
        }

        driver.quit();
    }
}