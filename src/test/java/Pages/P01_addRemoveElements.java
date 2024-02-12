package Pages;

import StepDefnitions.hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class P01_addRemoveElements {

    public WebElement addbutton(){
        return hooks.driver.findElement(By.xpath("//*[@id=\"content\"]/div/button"));
    }

    public WebElement deletebutton(){
        return hooks.driver.findElement(By.xpath("/html/body/div[2]/div/div/div/button"));
    }
    public List <WebElement>removebuttons(){
        return hooks.driver.findElements(By.xpath("//*[@id=\"elements\"]/button"));
    }
}
