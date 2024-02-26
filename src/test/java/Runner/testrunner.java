package Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;



@RunWith(Cucumber.class)
@CucumberOptions(

        features = "src/main/resources/Features/Features",
        glue = "StepDefnitions",
        tags = "@Regression"
)
public class testrunner {
}