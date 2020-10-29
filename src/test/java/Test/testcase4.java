package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class testcase4 {
	public  WebDriver driver;
	@BeforeClass
	public void setup(){
			driver = new ChromeDriver();
	}
	@Test(priority=1)
	public void submitform() {
		driver.get("http://sfwebhtml:t63KUfxL5vUyFLG4eqZNUcuRQ@sfwebhtml.sourcefuse.com/automation-form-demo-for-interview/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//div[@id='fnameInput']/input")).sendKeys("Gurpreet");
		driver.findElement(By.xpath("//div[@id='lnameInput']/input")).sendKeys("Kaur");
		driver.findElement(By.xpath("//div[@id='emailInput']/input")).sendKeys("gurpreet@gmail.com");
		driver.findElement(By.xpath("//div[@id='curCompanyInput']/input")).sendKeys("Responseiq");
		driver.findElement(By.xpath("//div[@id='mobInput']/input")).sendKeys("8360123544");
		driver.findElement(By.xpath("//div[@id='DOBInput']//div/input")).sendKeys("10/19/2020");
		driver.findElement(By.xpath("//div[@id='positionInput']/input")).sendKeys("Automation Engineer");
		driver.findElement(By.xpath("//div[@id='portfolioInput']/input")).sendKeys("gurpreet.abc.co");
		driver.findElement(By.xpath("//div[@id='salaryInput']/input")).sendKeys("7 Lakh");
		driver.findElement(By.xpath("//div[@id='relocateInput']//div/input")).click();
		driver.findElement(By.xpath("//form//button[@type='submit']")).click();
		
	}
	@AfterClass
	public void teardown() {
		driver.close();
	}	

}
