package Pages;

import StepDefnitions.hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P06_fileUpload {

    public WebElement choosefile(){
        return hooks.driver.findElement(By.cssSelector("#file-upload"));
    }

    public WebElement uploadButton(){
        return hooks.driver.findElement(By.cssSelector("#file-submit"));
    }

    public WebElement uploadedFile(){
        return hooks.driver.findElement(By.cssSelector("#uploaded-files"));
    }

    public WebElement fileuploadedsuccess(){
        return hooks.driver.findElement(By.cssSelector("#content > div > h3"));
    }
}
