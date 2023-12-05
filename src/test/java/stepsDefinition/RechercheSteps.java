package stepsDefinition;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.RecherchePage;

public class RechercheSteps {
	WebDriver driver = Hooks.driver;
	RecherchePage Reaserch = new RecherchePage(driver);

	@When("the administtrator locate search bar")
	public void the_administtrator_locate_search_bar() {
		Reaserch.locatesearch();
	}

	@When("writes name of lecon Tester les APIs REST")
	public void writes_name_of_lecon_tester_les_ap_is_rest() {
		Reaserch.writeslecon();
	}

	@Then("check that search page displays Tester les APIs REST")
	public void check_that_search_page_displays_tester_les_ap_is_rest() {
		Reaserch.checksearch();
	}

	@Then("writes name of module notions avancées")
	public void writes_name_of_module_notions_avancées() {
		Reaserch.clearsearch();
		Reaserch.writesModule();
	}

	@Then("check that search page displays notions avancées")
	public void check_that_search_page_displays_notions_avancées() {
		Reaserch.checksearchModule();
	}

	@Then("writes the evaluation score {int} votes")
	public void writes_the_evaluation_score_votes(Integer int1) {
		Reaserch.clearsearch();
		Reaserch.writesscoreEvaluation();
	}

	@Then("check that search page displays {int} votes")
	public void check_that_search_page_displays_votes(Integer int1) {
		Reaserch.checksearchscoreEvaluation();
	}

}