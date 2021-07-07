package org.loginsteps;

import org.utilities.Baseclass;
import org.utilities.Pojoclass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Loginsteps extends Baseclass {

	@Given("user is in Adactin login page")
	public void user_is_in_Adactin_login_page() {
		launchbrowser();
		loadurl("https://adactinhotelapp.com/");
	}

	@When("user enter valid {string} and {string}")
	public void user_enter_valid_and(String Username, String Password) {

		Pojoclass pj = new Pojoclass();

		fill(pj.getTxtemail(), Username);
		fill(pj.getTxtpass(), Password);
	}

	@When("user click login button")
	public void user_click_login_button() {

		Pojoclass pj = new Pojoclass();
		click(pj.getTxtlogin());
	}

	@When("user select hotel details {string},{string},{string},{string},{string} and {string}")
	public void user_select_hotel_details_and(String location, String hotels, String roomtype, String roomnos,
			String adultroom, String childroom) {

		Pojoclass pj1 = new Pojoclass();
		dropdown(pj1.getLocation(), location);
		dropdown(pj1.getHotels(), hotels);
		dropdown(pj1.getRoomtype(), roomtype);
		dropdown(pj1.getRoomnos(), roomnos);
		dropdown(pj1.getAdultroom(), adultroom);
		dropdown(pj1.getChildroom(), childroom);

	}

	@When("user click search button")
	public void user_click_search_button() {
		Pojoclass pj1 = new Pojoclass();
		click(pj1.getSubmit());
		click(pj1.getRadio());
		click(pj1.getContinue());

	}

	@When("user has to fill the details {string},{string},{string},{string},{string},{string},{string} and {string}")
	public void user_has_to_select_the(String Firstname, String Lastname, String Address, String Cardnumber,
			String Cardtype, String CCmonth, String CCyear, String Cvvnumber) {
		Pojoclass pj = new Pojoclass();

		fill(pj.getFirstname(), Firstname);
		fill(pj.getLastname(), Lastname);
		fill(pj.getAddress(), Address);
		fill(pj.getCcnum(), Cardnumber);
		dropdown(pj.getCctype(), Cardtype);
		dropdown(pj.getCcmonth(), CCmonth);
		dropdown(pj.getCcyear(), CCyear);
		fill(pj.getCvv(), Cvvnumber);
		click(pj.getBooknow());
	}

	@Then("user click continue button")
	public void user_click_continue_button(String text) {
		Pojoclass pj1 = new Pojoclass();
		click(pj1.getSubmit());
		click(pj1.getRadio());
		click(pj1.getContinue());
		bookingNumber(pj1.getOrdernumber(), text);
		System.out.println(text);
	}

	@Then("user must be login with success message")
	public void user_must_be_login_with_success_message(String text) {
		closebrowser();
	}

}