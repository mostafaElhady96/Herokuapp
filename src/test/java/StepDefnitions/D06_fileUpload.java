package StepDefnitions;

import Pages.P06_fileUpload;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

public class D06_fileUpload {
    
    P06_fileUpload page = new P06_fileUpload();
    WebDriverWait wait = new WebDriverWait(hooks.driver, Duration.ofSeconds(10));

    SoftAssert soft = new SoftAssert();
    @Given("user go to upload file page")
    public void usergotoupload(){
        hooks.driver.get("https://the-internet.herokuapp.com/upload");
    }

    @And("user upload chosen file")
    public void userClickOnChooseFile() throws InterruptedException {

        String filePath = "C:\\Users\\HP\\Downloads\\linkedin pdf\\face.jpg";
        page.choosefile().sendKeys(filePath);

    }

    @And("user click on upload button")
    public void userClickOnUploadButton() {
        page.uploadButton().click();
    }

    @Then("assert on file uploading")
    public void assertOnFileUploading() {
       // wait.until(ExpectedConditions.invisibilityOf(page.uploadButton()));
        String uploadedfilename = page.uploadedFile().getText();
        soft.assertTrue(uploadedfilename.contains("face.jpg"));
        soft.assertTrue(page.fileuploadedsuccess().getText().contains("File Uploaded!"));
        soft.assertAll();
    }
}
