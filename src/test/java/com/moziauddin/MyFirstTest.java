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
        // Use Chrome: Uncomment below two lines
        System.setProperty("webdriver.chrome.driver", "C:\\devel\\testing\\browsers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //driver.navigate().to("https://google.com");
        //Assert.assertEquals("Google",driver.getTitle());

        // Use Firefox
        //System.setProperty("webdriver.gecko.driver", "C:\\devel\\testing\\browsers\\geckodriver.exe");
        //WebDriver driver = new FirefoxDriver();
        driver.navigate().to("http://localhost:3001");
        Assert.assertEquals("Login",driver.getTitle());

        driver.findElement(By.xpath("//*[@id=\"img1\"]/form/div/div/div/div[1]/div[2]/input")).sendKeys("admin");
        driver.findElement(By.xpath("//*[@id=\"img1\"]/form/div/div/div/div[1]/div[4]/input")).sendKeys("admin");
        driver.findElement(By.xpath("//*[@id=\"img1\"]/form/div/div/div/div[1]/div[6]/input")).click();

        driver.close();
        driver.quit();
    }
}
