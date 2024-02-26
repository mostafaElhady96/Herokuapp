package Pages;

import StepDefnitions.hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P09_javaScriptAlert {


    public WebElement jsAlert(){
        return hooks.driver.findElement(By.cssSelector("#content > div > ul > li:nth-child(1) > button"));
    }

    public WebElement jsConfirm(){
        return hooks.driver.findElement(By.cssSelector("#content > div > ul > li:nth-child(2) > button"));
    }


    public WebElement jsprompt(){
        return hooks.driver.findElement(By.cssSelector("#content > div > ul > li:nth-child(3) > button"));
    }


    public WebElement result(){
        return hooks.driver.findElement(By.cssSelector("#result"));
    }
}
