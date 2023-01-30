package stepDefenations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageFactory.*;
public class DragDroptMultiSelect {
	private DradDropMultiSelectFactory ddsm=new DradDropMultiSelectFactory() ;
//drop
	@Given("select the drop element AUI-{int} link")
	public void select_the_drop_element_aui_link(Integer int1) {
	    ddsm.selectDrop();
	}
	@Then("drag the dragable element to droping point")
	public void drag_the_dragable_element_to_droping_point() {
	    ddsm.findDimensionAndcoOrdinatesofDragableElement();
	    ddsm.dragdragable();
	}


//multiSelect****************
	@Given("select the multi-select title element click AUI-{int}")
	public void select_the_multi_select_title_element_click_aui(Integer int1) {
	    ddsm.selectMultiSelect();
	    
	}

	@Then("get all the list element of list")
	public void get_all_the_list_element_of_list() {
	    ddsm.getelements();
	    
	}

	@Then("select all the present list and print")
	public void select_all_the_present_list_and_printt() {
	    
	    ddsm.selectAllElements();
	}

	
}
