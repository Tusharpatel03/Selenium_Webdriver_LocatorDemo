package com.bridgelabz.selenium;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class Instagram {
        public static void main(String[] args) throws InterruptedException {
            ChromeDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.navigate().to("https://www.instagram.com/");
            Thread.sleep(1000);
            //invalid credentials login
            driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div[1]/div[1]/div/label/input")).sendKeys("kiran");
            driver.findElement(By.xpath("//input[@aria-label='Password']")).sendKeys("kiran@123");
            driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div[3]")).click();
            Thread.sleep(3000);
            driver.findElement(By.linkText("Forgot password?")).click();
            Thread.sleep(3000);
            driver.findElement(By.xpath("//a[normalize-space()='Back to login']")).click();
            Thread.sleep(5000);
            //signup
            driver.findElement(By.linkText("Sign up")).click();
            Thread.sleep(3000);
            driver.findElement(By.xpath("//button[@type='button']")).click();
            driver.navigate().back();
            Thread.sleep(3000);
            driver.findElement(By.xpath("//input[@aria-label='Mobile Number or Email']")).sendKeys("8512558745646");
            driver.findElement(By.xpath("//input[@aria-label='Full Name']")).sendKeys("kumar");
            driver.findElement(By.xpath("//input[@aria-label='Username']")).sendKeys("s@004");
            driver.findElement(By.xpath("//input[@aria-label='Password']")).sendKeys("#@kjdbfja");
            Thread.sleep(3000);
            driver.findElement(By.xpath("//button[normalize-space()='Sign up']")).click();
            Thread.sleep(3000);
            // Providing Valid Credentials
            // Valid Username
            driver.findElement(By.xpath("//input[@name='username']")).sendKeys("testingtestdata");
            Thread.sleep(1000);
            // Valid Password
            driver.findElement(By.xpath("//input[@type='password']")).sendKeys("testingtestdatablz");
            Thread.sleep(1000);
            // Login
            driver.findElement(By.xpath("//div[text()='Log in']")).click();
            Thread.sleep(2000);

            //choosing option Not Now For Notifications
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()=\"Not Now\"]")));
            driver.findElement(By.xpath("//button[text()=\"Not Now\"]")).click();

            //More
            driver.findElement(By.xpath("//span[text()='More']")).click();
            Thread.sleep(1000);

            //Log Out
            driver.findElement(By.xpath("//html/body[1]")).click();
            Thread.sleep(1000);

        }
    }