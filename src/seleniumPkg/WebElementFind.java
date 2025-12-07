package seleniumPkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementFind {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= new ChromeDriver();

        WebDriver.Navigation nav=driver.navigate();

        nav.to("https://www.knowledgeware.in/final.html");
//        Thread.sleep(3000);

        //we will find the single web element by unique locator

        WebElement username=driver.findElement(By.name("name"));
        System.out.println(username);
        username.sendKeys("mahesh");

        //we will find the web element using the name selector

       WebElement pass= driver.findElement(By.name("password"));
       pass.sendKeys("*******");
        System.out.println(pass);


        //we will find the web element using the tag name
        WebElement add= driver.findElement(By.tagName("input"));
        System.out.println(add);
        add.sendKeys("Aher");


        //find the web element using the link text

//        WebElement login=driver.findElement(By.linkText("LOGIN"));
//        login.click();

//        find the web element using the Partial link text
        WebElement login2=driver.findElement(By.partialLinkText("GIN"));
        login2.click();








//        driver.close();



    }
}
