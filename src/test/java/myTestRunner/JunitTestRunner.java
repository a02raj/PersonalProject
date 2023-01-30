package myTestRunner;

import org.junit.runner.RunWith;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions
		(
                features = {"src/test/resources/features"},//The path of the feature file
                glue = {"stepDefenations", "applicationHooks"},//The path of the stepDefenation files
				stepNotifications = true,//to get the output notification at granualar level
                plugin =//to generate report and store in repositories or to autogenerate report
                        {
                                "pretty",
                                "html:Report/HtmlReport/Advance.html","json:Report/JsonReport/Advance.json",
                        		"junit:Report/JunitReport/Advance.xml",
                                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
                        },
                monochrome = true//display the consol output in a proper readable format
               , dryRun = false//to check the mapping is proper between feature file and stepdefenation file
               , tags = "@Form"
		)													
public class JunitTestRunner {
	
	
}
//OR : tags={"@smoke, @Regression"}---Execute all tests tagged as @smoke OR @Regression Test
//AND : tags={"@smoke", "@Regression"}---Execute all tests tagged as @smoke AND @Regression Test
//NOT or ignore test : tags={"@smoke", "~@Regression"}---Execute all tests tagged as @smoke ignor @Regression Test
										//.............