package com.bridgelabz.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class WindowHandling {

        public static WebDriver driver;
        public static void main(String[] args) throws InterruptedException {
            driver = new ChromeDriver();
            driver.manage().window().maximize();


            driver.get("https://demoqa.com/browser-windows");
            driver.findElement(By.id("tabButton")).click();
            Thread.sleep(1000);
            driver.findElement(By.id("windowButton")).click();


            String parentWindowAddress = driver.getWindowHandle();
            System.out.println("Parent Window Address is : "+parentWindowAddress);


            Set<String> allWindow = driver.getWindowHandles();//parent + no. of child that opened by parent
            System.out.println("No os windows Opened currently : "+allWindow.size());


            Iterator<String> window = allWindow.iterator();
            while(window.hasNext()){
                String childWindow = window.next();
                if (!parentWindowAddress.equalsIgnoreCase(childWindow)){
                    driver.switchTo().window(childWindow);
                    String fetchedText = driver.findElement(By.id("sampleHeading")).getText();
                    System.out.println("fetched text : "+fetchedText);
                }
            }
            driver.switchTo().window(parentWindowAddress);
            //driver.close();
        }
    }