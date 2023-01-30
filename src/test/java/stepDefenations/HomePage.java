package stepDefenations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageFactory.HomePageFactory;

public class HomePage {
private HomePageFactory home=new HomePageFactory();
	@Given("click on sign up button link")
	public void click_on_sign_up_button_link() {
	   home.signin();
	}

	@Given("^enter user name ([^\"]*)$")
	public void enter_user_name_aryan_raj(String name) {
	    home.enterUserName(name);
	}

	@Given("^enter email ([^\"]*)$")
	public void enter_email_abc_pqr_xyz(String email) {
	   home.enterEmail(email);
	}

	@Given("^enter password ([^\"]*)$")
	public void enter_password_password1234(String pass) {
	    home.enterPassword(pass);
	}

	@Given("click on agree the t&c checkbox")
	public void click_on_agree_the_t_c_checkbox() {
	   home.TandC();
	}

	@Then("click on sign up button")
	public void click_on_sign_up_button() {
	  home.signup();
	}

	@Then("click sign out")
	public void click_sign_out() {
	    home.signout();
	}

	@Given("user clicks on loginLink button")
	public void user_clicks_on_login_link_button() {
	    home.login();
	}


	@Given("click on login button")
	public void click_on_login_button() {
	  home.loginButton();
	}

	@Given("verify signed by signout button")
	public void verify_signed_by_signout_button() {
	    home.verifysignin();
	}
}
