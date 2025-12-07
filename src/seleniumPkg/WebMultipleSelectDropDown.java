package seleniumPkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WebMultipleSelectDropDown {
    public static void main(String[] args) throws InterruptedException {


        WebDriver driver= new ChromeDriver();

        driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple");

        driver.switchTo().frame("iframeResult");

        WebElement cars=driver.findElement(By.name("cars"));

        Select car=new Select(cars);

        System.out.println(car.isMultiple());
        System.out.println(car.getOptions());
        car.selectByIndex(1);
        car.selectByVisibleText("Audi");
        car.selectByValue("volvo");
        Thread.sleep(2000);
        System.out.println("Fist Selected option"+car.getFirstSelectedOption());
        System.out.println("All Selected option"+car.getAllSelectedOptions());




        Thread.sleep(3000);

        car.deselectAll();








//        driver.close();



    }



}
