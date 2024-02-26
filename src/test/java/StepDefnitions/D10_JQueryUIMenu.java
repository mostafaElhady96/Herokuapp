package StepDefnitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class D10_JQueryUIMenu {

Actions actions=new Actions(hooks.driver);
WebDriverWait wait = new WebDriverWait(hooks.driver, Duration.ofSeconds(10));
    @Given("user go to JQueryUI - Menu page")
    public void usergouserJQueryUI(){
        hooks.driver.get("https://the-internet.herokuapp.com/jqueryui/menu#");
    }

    @When("user move to enabled")
    public void userMoveToEnabled() {
        WebElement enabled = hooks.driver.findElement(By.cssSelector("#ui-id-3 > a"));
        actions.moveToElement(enabled).perform();
    }

    @And("user move to downloads")
    public void userMoveToDownloads() {

      WebElement downloads = hooks.driver.findElement(By.cssSelector("#ui-id-4 > a"));
      wait.until(ExpectedConditions.elementToBeClickable(downloads));
      actions.moveToElement(downloads).perform();
    }

    @Then("click on pdf")
    public void clickOnPdf() {
        WebElement pdf = hooks.driver.findElement(By.xpath("//*[@id=\"ui-id-5\"]/a"));
        wait.until(ExpectedConditions.elementToBeClickable(pdf));
        actions.moveToElement(pdf).click().perform();
    }
}
