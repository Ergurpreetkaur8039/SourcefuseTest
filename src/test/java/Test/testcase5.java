package Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class testcase5 {
	   private Connection connection;
	   private static Statement statement;
	   private static ResultSet rs;
	   public  WebDriver driver;
	   
	@BeforeClass
	public void setUp() {
        String databaseURL = "jdbc:mysql://localhost:3306/easy";
        String user = "root";
        String password = "admin";
        connection = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Connecting to Database...");
            connection = DriverManager.getConnection(databaseURL, user, password);
            if (connection != null) {
                System.out.println("Connected to the Database...");
            }
        } catch (SQLException ex) {
           ex.printStackTrace();
        }
        catch (ClassNotFoundException ex) {
           ex.printStackTrace();
        }
        driver = new ChromeDriver();
}
	@Test(priority=1)
	public void db_entry() {
		driver.findElement(By.xpath("//div[@id='fnameInput']/input")).sendKeys("Gurpreet");
		driver.findElement(By.xpath("//div[@id='lnameInput']/input")).sendKeys("Kaur");
		driver.findElement(By.xpath("//form//button[@type='submit']")).click();
	}
		
		@Test(priority=2)
	public void db_entry_verify() {
		try{
            String query = "select * from userinfo";
            ResultSet res = statement.executeQuery(query);
            while (res.next())
            {
                   System.out.print(res.getString(1));
            System.out.print("\t" + res.getString(2));
            System.out.print("\t" + res.getString(3));
            System.out.println("\t" + res.getString(4));
            }
            }
            catch(Exception e)
            {
                   e.printStackTrace();
            }     
	}
	

}
