package hybridDrivenFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RepoSauceDemo_2807
{
	WebDriver w;
	public RepoSauceDemo_2807(WebDriver wd)
	{
		w=wd;
		PageFactory.initElements(w, this);
	}
	//Login Element
	@FindBy (id = "user-name") WebElement username;
	@FindBy(id = "password") WebElement password;
	@FindBy(css="input#login-button[value=\"LOGIN\"]") WebElement loginbtn;
	
	//Add to Cart element
	@FindBy(xpath = "//*[@id=\"inventory_container\"]/div/div[1]/div[3]/button") WebElement product1;
	@FindBy(xpath = "//*[@id=\"inventory_container\"]/div/div[3]/div[3]/button") WebElement product2;
	@FindBy(xpath =  "//*[@id=\"shopping_cart_container\"]/a/span" ) WebElement cart;
	
	//CheckOut
	@FindBy(linkText = "CHECKOUT") WebElement checkoutbtn;
	
	//Your Information
	@FindBy(id = "first-name") WebElement firstname;
	@FindBy(id = "last-name") WebElement lastname;
	@FindBy(id = "postal-code") WebElement zipcode;
	@FindBy(css = "input[value=\"CONTINUE\"]") WebElement continuebtn;
	
	//Overview
	@FindBy(linkText = "FINISH") WebElement finishbtn;
	
	//Logout
	@FindBy(xpath = "//*[@id=\"menu_button_container\"]/div/div[3]/div/button") WebElement openmenu;
	@FindBy(linkText = "Logout") WebElement logoutbtn;
	
	public void openUrl(String url)
	{
		w.manage().window().maximize();
		w.get(url);
	}
	public void login(String user, String pass) throws Exception 
	{
		username.sendKeys(user);
		Thread.sleep(2000);
		password.sendKeys(pass);
		Thread.sleep(2000);
		loginbtn.click();
	}
	public void addProduct1() throws Exception
	{
		Thread.sleep(2000);
		product1.click();
	}
	public void addProduct2() throws Exception
	{
		Thread.sleep(2000);
		product2.click();
	}
	public void opencart() throws Exception 
	{
		Thread.sleep(2000);
		cart.click();
	}
	public void checkout() throws Exception 
	{
		Thread.sleep(2000);
		checkoutbtn.click();
	}
	public void yourInfo(String first,String last,String zip) throws Exception 
	{
		Thread.sleep(2000);
		firstname.sendKeys(first);
		Thread.sleep(2000);
		lastname.sendKeys(last);
		Thread.sleep(2000);
		zipcode.sendKeys(zip);
		Thread.sleep(2000);
		continuebtn.click();
	}
	public void overview() throws Exception
	{
		Thread.sleep(2000);
		finishbtn.click();
	}
	public void logout() throws Exception 
	{
		Thread.sleep(2000);
		openmenu.click();
		Thread.sleep(2000);
		logoutbtn.click();
	}
}
