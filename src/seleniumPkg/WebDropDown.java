package seleniumPkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WebDropDown {
    public static void main(String[] args) {


        WebDriver driver= new ChromeDriver();

        driver.get("https://www.knowledgeware.in/reg.html");


        WebElement Birthday_date= driver.findElement(By.name("Birthday_day"));

        Select select=new Select(Birthday_date);
//        select.selectByValue("3");

        select.selectByVisibleText("21");

        System.out.println(select.isMultiple());
        ;
        WebElement Birthday_Month= driver.findElement(By.name("Birthday_Month"));
        Select drop=new Select(Birthday_Month);
        drop.selectByIndex(3);


        WebElement Birthday_Year= driver.findElement(By.name("Birthday_Year"));
        Select dropyear=new Select(Birthday_Year);
        dropyear.selectByValue("2001");









//        driver.close();



    }



}
