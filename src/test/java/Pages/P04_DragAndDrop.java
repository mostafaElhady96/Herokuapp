package Pages;

import StepDefnitions.hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P04_DragAndDrop {


    public WebElement columnA(){
        return hooks.driver.findElement(By.cssSelector("#column-a"));
    }

    public WebElement columnB(){
        return hooks.driver.findElement(By.cssSelector("#column-b"));
    }
}
