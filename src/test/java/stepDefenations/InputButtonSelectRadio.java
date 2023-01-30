package stepDefenations;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageFactory.InputButtonSelectRadioFactory;


public class InputButtonSelectRadio {
	private InputButtonSelectRadioFactory ibsr=new InputButtonSelectRadioFactory();

	@Given("select the input element edit link")
	public void select_the_input_element_edit_link() {
			ibsr.selecteditLink();

	}
	@Given("enter full ([^\"]*)$")
	public void enter_full_name(String name) {
	     ibsr.enterFullName(name);
	     
	}
	@Given("enter the text inside append ([^\"]*)$")
	public void enter_the_text_inside_append_text(String text) {
	     
	     ibsr.apendText(text);
	}
	@Given("get the text inside the text box")
	public void get_the_text_inside_the_text_box() {
	     
	     ibsr.gettext();
	}
	@Given("clear the text from clear the text")
	public void clear_the_text_from_clear_the_text() {
	     ibsr.cleartext();
	}
	@Given("confirm edit field is disabled")
	public void confirm_edit_field_is_disabled() {
		System.out.println("The edit field is enabled :-"+ibsr.confirmDisable());
	}
	@Given("confirm text is read only")
	public void confirm_text_is_read_only() 
{
	ibsr.readonly();
}

	@Given("select the button title element click")
	public void select_the_button_title_element_click() {
		ibsr.selectButtons();

	}

	@Given("click on goto home and navigate back to current page")
	public void click_on_goto_home_and_navigate_back_to_current_page() {
	   ibsr.goToHome();
	}

	@Given("get the x and y co-ordinates of the button")
	public void get_the_x_and_y_co_ordinates_of_the_button() {
	    ibsr.getCoOrdinates();
	}

	@Given("Find the color of the button")
	public void find_the_color_of_the_button() {
	   ibsr.buttonColor();
	}
	@Given("Find the height & width of the button")
	public void find_the_height_width_of_the_button() {
	    ibsr.buttonDimension();
	}
	@Given("Confirm button is disabled")
	public void confirm_button_is_disabled() {
	    ibsr.buttonDisabled();
	}
	@Given("Click and Hold Button and get the button output")
	public void click_and_hold_button_and_get_the_button_output() {
	   ibsr.clickAndHold();
	}


//***********************************************************************
@Given("select the Select title element link drop-down")
public void select_the_select_title_element_link_drop_down() {
	ibsr.selectDropdown();

}
	@Given("Select the {int} using visible text and print the output")
	public void select_the_using_visible_text_and_print_the_output(Integer int1) {
		ibsr.selectfruit(int1);
	}
	@And("^Select your super ([^\"]*) and prints the output")
	public void select_your_super_heros_and_prints_the_output(String heros) {
		ibsr.selectSuperHeros(heros);
	}
	@And("^Select the programming ([^\"]*) and print all the options")
	public void select_the_last_swift_and_print_all_the_options(String language) {
		ibsr.selectLanguages(language);
	}
	@And("^Select ([^\"]*) using value & print the selected value")
	public void select_country_using_value_print_the_selected_value(String country) {
		ibsr.selectCountry(country);
	}

//***********************************************************************

	@Given("select the radio title element click toggle")
	public void select_the_radio_title_element_click_toggle() {
		ibsr.selectToggle();
	}


	@Given("select any one from yes or no")
	public void select_any_one_from_yes_or_no() {
		ibsr.selectNo();
	}

	@Given("Cofirm you can select only one radio button")
	public void cofirm_you_can_select_only_one_radio_button() {
	   ibsr.verifyRadio();
	}

	@Given("Find the bug")
	public void find_the_bug() {
	    ibsr.findBug();
	}

	@Given("Find which one is selected")
	public void find_which_one_is_selected() {
	    ibsr.selectedRadio();
	}

	@Given("Confirm last field is disabled")
	public void confirm_last_field_is_disabled() {
	    ibsr.confirmRadioDisabled();
	}

	@Given("Find if the checkbox is selected?")
	public void find_if_the_checkbox_is_selected() {
	   ibsr.confirmSelectedCheckbox();
	}

	@Then("Accept the T&C")
	public void accept_the_t_c() {
	   ibsr.acceptTandC();
	}




}
