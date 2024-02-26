package StepDefnitions;

import Pages.P09_javaScriptAlert;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Alert;
import org.testng.Assert;

public class D09_javaScript {

    P09_javaScriptAlert page = new P09_javaScriptAlert();

    @Given("user go to javaScript alert page")
    public void usergotojavascriptalert(){
        hooks.driver.get("https://the-internet.herokuapp.com/javascript_alerts");
    }


    @When("user click on js Alert")
    public void userClickOnJsAlert() {
        page.jsAlert().click();
    }

    @Then("accept alert")
    public void acceptAlert() {
        hooks.driver.switchTo().alert().accept();
    }

    @When("user click on js confirm")
    public void userClickOnJsConfirm() {
        page.jsConfirm().click();
    }

    @Then("confirm it")
    public void confirmIt() {
        hooks.driver.switchTo().alert().accept();
    }

    @When("user click js prompt")
    public void userClickJsPrompt() {
      page.jsprompt().click();
    }

    @And("user send  word like {string}")
    public void userSendWordLike(String arg0) {
        Alert promptAlert =   hooks.driver.switchTo().alert();
        promptAlert.sendKeys(arg0);
        promptAlert.accept();
    }

    @Then("assert the word {string} in result")
    public void assertTheWordInResult(String arg0) {
        System.out.println(page.result().getText());
        Assert.assertTrue(page.result().getText().contains(arg0));
    }
}
