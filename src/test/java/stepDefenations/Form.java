package stepDefenations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageFactory.FormFactory;

public class Form {
	FormFactory form= new FormFactory();
	@Given("select the forms title element click all in one")
	
	public void select_the_forms_title_element_click_all_in_one() {
	    
	   form.selectformslink();
	}
	@Then("enter first name")
	public void enter_first_name() {
	   
	    form.firstName();
	}
	@Then("enter last name")
	public void enter_last_name() {
		form.lastName();
		}
	@Then("enter email")
	public void enter_email() {
		form.email();
	}
	@Then("select country code india from dropdown")
	public void select_country_code_india_from_dropdown() {
		form.countrycode();
	}
	@Then("enter phone number")
	public void enter_phone_number() {
		form.phone();
	}
	@Then("enter address line-{int}")
	public void enter_address_line(Integer int1) {
		if(int1==1)
		{	
		form.addline1();}
		else {
		form.addline2();
	
		}}
	@Then("enter state")
	public void enter_state() {
		form.state();
	}
	@Then("enter postal-code")
	public void enter_postal_code() {
		form.postCode();
	}
	@Then("select country india from dropdown")
	public void select_country_india_from_dropdown() {
		form.country();
	}
	@Then("select date of birth {int}-{int}-{int} from datepicker")
	public void select_date_of_birth_from_datepicker(Integer int1, Integer int2, Integer int3) {
		form.dob();
	}
	@Then("Select gender male radio button")
	public void select_gender_male_radio_button() {
		form.gender();
	}
	@Then("agree the T&C by clicking on checkbox")
	public void agree_the_t_c_by_clicking_on_checkbox() {
		form.TandC();
	}
	@Then("click on sbmit button to submit the form")
	public void click_on_sbmit_button_to_submit_the_form() {
		form.submit();
	}
}
