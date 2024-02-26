package StepDefnitions;

import Pages.P03_contextmenu;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.interactions.Actions;

public class D03_contextmenu {

 P03_contextmenu page = new P03_contextmenu();
    @Given("user go to context menu page")
    public void usergotocontextmenu(){
        hooks.driver.get("https://the-internet.herokuapp.com/context_menu");
    }

    @And("click Rightclick")
    public void clickRightclick() {
        Actions actions = new Actions(hooks.driver);
        actions.moveToElement(page.image()).contextClick().perform();
    }

    @Then("Alert appear and click enter")
    public void alertAppearAndClickEnter() {
    hooks.driver.switchTo().alert().accept();
    }

}
