package com.bridgelabz.selenium;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.time.Duration;

public class InstagramApplication {
    public static WebDriver driver;

    public static void main(String[] args) throws InterruptedException, AWTException {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.instagram.com");
        Thread.sleep(1000);

        //Username// valid credentials//
        driver.findElement(By.name("username")).sendKeys("testingtestdata");
        Thread.sleep(1000);
        //password//
        driver.findElement(By.name("password")).sendKeys("testingtestdatablz");
        Thread.sleep(1000);

        //login//
        driver.findElement(By.xpath("//*[@type=\"submit\"]")).click();
        Thread.sleep(1000);

        //choosing option Not Now For Notifications
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"mount_0_0_ke\"]/div/div/div[2]/div/div/div/div[1]/div[1]/div[2]/section/main/div/div/div/div/div")));
        driver.findElement(By.xpath("//*[@id=\"mount_0_0_ke\"]/div/div/div[2]/div/div/div/div[1]/div[1]/div[2]/section/main/div/div/div/div/div")).click();

        //More
        driver.findElement(By.xpath("//span[text()='More']")).click();
        Thread.sleep(1000);

        //Log Out
        driver.findElement(By.xpath("//html/body[1]")).click();
        Thread.sleep(1000);


    }
}