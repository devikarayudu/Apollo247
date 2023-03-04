package com.apollo.Apollo247;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Stepdefination {
	WebDriver driver;

	
	@Given("User is on the Apollo247 home page")
	public void user_is_on_the_Apollo247_home_page() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("Webdriver.chrome.driver","chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.apollo247.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[@id='wzrk-cancel']")).click();
		Thread.sleep(3000);
		
	}
	@When("User clicks on login button")
	public void user_clicks_on_login_button() {
	    // Write code here that turns the phrase above into concrete actions
		
		doctorconsultpagefactory dc =new doctorconsultpagefactory(driver);
		dc.login.click();
	}
	@When("User is able to give mobilenumber")
	public void user_is_able_to_give_mobilenumber() {
	    // Write code here that turns the phrase above into concrete actions
		doctorconsultpagefactory dc=new doctorconsultpagefactory(driver);
		dc.mobileno.sendKeys("9381336112");
		dc.mobileArrow.click();	
//	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0,5 ));
	}
	@When("User is able to write otp")
	public void user_is_able_to_write_otp() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		doctorconsultpagefactory dc=new doctorconsultpagefactory(driver);
		Thread.sleep(20000);
		dc.otpArrow.click();
	}
	@Then("User is able to Login")
	public void user_is_able_to_Login() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(2000);
		doctorconsultpagefactory dc =new doctorconsultpagefactory(driver);
		dc.login1.click();
	}
	@Given("User is on the Doctor consultation page")
	public void user_is_on_the_Doctor_consultation_page() throws InterruptedException {
//	    Write code here that turns the phrase above into concrete actions
		System.setProperty("Webdriver.chrome.driver","chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.apollo247.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[@id='wzrk-cancel']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//p[text()='Consult']")).click();
		Thread.sleep(2000);
     		
     		
     		
	}
	@When("the User clicks on consult button")
	public void the_User_clicks_on_consult_button() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		String excepted_title="Online Doctor Consultation via Video Call / Audio / Chat - Apollo 247";
		String actual_title=driver.getTitle();
		
		assertEquals( excepted_title,actual_title);

	}

	@Then("the User should be able to view the consult page")
	public void the_User_should_be_able_to_view_the_consult_page() {
	    
	}

	@Given("User is on Consult page")
	public void user_is_on_Consult_page() throws InterruptedException {
		System.setProperty("Webdriver.chrome.driver","chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.apollo247.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[@id='wzrk-cancel']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//p[text()='Consult']")).click();
		Thread.sleep(2000);

	}

	@When("User clicks on search  button")
	public void user_clicks_on_search_button() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//input[@placeholder='Search doctors or specialities']")).click();
		Thread.sleep(2000);
		String excepted_title="Online Doctor Consultation via Video Call / Audio / Chat - Apollo 247";
		String actual_title=driver.getTitle();
		
		assertEquals( excepted_title,actual_title);

	}

	@Then("the user is able to search particular doctor")
	public void the_user_is_able_to_search_particular_doctor() {
	    
	}

	@Given("User is on consult page")
	public void user_is_on_consult_page() throws InterruptedException {
		System.setProperty("Webdriver.chrome.driver","chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.apollo247.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[@id='wzrk-cancel']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//p[text()='Consult']")).click();
		Thread.sleep(2000);
	}

	@When("the User clicks on particular city")
	public void the_User_clicks_on_particular_city() throws InterruptedException {
		driver.findElement(By.xpath("//a[@href='/doctors/doctors-in-bangalore-dcity']")).click();
		Thread.sleep(2000);
	   
	}

	@Then("the User is able to see all the doctors in that city")
	public void the_User_is_able_to_see_all_the_doctors_in_that_city() {
	    
	}

	
	@When("the User clicks on particular doctor from a particular city")
	public void the_User_clicks_on_particular_doctor_from_a_particular_city() throws InterruptedException {
		driver.findElement(By.xpath("//a[@href='/doctors/doctors-in-bangalore-dcity']")).click();
		Thread.sleep(2000);
		WebElement Img=driver.findElement(By.xpath("//img[@alt='Dr. Narendra B S, Endocrinologist in bangalore']"));
 		Img.click();
 		Thread.sleep(2000);
// 		 driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div[2]/div/div[2]/div[1]/div[1]/div[1]/div/div[1]/div[2]/div[1]/button/span[1]/img")).click();
//        	Thread.sleep(2000);
//// 		doctorconsultpagefactory dc=new doctorconsultpagefactory(driver);
// 		dc.login.click();
//		dc.mobileno.sendKeys("9381336112");
//		dc.mobileArrow.click();	
//		Thread.sleep(20000);
//		dc.otpArrow.click();
//		Thread.sleep(2000);
//		dc.login1.click();
//		Thread.sleep(2000);
 	//	 driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div[2]/div/div[2]/div[1]/div[1]/div[1]/div/div[1]/div[2]/div[1]/button/span[1]/img")).click();
  //     	Thread.sleep(2000);
 //		driver.findElement(By.xpath("button[@value=\"15:00\"]")).click();
 		

	}

	@Then("The User is able to see the doctor in the page")
	public void the_User_is_able_to_see_the_doctor_in_the_page() {
	  
	}
	



}


