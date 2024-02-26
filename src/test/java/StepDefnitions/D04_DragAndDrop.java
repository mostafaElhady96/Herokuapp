package StepDefnitions;

import Pages.P04_DragAndDrop;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.interactions.Actions;

public class D04_DragAndDrop {

P04_DragAndDrop page = new P04_DragAndDrop();

    @Given("user go to drag and drop page")
    public void usergotoDragandDrop(){
        hooks.driver.get("https://the-internet.herokuapp.com/drag_and_drop");
    }


    @When("user drag column a to position of b")
    public void userDragColumnAToPositionOfB() throws InterruptedException {
        Actions actions= new Actions(hooks.driver);
        actions.dragAndDrop(page.columnA(),page.columnB()).perform();
        Thread.sleep(2000);

    }


}
