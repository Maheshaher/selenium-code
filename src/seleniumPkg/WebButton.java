package seleniumPkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebButton {
    public static void main(String[] args) {


        WebDriver driver= new ChromeDriver();

        driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_button_test");

        driver.switchTo().frame("iframeResult");




        WebElement button=driver.findElement(By.tagName("button"));

        System.out.println(button.isDisplayed());
        System.out.println(button.isEnabled());
        System.out.println(button.getText());
        System.out.println(button.getAttribute("onclick"));

        button.click();







        driver.close();



    }



}
