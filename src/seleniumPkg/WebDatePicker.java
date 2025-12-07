package seleniumPkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WebDatePicker {
    public static void main(String[] args) {


        WebDriver driver= new ChromeDriver();

        driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_input_type_date");




        driver.switchTo().frame("iframeResult");


        WebElement datepikcer= driver.findElement(By.name("birthday"));
        datepikcer.sendKeys("21-01-2001");
//        driver.close();



    }



}
