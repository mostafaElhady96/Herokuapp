package StepDefnitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;
import java.util.Random;

public class D11_Hovers {

    Actions actions = new Actions(hooks.driver);


    @Given("user go to hover page")
    public void hoverpage(){
    hooks.driver.get("https://the-internet.herokuapp.com/hovers");
    }

    @When("user hover first element")
    public void userHoverFirstElement() throws InterruptedException {
        WebElement firstElement =hooks.driver.findElement(By.cssSelector("#content > div > div:nth-child(3) > img"));
        actions.moveToElement(firstElement).perform();
    }

    @When("user hover second element")
    public void userHoverSecondElement() {
        WebElement secondElement = hooks.driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/img"));
        actions.moveToElement(secondElement).perform();
    }



    @When("hover third element")
    public void hoverThirdElement() {
        WebElement thirdElement = hooks.driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[3]/img"));
        actions.moveToElement(thirdElement).perform();

    }

    @When("hover random image")
    public void hoverRandomImage() {
        List<WebElement> allImages =hooks.driver.findElements(By.className("figure"));
        Random random = new Random();
        int randomindex = random.nextInt(allImages.size());
        WebElement randomimage = allImages.get(randomindex);
        actions.moveToElement(randomimage).perform();
    }
}
