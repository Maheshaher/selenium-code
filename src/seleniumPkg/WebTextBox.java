package seleniumPkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTextBox {
    public static void main(String[] args) {


        WebDriver driver= new ChromeDriver();

        driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_input_disabled");

        driver.switchTo().frame("iframeResult");


        WebElement firstName=driver.findElement(By.name("fname"));
        WebElement LastName=driver.findElement(By.name("lname"));

        System.out.println(firstName.isEnabled());
        System.out.println(LastName.isEnabled());

        System.out.println(firstName.isDisplayed() + " first cheking is Displayed");
        System.out.println(LastName.isDisplayed() + " last cheking is Displayed");





        driver.close();



    }



}
