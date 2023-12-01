package teststeps;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;






@RunWith(Cucumber.class)

@CucumberOptions(features="src\\test\\resources\\Features" , glue={"teststeps"} , strict = true, plugin = {
		"pretty", "html:target/rapport.html", "json:target/rapport.json"
} )


public class Runner {

}