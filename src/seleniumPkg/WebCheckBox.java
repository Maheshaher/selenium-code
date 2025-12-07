package seleniumPkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class WebCheckBox {
    public static void main(String[] args) throws InterruptedException {


        WebDriver driver= new ChromeDriver();

        driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_input_type_checkbox");

         driver.switchTo().frame("iframeResult");




        List<WebElement> checkbox=driver.findElements(By.xpath("//input[@type='checkbox']"));

        for(WebElement ele: checkbox){
            String vechileType=ele.getAttribute("value");
            if(vechileType.equals("Car") || vechileType.equals("Bike")){
                ele.click();
        }
        }
//
//        System.out.println(checkbox.isDisplayed());
//        System.out.println(checkbox.isEnabled());
//        System.out.println(checkbox.getText());

     Thread.sleep(3000);



        for(WebElement ele: checkbox){
            String vechileType=ele.getAttribute("value");
            if(vechileType.equals("Car") || vechileType.equals("Boat")){
                if(ele.isSelected()){

                }
                 else {
                     ele.click();
                }
            }
            else{
                ele.click();
            }
        }





//        driver.close();



    }



}
