package seleniumPkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class WebRadioButton {
    public static void main(String[] args) throws InterruptedException {


        WebDriver driver= new ChromeDriver();

        driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_input_type_radio");

         driver.switchTo().frame("iframeResult");




        List<WebElement> radioButtons=driver.findElements(By.xpath("//input[@type='radio']"));

        for(WebElement ele: radioButtons){
            String vechileType=ele.getAttribute("value");
            if(vechileType.equals("HTML") || vechileType.equals("60")){
                ele.click();
        }
        }
//
//        System.out.println(checkbox.isDisplayed());
//        System.out.println(checkbox.isEnabled());
//        System.out.println(checkbox.getText());

     Thread.sleep(3000);



        driver.close();



    }



}
