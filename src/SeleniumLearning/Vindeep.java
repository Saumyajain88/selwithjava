package SeleniumLearning;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Vindeep {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
				driver.get("https://vindeep.com/Calculators/FDCalc.aspx");
				driver.manage().window().maximize();
		String title = driver.getTitle();
		System.out.println("Title="+title);
		if (title.equals("Fixed Deposit Calculator | Calculate FD Interest, Maturity value"))
		{
			System.out.println("Title matched");
			driver.findElement(By.id("ContentPlaceHolder1_cphCentre_FDAmount")).clear();
			driver.findElement(By.id("ContentPlaceHolder1_cphCentre_FDAmount")).sendKeys("20000");
			driver.findElement(By.id("ContentPlaceHolder1_cphCentre_Period")).clear();
			driver.findElement(By.id("ContentPlaceHolder1_cphCentre_Period")).sendKeys("70");
			WebElement ele=driver.findElement(By.id("ContentPlaceHolder1_cphCentre_PeriodDropDown"));
			Select opts=new Select(ele);
			opts.selectByVisibleText("Days");
			List<WebElement>allItems=opts.getOptions();
			System.out.println("Total items="+allItems.size());
			for (int i=0; i<allItems.size();i++)
			{
				System.out.println(allItems.get(i).getText());
			}
			driver.findElement(By.id("ContentPlaceHolder1_cphCentre_InterestRate")).clear();
			driver.findElement(By.id("ContentPlaceHolder1_cphCentre_InterestRate")).sendKeys("5.40");
			driver.findElement(By.name("ctl00$ContentPlaceHolder1$cphCentre$btnFDMAmount")).click();
			
			
		}
		else		
		{
			System.out.println("Title not matched");
			
		}
		
	}

}
