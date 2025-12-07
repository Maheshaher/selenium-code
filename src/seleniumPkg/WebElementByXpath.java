package seleniumPkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementByXpath {
    public static void main(String[] args) {
        WebDriver driver= new ChromeDriver();

        WebDriver.Navigation nav=driver.navigate();

        nav.to("https://www.knowledgeware.in/final.html");


        /*
        Xpath stands for xml path language .
        it is used to navigate and locate the elements from html document.
        it is the most powerful locator especially when there is no unique id or class present in element.
        it allows to write the expression  to find the element based the attributes, text content and hierarchy.

        How many types of xpath:
               There are two type of xpath:
               1.Absolute xpath:
               for eg /html/body/div/div/form/input[1].
               it always starts with the single forward slash "/".
               2.Relative xpath:
               Starts with the middle of full xpath .
               always starts with the double forward slash "//".
               syntax of relative path:
               tagName["//@attributeName='attributeValue']"
               syntax to write in console :
               $x("input[@attributeName='attributeValue']").

        * */

        WebElement username=driver.findElement(By.xpath("//input[@name='name']"));

        username.sendKeys("maheshaher");

        WebElement pass=driver.findElement(By.xpath("/html/body/div/div/form/input[2]"));

       pass.sendKeys("maheshaher@546");


    }
}
