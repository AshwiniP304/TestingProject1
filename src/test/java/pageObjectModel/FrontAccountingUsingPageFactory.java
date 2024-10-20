package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrontAccountingUsingPageFactory 
{

	public static void main(String[] args) throws Exception
	{
		WebDriver w = new ChromeDriver();
		RepoFrontAccountingUsingPageFactory_1407 fa = new RepoFrontAccountingUsingPageFactory_1407(w);
		fa.openUrl();
		w.manage().window().maximize();
		fa.login("demouser", "password");
		fa.logout();
		

	}

}
