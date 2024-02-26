package StepDefnitions;

import Pages.P07_Geolocation;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.asserts.SoftAssert;

public class D07_Geolocation {

    P07_Geolocation page = new P07_Geolocation();
    SoftAssert soft = new SoftAssert();
    @Given("user go to location page")
    public void usergotolocation(){
        hooks.driver.get("https://the-internet.herokuapp.com/geolocation");
    }

    @When("user click on location button")
    public void userClickOnLocationButton() {
        page.whereAmIBtn().click();
    }

    @Then("Assert the location is right")
    public void assertTheLocationIsRight() throws InterruptedException {
        soft.assertTrue(page.latitude().isDisplayed());
        soft.assertTrue(page.longtude().isDisplayed());
        soft.assertTrue(page.whereAmIBtn().isDisplayed());

        page.seeItOngoogle().click();
        soft.assertTrue(hooks.driver.getCurrentUrl().contains("https://www.google.com/maps"));

        soft.assertAll();
    }
}
