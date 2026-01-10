package seleniumPkg;
//import org.apache.commons.io.FileUtils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
//import org.openqa.selenium.devtools.v138.filesystem.model.File;

public class TakeScreennnShot {
    public static void main(String[] args) {
        WebDriver driver =new ChromeDriver();

        driver.get(" https://www.knowledgeware.in/final.html");
        takeScreenShot(driver);





    }


    public static void takeScreenShot(WebDriver driver){

        TakesScreenshot ss=(TakesScreenshot)driver ;
        File sourceOutputFile=ss.getScreenshotAs(OutputType.FILE);
        File Dest=new File("D:/screenshotDemo/img.png");
//        FileUtils.copyFile(sourceOutputFile, Dest);
//        return Dest.getAbsolutePath();
    }



}
