package stepsDefinition;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.When;
import pages.ExtractionFiltrePage;
import pages.PaginationPage;

public class ExtractionFiltreSteps {
	WebDriver driver = Hooks.driver;

	ExtractionFiltrePage Extract = new ExtractionFiltrePage(driver);

	@When("extract data evaluation of past session")
	public void extract_data_evaluation_of_past_session() {
        Extract.extractDataFromWebTable();
	}

	@When("filter the evaluations which have scores less than or equal to {int} and which have a comment")
	public void filter_the_evaluations_which_have_scores_less_than_or_equal_to_and_which_have_a_comment(Integer int1) {

	}

}
