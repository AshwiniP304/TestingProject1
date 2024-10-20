package keyDrivenFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RepoFlipkart_Task_2807 
{
	WebDriver w;
	public RepoFlipkart_Task_2807(WebDriver wd)
	{
		w=wd;
		PageFactory.initElements(w, this);
	}
	//search
	@FindBy(name = "q") WebElement search;
	@FindBy(xpath = "/html/body/div/div/div[3]/div[1]/div[2]/div[3]/div/div/div/a/div[2]/div[1]/div[2]") WebElement product1;
	@FindBy(xpath = "/html/body/div/div/div[3]/div[1]/div[2]/div[2]/div/div/div/a/div[2]/div[1]") WebElement product2;
	@FindBy(xpath = "/html/body/div[1]/div/div[3]/div[1]/div[1]/div[2]/div/ul/li[1]/button") WebElement cart;
	
	public void openUrl(String url)
	{
		w.manage().window().maximize();
		w.get(url);
	}
	public void p1(String GoPro, String iphone)
	{
		
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
	
	}
