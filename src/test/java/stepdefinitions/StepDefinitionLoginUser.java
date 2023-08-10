package stepdefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.Transpose;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import question.Answer;
import tasks.Login;
import tasks.OpenTask;

import java.util.Map;

public class StepDefinitionLoginUser {
    @Before
    public void configuracionInicial() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("the user wishes to login an account on the website")
    public void the_user_wishes_to_login_an_account_on_the_website() {
        OnStage.theActor("User").wasAbleTo(OpenTask.theHomePage());
    }

    @When("the user enters yours credentials")
    public void the_user_enters_his_or_her_data_for_the_creation_of_a_new_system(@Transpose Map<String,String> dataTable) {
        OnStage.theActorInTheSpotlight().attemptsTo(Login.inPage(dataTable));

    }

    @Then("he must display a message (.*)$")
    public void he_must_display_a_message_products(String message) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(message)));

    }

}
