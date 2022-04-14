import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TenMinuteSchoolAutomation {

	public static void main(String[] args) throws InterruptedException {
		
		
		        //System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
				//ChromeDriver driver = new ChromeDriver();
			    		  
				System.setProperty("webdriver.gecko.driver", "C:\\drivers\\geckodriver.exe");
				FirefoxDriver driver = new FirefoxDriver();
				
				//Search URL
				driver.get("https://10minuteschool.com/");
				Thread.sleep(2000);
				
				//Maximize Window
				driver.manage().window().maximize();
				
				//Select Admission Test 
				driver.findElement(By.xpath("/html/body/app-root/div/div[1]/app-home/div/div/main/app-home-page/"
						+ "div[1]/app-hero/div/div/div[1]/div[2]/div")).click();
			    driver.findElement(By.xpath("/html/body/app-root/div/div[1]/"
			    		+ "app-home/div/div/main/app-home-page/div[1]/"
			    		+ "app-hero/div/div/div[1]/div[2]/div/ul/li[2]")).click();
				driver.findElement(By.xpath("/html/body/app-root/div/div[1]/"
						+ "app-home/div/div/main/app-home-page/div[1]/"
						+ "app-hero/div/div/div[1]/div[2]/a")).click();
				Thread.sleep(2000);
				
				//Click Engineering Programs
				driver.findElement(By.xpath("/html/body/app-root/div/div[1]/app-home/div/div/main/"
						+ "app-learning-path/app-admission-test/"
						+ "div[2]/div/div[3]/app-program-card/a/div/h6")).click();
				Thread.sleep(2000);
			
				//Scroll Down Navigation Bar Header -> Admission Exam 21 Live Class
				JavascriptExecutor js = (JavascriptExecutor) driver;
				WebElement profile_section_down = driver.findElement(By.xpath("/html/body/app-root/div/div[1]/app-home/div/div/main/app-admission-funnel/section/div/div[1]/funnel-widget[8]/div/h4"));
				js.executeScript("arguments[0].scrollIntoView(true);", profile_section_down);
				Thread.sleep(3000);
				
				//Scroll Up Navigation Bar Footer -> Header
				WebElement profile_section_up = driver.findElement(By.xpath("/html/body/app-root/div/div[1]/app-home/div/div/main/app-admission-funnel/section/div/div[1]/funnel-widget[1]/div/h1"));
				js.executeScript("arguments[0].scrollIntoView(true);", profile_section_up);
				Thread.sleep(3000);
				
				//To join Engineering Program
				driver.findElement(By.xpath("/html/body/app-root/div/div[1]/app-home/div/div/main/app-admission-funnel/section/div/div[2]/div/div[1]/div/app-coupon/div/div[2]/div/div/div[2]/button/span[1]")).click();
				Thread.sleep(2000);
				
				//Click HomePage 
				driver.findElement(By.xpath("/html/body/app-root/div/div[1]/app-home/div/app-navbar/div/nav/div/div[1]/a/img")).click();
	            Thread.sleep(2000);
				
		        //Select Courses Module
				driver.findElement(By.xpath("/html/body/app-root/div/div[1]/app-home/div/app-navbar/div/nav/div/div[2]/div[1]/div/div[1]/a[2]/span")).click();
				Thread.sleep(2000);
				
				//Scroll Down Web Page Header -> Footer 
				js.executeScript("window.scrollBy(0, document.body.scrollHeight);");
				Thread.sleep(3000);
								
				//Scroll Down Web Page Footer -> Header
				js.executeScript("window.scrollBy(0, -document.body.scrollHeight);");
				Thread.sleep(3000);
				
				//Select Specific Course
				driver.findElement(By.xpath("/html/body/app-root/div/div[1]/app-home/div/div/main/app-skills/div[1]/div/div[3]/app-course-card/div/a/div[3]")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("/html/body/app-root/div/div[1]/app-home/div/div/main/app-skill-funnel/section/div[1]/div[2]/div/div[1]/div/div[1]/div/div/"
				+ "app-coupon/div/div[2]/div/div/button/span[1]")).click();
			
				//Click HomePage 
				driver.findElement(By.xpath("/html/body/app-root/div/div[1]/app-home/div/app-navbar/div/nav/div/div[1]/a/img")).click();
	            Thread.sleep(2000);
				
				//Book Store
				driver.findElement(By.xpath("/html/body/app-root/div/div[1]/app-home/div/"
						+ "app-navbar/div/nav/div/div[2]/div[1]/div/div[1]/a[5]/span")).click();
				
				//Click HomePage Again 
				driver.findElement(By.xpath("/html/body/app-root/div/div[1]/app-home/div/app-navbar/div/nav/div/div[1]/a/img")).click();
	            Thread.sleep(2000);
	            
	            
	        	driver.quit(); 
	}

}
