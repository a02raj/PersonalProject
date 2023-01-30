package myTestRunner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions
        (
                features = {"src/test/resources/features"},//The path of the feature file
                glue = {"stepDefenations", "applicationHooks"},//The path of the stepDefenation files
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
public class TestNGTestRunner extends AbstractTestNGCucumberTests {

}
