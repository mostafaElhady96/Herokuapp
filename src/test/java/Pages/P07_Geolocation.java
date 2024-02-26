package Pages;

import StepDefnitions.hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P07_Geolocation {

    public WebElement whereAmIBtn(){
        return hooks.driver.findElement(By.cssSelector("#content > div > button"));
    }

    public WebElement latitude(){
        return hooks.driver.findElement(By.cssSelector("#lat-value"));
    }

    public WebElement longtude(){
        return hooks.driver.findElement(By.cssSelector("#long-value"));
    }

    public WebElement seeItOngoogle(){
        return hooks.driver.findElement(By.cssSelector("#map-link > a"));
    }


}
