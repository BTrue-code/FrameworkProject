package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.CommonMethods;
import utils.ConfigReader;

public class AddEmployeeStep extends CommonMethods {


    @When("user enters firstname middlename and lastname")
    public void user_enters_firstname_middlename_and_lastname() {
        sendText(ConfigReader.read("firstname"), addEmployeePage.firstNameLocator);
        sendText(ConfigReader.read("middlename"), addEmployeePage.middleNameLocator);
        sendText(ConfigReader.read("lastname"), addEmployeePage.lastNameLocator);
    }


    @When("user clicks on save button")
    public void user_clicks_on_save_button() {
        click(addEmployeePage.saveBtn);
    }


    @Then("employee is added sucessfully")
    public void employee_is_added_sucessfully() {
        System.out.println("Employee successfully added to roster!");
    }


    @When("user enters firstname and lastname")
    public void user_enters_firstname_and_lastname() {
        sendText(ConfigReader.read("first_name"), addEmployeePage.firstNameLocator);
        sendText(ConfigReader.read("last_name"), addEmployeePage.lastNameLocator);
    }


    @When("user enters employees id number")
    public void user_enters_employees_id_number() {

        sendText(ConfigReader.read("idnumber"), addEmployeePage.empID);
    }


    @When("user clicks on the employee list button")
    public void user_clicks_on_the_employee_list_button() {
        click(addEmployeePage.viewEmpList);
    }


    @When("user searches employees id number")
    public void user_searches_employees_id_number() {
        sendText(ConfigReader.read("idnumber"), addEmployeePage.empSearchID);
    }


    @Then("user clicks search button")
    public void user_clicks_search_button() {
        click(addEmployeePage.btnSearch);
    }


}
