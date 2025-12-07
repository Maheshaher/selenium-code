package seleniumPkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementGetText {
    public static void main(String[] args) {


        WebDriver driver= new ChromeDriver();

        driver.get("https://www.knowledgeware.in/final.html");


        WebElement ele=driver.findElement(By.linkText("LOGIN"));

        System.out.println(ele.getText());

        driver.close();



    }



}
