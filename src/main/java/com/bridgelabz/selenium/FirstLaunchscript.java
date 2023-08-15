package com.bridgelabz.selenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class FirstLaunchscript {
    public static void main(String args[]){
   ChromeDriver chromeDriver=new ChromeDriver();
   chromeDriver.manage().window().maximize();
   chromeDriver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");


    }
}
