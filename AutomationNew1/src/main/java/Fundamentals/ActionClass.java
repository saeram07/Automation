package Fundamentals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.By;


public class ActionClass {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/chromedriver");
        WebDriver driver = new ChromeDriver();
        Actions builder = new Actions(driver);


        driver.manage().window().maximize();

        driver.get("https://www.google.com");

        WebElement gmailButton = driver.findElement(By.className("gb_g"));
        builder.contextClick(gmailButton).build().perform();

        Thread.sleep(3000);


        driver.quit();
    }
}

