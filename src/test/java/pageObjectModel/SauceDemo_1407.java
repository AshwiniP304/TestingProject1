package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SauceDemo_1407 {

	public static void main(String[] args) throws Exception 
	{
		WebDriver w  = new ChromeDriver();
		RepoSauceDemoUsingPageFactory_1407 sd =new RepoSauceDemoUsingPageFactory_1407(w);
		w.manage().window().maximize();
		sd.openUrl();
		sd.login("standard_user", "secret_sauce");
		sd.logout();
	}
}
