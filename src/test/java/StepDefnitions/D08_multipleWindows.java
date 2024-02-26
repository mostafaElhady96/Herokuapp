package StepDefnitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;

import java.util.List;
import java.util.Set;

public class D08_multipleWindows {


    @Given("user go to multiple windows page")
    public void usergotomultiple(){
        hooks.driver.get("https://the-internet.herokuapp.com/windows");

    }

    @And("user click on link which open new window")
    public void userClickOnLinkWhichOpenNewWindow() {
        hooks.driver.findElement(By.cssSelector("#content > div > a")).click();

    }

    @Then("user retrun to the original window")
    public void userRetrunToTheOriginalWindow() throws InterruptedException {
        String originaltab=hooks.driver.getWindowHandle();
        Set <String> allwindows = hooks.driver.getWindowHandles();

        System.out.println("allWindows"+allwindows);
        System.out.println("originalTab"+originaltab);

        for (String window:allwindows){
            if (!window.equals(originaltab)){
                hooks.driver.switchTo().window(window);
                hooks.driver.close();
            }
        }
    }
}
