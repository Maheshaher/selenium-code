package seleniumPkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserTitle {
    public static void main(String[] args) {
        WebDriver driver= new ChromeDriver();

        driver.navigate().to("https://www.knowledgeware.in/Automation/");

        String title=driver.getTitle();

        System.out.println(title);


    }
}
