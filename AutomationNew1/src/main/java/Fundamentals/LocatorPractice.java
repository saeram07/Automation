package Fundamentals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorPractice {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.google.com");

     driver.findElement(By.className("gb_g")).click();

  /*    driver.findElement(By.name("q")).sendKeys("Selenium Interview Questions");
        driver.findElement(By.id("gbqfbb")).click();*/

        /*driver.findElement(By.cssSelector("input.gLFyf")).sendKeys("Selenium Interview Questions");
        Thread.sleep(2000);*/

        //driver.findElement(By.xpath("/html/body/div[1]/div[1]/a[2]")).click();

        //driver.findElement(By.linkText("Privacy")).click();

       // driver.findElement(By.partialLinkText("How")).click();

        driver.quit();


    }
}
