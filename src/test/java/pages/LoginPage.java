package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

public class LoginPage extends CommonMethods {


    @FindBy(id = "txtUsername")
    public WebElement userName;


    @FindBy(id = "txtPassword")
    public WebElement password;


    @FindBy(id = "btnLogin")
    public WebElement loginButton;

    @FindBy(id="menu_pim_viewPimModule")
    public WebElement pimOptBtn;

    @FindBy(id="menu_pim_addEmployee")
    public WebElement addEmpOption;

    @FindBy(id = "spanMessage")
    public WebElement errorMessage;


    public LoginPage() {
        PageFactory.initElements(driver, this);
    }

}
