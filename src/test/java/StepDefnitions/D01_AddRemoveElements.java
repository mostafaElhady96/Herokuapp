package StepDefnitions;

import Pages.P01_addRemoveElements;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class D01_AddRemoveElements {
    P01_addRemoveElements page =new P01_addRemoveElements();
    WebDriverWait wait = new WebDriverWait(hooks.driver, Duration.ofSeconds(10));

    @Given("user go to add and remove element page")
    public void user_go_AddElementPage(){
    hooks.driver.get("https://the-internet.herokuapp.com/add_remove_elements/");

    }

    @When("user click on add element")
    public void userClickOnAddElement() {
        page.addbutton().click();
    }

    @Then("new element should be added")
    public void newElementShouldBeAdded() {
        Assert.assertTrue(page.deletebutton().isDisplayed());
    }

    @When("user click on remove element")
    public void userClickOnRemoveElement() {
        wait.until(ExpectedConditions.elementToBeClickable(page.deletebutton()));
        page.deletebutton().click();
    }

    @Then("new element should be removed")
    public void newElementShouldBeRemoved() {

       try {
           page.deletebutton().click();
       }
       catch (NoSuchElementException e){
           System.out.println("no such element to remove ");

       }

    }







    @When("user click on add element for {string} times")
    public void userClickOnAddElementForTimes(String count) {
        int clickcount = Integer.parseInt(count);
        for (int i=0; i<clickcount ; i++){
        wait.until(ExpectedConditions.elementToBeClickable(page.addbutton()));
        page.addbutton().click();
        }
    }

    @Then("{string} new element should be added")
    public void newElementShouldBeAdded(String count) {
        int clickcount = Integer.parseInt(count);
       Assert.assertEquals(page.removebuttons().size(),clickcount);
    }

    @When("user click on remove element {string} times")
    public void userClickOnRemoveElementTimes(String count) {
        int clickcount = Integer.parseInt(count);

        for (int i=0 ; i<clickcount; i++){
            wait.until(ExpectedConditions.elementToBeClickable(page.deletebutton()));
            page.deletebutton().click();
        }

    }

    @Then("new elements should be removed")
    public void newElementsShouldBeRemoved() {
        Assert.assertTrue(page.removebuttons().isEmpty());
    }



}
