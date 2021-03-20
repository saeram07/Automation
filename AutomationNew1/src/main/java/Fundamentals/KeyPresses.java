package Fundamentals;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyPresses {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("http://the-internet.herokuapp.com/key_presses");

        WebElement textbox = driver.findElement(By.id("target"));
      textbox.sendKeys(Keys.ENTER);
        Thread.sleep(2000);

        textbox.click();
      textbox.sendKeys(Keys.ESCAPE);
        Thread.sleep(2000);

        textbox.click();
        textbox.sendKeys(Keys.DELETE);
        Thread.sleep(2000);

        textbox.click();
        textbox.sendKeys(Keys.ARROW_DOWN);
        Thread.sleep(2000);


        driver.quit();
    }
}
