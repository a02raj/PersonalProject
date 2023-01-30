package stepDefenations;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebElement;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageFactory.AlertFrameWindowFactory;

public class AlertFrameWindow {
	AlertFrameWindowFactory afw=new AlertFrameWindowFactory();
	
	@Given("select the alert title element click dialog")
	public void select_the_alert_title_element_click_dialog() {
	   afw.selectAlert();
	}
	@Then("click on simple alert button")
	public void click_on_simple_alert_button() {
	    afw.simpleAlert();
	}
	@Then("Accept the Alert")
	public void accept_the_alert() {
	    afw.acceptAlert();
	}
	@Then("click on confirm alert button")
	public void click_on_confirm_alert_button() {
		afw.confirmAlert();
	}
	@Then("Dismiss the Alert & print the alert text")
	public void dismiss_the_alert_print_the_alert_text() {
	    afw.getMessage();
	    afw.dismissAlert();
	}
	@Then("click on prompt alert button")
	public void click_on_prompt_alert_button() {
		afw.promptAlert();
	}
	@Then("Type your name & accept$")
	public void type_your_name_accept(DataTable datatable) {
		List<String> data=datatable.asList();
	    afw.sendAlertMessage(data.get(0));
	    afw.acceptAlert();
	}
	@Then("verify the output")
	public void verify_the_output() {
	    afw.outputMessage();
	}
	@Then("click modern alert button")
	public void click_modern_alert_button() {
	    afw.modernAlert();
	}
//**********Frame*******************
	@Given("select the frame title element click inner HTML")
	public void select_the_frame_title_element_click_inner_html() {
	    afw.clickFrame();	    
	}
	@Then("get the number of frmes on the page")
	public void get_the_number_of_frmes_on_the_page() {
	    
	    afw.getFrames();
	}
	@Then("^switch to outer frame by ([^\"]*)")
	public void switch_to_outer_frame_by_name(String name) {
	    afw.movetoframe(name);
	}

	
	@Then("enter first name and last name")
	public void enter_first_name_and_last_name(DataTable dataTable) {
	    Map<String, String> data= dataTable.asMap();	    
	   afw.enterData(data.get("first"), data.get("last"));
	}
	@Then("get the output")
	public void get_the_output() {
	    
	    afw.getOutput();
	}
	@Then("^switch to inner frame by ([^\"]*)")
	public void switch_to_inner_frame_by_webelement(String element) {
		 afw.movetoframe(element);
	}
	@Then("^enter the ([^\"]*) inside email field inside frame")
	public void enter_the_email_inside_email_field_inside_frame(String email) {	    
	    afw.enterEmail(email);
	}
	@Then("get back to main wndow page")
	public void get_back_to_main_wndow_page() {
	    
	    afw.goTomainFrame();
	}
	@Then("get back to home page")
	public void get_back_to_home_page() {	    
	    afw.goToHome();
	}

}
