package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SocialMediaTracker{
    public static void main(String[] args) {
        // Set the path for the ChromeDriver
       // System.setProperty("webdriver.chrome.driver", "path/to/chromedriver"); // Update this path

        // Initialize WebDriver
        WebDriver driver = new ChromeDriver();

        try {
            // Step 1: Navigate to Instagram login page
            driver.get("https://www.instagram.com/accounts/login/");

            // Wait for the login page to load
            Thread.sleep(2000);

            // Step 2: Log in to Instagram
            WebElement usernameField = driver.findElement(By.name("username"));
            WebElement passwordField = driver.findElement(By.name("password"));
            usernameField.sendKeys("findme_7107"); // Replace with your username
            passwordField.sendKeys("findme@7107"); // Replace with your password
            passwordField.submit();

            // Wait for the main page to load
            Thread.sleep(5000);

            // Step 3: Navigate to the user's profile
            String userId = "7_om_5402"; // Replace with the user ID you want to track
            driver.get("https://www.instagram.com/" + userId + "/");

            // Wait for the profile page to load
            Thread.sleep(10000);

            // Step 4: Get total posts
            String totalPostsText = driver.findElement(By.xpath("//header//section[3]//li[1]//span")).getText();
            int totalPosts = Integer.parseInt(totalPostsText.replace(",", ""));
            System.out.println("Total Posts are: " + totalPosts);
            
            Thread.sleep(2000);
            String totalFollowers = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div/div/div[1]/div[2]/div/div[1]/section/main/div/header/section[3]/ul/li[2]/div/a/span/span")).getText();
            int totalF = Integer.parseInt(totalFollowers.replace(",", ""));
            System.out.println("Followers are: " +totalFollowers);
            
            Thread.sleep(2000);
            String totalFollowing= driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div/div/div[1]/div[2]/div/div[1]/section/main/div/header/section[3]/ul/li[3]/div/a/span/span")).getText();
            int totalFl = Integer.parseInt(totalFollowers.replace(",", ""));
            System.out.println("Following are: " +totalFl);

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
            
            driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div/div/div[1]/div[1]/div[1]/section/main/section/div/div/div/div[1]/div/div[1]/div/div[1]/div[2]/div/div")).click();
            
            Thread.sleep(2000);
            driver.findElement(By.xpath("/html/body/div[6]/div[1]/div/div[2]/div/div/div/div/div/div/div[1]/div/div[2]/div/div[2]/input")).sendKeys(""+userId);
            
            Thread.sleep(2000);
            driver.findElement(By.xpath("/html/body/div[6]/div[1]/div/div[2]/div/div/div/div/div/div/div[1]/div/div[3]/div/div/div[1]/div/div/div[3]/div/label/div/input")).click();
            
            Thread.sleep(2000);
            driver.findElement(By.xpath("/html/body/div[6]/div[1]/div/div[2]/div/div/div/div/div/div/div[1]/div/div[4]/div")).click();
          
            driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div/div/div[1]/div[1]/div[2]/div/div/div/div/div[2]/div[4]/span/div/a")).click();
            
            Thread.sleep(3000);
            driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div/div/div[1]/div[1]/div[1]/section/main/div/div[3]/div/div[1]/div/div/div/div/div/div/div/div/div/div/div[1]/div[1]/div")).click();
            Actions act = new Actions(driver);
			Thread.sleep(15000);
			act.keyDown(Keys.PAGE_DOWN).keyUp(Keys.PAGE_DOWN).perform();
			
			
            
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        } 
//        finally 
//        {
//           driver.quit();
//        }
    }
}