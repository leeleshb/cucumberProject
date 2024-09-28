package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)	//it will run all the feature files together
@CucumberOptions(	features="src/test/resources/features",				//to run specific feature file just add functionality along with .feature extension after this path e.g.- features="src/test/java/features/Login.feature"
					glue={"stepdefinitions","hooks"},					//initialize step definitions files and hooks files
					plugin= {"pretty",
							"html:Report/CucumberReport/testReport.html", 			//"html:Report/CucumberReport/testReport.html"-it will generate test report in html & "pretty" plugin is used to highlight outputs in different colours
							//"json:Report/CucumberReport/testReport.json",			//"json:Report/CucumberReport/testReport.json"-it will generate test report in json format
							//"junit:Report/CucumberReport/testReport.xml"			//"junit:Report/CucumberReport/testReport.xml"-it will generate test report in xml format
							},
					dryRun = true,				//it is used to check whether there is any steps are missing to implement or not
					//publish = true,				//it is used to publish reports on cloud and we can also publish report on cloud using properties file
							tags="@all and not @dev and not @ignore and not @wip")	//tags by which you can run only those tests mentioned as tag in feature file
																						//@dev- development tag, @ignore tag- to intentionally ignore some cases and @wip- work in progress tag. This all are default tags in cucumber
public class TestRunner {

}
