package seleniumPkg;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class JavaScriptExecutorImplementation {
    /* what is the use of javascript executor ->  whenever the webdriver is unable to identify or handle
     some of the ui elements or  actions like scrolling,hidden elements ,dynamic calling ,
      so there we need javascript executor

    * */


    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();

        driver.get("https://www.knowledgeware.in/Automation/");

        List<WebElement> elements=driver.findElements(By.tagName("input"));



        for(WebElement element :elements){
            System.out.println(element);
        }


        JavascriptExecutor js=(JavascriptExecutor) driver;


        js.executeScript("arguments[0].value='mahesh',arguments[1].value='Aher'",elements.get(0),elements.get(1));
//        js.executeScript(" ",elements.get(1));










    }
}
