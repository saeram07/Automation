package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public class MoMediaHw {
    public WebDriver driver;

    String baseURL = "https://momedia.netlify.app";
    String movieName = "Raya and the Last Dragon";

    //Locators for movie details
    By searchInput = By.id("search-input");
    By firstMovieSuggestion = By.xpath("//p[@class='search-item searched-title font-weight-lighter']");
    By movieTitle = By.xpath("//h1[@class='display-4 font-italic p-3 text-center']");
    By rating = By.xpath("(//div[@class='featured__container featured__container--copy'])[2]");
    By actorDetails = By.xpath("(//h5[@class='lead card-title'])[1]");

    //Locators for contact us

    By nameLocator = By.id("validationCustom01");
    By emailLocator = By.id("validationCustom02");
    By messageBoxLocator = By.id("validationCustom03");
    By submitButton = By.xpath("//button[@type='submit']");

/*private void clickElement(){

}*/

    @BeforeClass
    public void initialSetup() {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test(priority = 1)
    public void movieDetails() throws InterruptedException {
        driver.get(baseURL);


        driver.findElement(By.id("search-input")).sendKeys(movieName);
        driver.findElement(By.xpath("//p[@class='search-item searched-title font-weight-lighter']")).click();
        driver.findElement(By.xpath("//h1[@class='display-4 font-italic p-3 text-center']")).getText();
        System.out.println(driver.findElement(By.xpath("//h1[@class='display-4 font-italic p-3 text-center']")).getText());
        driver.findElement(By.xpath("(//div[@class='featured__container featured__container--copy'])[2]")).getText();
        System.out.println(driver.findElement(By.xpath("(//div[@class='featured__container featured__container--copy'])[2]")).getText());
        driver.findElement(By.xpath("(//h5[@class='lead card-title'])[1]")).click();
        driver.findElement(By.xpath("//div[@class='model-actor-info-container']")).getText();
        System.out.println(driver.findElement(By.xpath("//div[@class='model-actor-info-container']")).getText());
    }

    @Test(priority = 2)
    public void contactUs() throws InterruptedException {
        driver.get(baseURL);

        driver.findElement(By.xpath("//a[@class='nav-link' and contains(text(),'Contact Us')]")).click();
        driver.findElement(By.id("validationCustom01")).sendKeys("Saera Mustafa");
        driver.findElement(By.id("validationCustom02")).sendKeys("abc123@gmail.com");
        driver.findElement(By.id("validationCustom03")).sendKeys("Movie link is not working");
        //driver.findElement(By.xpath("//button[@type='submit']")).click();

        Thread.sleep(2000);

    }

    @AfterClass
    public void quitPage() {
        driver.quit();
    }
}

