package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class SocialMediaTracker
{
	public static WebDriver driver=new ChromeDriver();
	
    public static void main(String[] args) 
    {
    	Scanner sc=new Scanner(System.in);

        try {
        	driver.manage().window().maximize();
            driver.get("https://www.instagram.com/accounts/login/");
            
            Thread.sleep(2000);
            
            WebElement usernameField = driver.findElement(By.name("username"));
            WebElement passwordField = driver.findElement(By.name("password"));
            Thread.sleep(3000);
            
            System.out.println("Enter your instagram id:");
            Thread.sleep(10000);
            String username=sc.next();
            
            System.out.println("Enter your instagram password:");
            Thread.sleep(10000);
            String password=sc.next();
            
            usernameField.sendKeys(username);
            passwordField.sendKeys(password);
            passwordField.submit();

            Thread.sleep(5000);

            System.out.println("Enter the id you want to search:");
            Thread.sleep(10000);
        	String userId =sc.next();
            driver.get("https://www.instagram.com/" + userId + "/");
            Thread.sleep(7000);

            SocialMediaTracker.viewIdDetails();
            Thread.sleep(30000);

//            String totalPostsText = driver.findElement(By.xpath("//header//section[3]//li[1]//span")).getText();
//            int totalPosts = Integer.parseInt(totalPostsText.replace(",", ""));
//            System.out.println("Total Posts are: " + totalPosts);
//            
//            Thread.sleep(2000);
//            String totalFollowers = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div/div/div[1]/div[2]/div/div[1]/section/main/div/header/section[3]/ul/li[2]/div/a/span/span")).getText();
//            int totalF = Integer.parseInt(totalFollowers.replace(",", ""));
//            System.out.println("Followers are: " +totalFollowers);
//            
//            Thread.sleep(2000);
//            String totalFollowing= driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div/div/div[1]/div[2]/div/div[1]/section/main/div/header/section[3]/ul/li[3]/div/a/span/span")).getText();
//            int totalFl = Integer.parseInt(totalFollowing.replace(",", ""));
//            System.out.println("Following are: " +totalFl);

            driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div/div/div[1]/div[2]/div/div[2]/div/div/div/div/div[2]/div[5]/div/div/span/div/a")).click();
            
            Thread.sleep(7000);
            WebElement notify=driver.findElement(By.xpath("//button[text()='Turn On']"));
           // System.out.println(notify);
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
            
            Thread.sleep(2000);
           // driver.findElement(By.xpath("/html/body/div[6]/div[1]/div/div[2]/div/div/div/div/div/div/div[1]/div/div[2]/div/div[2]/input")).sendKeys(""+userId);
            
            Thread.sleep(3000);
            driver.findElement(By.xpath("/html/body/div[6]/div[1]/div/div[2]/div/div/div/div/div/div/div[1]/div/div[3]/div/div/div[1]/div/div/div[3]/div/label/div/input")).click();
            
            Thread.sleep(2000);
            driver.findElement(By.xpath("/html/body/div[6]/div[1]/div/div[2]/div/div/div/div/div/div/div[1]/div/div[4]/div")).click();
            
            Thread.sleep(2000);
            driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div/div/div[1]/div[1]/div[1]/section/main/section/div/div/div/div[1]/div/div[2]/div/div/div[1]/div/div/div/div[2]/div/div/div[2]/div/div/div[2]/div/div[1]")).sendKeys("Hello, CodeApex gives you Final Year Projects.Click on the link below for Enquiry");
            
            
            Thread.sleep(3000);
            driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div/div/div[1]/div[1]/div[2]/div/div/div/div/div[2]/div[7]/div/span/div/a")).click();
            
//            //SELECT FROM COMPUTER
//            Thread.sleep(3000);
//            driver.findElement(By.xpath("/html/body/div[6]/div[1]/div/div[3]/div/div/div/div/div/div/div/div[2]/div[1]/div/div/div[2]/div/button")).click();
            
//            Thread.sleep(3000);
//            driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div/div/div[1]/div[1]/div[2]/div/div/div/div/div[2]/div[4]/span/div/a")).click();
            
            Thread.sleep(7000);
            driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div/div/div[1]/div[1]/div[1]/section/main/div/div[1]/div/div[1]/div/div/div/div/div/div/div/div/div/div/div[1]/div[1]/div")).click();
            
            for (int i = 0; i < 2;) 
            {
            	 Actions act = new Actions(driver);
    			Thread.sleep(5000);
     			act.keyDown(Keys.PAGE_DOWN).keyUp(Keys.PAGE_DOWN).perform();
			}
           
        }
        catch (Exception e) 
        {
        	//System.out.println("Its a private account so you can just view other details but cannot access it");
            e.printStackTrace();
        } 
        finally 
        {
           //driver.quit();
        }
    }
    public static void viewIdDetails() throws InterruptedException 
    {
    	String totalPostsText = driver.findElement(By.xpath("//header//section[3]//li[1]//span")).getText();
        int totalPosts = Integer.parseInt(totalPostsText.replace(",", ""));
        System.out.println("Total Posts are: " + totalPosts);
        
        Thread.sleep(2000);
        String totalFollowers = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div/div/div[1]/div[2]/div/div[1]/section/main/div/header/section[3]/ul/li[2]/div/a/span/span")).getText();
        int totalF = Integer.parseInt(totalFollowers.replace(",", ""));
        System.out.println("Followers are: " +totalFollowers);
        
        Thread.sleep(2000);
        String totalFollowing= driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div/div/div[1]/div[2]/div/div[1]/section/main/div/header/section[3]/ul/li[3]/div/a/span/span")).getText();
        int totalFl = Integer.parseInt(totalFollowing.replace(",", ""));
        System.out.println("Following are: " +totalFl);
        
	}
}
