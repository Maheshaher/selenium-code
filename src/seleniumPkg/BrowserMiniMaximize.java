package seleniumPkg;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserMiniMaximize {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.navigate().to("https://www.knowledgeware.in/Automation/");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.manage().window().minimize();
        Thread.sleep(3000);





        Dimension size = driver.manage().window().getSize();
        System.out.println(size.width);

//        Dimension d=new Dimension(100,199);

        driver.manage().window().setSize(new Dimension(100,100));

        driver.manage().window().setPosition(new Point(300,100));
    }
}
