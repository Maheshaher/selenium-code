package seleniumPkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOperation {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();

        driver.get("https://club.ministryoftesting.com/t/my-collection-of-dummy-sites-practical-testing-for-beginners/76939");

        Thread.sleep(3000);

        WebElement trend =driver.findElement(By.linkText("Trends"));


        System.out.println(trend.getText());

        Actions mouseAction=new Actions(driver);
//        mouseAction.doubleClick(trend);
        mouseAction.moveToElement(trend).perform();
//        if(trend.isEnabled()){
//            mouseAction.click(trend).perform();
//            mouseAction.contextClick(trend).perform();
//        }
//        else {
//            System.out.println("it not clickable");
//        }
    }
}
