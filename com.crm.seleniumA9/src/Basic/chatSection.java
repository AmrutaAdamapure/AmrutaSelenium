package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class chatSection 
{
//  -------------------------- CHATS
    
  public void chat(String userId,WebDriver driver) throws InterruptedException 
  {
  	driver.get("https://www.instagram.com/" + userId + "/");
      Thread.sleep(7000);
      
      driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div/div/div[1]/div[2]/div/div[2]/div/div/div/div/div[2]/div[5]/div/div/span/div/a")).click();
      
      Thread.sleep(7000);
      WebElement notify=driver.findElement(By.xpath("//button[text()='Turn On']"));
      if (notify!= null) 
      {
      	notify.click();
		}
      else
      {
      	driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div/div/div[1]/div[1]/div[1]/section/main/section/div/div/div/div[1]/div/div[1]/div/div[1]/div[2]/div/div")).click();
      }
      
      Thread.sleep(3000);
      driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div/div/div[1]/div[1]/div[1]/section/main/section/div/div/div/div[1]/div/div[1]/div/div[1]/div[2]/div/div")).click();
      
      Thread.sleep(5000);
      driver.findElement(By.xpath("/html/body/div[6]/div[1]/div/div[2]/div/div/div/div/div/div/div[1]/div/div[2]/div/div[2]/input")).sendKeys(""+userId);
      
      Thread.sleep(3000);
      driver.findElement(By.xpath("/html/body/div[6]/div[1]/div/div[2]/div/div/div/div/div/div/div[1]/div/div[3]/div/div/div[1]/div/div/div[3]/div/label/div/input")).click();
      
      Thread.sleep(2000);
      driver.findElement(By.xpath("/html/body/div[6]/div[1]/div/div[2]/div/div/div/div/div/div/div[1]/div/div[4]/div")).click();
      
      try
      {
      	Thread.sleep(2000);
          driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div/div/div[1]/div[1]/div[1]/section/main/section/div/div/div/div[1]/div/div[2]/div/div/div[1]/div/div/div/div[2]/div/div/div[3]/div/div/div[2]/div/div[1]/p")).sendKeys("Hello, CodeApex gives you Final Year Projects.Click on the link below for Enquiry");
          Thread.sleep(3000);
          driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div/div/div[1]/div[1]/div[1]/section/main/section/div/div/div/div[1]/div/div[2]/div/div/div[1]/div/div/div/div[2]/div/div/div[3]/div/div/div[3]")).click();
      }
      catch (Exception e) 
      {
      	Thread.sleep(3000);
      	try
      	{
      	WebElement invite=driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div/div/div[1]/div[1]/div[1]/section/main/section/div/div/div/div[1]/div/div[2]/div/div/div[1]/div/div/div/div[2]/div/div/div[2]/div/div/div/div/div/div/div/div/div[1]/span"));
      	if (invite==null) 
      	{
      		Thread.sleep(3000);
  			driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div/div/div[1]/div[1]/div[1]/section/main/section/div/div/div/div[1]/div/div[2]/div/div/div[1]/div/div/div/div[2]/div/div/div[2]/div/div/div[2]/div/div[1]")).sendKeys("Hello, CodeApex gives you Final Year Projects.Click on the link below for Enquiry");
  			Thread.sleep(3000);
              driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div/div/div[1]/div[1]/div[1]/section/main/section/div/div/div/div[1]/div/div[2]/div/div/div[1]/div/div/div/div[2]/div/div/div[3]/div/div/div[3]")).click();
			
      	} 
      	else 
      	{
      		System.out.println("Invite is sent already");
			}
      	}
      	catch (Exception exc) 
      	{
      		Thread.sleep(3000);
      		driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div/div/div[1]/div[1]/div[1]/section/main/section/div/div/div/div[1]/div/div[2]/div/div/div[1]/div/div/div/div[2]/div/div/div[2]/div/div/div[2]/div/div[1]")).sendKeys("Hello Everyone!");
      		Thread.sleep(3000);
      		driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div/div/div[1]/div[1]/div[1]/section/main/section/div/div/div/div[1]/div/div[2]/div/div/div[1]/div/div/div/div[2]/div/div/div[2]/div/div/div[3]")).click();
				System.out.println("");
			}
			
		}
			

	}
}
