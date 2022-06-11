package stepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.AutoPracticePage;
import utilities.Driver;

public class AutoPracticeStepDef {

    AutoPracticePage autoPracticePage=new AutoPracticePage();
    Faker faker=new Faker();

    @Given("user sign in linkine tiklar")
    public void user_sign_in_linkine_tiklar() {
        autoPracticePage.signinButton.click();

    }
    @Given("user Create and account bolumune email adresi girer")
    public void user_create_and_account_bolumune_email_adresi_girer() {
autoPracticePage.emailTextBox.sendKeys(faker.internet().emailAddress());
    }
    @Given("Create an Account butonuna basar")
    public void create_an_account_butonuna_basar() {
        autoPracticePage.createAccountButton.click();

    }
    @Given("user kisisel bilgilerini ve iletisim bilgilerini girer")
    public void user_kisisel_bilgilerini_ve_iletisim_bilgilerini_girer() {
        Actions actions=new Actions(Driver.getDriver());
        actions.click(autoPracticePage.genderMRbutton)
                .sendKeys(Keys.TAB)
                . sendKeys(faker.name().firstName())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.name().lastName())
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(faker.internet().password())
                .sendKeys(Keys.TAB)
                .sendKeys("10")
                .sendKeys(Keys.TAB)
                .sendKeys("May")
                .sendKeys(Keys.TAB)
                .sendKeys("1999")
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(faker.company().name())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.address().fullAddress())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.address().city())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.address().state())
                .sendKeys(Keys.TAB)
                .sendKeys("12365")
                .sendKeys(Keys.TAB)
                .sendKeys(faker.address().country())
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys("5875472")

                .sendKeys(Keys.TAB)
                .sendKeys("564321")
                .sendKeys(Keys.TAB)
                .sendKeys("asfaosdfo").perform();


    }
    @Given("user Register butonuna basar")
    public void user_register_butonuna_basar() {
autoPracticePage.registerButton.click();
    }
    @Then("hesap olustugunu dogrular")
    public void hesap_olustugunu_dogrular() {
Assert.assertTrue(autoPracticePage.positiveResultText.isDisplayed());
    }

}
