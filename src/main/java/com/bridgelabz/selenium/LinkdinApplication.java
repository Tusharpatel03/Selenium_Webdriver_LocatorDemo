package com.bridgelabz.selenium;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;

public class LinkdinApplication {
    public static ChromeDriver driver;

    public static void main(String[] args) throws InterruptedException, IOException {
        //get the url page
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.linkedin.com/login");

       //signin linkdin
        driver.findElement(By.id("username")).sendKeys("testing");
        driver.findElement(By.name("session_password")).sendKeys("bridgelabz");
        driver.findElement(By.xpath("//*[@id=\"organic-div\"]/form/div[3]/button")).click();
        Thread.sleep(1000);

        // page down page up actions
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Thread.sleep(500);
        actions.sendKeys(Keys.PAGE_UP).perform();
        Thread.sleep(500);

       //Forgot password linkdin
        WebElement forgotpasslink = driver.findElement(By.linkText("Forgot password?"));
        forgotpasslink.click();
        Thread.sleep(1000);

        driver.findElement(By.cssSelector("#username")).sendKeys("testing@123");
        Thread.sleep(1000);

        WebElement resetPasswd = driver.findElement(By.id("reset-password-submit-button"));
        resetPasswd.click();
        Thread.sleep(1000);

        driver.findElement(By.partialLinkText("Back")).click();
        Thread.sleep(1000);

     //home page of linkdin & click on join now
        driver.findElement(By.partialLinkText("Join now")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("email-or-phone")).sendKeys("Tushar12");
        driver.findElement(By.name("password")).sendKeys("bridgelabz");

        WebElement agreeAndJoin = driver.findElement(By.id("join-form-submit"));
        agreeAndJoin.click();
        Thread.sleep(1000);
       }
       }