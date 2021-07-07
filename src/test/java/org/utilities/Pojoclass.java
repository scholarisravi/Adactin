package org.utilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pojoclass extends Baseclass {

	public Pojoclass() {
		PageFactory.initElements(driver, this);
	}

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotels() {
		return hotels;
	}

	public WebElement getRoomtype() {
		return roomtype;
	}

	public WebElement getRoomnos() {
		return roomnos;
	}

	public WebElement getAdultroom() {
		return adultroom;
	}

	public WebElement getChildroom() {
		return childroom;
	}

	@FindBy(xpath = "//*[@name='order_no']")
	private WebElement Ordernumber;

	public WebElement getOrdernumber() {
		return Ordernumber;
	}

	@FindBy(xpath = "//*[@id='location']")
	private WebElement location;

	@FindBy(xpath = "//*[@id='hotels']")
	private WebElement hotels;

	@FindBy(xpath = "//*[@id='room_type']")
	private WebElement roomtype;

	@FindBy(xpath = "//select[@id='room_nos']")
	private WebElement roomnos;

	@FindBy(xpath = "//*[@id='adult_room']")
	private WebElement adultroom;

	@FindBy(xpath = "//*[@id='child_room']")
	private WebElement childroom;

	@FindBy(id = "username")
	private WebElement txtemail;

	public WebElement getTxtemail() {
		return txtemail;
	}

	public WebElement getTxtpass() {
		return txtpass;
	}

	public WebElement getTxtlogin() {
		return txtlogin;
	}

	@FindBy(id = "password")
	private WebElement txtpass;

	@FindBy(name = "login")
	private WebElement txtlogin;

	@FindBy(name = "Submit")
	private WebElement submit;

	@FindBy(name = "radiobutton_0")
	private WebElement radio;

	@FindBy(name = "continue")
	private WebElement Continue;

	@FindBy(name = "first_name")
	private WebElement firstname;

	@FindBy(name = "last_name")
	private WebElement lastname;

	@FindBy(name = "address")
	private WebElement address;

	public WebElement getRadio() {
		return radio;
	}

	public WebElement getContinue() {
		return Continue;
	}

	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCctype() {
		return cctype;
	}

	public WebElement getCcmonth() {
		return ccmonth;
	}

	public WebElement getCcyear() {
		return ccyear;
	}

	public WebElement getCvv() {
		return cvv;
	}

	public WebElement getBooknow() {
		return booknow;
	}

	public WebElement getCcnum() {
		return Ccnum;
	}

	@FindBy(name = "cc_type")
	private WebElement cctype;

	@FindBy(name = "cc_exp_month")
	private WebElement ccmonth;

	@FindBy(name = "cc_exp_year")
	private WebElement ccyear;

	@FindBy(name = "cc_cvv")
	private WebElement cvv;

	@FindBy(name = "book_now")
	private WebElement booknow;

	@FindBy(xpath = "//*[@name='cc_num']")
	private WebElement Ccnum;

	public WebElement getSubmit() {
		return submit;
	}

	@FindBy(xpath = "//*[@name='datepick_in']")
	private WebElement checkindate;

	@FindBy(xpath = "//*[@name='username_show']")
	private WebElement userlogo;

	public WebElement getUserlogo() {
		return userlogo;
	}

	@FindBy(xpath = "//*[@name='datepick_out']")
	private WebElement checkoutdate;

	public WebElement getCheckindate() {
		return checkindate;
	}

	public WebElement getCheckoutdate() {
		return checkoutdate;
	}

}
