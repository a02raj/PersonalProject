package stepDefenations;
import io.cucumber.java.en.Given;
import pageFactory.WorkspaceFactory;
import static utility.Constants.*;
public class Workspace {

    private WorkspaceFactory ws=new WorkspaceFactory();
    //**************************************************************************************************
//work space page features
    @Given("user is on home page")
    public void user_is_on_home_page() {
        ws.goToHomepage();

    }
    @Given("get the heading and print")
    public void get_the_heading_and_print() {
    	homepageTitle=ws.getHeading();
        System.out.println("The title of the page is: "+homepageTitle);
    }
    @Given("user click on workspace link")
    public void user_click_on_workspace_link() {
    	ws.clickWorkSpace();
    }
//******************************************************************************


}
