package elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import page.CommonPage;

public class LoginElements extends CommonPage {
    @FindBy(xpath = "//a[contains(.,'Signup / Login')]")
    protected WebElement linklogin;
    @FindBy(name = "email")
    protected WebElement txtemail;
    @FindBy(xpath = "//input[@data-qa='signup-email']")
    protected WebElement txtemailcadastro;
    @FindBy(name = "password")
    protected WebElement txtsenha;
    @FindBy(xpath = "//button[@type='submit'][contains(.,'Login')]")
    protected WebElement btnlogin;
    @FindBy(tagName = "Signup")
    protected WebElement btnsignup;
}
