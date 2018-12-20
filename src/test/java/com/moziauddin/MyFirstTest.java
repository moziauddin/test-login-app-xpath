package com.moziauddin;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.junit.Assert;

public class MyFirstTest {
    @Test
    public void startMySite() {
        String url = "http://localhost:3001";
        String userName1 = "admin";
        String passWord1 = "admin";

        // Use Chrome: Uncomment below two lines
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //driver.navigate().to("https://google.com");
        //Assert.assertEquals("Google",driver.getTitle());

        // Use Firefox
        //System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
        //WebDriver driver = new FirefoxDriver();
        driver.navigate().to(url);
        Assert.assertEquals("Login",driver.getTitle());

        driver.findElement(By.xpath("//*[@id=\"img1\"]/form/div/div/div/div[1]/div[2]/input")).sendKeys(userName1);
        driver.findElement(By.xpath("//*[@id=\"img1\"]/form/div/div/div/div[1]/div[4]/input")).sendKeys(passWord1);
        driver.findElement(By.xpath("//*[@id=\"img1\"]/form/div/div/div/div[1]/div[6]/input")).click();

        driver.close();
        driver.quit();
    }
}
