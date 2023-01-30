package stepDefenations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageFactory.SlideWaitWindowFactory;

public class SlideWaitWindow {
	private SlideWaitWindowFactory sww=new  SlideWaitWindowFactory();
//***********Slider****************************
	@Given("select the slide title element click AUI-{int}")
	public void select_the_slide_title_element_click_aui(Integer int1) {
	   sww.clickSlidelink();
	}
	@Then("get the initial value of Word limit slider")
	public void get_the_initial_value_of_word_limit_slider() {
	    
	}
	@Then("get the range of slider")
	public void get_the_range_of_slider() {
	    sww.rangeOfSlider();
	}
	@Then("slide the slider to {int}%")
	public void slide_the_slider_to(Integer i) {
	    sww.slideto(i.intValue());
	}
	@Then("click get countries button")
	public void click_get_countries_button() {
	    sww.clickGetCountries();
	}
	@Then("get all the country names")
	public void get_all_the_country_names() {
	    sww.getAllCountries();
	}
	
	//********************************Wait*************************************
	@Given("select the wait title element click timeout")
	public void select_the_wait_title_element_click_timeout() {
	    sww.selectWait();
	    }
	@Then("wait for alert to present and get what time it took to apear")
	public void wait_for_alert_to_present_and_get_what_time_it_took_to_apear() {
	    sww.waitandgettext();
	}
	@Then("get the text from alert")
	public void get_the_text_from_alert() {
	    sww.getMessage();
	}
	@Then("accept the alert")
	public void accept_the_alert() {
	    sww.acceptAlert();
	}
	
	//***************************************window****************************************
	
	@Given("select the window title element click tabs")
	public void select_the_window_title_element_click_tabs() {
	    sww.selectwindow();
	}
	@Given("get the parent window name as string")
	public void get_the_parent_window_name_as_string() {
	    sww.parentWindow();
	}
	@Then("click on open home page button")
	public void click_on_open_home_page_button() {
	   sww.homePagebtn();	}
	@Then("Click on the home button")
	public void click_on_the_home_button() {
	    sww.homeBtn();
	}
	@Then("Click on the Muiltiple windows button")
	public void click_on_the_muiltiple_windows_button() {
	    sww.multiPagebtn();
	}
	@Then("Goto the newly opened tabs and get the titles")
	public void goto_the_newly_opened_tabs_and_get_the_titles() {
	    sww.AllWindows();
	}
		
	@Then("Print all the window title")
	public void print_all_the_window_title() {
	    sww.printTitles();
	}
	@Then("Close all the windows")
	public void close_all_the_windows() {
	   sww.closeAll();
	}
	
	
}
