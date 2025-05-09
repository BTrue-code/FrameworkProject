package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

public class AddEmployeePage extends CommonMethods {


    @FindBy(id="firstName")
    public WebElement firstNameLocator;

    @FindBy(id="lastName")
    public WebElement lastNameLocator;

    @FindBy(id="middleName")
    public WebElement middleNameLocator;

    @FindBy(id="btnSave")
    public WebElement saveBtn;

    @FindBy(id="menu_pim_viewPimModule")
    public WebElement pimOptBtn;

    @FindBy(id="menu_pim_addEmployee")
    public WebElement addEmpOption;

    @FindBy(id="menu_pim_viewEmployeeList")
    public WebElement viewEmpList;

    @FindBy(id= "empsearch_id")
    public WebElement empSearchID;

    @FindBy(id = "searchBtn")
    public WebElement btnSearch;

    @FindBy(id = "employeeId")
    public WebElement empID;


    public AddEmployeePage() {
        PageFactory.initElements(driver, this);
    }


}
