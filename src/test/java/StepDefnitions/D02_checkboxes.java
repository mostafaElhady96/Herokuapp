package StepDefnitions;

import Pages.P02_checkboxes;
import io.cucumber.java.bs.A;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class D02_checkboxes {
P02_checkboxes page = new P02_checkboxes();

    @Given("user go to check box page")
    public void usergoToCheckbox(){
        hooks.driver.get("https://the-internet.herokuapp.com/checkboxes");
    }

    @When("user check box one")
    public void userCheckBoxOne() {
    page.boxone().click();
    }

    @And("user uncheckbox two")
    public void userUncheckboxTwo() throws InterruptedException {
        page.boxtwo().click();

    }

    @Then("box one checked")
    public void boxOneChecked() {
        Assert.assertTrue(page.boxone().isSelected());
    }

    @Then("box two unchecked")
    public void boxTwoUnchecked() {
        Assert.assertFalse(page.boxtwo().isSelected());
    }
}
