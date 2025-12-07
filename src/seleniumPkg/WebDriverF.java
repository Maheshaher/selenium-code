package seleniumPkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverF {
    public static void main(String[] args) {

        WebDriver driver; //driver is a variable type of webdriver

        driver = new ChromeDriver();

//        driver.get("https://www.google.com");


        //Another way to open the url

//        driver.navigate().to("https://www.google.com");

          WebDriver.Navigation nav=driver.navigate();

          nav.to("http://www.google.com");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        nav.back();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        nav.forward();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        nav.refresh();





    }
}
