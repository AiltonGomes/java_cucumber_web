package elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import page.CommonPage;

public class RegisterElements extends CommonPage {
    @FindBy(xpath = "//a[contains(.,'Signup / Login')]")
    protected WebElement linklogin;
    @FindBy(xpath = "//input[@name='name']")
    public WebElement txtnome;
    @FindBy(xpath = "//input[@data-qa='signup-email']")
    protected WebElement txtemail;
    @FindBy(xpath = "//button[@type='submit'][contains(.,'Signup')]")
    public WebElement btnsignup;
    @FindBy(id = "id_gender1")
    public WebElement radMale;
    @FindBy(id = "id_gender2")
    public WebElement genderFemale;
    @FindBy(id = "password")
    public WebElement txtpassoword;
    @FindBy(id = "days")
    public WebElement dayBirth;
    @FindBy(id = "months")
    public WebElement monthBirth;
    @FindBy(id = "years")
    public WebElement yearBirth;
    @FindBy(id = "first_name")
    public WebElement txtfirstName;
    @FindBy(id = "last_name")
    public WebElement txtlasttName;
    @FindBy(id = "company")
    public WebElement company;
    @FindBy(id = "address1")
    public WebElement txtaddress;
    @FindBy(id = "country")
    public WebElement country;
    @FindBy(id = "state")
    public WebElement txtstate;
    @FindBy(id = "city")
    public WebElement txtcity;
    @FindBy(id = "zipcode")
    public WebElement txtpostcode;
    @FindBy(id = "mobile_number")
    public WebElement txt_mobile;
    @FindBy(xpath = "//button[contains(.,'Create Account')]")
    public WebElement btnRegister;
    @FindBy(xpath = "//b[contains(.,'Account Created!')]")
    public WebElement validacontacriada;
    @FindBy(xpath = "//a[contains(@data-qa,'continue-button')]")
    public WebElement btnContinue;
}
