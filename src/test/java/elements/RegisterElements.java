package elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterElements {
    @FindBy(xpath = "//b[contains(.,'Enter Account Information')]")
    public WebElement txtauthentication;

    @FindBy(id = "id_gender1")
    public WebElement genderMale;

    @FindBy(id = "id_gender2")
    public WebElement genderFemale;

    @FindBy(id = "password")
    public WebElement inppasswd;

    @FindBy(id = "days")
    public WebElement dayBirth;

    @FindBy(id = "months")
    public WebElement monthBirth;

    @FindBy(id = "years")
    public WebElement yearBirth;

    @FindBy(id = "first_name")
    public WebElement inpfirstName;

    @FindBy(id = "last_name")
    public WebElement inplastName;

    @FindBy(id = "company")
    public WebElement inpcompany;

    @FindBy(id = "address1")
    public WebElement address;

    @FindBy(id = "address2")
    public WebElement addressCont;

    @FindBy(id = "country")
    public WebElement country;

    @FindBy(id = "state")
    public WebElement state;

    @FindBy(id = "city")
    public WebElement city;

    @FindBy(id = "zipcode")
    public WebElement postcode;







    @FindBy(id = "optin")
    public WebElement specialOffers;

    @FindBy(id = "company")
    public WebElement company;

    @FindBy(id = "mobile_number")
    public WebElement phone_mobile;

    @FindBy(id = "create-account")
    public WebElement btnRegister;
/*
    @FindBy(id = "other")
    public WebElement additionalInformation;

    @FindBy(id = "phone")
    public WebElement phone_home;

    @FindBy(id = "alias")
    public WebElement addresAlias;
*/

}
