package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class testcase2 {
	public  WebDriver driver;
	@BeforeClass
	public void setup(){
			driver = new ChromeDriver();
	}
	@Test(priority=1)
	public void soft_assertions() {
		driver.get("http://sfwebhtml:t63KUfxL5vUyFLG4eqZNUcuRQ@sfwebhtml.sourcefuse.com/automation-form-demo-for-interview/");
		driver.manage().window().maximize();
		WebElement curcompany= driver.findElement(By.xpath("//div[@id='curCompanyInput']/input"));
		WebElement email= driver.findElement(By.xpath("//div[@id='emailInput']/input"));
		driver.findElement(By.xpath("//form//button[@type='submit']")).click();
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(curcompany.getText(), "Responseiq", "Current company is not Responseiq");
		softAssert.assertEquals(email.getText(), "email@gmail.com", "Email id is blank");
		softAssert.assertAll();
		System.out.println("Soft assertions are passed");
	}
	@AfterClass
	public void teardown() {
		driver.close();
	}	

}
