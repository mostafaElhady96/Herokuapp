package StepDefnitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class D05_DropDown {


    @Given("user go to dropdown page")
    public void usergotodropdown(){
        hooks.driver.get("https://the-internet.herokuapp.com/dropdown");
    }

    @When("user choose option two")
    public void userChooseOptionTwo() throws InterruptedException {
        WebElement choices = hooks.driver.findElement(By.cssSelector("#dropdown"));
        Select select = new Select(choices);
        select.selectByValue("1");
        System.out.println("option 1 is choosen ");
        Thread.sleep(2000);
        select.selectByVisibleText("Option 2");
        System.out.println("option 2 is choosen");
        Thread.sleep(2000);
    }

    @Then("option two choosen")
    public void optionTwoChoosen() {
        System.out.println("dslkfjls");
    }
}
