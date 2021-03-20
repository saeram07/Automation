package Fundamentals;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {
    public static void main(String args[]) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://demoqa.com/alerts");

        driver.findElement(By.id("alertButton")).click();

   //     driver.findElement(By.id("confirmButton")).click();
        Alert alertpopup = driver.switchTo().alert();

        System.out.println(alertpopup.getText());

        Thread.sleep(2000);
        alertpopup.accept();
        
        driver.quit();
    }
}
