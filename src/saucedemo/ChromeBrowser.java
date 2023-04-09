package saucedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowser {
    public static void main(String[] args) {
        String baseurl = "https://www.saucedemo.com/";
        //launce the chrome browser
        WebDriver driver = new ChromeDriver();
        //open url into browser
        driver.get(baseurl);
        //maximise the browser
        driver.manage().window().maximize();
        //print the title of the page
        System.out.println("page Title : " + driver.getTitle());
        //print current url
        System.out.println("Current URL : " + driver.getCurrentUrl());
        //print the page source
        System.out.println("Page source : " + driver.getPageSource());
        //find the email to email field
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        //find the password to password field
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        //close the browser
        //driver.close();
    }
}
