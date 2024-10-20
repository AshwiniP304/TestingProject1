package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Login_Amazon_1905
{

	public static void main(String[] args) throws Exception
	{
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setBrowserName("chrome");
		RemoteWebDriver w = new RemoteWebDriver(dc);
		
		Thread.sleep(2000);
		w.manage().window().maximize();
		Thread.sleep(2000);
		w.get("https://www.amazon.in/ap/register?showRememberMe=true&openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_custrec_signin&prevRID=M21WTCTCP24H5R85K91Y&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&prepopulatedLoginId=&failedSignInCount=0&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&pageId=inflex&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		Thread.sleep(2000);
		w.findElement(By.id("ap_customer_name")).sendKeys("Ashwini Patil");
		Thread.sleep(2000);
		w.findElement(By.id("ap_phone_number")).sendKeys("9892715715");
		Thread.sleep(2000);
		w.findElement(By.id("ap_password")).sendKeys("Ash@715715");
	}

}
