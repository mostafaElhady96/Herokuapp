package Pages;

import StepDefnitions.hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P03_contextmenu {


    public WebElement image(){
        return hooks.driver.findElement(By.cssSelector("#hot-spot"));
    }
}
