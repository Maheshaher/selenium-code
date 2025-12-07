package seleniumPkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserCurrentUrl {
    public static void main(String[] args) {
        WebDriver driver= new ChromeDriver();

        driver.get("https://www.opera.com/");


       String URl= driver.getCurrentUrl();
        System.out.println(URl);


        String PageSource= driver.getPageSource();
        System.out.println("pageSource" + PageSource);
    }
}
