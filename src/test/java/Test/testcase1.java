package Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;



public class testcase1 {
	
	public  WebDriver driver;
	@BeforeClass
	public void setup(){
			driver = new ChromeDriver();
	}
	@Test(priority=1)
	public void Printlabels() {
		driver.get("http://sfwebhtml:t63KUfxL5vUyFLG4eqZNUcuRQ@sfwebhtml.sourcefuse.com/automation-form-demo-for-interview/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//form//button[@type='submit']")).click();
		List<WebElement> iList = driver.findElements(By.xpath("//input[@required]/ancestor::div[2]//label"));
		iList.forEach((ele) -> System.out.println(ele.getText()));
		
	}
	@AfterClass
	public void teardown() {
		driver.close();
	}	


}
