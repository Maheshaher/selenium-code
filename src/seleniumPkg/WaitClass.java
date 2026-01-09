package seleniumPkg;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;

public class WaitClass {

    public static void main(String[] args) {
        WebDriver driver= new ChromeDriver();

        driver.get("https://www.knowledgeware.in/final.html");

        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10));

        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));

//        driver.findElement(By.cssSelector("input[name='name']")).sendKeys("mahesh aher");
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("input[name='name']"))).sendKeys("mahesh");

        Wait<WebDriver> wait1=new FluentWait<>(driver).withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofMillis(2))
                .ignoring(NoSuchElementException.class);
        wait1.until(ExpectedConditions.elementToBeClickable(By.name("name"))).sendKeys("mahesjojf");
    }
}
