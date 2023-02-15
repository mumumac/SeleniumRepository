package week2.day2.Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		driver.findElement(By.linkText("Leads")).click();
		
		driver.findElement(By.linkText("Create Lead")).click();
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("COGNIZANT");
		
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Moorthy");
		
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Purushothaman");
		
		driver.findElement(By.id("createLeadForm_firstnameLocal")).sendKeys("Mumu");
		
		driver.findElement(By.name("departmentName")).sendKeys("Automobile");
		
		driver.findElement(By.name("description")).sendKeys("Testing");
		
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("moorthymac13@gmail.com");
		
	WebElement state = driver.findElement(By.id("createLeadForm_generalstateproviceGeoId"));
	
		Select ddState = new Select(state);
		
		ddState.selectByVisibleText("New York");
		
		driver.findElement(By.name("smallSubmit")).click();
		
		String title = driver.getTitle();
		
		System.out.println("Title of the current page: " +title);
		
		

	}

}
