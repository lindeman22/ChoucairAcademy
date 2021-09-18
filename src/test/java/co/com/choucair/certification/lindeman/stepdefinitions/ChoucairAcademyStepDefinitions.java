package co.com.choucair.certification.lindeman.stepdefinitions;
import co.com.choucair.certification.lindeman.models.AcademyChoucairData;
import co.com.choucair.certification.lindeman.tasks.Answer;
import co.com.choucair.certification.lindeman.tasks.Login;
import co.com.choucair.certification.lindeman.tasks.OpenUp;
import co.com.choucair.certification.lindeman.tasks.Search;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actions.OpenPage;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;


public class ChoucairAcademyStepDefinitions {
    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }


    @Given("^that Brandon wants to learn automation at the choucair academy$")
    public void thatBrandonWantsToLearnAutomationAtTheChoucairAcademy(List<AcademyChoucairData> academyChoucairData) {
    OnStage.theActorCalled("Brandon").wasAbleTo(OpenUp.thePage(), Login.
            OnThePage(academyChoucairData.get(0).getStrUser(), academyChoucairData.get(0).getStrPassword()));

    }


    @When("^he search for the course on the choucair academy$")
    public void heSearchForTheCourseOnTheChoucairAcademy(List<AcademyChoucairData> academyChoucairData) {
        OnStage.theActorInTheSpotlight().attemptsTo(Search.the(academyChoucairData.get(0).getStrCourse()));

    }

    @Then("^he finds the course called$")
     public void heFindsTheCourseCalled(List<AcademyChoucairData> academyChoucairData) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(academyChoucairData.get(0).getStrCourse())));
    }


}
