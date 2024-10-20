package keyDrivenFramework;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RepoTamTamB2B 
{
	WebDriver w;
	public RepoTamTamB2B(WebDriver wd)
	{
		w=wd;
		PageFactory.initElements(w, this);
	}
	
	//Login
	@FindBy (id = "txtusername") WebElement username;
	@FindBy (id = "txtpassword") WebElement password;
	@FindBy (css = "a[onclick=\"return ValidateLogin();\"]") WebElement loginbtn;
	
	
	//click on hotel
	@FindBy (linkText = "Hotels") WebElement hotelsearch;
	
	//Hotel search page
	@FindBy(id = "HotelForm_dllCity") WebElement des;
	
	@FindBy(id = "txtCheckinDate") WebElement checkin;
	@FindBy(id = "txtCheckOutDate") WebElement checkout;
	@FindBy(id = "hfp_RoomPaxInfo") WebElement pax;
	@FindBy(id = "SearchPackage") WebElement donebtn;
	@FindBy(id = "divbtnSearch") WebElement search;
	
	//Hotel listing
	@FindBy(xpath = "/html/body/form/div[3]/div[3]/div/div/div[11]/div/div[9]/div[2]/div/div[1]/div/div/div/div[2]/div/span/span[1]/button")WebElement listing;
	
	//select room 
	@FindBy(xpath ="/html/body/form/div[3]/div[3]/div/div/div[11]/div/div[9]/div[2]/div/div[2]/div/div/div[3]/div[1]/div/div[2]/div/div[3]/div/div[4]/button")WebElement room;
	
	//My Cart
	@FindBy(xpath = "//*[@id=\"myselection\"]/div/div/div[2]/div[2]/div[2]/button") WebElement cart;
	
	//booking page
	@FindBy(xpath = "//*[@id=\"infodiv\"]/div[2]/a/button") WebElement nextbtn;
	
	//Pax Info
	@FindBy(xpath = "/html/body/form/div[3]/div[5]/div/div/div/div[1]/div[2]/div[2]/div/div[2]/div[1]/div[3]/div[1]/div[1]/div/select") WebElement title1;
	@FindBy(xpath = "//*[@id=\"5299_1_0_firstname\"]") WebElement firstname1;
	@FindBy(xpath = "//*[@id=\"5299_1_0_lastname\"]") WebElement lastname1;
	@FindBy(xpath = "//*[@id=\"5299_1_0_ages\"]")WebElement dob1;
	
	@FindBy(xpath = "/html/body/form/div[3]/div[5]/div/div/div/div[1]/div[2]/div[2]/div/div[2]/div[1]/div[5]/div[1]/div[1]/div/select") WebElement title2;
	@FindBy(xpath = "//*[@id=\"5299_1_1_firstname\"]") WebElement firstname2;
	@FindBy(xpath = "//*[@id=\"5299_1_1_lastname\"]") WebElement lastname2;
	@FindBy(xpath = "//*[@id=\"5299_1_1_ages\"]")WebElement dob2;
	@FindBy(xpath = "//*[@id=\"paxinfo\"]/div[5]/div[2]/button") WebElement proceedbtn;
	
	public void openUrl(String url)
	{
		w.manage().window().maximize();
		w.get(url);
	}
	public void login(String user, String pass) throws Exception
	{
		username.sendKeys(user);
		Thread.sleep(1000);
		password.sendKeys(pass);
		Thread.sleep(1000);
		loginbtn.click();
		Thread.sleep(1000);
	}
	public void hotel() throws Exception
	{
		hotelsearch.click();
		Thread.sleep(1000);
	}
	 public void dropdownOnDestination(String value) throws Exception 
	 {
		 Select s = new Select(des);
		 s.selectByValue(value);
		 Thread.sleep(1000);
	 }	
	 
	 public void checkindate(String checkindate, String checkoutdate) throws Exception
		{
			checkin.sendKeys(checkindate);
			Thread.sleep(1000);
			checkout.sendKeys(checkoutdate);
			Thread.sleep(1000);
			pax.click();
			donebtn.click();
			Thread.sleep(1000);
			search.click();
			Thread.sleep(1000);
		}
	 public void HotelListing() throws Exception 
	 {
		 listing.click();
		 Thread.sleep(1000);
		 cart.click();
		 Thread.sleep(1000);
		 nextbtn.click();
		 Thread.sleep(1000);
	 }
	 public void myselection() throws Exception
	 {
		 Alert alt = w.switchTo().alert();
		 Thread.sleep(2000);
		 room.click();
		 Thread.sleep(1000); 
	 }
	 public void dropdowntitle1(String value1) 
	 {
		Select se = new Select(title1);
		se.selectByVisibleText(value1); 
	 }
	 public void paxinfo1(String first1,String last1,String birthdate1) throws Exception
	 {
		 firstname1.sendKeys(first1);
		 Thread.sleep(1000);
		 lastname1.sendKeys(last1);
		 dob1.sendKeys(birthdate1);
	 }
	 public void dropdowntitle2(String value2) 
	 {
		Select se = new Select(title2);
		se.selectByVisibleText(value2); 
	 }
	 public void paxinfo2(String first2,String last2,String birthdate2) throws Exception
	 {
		 firstname2.sendKeys(first2);
		 lastname2.sendKeys(last2);
		 Thread.sleep(1000);
		 dob2.sendKeys(birthdate2);
		 proceedbtn.click();		 
	 } 	 
}
