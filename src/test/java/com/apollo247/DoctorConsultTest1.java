package com.apollo247;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.apollo.Apollo247.doctorconsultpagefactory;

public class DoctorConsultTest1 {
  @Test
  public void f() throws InterruptedException {
	  
	  System.setProperty("Webdriver.chrome.driver", "chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://www.apollo247.com/");
		 driver.manage().window().maximize();
		 driver.findElement(By.xpath("//button[@id='wzrk-cancel']")).click();
		  Thread.sleep(3000);
		  doctorconsultpagefactory hr = new doctorconsultpagefactory( driver);
		 Thread.sleep(2000);
		 hr.Login();
		 Thread.sleep(2000);
		 hr.MobileNumber();
		 hr.submit();
		 Thread.sleep(20000);
		 hr.Arrow();
		 Thread.sleep(1000);

  }



public void consult()
{
	System.setProperty("Webdriver.chrome.driver","chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://www.apollo247.com/");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//button[@id='wzrk-cancel']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//p[text()='Consult']")).click();
	Thread.sleep(2000);
	
}
     
}
   