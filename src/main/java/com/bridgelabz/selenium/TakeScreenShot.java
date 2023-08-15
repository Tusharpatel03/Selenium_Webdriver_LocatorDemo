package com.bridgelabz.selenium;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;

public class TakeScreenShot {
        public static WebDriver driver;
        public static void main(String[] args) throws InterruptedException, IOException {
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://www.instagram.com/");
            Thread.sleep(300);


            TakesScreenshot src = (TakesScreenshot) driver;
            File srcShot = src.getScreenshotAs(OutputType.FILE);
            File destShot = new File("C:\\Users\\INTEL\\AutomationtestingRBP008\\LocatorsDemo\\src\\main\\resources"+ System.currentTimeMillis()+".png");
            FileHandler.copy(srcShot,destShot);


            WebElement phoneNoField = driver.findElement(By.name("username"));
            File srcShot1 = phoneNoField.getScreenshotAs(OutputType.FILE);
            File destShot1 = new File("C:\\Users\\INTEL\\AutomationtestingRBP008\\LocatorsDemo\\src\\main\\resources"+ System.currentTimeMillis()+".png");
            FileHandler.copy(srcShot1,destShot1);
            driver.close();
        }
    }
