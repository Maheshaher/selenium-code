package seleniumPkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FindWebElementsVsFindWebElements {
    public static void main(String[] args) {
        WebDriver driver =new ChromeDriver();

//        driver.get(" https://www.knowledgeware.in/final.html");

//        driver.navigate().to("https://www.knowledgeware.in/final.html");

        WebDriver.Navigation nav=driver.navigate();
        nav.to("https://www.knowledgeware.in/final.html");

        WebElement usernameelement=driver.findElement(By.xpath("//input[@type='text']"));

//        usernameelement.sendKeys("mahesh aher");

        System.out.println("element present :  " + usernameelement);

      List<WebElement> elemts =driver.findElements(By.xpath("//input[@type='text']"));

        System.out.println("elemts present" + elemts);

//      String arry[]={"mahesh Aher" ,"mahesh546","mahesh546"};
//
//      int i=0;
      for(WebElement ele : elemts){
          System.out.println(ele);
//          i++;
      }

/* findelement returns the single
    Throws NoSuchElementException if not found.


*  findelements returns the list of elements.
    Returns an empty list if none found

*
*
* */


    }
}
