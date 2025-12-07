package seleniumPkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserOpenWindow {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.opera.com/");

        //Now i want to open the google in new window
        /*We can open multiple browser windows or tabs within the same
        session and switch between them using the
        same driver instance*/

        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get("https://www.google.com/");
//
//        driver.switchTo().newWindow(WindowType.TAB);
//        driver.get("https://www.reddit.com/");
//        driver.switchTo().newWindow(WindowType.WINDOW);
//        driver.get("https://www.yahoo.com/");


        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get("https://www.rediff.com/");

        driver.close();


    }
}
