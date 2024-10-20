package selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceBook_Signup_task_2306 {

	public static void main(String[] args) throws Exception
	{
		WebDriver w = new ChromeDriver();
		w.manage().window().maximize();
		w.get("https://www.google.com/search?q=facebook&sca_esv=8b154fb423ea49e7&source=hp&ei=xFp4ZpXxAqqu4-EP8P25kAk&iflsig=AL9hbdgAAAAAZnho1MS3Q-M8gQ8qzYKx1TnovqR1mJaK&ved=0ahUKEwiV4-e3n_KGAxUq1zgGHfB-DpIQ4dUDCA0&uact=5&oq=facebook&gs_lp=Egdnd3Mtd2l6IghmYWNlYm9vazIREC4YgAQYsQMY0QMYgwEYxwEyCxAAGIAEGLEDGIMBMgsQABiABBixAxiDATIIEAAYgAQYsQMyCBAAGIAEGLEDMgsQABiABBixAxiDATIIEAAYgAQYsQMyCBAAGIAEGLEDMgsQABiABBixAxiDATILEAAYgAQYsQMYgwFI9iZQtAVY3yNwAXgAkAEAmAF6oAGTB6oBAzAuOLgBA8gBAPgBAZgCCaAC2QeoAgrCAhAQABgDGOUCGOoCGIwDGI8BwgIQEC4YAxjlAhjqAhiMAxiPAcICCxAuGIAEGLEDGIMBwgIOEC4YgAQYsQMYgwEY1ALCAggQLhiABBixA8ICDhAuGIAEGLEDGIMBGIoFwgILEC4YgAQY0QMYxwHCAgUQLhiABMICBRAAGIAEmAMWkgcDMS44oAfgRA&sclient=gws-wiz");
		Thread.sleep(2000);
		w.findElement(By.linkText("Facebook")).click();
		Thread.sleep(2000);
		w.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[5]/div/div/div[1]/div/div[2]/div/div/div/div[2]/form/div/div[8]/div/div")).click();
		Thread.sleep(2000);
		
		
		String parentwindow = w.getWindowHandle();
		System.out.println("Parent window" + parentwindow);
		Set<String>multiwindow = w.getWindowHandles();
		System.out.println("Multi Window"+multiwindow);
		
		for (String child : multiwindow) 
		{
			if (!parentwindow.equals(child))
			{
				w.switchTo().window(child);
				Thread.sleep(2000);
				w.findElement(By.name("firstname")).sendKeys("Ashwini");
				Thread.sleep(2000);
				w.findElement(By.name("lastname")).sendKeys("Patil");
				Thread.sleep(2000);
				w.findElement(By.name("reg_email__")).sendKeys("ash0111@mail.com");
				Thread.sleep(2000);
				w.findElement(By.name("reg_email_confirmation__")).sendKeys("ash0111@mail.com");
				Thread.sleep(2000);
				
				w.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[2]/div/div[2]/div/div/div[1]/form/div[1]/div[4]/div/div[1]/input")).sendKeys("ash@0111");
				
				WebElement bday = w.findElement(By.id("day"));
				Select bd = new Select(bday);
				bd.selectByIndex(0);
				Thread.sleep(2000);
			
				WebElement bmonth = w.findElement(By.id("month"));
				Select mnth = new Select(bmonth);
				mnth.selectByIndex(4);
				Thread.sleep(2000);
				
				WebElement byear = w.findElement(By.id("year"));
				Select yrs = new Select(byear);
				yrs.selectByValue("1995");
				Thread.sleep(2000);
				
				w.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[2]/div/div[2]/div/div/div[1]/form/div[1]/div[7]/span/span[1]/label")).click();
				Thread.sleep(2000);
				
				w.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[2]/div/div[2]/div/div/div[1]/form/div[1]/div[11]/button")).click();
				Thread.sleep(7000);
			}
		}

	}

}
