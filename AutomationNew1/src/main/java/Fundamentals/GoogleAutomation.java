package Fundamentals;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class GoogleAutomation {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.google.com");
       // driver.navigate().to("https://www.google.com");

        driver.findElement(By.name("q")).sendKeys("Selenium");

        Thread.sleep(3000);

        driver.quit();
    }
}
