package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class testcase3 {
	public  WebDriver driver;
	@BeforeClass
	public void setup(){
			driver = new ChromeDriver();
	}
	@Test(priority=1)
	public void hard_assertions() {
		driver.get("http://sfwebhtml:t63KUfxL5vUyFLG4eqZNUcuRQ@sfwebhtml.sourcefuse.com/automation-form-demo-for-interview/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//form//button[@type='submit']")).click();
		Assert.assertTrue(driver.findElement(By.xpath("//div[@id='fnameInput']/input")).isSelected());
		System.out.println("Hard assertion has passed");
		
	}
	@AfterClass
	public void teardown() {
		driver.close();
	}	

}
