package selenium.javawebdriver.basictests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class facegenie {

		public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://facegenie-ams-school.web.app/");
		driver.findElement(By.name("email")).sendKeys("testbams@gmail.com");
		driver.findElement(By.id("password")).sendKeys("facegenie");
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/div/div/div/div[1]/form[2]/button")).click();
		String exp="facegenie";
		String actual=driver.getTitle();
		if(exp.equalsIgnoreCase(actual)){
			System.out.println("pass");
		}else {
			System.out.println("fail");
		}
	
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/div/div/div/nav/div[3]/div[2]/span")).click();
        
		
		
		
		
		String month="September 2023";
		String day="14";
		
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/div/main/div[2]/div/div/div/div[2]/div[1]/div[1]/div/div/div/div[1]/div[1]/div/div")).click();
		
		while(true) {
			String text=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/div/main/div[2]/div/div/div/div[2]/div[1]/div[1]/div/div/div/div[1]/div[1]/div/div")).getText();
			if (text.equals(month)) {
				break;
			}
			else {
				driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/div/main/div[2]/div/div/div/div[2]/div[1]/div[1]/div/div/div/div[1]/div[2]/button[2]/svg")).click();
			
				}
		}
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/div/main/div[2]/div/div/div/div[2]/div[1][contains(text(),"+day+")]"));
		
		
		

	}

}
