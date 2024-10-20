package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RepoFrontAccounting_1407 
{
WebDriver w;

	public RepoFrontAccounting_1407(WebDriver wd)
	{
		w =wd;
	}
	By username = By.name("user_name_entry_field");
	By password = By.name("password");
	By loginbtn = By.name("SubmitUser");
	By logoutbtn = By.linkText("Logout");
	
	public void openUrl() 
	{
		w.get("https://demo.frontaccounting.eu/index.php");
	}
	public void login(String usern, String passw) 
	{
		w.manage().window().maximize();
		w.findElement(username).clear();
		w.findElement(username).sendKeys(usern);
		w.findElement(password).clear();
		w.findElement(password).sendKeys(passw);
		w.findElement(loginbtn).click();
	}
	public void logout() 
	{
		w.findElement(logoutbtn).click();
	}
}
