package seleniumPkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.Set;

public class BrowserWindowSwitch {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.opera.com/");


        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get("https://www.google.com/");
        String gHandle=driver.getWindowHandle();
        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get("https://www.rediff.com/");

//        if we want to swtich window one by one

        Set<String> windowHandlerdriver=driver.getWindowHandles();

        for(String handle :windowHandlerdriver ){
//            System.out.println(handle);

            if(handle.equals(gHandle)){
                driver.switchTo().window(handle);
            }

        }
    }
}
