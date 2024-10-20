package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrontAccounting_1407
{
	public static void main(String[] args) 
	{
		WebDriver w = new ChromeDriver();
		RepoFrontAccounting_1407 fa = new RepoFrontAccounting_1407(w);
		fa.openUrl();
		fa.login("demouser", "password");
		fa.logout();
		

	}

}
