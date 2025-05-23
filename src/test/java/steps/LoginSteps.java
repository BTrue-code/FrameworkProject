package steps;


import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import utils.CommonMethods;
import utils.ConfigReader;

public class LoginSteps extends CommonMethods {


    @When("user enters blank username")
    public void user_enters_blank_username() {
        sendText(ConfigReader.read("blankusername"), loginPage.userName);
    }


    @When("user enters valid password")
    public void user_enters_valid_password() {
        sendText(ConfigReader.read("password"), loginPage.password);
    }


    @When("user clicks on login button")
    public void user_clicks_on_login_button() {
        click(loginPage.loginButton);
    }


    @When("user enters valid username")
    public void user_enters_valid_username() {
        sendText(ConfigReader.read("username"), loginPage.userName);
    }


    @When("user enters blank password")
    public void user_enters_blank_password() {
        sendText(ConfigReader.read("blankpassword"), loginPage.password);
    }



    @Then("user can see error message")
    public void user_can_see_error_message() {
        String errorMessage = loginPage.errorMessage.getText();
        Assert.assertEquals(errorMessage, "Password is Empty");
        System.out.println("Password is Empty");
    }


    @When("user enters invalid username")
    public void user_enters_invalid_username() {
        sendText(ConfigReader.read("invalidusername"), loginPage.userName);
    }


    @When("user enters invalid password")
    public void user_enters_invalid_password() {
        sendText(ConfigReader.read("invalidpassword"), loginPage.password);
    }


    @Then("user sees error message")
    public void user_sees_error_message() {
        String errorMessage = loginPage.errorMessage.getText();
        Assert.assertEquals(errorMessage, "Invalid credentials");
        System.out.println("Invalid credentials.");
    }


    @Then("user is able to see error message")
    public void user_is_able_to_see_error_message() {
        String errorMessage = loginPage.errorMessage.getText();
        Assert.assertEquals(errorMessage, "Username cannot be empty");
        System.out.println("Username cannot be empty");
    }



    @When("user enters valid username and password")
    public void user_enters_valid_username_and_password() {
        sendText(ConfigReader.read("username"), loginPage.userName);
        sendText(ConfigReader.read("password"), loginPage.password);
    }


    @Then("user is able to see the dashboard page")
    public void user_is_able_to_see_the_dashboard_page() {
        String dashboard = loginPage.dashboard.getText();
        Assert.assertEquals(dashboard, "Dashboard");
        System.out.println("Successfully loaded dashboard");
    }


}
