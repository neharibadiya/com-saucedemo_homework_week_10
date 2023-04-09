package saucedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultiBrowser {
    static String browser = "Chrome";
    static WebDriver driver;
    static String baseurl = "https://www.saucedemo.com/";

    public static void main(String[] args) {
        if (browser.equalsIgnoreCase("Chrome")){
            driver = new ChromeDriver();
        }else if (browser.equalsIgnoreCase("Edge")){
            driver = new EdgeDriver();
        }else if (browser.equalsIgnoreCase("FireFox")){
            driver = new FirefoxDriver();
        }else{
            System.out.println("Wrong browser name");
        }
        driver.get(baseurl);
        //getb the title of the Page
        System.out.println("Page Title : " + driver.getTitle());
        //print current url
        System.out.println("Current URL : " + driver.getCurrentUrl());
        //print the page source
        System.out.println("Page Source : " + driver.getPageSource());
        //enter email to email field
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        //find the password to password field
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        //close the browser
        //driver.close();
    }
}
