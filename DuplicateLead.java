package week2.day2.Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DuplicateLead {
	
	
	public static void main(String[] args) {
		
	

			// TODO Auto-generated method stub
			
			ChromeDriver driver = new ChromeDriver();
			// 1. Launch URL
			driver.get("http://leaftaps.com/opentaps/control/login");
			
			driver.manage().window().maximize();
			
			// 2. Enter UserName and Password Using Id Locator
			driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
			
			driver.findElement(By.id("password")).sendKeys("crmsfa");
			
			// 3. Click on Login Button using Class Locator
			driver.findElement(By.className("decorativeSubmit")).click();

			// 4. Click on CRM/SFA Link
			driver.findElement(By.linkText("CRM/SFA")).click();
			// 5. Click on Leads Button
			driver.findElement(By.linkText("Leads")).click();
			// 6. Click on Create Lead 
			driver.findElement(By.linkText("Create Lead")).click();
			// 7. Enter CompanyName Field Using id Locator
			driver.findElement(By.id("createLeadForm_companyName")).sendKeys("COGNIZANT");
			// 8. Enter FirstName Field Using id Locator
			driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Moorthy");
			// 9. Enter LastName Field Using id Locator
			driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Purushothaman");

			// 10. Enter FirstName(Local) Field Using id Locator
			driver.findElement(By.id("createLeadForm_firstnameLocator")).sendKeys("Mumu");
			// 11. Enter Department Field Using any Locator of Your Choice
			driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Automobile");
			// 12. Enter Description Field Using any Locator of your choice 
			driver.findElement(By.name("description")).sendKeys("Testing");
			// 13. Enter your email in the E-mail address Field using the locator of your choice
			driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("moorthymac13@gmail.com");
			// 14. Select State/Province as NewYork Using Visible Text
		WebElement stateelment	= driver.findElement(By.id("createLeadForm_generalstateproviceGeoId"));
		
			Select state = new Select(stateelment);
			
			state.selectByVisibleText("New York");
			// 15. Click on Create Button
			driver.findElement(By.name("submitButton")).click();
			
			String title = driver.getTitle();
			
			System.out.println("Title of the current page: " +title);
			
			//17.click on Duplicate button
			driver.findElement(By.linkText("Duplicate Lead")).click();
			
			// 18. Clear the CompanyName Field using .clear() And Enter new CompanyName
			
			driver.findElement(By.id("createLeadForm_companyName")).clear();
			driver.findElement(By.id("createLeadForm_companyName")).sendKeys("COGZ");
			

			// 19.Clear the FirstName Field using .clear() And Enter new FirstName
			driver.findElement(By.id("createLeadForm_firstName")).clear();
			driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Moorthy");
			

			// 20.Click on Create Lead Button
			
			driver.findElement(By.name("smallSubmit")).click();
			
			// 21. Get the Title of Resulting Page  using driver.getTitle()
			
			String finalpage = driver.getTitle();
			
			System.out.println("Title of resulting page:" +finalpage); 
			
			

	
	}
	
	
}
