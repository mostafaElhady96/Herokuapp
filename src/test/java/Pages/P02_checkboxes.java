package Pages;

import StepDefnitions.hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P02_checkboxes {

    public WebElement boxone(){
        return hooks.driver.findElement(By.cssSelector("#checkboxes > input[type=checkbox]:nth-child(1)"));
    }


    public WebElement boxtwo(){
        return hooks.driver.findElement(By.xpath("//*[@id=\"checkboxes\"]/input[2]"));
    }
}
