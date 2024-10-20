package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RepoSauceDemoUsingPageFactory_1407
{
WebDriver w;
	public RepoSauceDemoUsingPageFactory_1407(WebDriver wd) 
   {
	w = wd;
	PageFactory.initElements(w, this);
   }
	@FindBy(id = "user-name") WebElement username;
	@FindBy(id = "password") WebElement password;
	@FindBy(xpath = "//*[@id=\"login-button\"]") WebElement loginbtn;
	@FindBy(xpath = "//*[@class=\"bm-burger-button\"]/button") WebElement openMenu;
	@FindBy(partialLinkText = "Logout") WebElement logoutlink;
	
	public void openUrl()
	{
		w.get("https://www.saucedemo.com/v1/");
	}
	 public void login(String usern, String passw)
	{
		username.sendKeys(usern);
		password.sendKeys(passw);
		loginbtn.click();
	}
	 public void logout() throws Exception 
	 {
		 Thread.sleep(1000);
		 openMenu.click();
		 Thread.sleep(1000);
		 logoutlink.click();
	 }
}
