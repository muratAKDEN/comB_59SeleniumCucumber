package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AutoPracticePage {
    public AutoPracticePage() {
        PageFactory.initElements(Driver.getDriver(),this);

    }

   @FindBy(xpath = " //a[@class='login']")
    public WebElement signinButton;

    @FindBy(xpath = "//input[@id='email_create']")
    public WebElement emailTextBox;

    @FindBy(xpath = "//button[@id='SubmitCreate']")
    public WebElement createAccountButton;

    @FindBy(id = "submitAccount")
    public WebElement registerButton;

    @FindBy(xpath = "//input[@id='id_gender1']")
    public WebElement genderMRbutton;

    @FindBy(xpath = "//*[text()='Welcome to your account. Here you can manage all of your personal information and orders.']")
    public WebElement positiveResultText;

}
